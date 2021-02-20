package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import org.eclipse.wb.swing.FocusTraversalOnArray;

public class HotelRoomInformation extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
	static JTextField room_type_t, basic_ap_t, max_ap_t, charge_t;
	static Label rnum;

	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String url;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws SQLException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelRoomInformation frame = new HotelRoomInformation();
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
	public HotelRoomInformation() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 281, 73);
		contentPane.add(panel);
		
		rnum = new Label();
		rnum.setForeground(new Color(255, 255, 255));
		rnum.setAlignment(Label.CENTER);
		rnum.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 20));
		rnum.setBounds(69, 26, 166, 21);
		panel.add(rnum);
		
		JLabel room_type = new JLabel("\uAC1D\uC2E4\uD0C0\uC785");
		room_type.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		room_type.setBounds(28, 106, 62, 18);
		contentPane.add(room_type);
		room_type_t = new JTextField();
		room_type_t.setHorizontalAlignment(SwingConstants.CENTER);
		room_type_t.setBounds(116, 103, 126, 24);
		contentPane.add(room_type_t);
		
		JLabel basic_ap = new JLabel("\uAE30\uBCF8\uC778\uC6D0");
		basic_ap.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		basic_ap.setBounds(28, 152, 62, 18);
		contentPane.add(basic_ap);
		basic_ap_t = new JTextField();
		basic_ap_t.setHorizontalAlignment(SwingConstants.CENTER);
		basic_ap_t.setBounds(116, 149, 126, 24);
		contentPane.add(basic_ap_t);
		
		JLabel max_ap = new JLabel("\uCD5C\uB300\uC778\uC6D0");
		max_ap.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		max_ap.setBounds(28, 200, 62, 22);
		contentPane.add(max_ap);
		max_ap_t = new JTextField();
		max_ap_t.setHorizontalAlignment(SwingConstants.CENTER);
		max_ap_t.setBounds(116, 199, 126, 24);
		contentPane.add(max_ap_t);
		
		JLabel charge = new JLabel("\uAC00\uACA9");
		charge.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
		charge.setBounds(39, 243, 35, 22);
		contentPane.add(charge);
		charge_t = new JTextField();
		charge_t.setHorizontalAlignment(SwingConstants.CENTER);
		charge_t.setBounds(116, 242, 126, 24);
		contentPane.add(charge_t);
		
		btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(158, 315, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton search = new JButton("\uAC80\uC0C9");
		search.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		search.setForeground(new Color(255, 255, 255));
		search.addActionListener(this);
		search.setBackground(new Color(255, 182, 193));
		search.setBounds(28, 315, 97, 23);
		contentPane.add(search);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			DBC.Information(rnum, room_type_t, basic_ap_t, max_ap_t, charge_t);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

