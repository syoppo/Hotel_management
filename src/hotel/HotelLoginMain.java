package hotel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HotelLoginMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelLoginMain frame = new HotelLoginMain();
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
	public HotelLoginMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 503);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 357, 21);
		contentPane.add(menuBar);
		JMenu menu = new JMenu("\uAC1D\uC2E4");
		menu.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\uAC1D\uC2E4 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRoom.main(null);
				dispose();
			}
		});
		mntmNewMenuItem_5.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu = new JMenu("\uC608\uC57D");
		mnNewMenu.setBackground(new Color(255, 255, 255));
		mnNewMenu.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\uC608\uC57D\uC870\uD68C");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
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
		mntmNewMenuItem_2.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		mntmNewMenuItem_2.setBackground(SystemColor.menu);
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uC608\uC57D\uB4F1\uB85D");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRegistration.main(null);
				dispose();
			}
		});
		mntmNewMenuItem_3.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("\uD22C\uC219\uAC1D\uC815\uBCF4");
		mnNewMenu_1.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\uD22C\uC219\uAC1D \uC815\uBCF4");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HotelGuest.main(null);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mntmNewMenuItem_6.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 12));
		mntmNewMenuItem_6.setBackground(SystemColor.menu);
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JButton btnNewButton = new JButton("\uC815\uBCF4\uC218\uC815");
		btnNewButton.setForeground(new Color(255, 255, 255));
		menuBar.add(btnNewButton);
		btnNewButton.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 12));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HotelChange.main(null);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 182, 193));
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		menuBar.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 12));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hotel.main(null);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		
		JButton button = new JButton("\uC608\uC57D");
		button.setBorderPainted(false);
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select1.main(null);
				dispose();
			}
		});
		button.setBackground(new Color(255, 182, 193));
		button.setBounds(33, 246, 243, 61);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uAC1D\uC2E4 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		button_1.setBorderPainted(false);
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRoom.main(null);
				dispose();
			}
		});
		button_1.setBackground(new Color(255, 182, 193));
		button_1.setBounds(33, 317, 243, 61);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\uD22C\uC219\uAC1D \uC815\uBCF4");
		button_2.setBorderPainted(false);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					HotelGuest.main(null);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBackground(new Color(255, 182, 193));
		button_2.setBounds(33, 388, 243, 61);
		contentPane.add(button_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HotelLoginMain.class.getResource("/image/150\uC0AC\uC774\uC988.png")));
		lblNewLabel.setBounds(90, 51, 161, 167);
		contentPane.add(lblNewLabel);
	}
}
