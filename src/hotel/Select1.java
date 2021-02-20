package hotel;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class Select1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select1 frame = new Select1();
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
	public Select1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC6D0\uD558\uB294 \uC2E4\uD589 \uC120\uD0DD");
		label.setForeground(new Color(255, 192, 203));
		label.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
		label.setBounds(79, 50, 144, 44);
		contentPane.add(label);
		
		JButton button = new JButton("\uC870\uD68C");
		button.setBorderPainted(false);
		button.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 14));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(255, 182, 193));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					HotelInquiry.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		button.setBounds(79, 117, 134, 44);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uB4F1\uB85D");
		button_1.setBorderPainted(false);
		button_1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 14));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(255, 182, 193));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRegistration.main(null);
				dispose();
			}
		});
		button_1.setBounds(79, 186, 134, 44);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u2190");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 24));
		btnNewButton.setForeground(new Color(255, 182, 193));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelLoginMain.main(null);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 10, 63, 31);
		contentPane.add(btnNewButton);
	}
}
