package com.pro.application;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.pro.entity.DataStructureCodeEnum;
import com.pro.entity.StaticDataEntity;

import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

public class MainApplication {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JCheckBox chckbxNewCheckBox_6;
	private JCheckBox chckbxNewCheckBox_7;
	private JCheckBox chckbxNewCheckBox_8;
	private JPanel panel_2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApplication window = new MainApplication();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1184, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("The first step , please select data structure (multiple choices are allowed)");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(9, 1, 0, 0));
		
		chckbxNewCheckBox = new JCheckBox("Bounded sorted list based on array               ");
		chckbxNewCheckBox.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Bounded unsorted list based on array             ");
		chckbxNewCheckBox_1.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Unbounded sorted list based on array             ");
		chckbxNewCheckBox_2.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("Unbounded and unsorted list based on array       ");
		chckbxNewCheckBox_3.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_3.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_3.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("Bounded sorted list based on linked list         ");
		chckbxNewCheckBox_4.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_4.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_4.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_4);
		
		chckbxNewCheckBox_5 = new JCheckBox("Bounded unsorted list based on linked list       ");
		chckbxNewCheckBox_5.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_5.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_5.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_5);
		
		chckbxNewCheckBox_6 = new JCheckBox("Unbounded sorted list based on linked list       ");
		chckbxNewCheckBox_6.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_6.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_6.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_6);
		
		chckbxNewCheckBox_7 = new JCheckBox("Unbounded and unsorted list based on linked list ");
		chckbxNewCheckBox_7.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_7.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_7.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_7);
		
		chckbxNewCheckBox_8 = new JCheckBox("Binary search tree                               ");
		chckbxNewCheckBox_8.setFont(new Font("宋体", Font.PLAIN, 22));
		chckbxNewCheckBox_8.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_8.addItemListener(new ItemListener() {
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
		panel_1.add(chckbxNewCheckBox_8);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		btnNewButton_1 = new JButton("confirm and next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator<String> codeIter = StaticDataEntity.SELECTED_DATA_STRUCTURE_CODE_LIST.iterator();
				while(codeIter.hasNext()) {
					System.out.println(codeIter.next());
				}
			}
		});
		panel_2.add(btnNewButton_1);
	}

}
