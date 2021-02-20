package hotel;

import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class Select2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select2 frame = new Select2();
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
	public Select2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 270);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC6D0\uD558\uB294 \uC2E4\uD589 \uC120\uD0DD");
		label.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		label.setBounds(164, 58, 154, 36);
		contentPane.add(label);
		
		JButton button = new JButton("\uCCB4\uD06C\uC778/\uCCB4\uD06C\uC544\uC6C3");
		button.setBorderPainted(false);
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("³ª´®°íµñ", Font.BOLD, 13));
		button.setBackground(new Color(255, 182, 193));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelCheckinCheckout.main(null);
				dispose();
			}
		});
		button.setBounds(12, 163, 124, 58);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uAC1D\uC2E4\uC815\uBCF4");
		button_1.setBorderPainted(false);
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_1.setBackground(new Color(255, 182, 193));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HotelRoomInformation.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		button_1.setBounds(169, 163, 124, 58);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(387, 10, 64, 36);
		contentPane.add(btnNewButton);
		
		JButton button_2 = new JButton("\uAC1D\uC2E4\uC0C1\uD0DC");
		button_2.setBorderPainted(false);
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		button_2.setBackground(new Color(255, 182, 193));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HotelRoomState.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setBounds(327, 163, 124, 58);
		contentPane.add(button_2);
	}
}
