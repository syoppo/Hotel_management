package hotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class HotelReservation extends JFrame {

	static int rnum;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelReservation frame = new HotelReservation();
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
	public HotelReservation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 586);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 713, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("\uAC1D\uC2E4");
		menu.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\uAC1D\uC2E4 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRoom.main(null);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menu.add(mntmNewMenuItem_5);
		
		JMenu menu_2 = new JMenu("\uC608\uC57D");
		menu_2.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.add(menu_2);
		
		JMenuItem menuItem = new JMenuItem("\uC608\uC57D\uC870\uD68C");
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
		menuItem.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuItem.setBackground(SystemColor.menu);
		menu_2.add(menuItem);
		
		JMenu mnNewMenu_1 = new JMenu("\uD22C\uC219\uAC1D\uC815\uBCF4");
		mnNewMenu_1.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
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
		mntmNewMenuItem_6.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		mntmNewMenuItem_6.setBackground(SystemColor.menu);
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu menu_1 = new JMenu("\uBA54\uC778");
		menu_1.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.add(menu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uBA54\uC778\uD654\uBA74");
		mntmNewMenuItem_1.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelLoginMain.main(null);
				dispose();
			}
		});
		menu_1.add(mntmNewMenuItem_1);
		
		JLabel label = new JLabel("¿¹¾à °¡´É °´½Ç");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 25));
		label.setBounds(223, 98, 208, 49);
		contentPane.add(label);
		
		JButton button = new JButton("101È£");
		button.setBorderPainted(false);
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button.setBackground(new Color(255, 182, 193));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 101;
				HotelReservation2.main(null);
			}
		});
		button.setBounds(64, 189, 105, 57);
		contentPane.add(button);
		
		JButton button_1 = new JButton("102È£");
		button_1.setBorderPainted(false);
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_1.setBackground(new Color(255, 182, 193));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 102;
				HotelReservation2.main(null);
			}
		});
		button_1.setBounds(209, 189, 105, 57);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("103È£");
		button_2.setBorderPainted(false);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_2.setBackground(new Color(255, 182, 193));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 103;
				HotelReservation2.main(null);
			}
		});
		button_2.setBounds(350, 189, 105, 57);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("104È£");
		button_3.setBorderPainted(false);
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_3.setBackground(new Color(255, 182, 193));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 104;
				HotelReservation2.main(null);
			}
		});
		button_3.setBounds(494, 189, 105, 57);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("201È£");
		button_4.setBorderPainted(false);
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_4.setBackground(new Color(255, 182, 193));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 201;
				HotelReservation2.main(null);
			}
		});
		button_4.setBounds(64, 277, 105, 58);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("202È£");
		button_5.setBorderPainted(false);
		button_5.setForeground(new Color(255, 255, 255));
		button_5.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_5.setBackground(new Color(255, 182, 193));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 202;
				HotelReservation2.main(null);
			}
		});
		button_5.setBounds(209, 277, 105, 58);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("203È£");
		button_6.setBorderPainted(false);
		button_6.setForeground(new Color(255, 255, 255));
		button_6.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_6.setBackground(new Color(255, 182, 193));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 203;
				HotelReservation2.main(null);
			}
		});
		button_6.setBounds(350, 277, 105, 58);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("204È£");
		button_7.setBorderPainted(false);
		button_7.setForeground(new Color(255, 255, 255));
		button_7.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_7.setBackground(new Color(255, 182, 193));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 204;
				HotelReservation2.main(null);
			}
		});
		button_7.setBounds(494, 277, 105, 58);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("301È£");
		button_8.setBorderPainted(false);
		button_8.setForeground(new Color(255, 255, 255));
		button_8.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_8.setBackground(new Color(255, 182, 193));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 301;
				HotelReservation2.main(null);
			}
		});
		button_8.setBounds(64, 373, 105, 59);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("302È£");
		button_9.setBorderPainted(false);
		button_9.setForeground(new Color(255, 255, 255));
		button_9.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_9.setBackground(new Color(255, 182, 193));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 302;
				HotelReservation2.main(null);
			}
		});
		button_9.setBounds(209, 373, 105, 59);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("303È£");
		button_10.setBorderPainted(false);
		button_10.setForeground(new Color(255, 255, 255));
		button_10.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_10.setBackground(new Color(255, 182, 193));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 303;
				HotelReservation2.main(null);
			}
		});
		button_10.setBounds(350, 373, 105, 59);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("304È£");
		button_11.setBorderPainted(false);
		button_11.setForeground(new Color(255, 255, 255));
		button_11.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_11.setBackground(new Color(255, 182, 193));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rnum = 304;
				HotelReservation2.main(null);
			}
		});
		button_11.setBounds(494, 373, 105, 59);
		contentPane.add(button_11);
		
		JLabel date = new JLabel();
		date.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 20));
		date.setBounds(504, 48, 157, 49);
		contentPane.add(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(new Date());
		date.setText(today);
	}
}
