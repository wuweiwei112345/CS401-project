package com.pro.application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.pro.entity.DataStructureInfoEntity;
import com.pro.entity.ResultDataEntity;
import com.pro.entity.SecondStepDataEntity;
import com.pro.entity.StaticDataEntity;
import com.pro.imple.SimpleFactory;
import com.pro.inter.ListInterface;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JCheckBox;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JFileChooser;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.awt.Choice;
import javax.swing.JTextArea;

/**
 * @describe Window program
 * @author Wei Wu,Ye Yu 
 */
public class MainApplication {

	private JFrame frmPerformanceAnalysisOf;//性能分析窗体对象
	private JMenuBar menuBar;//菜单bar
	private JMenu mnNewMenu;//菜单对象
	private JMenuItem mntmNewMenuItem;//菜单对象选项
	private JLayeredPane layeredPane;//叠加层pane对象
	private JPanel panel_2;//步骤一panel对象
	private JPanel panel_1;//步骤一中放置其他子控件的panel对象
	private JLabel label;//步骤一中提示标题变量
	private JPanel panel_4;//步骤二panel对象
	private JPanel panel_5;//步骤二中放置其他子控件的子panel对象
	private JLabel label_1;//步骤二中提示标题变量
	private JPanel panel_6;//步骤二中放置两个单选按钮的panel对象
	private JPanel panel_8;//步骤二中放置按钮的panel对象
	private JRadioButton rdbtnNewRadioButton;//步骤二中的单选按钮(String type)
	private JRadioButton rdbtnNewRadioButton_1;//步骤二中的单选按钮(Integer type)
	private JTextField textField;//步骤二中选择数据文件的文件路径展示文本框
	private JTextField textField_1;//步骤二中用于填写分隔符的文本框
	private JButton btnNewButton_1;//步骤二中的back按钮
	private SecondStepDataEntity secondStepDataEntity;//步骤二处理的数据实体
	private JPanel panel_10;//步骤三panel对象
	private JTextField textField_2;//步骤三中的搜索数据输入框
	private JLabel lblNewLabel_2;//步骤三提示标题变量
	private JButton button_1;//步骤三back按钮
	private Choice choice;//步骤一下拉选择框(有界性)
	private Choice choice1;//步骤一下拉选择框(有序性)
	private Choice choice_1;//步骤一下拉选择框(搜索方式)
	private List<DataStructureInfoEntity> dataStructureInfoEntityList = new ArrayList<DataStructureInfoEntity>();//数据结构信息实体列表
	private JPanel panel_12;//暂时忽略
	private JButton button_2;//第一步骤的confirm and next按钮
	private JTextArea textArea_2;//暂时忽略

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApplication window = new MainApplication();
					window.frmPerformanceAnalysisOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPerformanceAnalysisOf = new JFrame();
		frmPerformanceAnalysisOf.setResizable(false);
		frmPerformanceAnalysisOf.setTitle("Performance analysis of data structure");
		frmPerformanceAnalysisOf.setIconImage(Toolkit.getDefaultToolkit().getImage("G:\\book\\A-\u6211\u7684\u56FE\u7247\\3cb81764d54b35f9b41bdd33f7e3fc65.jpg"));
		frmPerformanceAnalysisOf.setBounds(100, 100, 1184, 730);
		frmPerformanceAnalysisOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		frmPerformanceAnalysisOf.getContentPane().add(panel, BorderLayout.NORTH);
		
		menuBar = new JMenuBar();
		menuBar.setForeground(SystemColor.activeCaption);
		menuBar.setBackground(SystemColor.window);
		panel.add(menuBar);
		
		mnNewMenu = new JMenu("Menu");
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Instructions");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				layeredPane.setLayer(panel_12, 2);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		mnNewMenu.add(mntmNewMenuItem);
		
		layeredPane = new JLayeredPane();
		frmPerformanceAnalysisOf.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		layeredPane.setLayer(panel_2, 1);
		panel_2.setBounds(0, 0, 1178, 644);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 5, 1176, 579);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		label = new JLabel("Step 1, please select data structure (multiple choices are allowed)");
		label.setBounds(0, 0, 1176, 58);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.BOLD, 26));
		panel_1.add(label);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(300, 100, 620, 480);
		panel_11.setLayout(null);
		panel_1.add(panel_11);
		
		choice1 = new Choice();
		choice1.setFont(new Font("Dialog", Font.PLAIN, 19));
		choice1.setBounds(490, 65, 240, 27);
		choice1.add("===Sorting Choice===");
		choice1.add("Sorted");
		choice1.add("Unsorted");
		choice1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.removeAll(StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST);
				dataStructureInfoEntityList.removeAll(dataStructureInfoEntityList);
				panel_11.removeAll();
				choice.select(0);
				choice_1.select(0);
				String item = e.getItem().toString();
				Iterator<DataStructureInfoEntity> dataStructureIter = StaticDataEntity.DATA_STRUCTURE_MAP.values().iterator();
				Integer isSorted = 0;
				if("===Sorting Choice===".equals(item)) {
					isSorted = 0;
				}else if("Sorted".equals(item)) {
					isSorted = 1;
				}else if("Unsorted".equals(item)) {
					isSorted = 2;
				}
				
				int x = 0;
				DataStructureInfoEntity entity = null;
				while(dataStructureIter.hasNext()) {
					entity = dataStructureIter.next();
					if(entity.getIsSorted().equals(isSorted)) {
						JCheckBox checkBox = new JCheckBox(entity.getDescribe());
						checkBox.setName(entity.getCode());
						checkBox.setBounds(0, 58 * x, 1162, 58);
						checkBox.setFont(new Font("Calibri", Font.PLAIN, 22));
						checkBox.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								JCheckBox jCheckBox = (JCheckBox)e.getSource();
								if(jCheckBox.isSelected()) {
									StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.add(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
								}else {
									StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.remove(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
								}
								
							}
						});
						dataStructureInfoEntityList.add(StaticDataEntity.DATA_STRUCTURE_MAP.get(entity.getCode()));
						panel_11.add(checkBox);
						x++;
					}
				}
				panel_11.updateUI();
			}
		});
		panel_1.add(choice1);
		
		choice = new Choice();
		choice.setFont(new Font("Dialog", Font.PLAIN, 19));
		choice.setBounds(190, 65, 270, 27);
		choice.add("===Boundary Choice===");
		choice.add("Bounded");
		choice.add("Unbounded");
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.removeAll(StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST);
				dataStructureInfoEntityList.removeAll(dataStructureInfoEntityList);
				panel_11.removeAll();
				choice1.select(0);
				choice_1.select(0);
				String item = e.getItem().toString();
				Iterator<DataStructureInfoEntity> dataStructureIter = StaticDataEntity.DATA_STRUCTURE_MAP.values().iterator();
				Integer isBounded = 0;
				if("===Boundary Choice===".equals(item)) {
					isBounded = 0;
				}else if("Bounded".equals(item)) {
					isBounded = 1;
				}else if("Unbounded".equals(item)) {
					isBounded = 2;
				}
				
				int x = 0;
				DataStructureInfoEntity entity = null;
				while(dataStructureIter.hasNext()) {
					entity = dataStructureIter.next();
					if(entity.getIsBounded().equals(isBounded)) {
						JCheckBox checkBox = new JCheckBox(entity.getDescribe());
						checkBox.setName(entity.getCode());
						checkBox.setBounds(0, 58 * x, 1162, 58);
						checkBox.setFont(new Font("Calibri", Font.PLAIN, 22));
						checkBox.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								JCheckBox jCheckBox = (JCheckBox)e.getSource();
								if(jCheckBox.isSelected()) {
									StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.add(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
								}else {
									StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.remove(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
								}
								
							}
						});
						dataStructureInfoEntityList.add(StaticDataEntity.DATA_STRUCTURE_MAP.get(entity.getCode()));
						panel_11.add(checkBox);
						x++;
					}
				}
				panel_11.updateUI();
			}
		});
		panel_1.add(choice);
		
		choice_1 = new Choice();
		choice_1.setFont(new Font("Dialog", Font.PLAIN, 19));
		choice_1.setBounds(770, 65, 200, 27);
		choice_1.add("===Search type===");
		choice_1.add("Line search");
		choice_1.add("Binary search");
		choice_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				panel_11.removeAll();
				Iterator<DataStructureInfoEntity> dataStructureIter = null;
				if(dataStructureInfoEntityList.size() > 0) {
					dataStructureIter = dataStructureInfoEntityList.iterator();
				}else {
					dataStructureIter = StaticDataEntity.DATA_STRUCTURE_MAP.values().iterator();
				}
				String item = e.getItem().toString();
				Integer isSearchType = 0;
				if("===Search type===".equals(item)) {
					isSearchType = 0;
					if(dataStructureInfoEntityList.size() > 0) {
						Iterator<DataStructureInfoEntity> iter = dataStructureInfoEntityList.iterator();
						int x = 0;
						DataStructureInfoEntity entity = null;
						while(iter.hasNext()) {
							entity = iter.next();
							JCheckBox checkBox = new JCheckBox(entity.getDescribe());
							checkBox.setName(entity.getCode());
							checkBox.setBounds(0, 58 * x, 1162, 58);
							checkBox.setFont(new Font("Calibri", Font.PLAIN, 22));
							checkBox.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									
									JCheckBox jCheckBox = (JCheckBox)e.getSource();
									if(jCheckBox.isSelected()) {
										StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.add(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
									}else {
										StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.remove(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
									}
									
								}
							});
							panel_11.add(checkBox);
							x++;
						}
					}
				}else if("Line search".equals(item)) {
					isSearchType = 1;
				}else if("Binary search".equals(item)) {
					isSearchType = 2;
				}
				
				int x = 0;
				DataStructureInfoEntity entity = null;
				while(dataStructureIter.hasNext()) {
					entity = dataStructureIter.next();
					if(entity.getSearchType().equals(isSearchType)) {
						JCheckBox checkBox = new JCheckBox(entity.getDescribe());
						checkBox.setName(entity.getCode());
						checkBox.setBounds(0, 58 * x, 1162, 58);
						checkBox.setFont(new Font("Calibri", Font.PLAIN, 22));
						checkBox.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								JCheckBox jCheckBox = (JCheckBox)e.getSource();
								if(jCheckBox.isSelected()) {
									StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.add(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
								}else {
									StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST.remove(StaticDataEntity.DATA_STRUCTURE_MAP.get(jCheckBox.getName()));
								}
								
							}
						});
						panel_11.add(checkBox);
						x++;
					}
				}
				panel_11.updateUI();
			}
		});
		panel_1.add(choice_1);
		
		button_2 = new JButton("confirm and next");
		button_2.addMouseListener(new MouseAdapter() {
			//步骤一 confirm and next 按钮 单击事件方法
			@Override
			public void mouseClicked(MouseEvent e) {
				//从静态数据中获取已选择的数据结构列表
				List<DataStructureInfoEntity> selectedDataStructureCodeList = StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST;
				//从列表中获取列表存储数据个数
				int size = selectedDataStructureCodeList.size();
				if(size > 0) {
					//存储数据个数大于0,切换到步骤二的panel
					layeredPane.setLayer(panel_2, 0);
					layeredPane.setLayer(panel_4, 1);
				}else {
					//未选中任何数据结构则弹出提示
					JOptionPane.showMessageDialog(null, "Please select at least one data structure.", "message", 1);
				}
				
			}
		});
		button_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		button_2.setBounds(910, 595, 230, 33);
		panel_2.add(button_2);
		
		panel_4 = new JPanel();
		layeredPane.setLayer(panel_4, 0);
		panel_4.setBounds(0, 0, 1178, 643);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setBounds(5, 5, 1173, 578);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		label_1 = new JLabel("Step 2, generate test data.");
		label_1.setBounds(250, 0, 672, 38);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Calibri", Font.BOLD, 26));
		panel_5.add(label_1);
		
		panel_6 = new JPanel();
		panel_6.setBounds(250, 103, 773, 38);
		panel_5.add(panel_6);
		
		rdbtnNewRadioButton = new JRadioButton("String type",true);
		rdbtnNewRadioButton.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 21));
		
		rdbtnNewRadioButton_1 = new JRadioButton("Integer type",false);
		rdbtnNewRadioButton_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				
				
			}
		});
		rdbtnNewRadioButton_1.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton_1.setFont(new Font("Calibri", Font.PLAIN, 21));
		panel_6.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_6.add(rdbtnNewRadioButton);
		panel_6.add(rdbtnNewRadioButton_1);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		TextArea textArea = new TextArea(null, 20, 20, TextArea.SCROLLBARS_NONE);
		textArea.setBounds(149, 219, 874, 286);
		panel_5.add(textArea);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_7.setBounds(250, 156, 773, 42);
		panel_5.add(panel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 22));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel_7.add(textField);
		textField.setColumns(15);
		
		JButton btnNewButton = new JButton("select a file");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//验证分隔符是否输入
				String textField_1Str = textField_1.getText();
				if(textField_1Str == null || "".equals(textField_1Str)) {
					JOptionPane.showMessageDialog(null, "Please enter a separator.","message",1);
					return;
				}
				
				JFileChooser chooser = new JFileChooser();
				chooser.setMultiSelectionEnabled(true);
				int returnVal = chooser.showOpenDialog(btnNewButton);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					String filepath = chooser.getSelectedFile().getAbsolutePath();
					textField.setText(filepath);
					
					StringBuffer stringDataSb = new StringBuffer();
					File file = new File(filepath);
					Reader reader = null;
					try {
						reader = new InputStreamReader(new FileInputStream(file));
						int tempInt;
						char tempChar;
						while ((tempInt = reader.read()) != -1) {
							tempChar = (char) tempInt;
							stringDataSb.append(tempChar);
						}
						reader.close();
						
						String[] strArr = stringDataSb.toString().split(textField_1Str);
						stringDataSb = new StringBuffer();
						for(int i = 0 ; i < strArr.length ; i++) {
							stringDataSb.append(strArr[i]).append(textField_1Str);
						}
						
						textArea.setText(stringDataSb.toString());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
					//System.out.println(filepath);
					//System.out.println("You chose to open this file: "+ chooser.getSelectedFile().getName());//
				}
				
			}
		});
		panel_7.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("   Input a separator");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		panel_7.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 22));
		panel_7.add(textField_1);
		textField_1.setColumns(4);
		
		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_9.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_9.setBounds(250, 156, 773, 42);
		panel_5.add(panel_9);
		
		JButton btnNewButton_2 = new JButton("Generate 2000 random numbers");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				StringBuffer testDataSb = new StringBuffer();
				Random rand = new Random();
				for(int i = 0 ; i < 2000 ; i++) {
					testDataSb.append(rand.nextInt(2000)).append(",");
				}
				
				textArea.setText(testDataSb.toString());
				
			}
		});
		panel_9.add(btnNewButton_2);
		
		panel_8 = new JPanel();
		panel_8.setBounds(710, 590, 450, 39);
		panel_4.add(panel_8);
		
		JButton button = new JButton("confirm and next");
		button.setBounds(200, 5, 230, 33);
		button.addActionListener(new ActionListener() {
			//步骤二 confirm and next 按钮 单击事件 方法 
			public void actionPerformed(ActionEvent e) {
				
				//测试数据非空检查
				if("".equals(textArea.getText())) {
					//为空弹出提示框
					JOptionPane.showMessageDialog(null, "No test data.","message",1);
					return;
				}
				
				//声明并实例化静态数据实体
				StaticDataEntity staticDataEntity = new StaticDataEntity();
				
				//单选按钮String type被选中
				if(rdbtnNewRadioButton.isSelected()) {
					//是否选中了某个路径的文件
					if("".equals(textField.getText())) {
						JOptionPane.showMessageDialog(null, "Please select a file.","message",1);
						return;
					}
					//是否填写了分隔符
					if("".equals(textField_1.getText())) {
						JOptionPane.showMessageDialog(null, "Please input a separator.","message",1);
						return;
					}
					//用分隔符分割测试数据得到字符串数组
					String[] stringDataArr = textArea.getText().split(textField_1.getText());
					//用静态数据库中的getSecondStepDataStringTypeEntity方法得到步骤二数据实体
					secondStepDataEntity = staticDataEntity.getSecondStepDataStringTypeEntity(1, textField.getText(), textField_1.getText(), stringDataArr);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					//用分隔符分割测试数据得到字符串数组
					String[] numberArr = textArea.getText().split(",");
					//声明并实例化数字类型数组
					Integer[] numberList = new Integer[numberArr.length];
					//将数据存入到数字类型数组中
					for(int i = 0 ; i < numberArr.length ; i++) {
						numberList[i] = Integer.parseInt(numberArr[i]);
					}
					//用静态数据库中的getSecondStepDataIntegerTypeEntity方法得到步骤二数据实体
					secondStepDataEntity = staticDataEntity.getSecondStepDataIntegerTypeEntity(2, numberList);
				}
				//切换到第三步panel
				layeredPane.setLayer(panel_4, 0);
				layeredPane.setLayer(panel_10, 1);
				
			}
		});
		panel_8.setLayout(null);
		button.setFont(new Font("Calibri", Font.PLAIN, 20));
		panel_8.add(button);
		
		btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			//步骤二 back按钮 单击事件 方法
			public void actionPerformed(ActionEvent e) {
				//切换到步骤一panel
				layeredPane.setLayer(panel_4, 0);
				layeredPane.setLayer(panel_2, 1);
				
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_1.setBounds(4, 5, 193, 33);
		panel_8.add(btnNewButton_1);
		
		panel_10 = new JPanel();
		layeredPane.setLayer(panel_10, 0);
		panel_10.setBounds(0, 0, 1178, 659);
		layeredPane.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter a search target data");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(256, 64, 300, 21);
		panel_10.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(555, 61, 96, 27);
		panel_10.add(textField_2);
		textField_2.setColumns(10);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		textArea_1.setBounds(180, 120, 870, 470);
		
		JButton btnNewButton_3 = new JButton("Confirm and start analysis");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			//步骤三 Confirm and start analysis 按钮单击 事件 方法
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//将静态数据库中分析处理结果map数据清空
				StaticDataEntity.RESULT_DATA_ENTITY_MAP.clear();
				//数据结果展示文本框清空
				textArea_1.setText("");
				textArea_1.append("");
				String textByField2 = null;
				//搜索目标数据验证
				if(rdbtnNewRadioButton.isSelected()) {
					textByField2 = textField_2.getText();
					//数据非空验证
					if(null == textByField2 || "".equals(textByField2)) {
						//弹出提示框
						JOptionPane.showMessageDialog(null, "The search target is not empty.","message",1);
						return;
					}
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					textByField2 = textField_2.getText();
					//数据非空验证
					if(null == textByField2 || "".equals(textByField2)) {
						//弹出提示框
						JOptionPane.showMessageDialog(null, "The search target is not empty.","message",1);
						return;
					}
					//正则表达式对象
					Pattern p = Pattern.compile("[0-9]|[0-9]\\d+");
		            Matcher m = p.matcher(textByField2);
		            //正则验证是否是正整数
		            boolean b = m.matches();
					if(!b) {
						//否,弹出提示框
						JOptionPane.showMessageDialog(null, "The search target is wrongful.","message",1);
						return;
					}
				}
				
				//获取用户选择的数据结构列表
				List<DataStructureInfoEntity> dataStructureList = StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST;
				//循环列表中的每一个对象
				for(DataStructureInfoEntity entity : dataStructureList) {
					if(rdbtnNewRadioButton.isSelected()) {
						//用户选择的是字符型
						ListInterface<String> list = SimpleFactory.createListImplByString(entity.getCode(), 2000);
						//获取测试数据
						String[] dataStrArr = secondStepDataEntity.getStringDataArr();
						//测试数据放置到当前的数据结构中
						for(String data : dataStrArr) {
							list.add(data);
						}
						//声明并实例化数据处理结果实体
						ResultDataEntity resultDataEntity = new ResultDataEntity();
						long timeTotal = 0;
						for(int y = 1; y < 4 ; y++) {
							long time1 = System.nanoTime();
							list.search(textByField2);
							//存入搜索方法处理时间
							long time2 = (System.nanoTime() - time1);
							resultDataEntity.getTimeMap().put(y, time2);
							timeTotal += time2;
						}
						//将数据分析处理结果存储到数据结果实体中
						resultDataEntity.getTimeMap().put(4, (timeTotal / 3));
						resultDataEntity.setDataStructureCode(entity.getCode());
						resultDataEntity.setDataStructureName(entity.getDescribe());
						resultDataEntity.setBigO(entity.getBigO());
						resultDataEntity.setTimeUnit("ns");
						resultDataEntity.setAnalysisText(entity.getAnalysisText());
						//将数据结果实体存入静态数据库中
						StaticDataEntity.RESULT_DATA_ENTITY_MAP.put(entity.getCode(), resultDataEntity);
					}else if(rdbtnNewRadioButton_1.isSelected()) {
						//用户选择的是数字型
						ListInterface<Integer> list = SimpleFactory.createListImplByInteger(entity.getCode(), 2000);
						//获取测试数据
						Integer[] numberArr = secondStepDataEntity.getNumberDataArray();
						//测试数据放置到当前的数据结构中
						for(Integer data : numberArr) {
							list.add(data);
						}
						//声明并实例化数据处理结果实体
						ResultDataEntity resultDataEntity = new ResultDataEntity();
						long timeTotal = 0;
						for(int y = 1; y < 4 ; y++) {
							long time1 = System.nanoTime();
							list.search(Integer.parseInt(textByField2));
							long time2 = (System.nanoTime() - time1);
							resultDataEntity.getTimeMap().put(y, time2);
							timeTotal += time2;
						}
						//将数据分析处理结果存储到数据结果实体中
						resultDataEntity.getTimeMap().put(4, (timeTotal / 3));
						resultDataEntity.setDataStructureCode(entity.getCode());
						resultDataEntity.setDataStructureName(entity.getDescribe());
						resultDataEntity.setBigO(entity.getBigO());
						resultDataEntity.setTimeUnit("ns");
						resultDataEntity.setAnalysisText(entity.getAnalysisText());
						//将数据结果实体存入静态数据库中
						StaticDataEntity.RESULT_DATA_ENTITY_MAP.put(entity.getCode(), resultDataEntity);
					}
				}
				//将数据结果进行排序处理				
				Map<String,ResultDataEntity> resultDataMap = StaticDataEntity.RESULT_DATA_ENTITY_MAP;
				Collection<ResultDataEntity> resultCollection = resultDataMap.values();
				Iterator<ResultDataEntity> iterator = resultCollection.iterator();
				ResultDataEntity[] resultArr = new ResultDataEntity[resultCollection.size()];
				ResultDataEntity resultDataEntity = null;
				int index = 0;
				while(iterator.hasNext()) {
					resultDataEntity = iterator.next();
					resultArr[index] = resultDataEntity;
					index++;
				}
				
				ResultDataEntity resultDataEntity1 = null;
				ResultDataEntity resultDataEntity2 = null;
				ResultDataEntity resultDataEntity3 = null;
				for(int i = 0 ; i < resultArr.length ; i++) {
					resultDataEntity1 = resultArr[i];
					for(int y = 0 ; y < resultArr.length ; y++) {
						resultDataEntity2 = resultArr[y];
						if(resultDataEntity1.getTimeMap().get(4) < resultDataEntity2.getTimeMap().get(4)) {
							resultDataEntity3 = resultArr[y];
							resultArr[y] = resultArr[i];
							resultArr[i] = resultDataEntity3;
						}
					}
				}
				
				//数据结果遍历并拼接为输出字符串
				StringBuffer resultSb = new StringBuffer();
				if(resultArr.length > 0) {
					for(int i = 0 ; i < resultArr.length ; i++) {
						ResultDataEntity entity = resultArr[i];
						resultSb.append("No " + (i + 1) + ". It's " + entity.getDataStructureName()).append("\n");
						Iterator<Long> timeIterator = entity.getTimeMap().values().iterator();
						int x = 1;
						while(timeIterator.hasNext()) {
							if(x < 4) {
								resultSb.append("Execution time of " + x + " : " + timeIterator.next() + entity.getTimeUnit()).append("\n");
							}else {
								resultSb.append("Execution avg time of " + " : " + timeIterator.next() + entity.getTimeUnit()).append("\n");
							}
							x++;
						}
						resultSb.append("The big-O is " + entity.getBigO() + ".");
						resultSb.append("\n\n");
					}
				}
				
				//将分析处理结果的字符串输出到文本框中
				textArea_1.setText(resultSb.toString());
				
			}
		});
		btnNewButton_3.setBounds(666, 60, 277, 29);
		panel_10.add(btnNewButton_3);
		
		lblNewLabel_2 = new JLabel("Step 3 , is to enter the target character and start the analysis");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_2.setBounds(300, 18, 875, 21);
		panel_10.add(lblNewLabel_2);
		
		button_1 = new JButton("back");
		button_1.addMouseListener(new MouseAdapter() {
			//步骤三 back 按钮 单击事件
			@Override
			public void mouseClicked(MouseEvent e) {
				//切换到步骤二
				layeredPane.setLayer(panel_10, 0);
				layeredPane.setLayer(panel_4, 1);
				
			}
		});
		button_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		button_1.setBounds(965, 595, 193, 33);
		panel_10.add(button_1);
		
		panel_10.add(textArea_1);
		
		panel_12 = new JPanel();
		layeredPane.setLayer(panel_12, -1);
		panel_12.setBounds(0, 0, 1178, 659);
		layeredPane.add(panel_12);
		panel_12.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("exit");
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				layeredPane.setLayer(panel_12, -1);
				
			}
		});
		btnNewButton_4.setBounds(1000, 595, 123, 33);
		panel_12.add(btnNewButton_4);
		
		try {
			Image image = ImageIO.read(new File("D:\\download\\ebb3f31c6dabbd7055811e55a2f129c2.jpg"));
			textArea_2 = new JTextArea();
			textArea_2.setBounds(0, 0, 1178, 586);
			textArea_2.prepareImage(image, 100, 50, null);
			panel_12.add(textArea_2);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		rdbtnNewRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				JRadioButton jRadioButton = (JRadioButton)e.getSource();
				if(jRadioButton.isSelected()) {
					panel_7.setVisible(true);
				}
				
			}
		});
		
		rdbtnNewRadioButton_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				JRadioButton jRadioButton = (JRadioButton)e.getSource();
				if(jRadioButton.isSelected()) {
					panel_7.setVisible(false);
				}
				
			}
		});
		
	}

}
