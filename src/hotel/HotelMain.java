package hotel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;

public class HotelMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public HotelMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBorderPainted(false); 
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 12));
		btnLogin.setBackground(new Color(255, 192, 203));
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				HotelLogin.main(null);
				dispose();
			}
		});
		btnLogin.setBounds(771, 429, 114, 46);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HotelMain.class.getResource("/image/\uD06C\uAE30\uBCC0\uD658_\uADF8\uB79C\uB4DC\uBCF5\uC21C.png")));
		lblNewLabel.setBounds(-100, 0, 934, 511);
		contentPane.add(lblNewLabel);
	}
}
