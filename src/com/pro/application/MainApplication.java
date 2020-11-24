package com.pro.application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.pro.entity.DataStructureCodeEnum;
import com.pro.entity.StaticDataEntity;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
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
					JOptionPane.showMessageDialog(null, "请选择至少一个数据结构!");
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
		
		rdbtnNewRadioButton = new JRadioButton("String type");
		rdbtnNewRadioButton.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton.setFont(new Font("宋体", Font.PLAIN, 21));
		
		rdbtnNewRadioButton_1 = new JRadioButton("Integer type");
		rdbtnNewRadioButton_1.setName("rdbtnNewRadioButton");
		rdbtnNewRadioButton_1.setFont(new Font("宋体", Font.PLAIN, 21));
		panel_6.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_6.add(rdbtnNewRadioButton);
		panel_6.add(rdbtnNewRadioButton_1);
		
		TextArea textArea = new TextArea();
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
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(710, 590, 450, 39);
		panel_4.add(panel_8);
		
		JButton button = new JButton("confirm and next");
		button.setBounds(200, 5, 230, 33);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StaticDataEntity staticDataEntity = new StaticDataEntity();
				
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
		
		
	}
}
