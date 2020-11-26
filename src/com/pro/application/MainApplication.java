package com.pro.application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.pro.entity.DataStructureCodeEnum;
import com.pro.entity.ResultDataEntity;
import com.pro.entity.SecondStepDataEntity;
import com.pro.entity.StaticDataEntity;
import com.pro.imple.SimpleFactory;
import com.pro.inter.ListInterface;

import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class MainApplication {

	private JFrame frmPerformanceAnalysisOf;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JLayeredPane layeredPane;
	private JPanel panel_2;
	private JPanel panel_1;
	private JLabel label;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_5;
	private JCheckBox checkBox_6;
	private JCheckBox checkBox_7;
	private JCheckBox checkBox_8;
	private JPanel panel_3;
	private JButton btnConfirmAndNext;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel label_1;
	private JPanel panel_6;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private SecondStepDataEntity secondStepDataEntity;
	private JPanel panel_10;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JButton button_1;

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
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		mnNewMenu.add(mntmNewMenuItem);
		
		layeredPane = new JLayeredPane();
		frmPerformanceAnalysisOf.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		panel_2 = new JPanel();
		layeredPane.setLayer(panel_2, 1);
		panel_2.setBounds(0, 0, 1162, 643);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 5, 1162, 580);
		panel_2.add(panel_1);
		panel_1.setLayout(new GridLayout(10, 1, 0, 0));
		
		label = new JLabel("The first step , please select data structure (multiple choices are allowed)");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 26));
		panel_1.add(label);
		
		checkBox = new JCheckBox("Bounded sorted list based on array               ");
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.BOUNDED_ORDERED_LIST_BASED_ON_ARRAY.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox);
		
		checkBox_1 = new JCheckBox("Bounded unsorted list based on array             ");
		checkBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_1.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.BOUNDED_UNORDERED_LIST_BASED_ON_ARRAY.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("Unbounded sorted list based on array             ");
		checkBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_2.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.UNBOUNDED_ORDERED_LIST_BASED_ON_ARRAY.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_2);
		
		checkBox_3 = new JCheckBox("Unbounded and unsorted list based on array       ");
		checkBox_3.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_3.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_ARRAY.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_3);
		
		checkBox_4 = new JCheckBox("Bounded sorted list based on linked list         ");
		checkBox_4.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_4.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.BOUNDED_SORTED_LIST_BASED_ON_LINKED_LIST.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_4);
		
		checkBox_5 = new JCheckBox("Bounded unsorted list based on linked list       ");
		checkBox_5.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_5.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.BOUNDED_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_5);
		
		checkBox_6 = new JCheckBox("Unbounded sorted list based on linked list       ");
		checkBox_6.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_6.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_6.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.UNBOUNDED_ORDERED_LIST_BASED_ON_LINKED_LIST.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_6);
		
		checkBox_7 = new JCheckBox("Unbounded and unsorted list based on linked list ");
		checkBox_7.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_7.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_7.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_LINKED_LIST.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_7);
		
		checkBox_8 = new JCheckBox("Binary search tree                               ");
		checkBox_8.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox_8.setFont(new Font("宋体", Font.PLAIN, 22));
		checkBox_8.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String code = DataStructureCodeEnum.BINARY_SEARCH_TREE.getCode();
				JCheckBox jCheckBox = (JCheckBox)e.getSource();
				if(jCheckBox.isSelected()) {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.add(code);
				}else {
					StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.remove(code);
				}
			}
		});
		panel_1.add(checkBox_8);
		
		panel_3 = new JPanel();
		panel_3.setBounds(960, 590, 200, 39);
		panel_2.add(panel_3);
		
		btnConfirmAndNext = new JButton("confirm and next");
		btnConfirmAndNext.setFont(new Font("宋体", Font.PLAIN, 20));
		btnConfirmAndNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> selectedDataStructureCodeList = StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST;
				int size = selectedDataStructureCodeList.size();
				if(size > 0) {
					layeredPane.setLayer(panel_2, 0);
					layeredPane.setLayer(panel_4, 1);
				}else {
					JOptionPane.showMessageDialog(null, "Please select at least one data structure !", "message", 1);
				}
			}
		});
		panel_3.add(btnConfirmAndNext);
		
		panel_4 = new JPanel();
		layeredPane.setLayer(panel_4, 0);
		panel_4.setBounds(0, 0, 1162, 643);
		layeredPane.add(panel_4);
		panel_4.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setBounds(5, 5, 1157, 578);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		label_1 = new JLabel("The second step , generate appropriate test data");
		label_1.setBounds(250, 0, 672, 38);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.BOLD, 26));
		panel_5.add(label_1);
		
		panel_6 = new JPanel();
		panel_6.setBounds(250, 103, 773, 38);
		panel_5.add(panel_6);
		
		rdbtnNewRadioButton = new JRadioButton("String type",true);
		rdbtnNewRadioButton.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton.setFont(new Font("宋体", Font.PLAIN, 21));
		
		rdbtnNewRadioButton_1 = new JRadioButton("Integer type",false);
		rdbtnNewRadioButton_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				
				
			}
		});
		rdbtnNewRadioButton_1.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton_1.setFont(new Font("宋体", Font.PLAIN, 21));
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
		textField.setFont(new Font("宋体", Font.PLAIN, 22));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel_7.add(textField);
		textField.setColumns(30);
		
		JButton btnNewButton = new JButton("Selected a file");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser = new JFileChooser();          //设置选择器
				chooser.setMultiSelectionEnabled(true);             //设为多选
				int returnVal = chooser.showOpenDialog(btnNewButton);     //是否打开文件选择框
				if (returnVal == JFileChooser.APPROVE_OPTION) {     //如果符合文件类型
					String filepath = chooser.getSelectedFile().getAbsolutePath();      //获取绝对路径
					textField.setText(filepath);
					
					StringBuffer stringDataSb = new StringBuffer();
					File file = new File(filepath);
					Reader reader = null;
					try {
						// 一次读一个字符
						reader = new InputStreamReader(new FileInputStream(file));
						int tempInt;
						char tempChar;
						while ((tempInt = reader.read()) != -1) {
							tempChar = (char) tempInt;
							stringDataSb.append(tempChar);
						}
						reader.close();
						textArea.setText(stringDataSb.toString());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
					//System.out.println(filepath);
					//System.out.println("You chose to open this file: "+ chooser.getSelectedFile().getName());  //输出相对路径
				}
				
			}
		});
		panel_7.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("   Input a separator");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		panel_7.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 22));
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
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(710, 590, 450, 39);
		panel_4.add(panel_8);
		
		JButton button = new JButton("confirm and next");
		button.setBounds(200, 5, 230, 33);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if("".equals(textArea.getText())) {
					JOptionPane.showMessageDialog(null, "It's have't test data !","message",1);
					return;
				}
				
				//实例化静态数据
				StaticDataEntity staticDataEntity = new StaticDataEntity();
				
				//判断选中的单选按钮
				if(rdbtnNewRadioButton.isSelected()) {
					//数据验证
					if("".equals(textField.getText())) {
						JOptionPane.showMessageDialog(null, "Please select a file !","message",1);
						return;
					}
					if("".equals(textField_1.getText())) {
						JOptionPane.showMessageDialog(null, "Please input a separator !","message",1);
						return;
					}
					String[] stringDataArr = textArea.getText().split(textField_1.getText());
					secondStepDataEntity = staticDataEntity.getSecondStepDataStringTypeEntity(1, textField.getText(), textField_1.getText(), stringDataArr);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					//获取输入框中的测试随机数字数据转换成Integer类型数组并存储
					String[] numberArr = textArea.getText().split(",");
					Integer[] numberList = new Integer[numberArr.length];
					for(int i = 0 ; i < numberArr.length ; i++) {
						numberList[i] = Integer.parseInt(numberArr[i]);
					}
					secondStepDataEntity = staticDataEntity.getSecondStepDataIntegerTypeEntity(2, numberList);
				}
				
				layeredPane.setLayer(panel_4, 0);
				layeredPane.setLayer(panel_10, 1);
				
			}
		});
		panel_8.setLayout(null);
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		panel_8.add(button);
		
		btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.setLayer(panel_4, 0);
				layeredPane.setLayer(panel_2, 1);
				
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_1.setBounds(4, 5, 193, 33);
		panel_8.add(btnNewButton_1);
		
		panel_10 = new JPanel();
		layeredPane.setLayer(panel_10, 0);
		panel_10.setBounds(0, 0, 1178, 659);
		layeredPane.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please enter a search target\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
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
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String textByField2 = null;
				//Validation data
				if(rdbtnNewRadioButton.isSelected()) {
					textByField2 = textField_2.getText();
					if(null == textByField2 || "".equals(textByField2)) {
						JOptionPane.showMessageDialog(null, "The search target is not empty !","message",1);
						return;
					}
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					textByField2 = textField_2.getText();
					if(null == textByField2 || "".equals(textByField2)) {
						JOptionPane.showMessageDialog(null, "The search target is not empty !","message",1);
						return;
					}
					Pattern p = Pattern.compile("[0-9]|[0-9]\\d+");
		            Matcher m = p.matcher(textByField2);
		            boolean b = m.matches();
					if(!b) {
						JOptionPane.showMessageDialog(null, "The search target is wrongful !","message",1);
						return;
					}
				}
				
				//Analysis and treatment
				List<String> dataStructureList = StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST;
				for(String code : dataStructureList) {
					if(rdbtnNewRadioButton.isSelected()) {
						ListInterface<String> list = SimpleFactory.createListImplByString(code, 2000);
						String[] dataStrArr = secondStepDataEntity.getStringDataArr();
						for(String data : dataStrArr) {
							list.add(data);
						}
						ResultDataEntity resultDataEntity = new ResultDataEntity();
						for(int y = 1; y < 4 ; y++) {
							long time1 = System.currentTimeMillis() * 1000;
							list.search(textByField2);
							resultDataEntity.getTimeMap().put(y, ((System.currentTimeMillis() * 1000) - time1));
						}
						resultDataEntity.setDataStructureCode(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getCode());
						resultDataEntity.setDataStructureName(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getDescribe());
						resultDataEntity.setBigO(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getBigO());
						resultDataEntity.setTimeUnit("ns");
						resultDataEntity.setAnalysisText(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getAnalysisText());
						StaticDataEntity.RESULT_DATA_ENTITY_MAP.put(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getCode(), resultDataEntity);
					}else if(rdbtnNewRadioButton_1.isSelected()) {
						ListInterface<Integer> list = SimpleFactory.createListImplByInteger(code, 2000);
						Integer[] numberArr = secondStepDataEntity.getNumberDataArray();
						for(Integer data : numberArr) {
							list.add(data);
						}
						ResultDataEntity resultDataEntity = new ResultDataEntity();
						long timeTotal = 0;
						for(int y = 1; y < 4 ; y++) {
							long time1 = System.nanoTime();
							list.search(Integer.parseInt(textByField2));
							resultDataEntity.getTimeMap().put(y, (System.nanoTime() - time1));
							timeTotal += time1;
						}
						resultDataEntity.getTimeMap().put(4, (timeTotal / 3));
						resultDataEntity.setDataStructureCode(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getCode());
						resultDataEntity.setDataStructureName(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getDescribe());
						resultDataEntity.setBigO(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getBigO());
						resultDataEntity.setTimeUnit("ns");
						resultDataEntity.setAnalysisText(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getAnalysisText());
						StaticDataEntity.RESULT_DATA_ENTITY_MAP.put(StaticDataEntity.DATA_STRUCTURE_MAP.get(code).getCode(), resultDataEntity);
					}
				}
				
				List<ResultDataEntity> oneLevel = new ArrayList<ResultDataEntity>();
				List<ResultDataEntity> twoLevel = new ArrayList<ResultDataEntity>();
				Map<String,ResultDataEntity> resultDataMap = StaticDataEntity.RESULT_DATA_ENTITY_MAP;
				Collection<ResultDataEntity> resultCollection = resultDataMap.values();
				Iterator<ResultDataEntity> iterator = resultCollection.iterator();
				ResultDataEntity resultDataEntity = null;
				while(iterator.hasNext()) {
					resultDataEntity = iterator.next();
					if("O(log2N)".equals(resultDataEntity.getBigO())) {
						oneLevel.add(resultDataEntity);
					}else if("O(N)".equals(resultDataEntity.getBigO())) {
						twoLevel.add(resultDataEntity);
					}
				}
				oneLevel.addAll(twoLevel);
				
				StringBuffer resultSb = new StringBuffer();
				if(oneLevel.size() > 0) {
					for(int i = 0 ; i < oneLevel.size() ; i++) {
						ResultDataEntity entity = oneLevel.get(i);
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
				
				textArea_1.setText(resultSb.toString());
				
			}
		});
		btnNewButton_3.setBounds(666, 60, 277, 29);
		panel_10.add(btnNewButton_3);
		
		lblNewLabel_2 = new JLabel("The third step , is to enter the target character and start the analysis");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 22));
		lblNewLabel_2.setBounds(181, 0, 875, 21);
		panel_10.add(lblNewLabel_2);
		
		button_1 = new JButton("back");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				layeredPane.setLayer(panel_10, 0);
				layeredPane.setLayer(panel_4, 1);
				
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBounds(965, 595, 193, 33);
		panel_10.add(button_1);
		
		panel_10.add(textArea_1);
		
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
