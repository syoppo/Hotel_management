package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTable;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class HotelRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_5;
	private JCheckBox checkBox_6;
	private JCheckBox checkBox_7;
	private JCheckBox checkBox_8;
	private JCheckBox checkBox_9;
	private JCheckBox checkBox_10;
	private JCheckBox checkBox_11;
	private JCheckBox checkBox_12;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_13;
	private JCheckBox checkBox_14;
	private JCheckBox checkBox_15;
	private JCheckBox checkBox_16;
	private JCheckBox checkBox_17;
	private JCheckBox checkBox_18;
	private JCheckBox checkBox_19;
	private JCheckBox checkBox_20;
	private JCheckBox checkBox_21;
	private JCheckBox checkBox_22;
	private JCheckBox checkBox_23;
	private JCheckBox checkBox_24;
	private JCheckBox checkBox_25;
	private JCheckBox checkBox_26;
	private JCheckBox checkBox_27;
	private JCheckBox checkBox_28;
	private JCheckBox checkBox_29;
	private JLabel label_1;
	private JButton button_1;
	private JMenu menu_2;
	private JMenuItem menuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelRegistration frame = new HotelRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HotelRegistration() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,700 , 586);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("예약등록");
		label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 25));
		label.setBounds(86, 168, 124, 45);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(255, 182, 193));
		textField.setText("  일요일");
		textField.setBounds(86, 257, 72, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setBackground(new Color(255, 182, 193));
		textField_1.setText("  월요일");
		textField_1.setColumns(10);
		textField_1.setBounds(157, 257, 72, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setBackground(new Color(255, 182, 193));
		textField_2.setText("  화요일");
		textField_2.setColumns(10);
		textField_2.setBounds(228, 257, 72, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.WHITE);
		textField_3.setBackground(new Color(255, 182, 193));
		textField_3.setText("  수요일");
		textField_3.setColumns(10);
		textField_3.setBounds(296, 257, 72, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setBackground(new Color(255, 182, 193));
		textField_4.setText("  목요일");
		textField_4.setColumns(10);
		textField_4.setBounds(368, 257, 72, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setBackground(new Color(255, 182, 193));
		textField_5.setText("  금요일");
		textField_5.setColumns(10);
		textField_5.setBounds(439, 257, 72, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.WHITE);
		textField_6.setBackground(new Color(255, 182, 193));
		textField_6.setText("  토요일");
		textField_6.setColumns(10);
		textField_6.setBounds(511, 257, 72, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setForeground(new Color(255, 182, 193));
		textField_7.setBounds(86, 277, 72, 24);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setForeground(new Color(255, 182, 193));
		textField_8.setColumns(10);
		textField_8.setBounds(157, 277, 72, 24);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setForeground(new Color(255, 182, 193));
		textField_9.setColumns(10);
		textField_9.setBounds(228, 277, 72, 24);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(255, 182, 193));
		textField_10.setColumns(10);
		textField_10.setBounds(296, 277, 72, 24);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setForeground(new Color(255, 182, 193));
		textField_11.setColumns(10);
		textField_11.setBounds(368, 277, 72, 24);
		contentPane.add(textField_11);
		
		checkBox_4 = new JCheckBox("1일");
		checkBox_4.setForeground(new Color(255, 182, 193));
		checkBox_4.setBackground(Color.WHITE);
		checkBox_4.setBounds(439, 276, 72, 27);
		contentPane.add(checkBox_4);
		
		checkBox_5 = new JCheckBox("2일");
		checkBox_5.setForeground(new Color(255, 182, 193));
		checkBox_5.setBackground(Color.WHITE);
		checkBox_5.setBounds(511, 276, 72, 27);
		contentPane.add(checkBox_5);
		
		checkBox_6 = new JCheckBox("3일");
		checkBox_6.setForeground(new Color(255, 182, 193));
		checkBox_6.setBackground(Color.WHITE);
		checkBox_6.setBounds(86, 301, 72, 27);
		contentPane.add(checkBox_6);
		
		checkBox_7 = new JCheckBox("4일");
		checkBox_7.setForeground(new Color(255, 182, 193));
		checkBox_7.setBackground(Color.WHITE);
		checkBox_7.setBounds(157, 301, 72, 27);
		contentPane.add(checkBox_7);
		
		checkBox_8 = new JCheckBox("5일");
		checkBox_8.setForeground(new Color(255, 182, 193));
		checkBox_8.setBackground(Color.WHITE);
		checkBox_8.setBounds(228, 301, 72, 27);
		contentPane.add(checkBox_8);
		
		checkBox_9 = new JCheckBox("6일");
		checkBox_9.setForeground(new Color(255, 182, 193));
		checkBox_9.setBackground(Color.WHITE);
		checkBox_9.setBounds(296, 301, 72, 27);
		contentPane.add(checkBox_9);
		
		checkBox_10 = new JCheckBox("7일");
		checkBox_10.setForeground(new Color(255, 182, 193));
		checkBox_10.setBackground(Color.WHITE);
		checkBox_10.setBounds(368, 301, 72, 27);
		contentPane.add(checkBox_10);
		
		checkBox_11 = new JCheckBox("8일");
		checkBox_11.setForeground(new Color(255, 182, 193));
		checkBox_11.setBackground(Color.WHITE);
		checkBox_11.setBounds(439, 301, 72, 27);
		contentPane.add(checkBox_11);
		
		checkBox_12 = new JCheckBox("9일");
		checkBox_12.setForeground(new Color(255, 182, 193));
		checkBox_12.setBackground(Color.WHITE);
		checkBox_12.setBounds(511, 301, 72, 27);
		contentPane.add(checkBox_12);
		
		checkBox = new JCheckBox("10일");
		checkBox.setForeground(new Color(255, 182, 193));
		checkBox.setBackground(Color.WHITE);
		checkBox.setBounds(86, 329, 72, 27);
		contentPane.add(checkBox);
		
		checkBox_1 = new JCheckBox("11일");
		checkBox_1.setForeground(new Color(255, 182, 193));
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setBounds(157, 329, 72, 27);
		contentPane.add(checkBox_1);
		
		checkBox_2 = new JCheckBox("12일");
		checkBox_2.setForeground(new Color(255, 182, 193));
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setBounds(228, 329, 72, 27);
		contentPane.add(checkBox_2);
		
		checkBox_3 = new JCheckBox("13일");
		checkBox_3.setForeground(new Color(255, 182, 193));
		checkBox_3.setBackground(Color.WHITE);
		checkBox_3.setBounds(296, 329, 72, 27);
		contentPane.add(checkBox_3);
		
		checkBox_13 = new JCheckBox("14일");
		checkBox_13.setForeground(new Color(255, 182, 193));
		checkBox_13.setBackground(Color.WHITE);
		checkBox_13.setBounds(368, 329, 72, 27);
		contentPane.add(checkBox_13);
		
		checkBox_14 = new JCheckBox("15일");
		checkBox_14.setForeground(new Color(255, 182, 193));
		checkBox_14.setBackground(Color.WHITE);
		checkBox_14.setBounds(439, 329, 72, 27);
		contentPane.add(checkBox_14);
		
		checkBox_15 = new JCheckBox("16일");
		checkBox_15.setForeground(new Color(255, 182, 193));
		checkBox_15.setBackground(Color.WHITE);
		checkBox_15.setBounds(511, 329, 72, 27);
		contentPane.add(checkBox_15);
		
		checkBox_16 = new JCheckBox("17일");
		checkBox_16.setForeground(new Color(255, 182, 193));
		checkBox_16.setBackground(Color.WHITE);
		checkBox_16.setBounds(86, 357, 72, 27);
		contentPane.add(checkBox_16);
		
		checkBox_17 = new JCheckBox("18일");
		checkBox_17.setForeground(new Color(255, 182, 193));
		checkBox_17.setBackground(Color.WHITE);
		checkBox_17.setBounds(157, 357, 72, 27);
		contentPane.add(checkBox_17);
		
		checkBox_18 = new JCheckBox("19일");
		checkBox_18.setForeground(new Color(255, 182, 193));
		checkBox_18.setBackground(Color.WHITE);
		checkBox_18.setBounds(228, 357, 72, 27);
		contentPane.add(checkBox_18);
		
		checkBox_19 = new JCheckBox("20일");
		checkBox_19.setForeground(new Color(255, 182, 193));
		checkBox_19.setBackground(Color.WHITE);
		checkBox_19.setBounds(296, 357, 72, 27);
		contentPane.add(checkBox_19);
		
		checkBox_20 = new JCheckBox("21일");
		checkBox_20.setForeground(new Color(255, 182, 193));
		checkBox_20.setBackground(Color.WHITE);
		checkBox_20.setBounds(368, 357, 72, 27);
		contentPane.add(checkBox_20);
		
		checkBox_21 = new JCheckBox("22일");
		checkBox_21.setForeground(new Color(255, 182, 193));
		checkBox_21.setBackground(Color.WHITE);
		checkBox_21.setBounds(439, 357, 72, 27);
		contentPane.add(checkBox_21);
		
		checkBox_22 = new JCheckBox("23일");
		checkBox_22.setForeground(new Color(255, 182, 193));
		checkBox_22.setBackground(Color.WHITE);
		checkBox_22.setBounds(511, 357, 72, 27);
		contentPane.add(checkBox_22);
		
		checkBox_23 = new JCheckBox("24일");
		checkBox_23.setForeground(new Color(255, 182, 193));
		checkBox_23.setBackground(Color.WHITE);
		checkBox_23.setBounds(86, 383, 72, 27);
		contentPane.add(checkBox_23);
		
		checkBox_24 = new JCheckBox("25일");
		checkBox_24.setForeground(new Color(255, 182, 193));
		checkBox_24.setBackground(Color.WHITE);
		checkBox_24.setBounds(157, 383, 72, 27);
		contentPane.add(checkBox_24);
		
		checkBox_25 = new JCheckBox("26일");
		checkBox_25.setForeground(new Color(255, 182, 193));
		checkBox_25.setBackground(Color.WHITE);
		checkBox_25.setBounds(228, 383, 72, 27);
		contentPane.add(checkBox_25);
		
		checkBox_26 = new JCheckBox("27일");
		checkBox_26.setForeground(new Color(255, 182, 193));
		checkBox_26.setBackground(Color.WHITE);
		checkBox_26.setBounds(296, 383, 72, 27);
		contentPane.add(checkBox_26);
		
		checkBox_27 = new JCheckBox("28일");
		checkBox_27.setForeground(new Color(255, 182, 193));
		checkBox_27.setBackground(Color.WHITE);
		checkBox_27.setBounds(368, 383, 72, 27);
		contentPane.add(checkBox_27);
		
		checkBox_28 = new JCheckBox("29일");
		checkBox_28.setForeground(new Color(255, 182, 193));
		checkBox_28.setBackground(Color.WHITE);
		checkBox_28.setBounds(439, 383, 72, 27);
		contentPane.add(checkBox_28);
		
		checkBox_29 = new JCheckBox("30일");
		checkBox_29.setForeground(new Color(255, 182, 193));
		checkBox_29.setBackground(Color.WHITE);
		checkBox_29.setBounds(511, 383, 72, 27);
		contentPane.add(checkBox_29);
		
		JButton button = new JButton("<");
		button.setForeground(new Color(255, 182, 193));
		button.setBackground(Color.WHITE);
		button.setBounds(118, 225, 59, 27);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton(">");
		btnNewButton.setForeground(new Color(255, 182, 193));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(484, 225, 59, 27);
		contentPane.add(btnNewButton);
		
		label_1 = new JLabel("11월");
		label_1.setForeground(new Color(255, 182, 193));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(290, 229, 62, 18);
		contentPane.add(label_1);
		
		button_1 = new JButton("\uC608\uC57D\uB4F1\uB85D");
		button_1.setBorderPainted(false);
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(255, 182, 193));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelReservation.main(null);
				dispose();
			}
		});
		button_1.setBounds(446, 484, 97, 23);
		contentPane.add(button_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.setBackground(SystemColor.menu);
		menuBar.setBounds(0, 0, 713, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("\uAC1D\uC2E4");
		menu.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\uAC1D\uC2E4 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRoom.main(null);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menu.add(mntmNewMenuItem_5);
		
		menu_2 = new JMenu("\uC608\uC57D");
		menu_2.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(menu_2);
		
		menuItem = new JMenuItem("\uC608\uC57D\uC870\uD68C");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HotelInquiry.main(null);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		menuItem.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuItem.setBackground(SystemColor.menu);
		menu_2.add(menuItem);
		
		JMenu mnNewMenu_1 = new JMenu("\uD22C\uC219\uAC1D\uC815\uBCF4");
		mnNewMenu_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\uD22C\uC219\uAC1D \uC815\uBCF4");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HotelGuest.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mntmNewMenuItem_6.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		mntmNewMenuItem_6.setBackground(SystemColor.menu);
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu menu_1 = new JMenu("\uBA54\uC778");
		menu_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(menu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uBA54\uC778\uD654\uBA74");
		mntmNewMenuItem_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelLoginMain.main(null);
				dispose();
			}
		});
		menu_1.add(mntmNewMenuItem_1);
	}
}
