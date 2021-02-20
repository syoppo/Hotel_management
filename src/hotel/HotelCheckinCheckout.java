package hotel;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class HotelCheckinCheckout extends JFrame{
	
	private JPanel contentPane;
	static JCheckBox checkin, checkout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelCheckinCheckout frame = new HotelCheckinCheckout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public HotelCheckinCheckout() throws SQLException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 329);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 182, 193));
		panel_1.setBounds(0, 0, 279, 73);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel rnum = new JLabel();
		rnum.setForeground(new Color(255, 255, 255));
		rnum.setBounds(0, 0, 279, 73);
		panel_1.add(rnum);
		rnum.setBackground(new Color(255, 182, 193));
		rnum.setHorizontalAlignment(SwingConstants.CENTER);
		rnum.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		
		try {
			DBC.CheckinCheckout(rnum);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JCheckBox checkin = new JCheckBox("\uCCB4\uD06C\uC778");
		checkin.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		checkin.setBackground(new Color(255, 255, 255));
		checkin.setBounds(88, 98, 79, 27);
		contentPane.add(checkin);
		
		JCheckBox checkBox = new JCheckBox("\uCCB4\uD06C\uC544\uC6C3");
		checkBox.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setBounds(88, 140, 95, 27);
		contentPane.add(checkBox);
		
		JButton button = new JButton("\uD655\uC778");
		button.setBorderPainted(false);
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(255, 182, 193));
		button.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "È®ÀÎ µÇ¾ú½À´Ï´Ù.");
				dispose();
			}
		});
		button.setBounds(25, 232, 105, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uCDE8\uC18C");
		button_1.setBorderPainted(false);
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(255, 182, 193));
		button_1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ãë¼Ò µÇ¾ú½À´Ï´Ù.");
				dispose();
			}
		});
		button_1.setBounds(162, 232, 105, 27);
		contentPane.add(button_1);
	}
}
