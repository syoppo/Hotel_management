package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HotelChange extends JFrame implements ActionListener{
	
	static String driver, url;
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String sql = null;
	static String tmpstr;

	private JPanel contentPane;
	private JLabel lblPassword;
	private JLabel label_1;
	private JTextField managerpwd2;
	private JTextField managerpwd;
	private JTextField managerid;
	static JButton update;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelChange frame = new HotelChange();
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
	public HotelChange() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC815\uBCF4\uC218\uC815");
		label.setForeground(new Color(255, 182, 193));
		label.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		label.setBounds(118, 36, 81, 47);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uAD00\uB9AC\uC790ID");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setFont(new Font("³ª´®°íµñ", Font.BOLD, 13));
		lblNewLabel.setBounds(52, 108, 57, 15);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPassword.setForeground(new Color(255, 182, 193));
		lblPassword.setFont(new Font("³ª´®°íµñ", Font.BOLD, 13));
		lblPassword.setBounds(52, 146, 57, 15);
		contentPane.add(lblPassword);
		
		label_1 = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		label_1.setForeground(new Color(255, 182, 193));
		label_1.setFont(new Font("³ª´®°íµñ", Font.BOLD, 13));
		label_1.setBounds(52, 188, 88, 15);
		contentPane.add(label_1);
		
		managerpwd2 = new JTextField();
		managerpwd2.setBounds(144, 143, 116, 21);
		contentPane.add(managerpwd2);
		managerpwd2.setColumns(10);
		
		managerpwd = new JTextField();
		managerpwd.setBounds(144, 185, 116, 21);
		contentPane.add(managerpwd);
		managerpwd.setColumns(10);
		
		update = new JButton("È®ÀÎ");
		update.setForeground(new Color(255, 255, 255));
		update.setBorderPainted(false);
		update.setBackground(new Color(255, 192, 203));
		update.addActionListener(this);
		update.setFont(new Font("³ª´®°íµñ", Font.BOLD, 12));
		update.setBounds(43, 258, 97, 23);
		contentPane.add(update);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setForeground(new Color(255, 255, 255));
		button.setBorderPainted(false);
		button.setBackground(new Color(255, 192, 203));
		button.setFont(new Font("³ª´®°íµñ", Font.BOLD, 12));
		button.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Ãë¼ÒÇÏ¿´½À´Ï´Ù.");
				dispose();
				HotelLoginMain.main(null);
			}
		});
		button.setBounds(191, 258, 97, 23);
		contentPane.add(button);
		
		managerid = new JTextField();
		managerid.setColumns(10);
		managerid.setBounds(144, 104, 116, 21);
		contentPane.add(managerid);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub			
		DBC.open();
		DBC.Change(managerid, managerpwd, managerpwd2);
		}
	}

