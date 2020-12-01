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

	private JFrame frmPerformanceAnalysisOf;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JLayeredPane layeredPane;
	private JPanel panel_2;
	private JPanel panel_1;
	private JLabel label;
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
	private Choice choice;
	private Choice choice1;
	private Choice choice_1;
	private List<DataStructureInfoEntity> dataStructureInfoEntityList = new ArrayList<DataStructureInfoEntity>();
	private JPanel panel_12;
	private JButton button_2;
	private JTextArea textArea_2;

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
			@Override
			public void mouseClicked(MouseEvent e) {
				
				List<DataStructureInfoEntity> selectedDataStructureCodeList = StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST;
				int size = selectedDataStructureCodeList.size();
				if(size > 0) {
					layeredPane.setLayer(panel_2, 0);
					layeredPane.setLayer(panel_4, 1);
				}else {
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
				
				JFileChooser chooser = new JFileChooser();          //璁剧疆閫夋嫨鍣�
				chooser.setMultiSelectionEnabled(true);             //璁句负澶氶��
				int returnVal = chooser.showOpenDialog(btnNewButton);     //鏄惁鎵撳紑鏂囦欢閫夋嫨妗�
				if (returnVal == JFileChooser.APPROVE_OPTION) {     //濡傛灉绗﹀悎鏂囦欢绫诲瀷
					String filepath = chooser.getSelectedFile().getAbsolutePath();      //鑾峰彇缁濆璺緞
					textField.setText(filepath);
					
					StringBuffer stringDataSb = new StringBuffer();
					File file = new File(filepath);
					Reader reader = null;
					try {
						// 涓�娆¤涓�涓瓧绗�
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
					//System.out.println("You chose to open this file: "+ chooser.getSelectedFile().getName());  //杈撳嚭鐩稿璺緞
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
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(710, 590, 450, 39);
		panel_4.add(panel_8);
		
		JButton button = new JButton("confirm and next");
		button.setBounds(200, 5, 230, 33);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if("".equals(textArea.getText())) {
					JOptionPane.showMessageDialog(null, "No test data.","message",1);
					return;
				}
				
				//瀹炰緥鍖栭潤鎬佹暟鎹�
				StaticDataEntity staticDataEntity = new StaticDataEntity();
				
				//鍒ゆ柇閫変腑鐨勫崟閫夋寜閽�
				if(rdbtnNewRadioButton.isSelected()) {
					//鏁版嵁楠岃瘉
					if("".equals(textField.getText())) {
						JOptionPane.showMessageDialog(null, "Please select a file.","message",1);
						return;
					}
					if("".equals(textField_1.getText())) {
						JOptionPane.showMessageDialog(null, "Please input a separator.","message",1);
						return;
					}
					String[] stringDataArr = textArea.getText().split(textField_1.getText());
					secondStepDataEntity = staticDataEntity.getSecondStepDataStringTypeEntity(1, textField.getText(), textField_1.getText(), stringDataArr);
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					//鑾峰彇杈撳叆妗嗕腑鐨勬祴璇曢殢鏈烘暟瀛楁暟鎹浆鎹㈡垚Integer绫诲瀷鏁扮粍骞跺瓨鍌�
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
		button.setFont(new Font("Calibri", Font.PLAIN, 20));
		panel_8.add(button);
		
		btnNewButton_1 = new JButton("back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
			@Override
			public void mouseClicked(MouseEvent e) {
				
				StaticDataEntity.RESULT_DATA_ENTITY_MAP.clear();
				textArea_1.setText("");
				textArea_1.append("");
				String textByField2 = null;
				//Validation data
				if(rdbtnNewRadioButton.isSelected()) {
					textByField2 = textField_2.getText();
					if(null == textByField2 || "".equals(textByField2)) {
						JOptionPane.showMessageDialog(null, "The search target is not empty.","message",1);
						return;
					}
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					textByField2 = textField_2.getText();
					if(null == textByField2 || "".equals(textByField2)) {
						JOptionPane.showMessageDialog(null, "The search target is not empty.","message",1);
						return;
					}
					Pattern p = Pattern.compile("[0-9]|[0-9]\\d+");
		            Matcher m = p.matcher(textByField2);
		            boolean b = m.matches();
					if(!b) {
						JOptionPane.showMessageDialog(null, "The search target is wrongful.","message",1);
						return;
					}
				}
				
				//Analysis and treatment
				List<DataStructureInfoEntity> dataStructureList = StaticDataEntity.SELECTED_DATA_STRUCTURE_LIST;
				for(DataStructureInfoEntity entity : dataStructureList) {
					if(rdbtnNewRadioButton.isSelected()) {
						ListInterface<String> list = SimpleFactory.createListImplByString(entity.getCode(), 2000);
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
						resultDataEntity.setDataStructureCode(entity.getCode());
						resultDataEntity.setDataStructureName(entity.getDescribe());
						resultDataEntity.setBigO(entity.getBigO());
						resultDataEntity.setTimeUnit("ns");
						resultDataEntity.setAnalysisText(entity.getAnalysisText());
						StaticDataEntity.RESULT_DATA_ENTITY_MAP.put(entity.getCode(), resultDataEntity);
					}else if(rdbtnNewRadioButton_1.isSelected()) {
						ListInterface<Integer> list = SimpleFactory.createListImplByInteger(entity.getCode(), 2000);
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
						resultDataEntity.setDataStructureCode(entity.getCode());
						resultDataEntity.setDataStructureName(entity.getDescribe());
						resultDataEntity.setBigO(entity.getBigO());
						resultDataEntity.setTimeUnit("ns");
						resultDataEntity.setAnalysisText(entity.getAnalysisText());
						StaticDataEntity.RESULT_DATA_ENTITY_MAP.put(entity.getCode(), resultDataEntity);
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
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 22));
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
