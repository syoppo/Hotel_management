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

public class HotelRoomState extends JFrame {

	private JPanel contentPane;
	private JTextField room_type_t;
	private JTextField cname_t;
	private JTextField indate_t;
	private JTextField outdate_t;
	private JTextField ap_t;
	private JTextField rnum_t;
	private JButton btnNewButton;
	private JTextField textField;
	
	static String driver, url;
	static Connection conn;
	static ResultSet rs;
	static Statement stmt;
	static long count = 0;
	

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelRoomState frame = new HotelRoomState();
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
	public HotelRoomState() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		indate_t = new JTextField();
		//indate_t.setText("2019-11-19~2019-11-20");
		indate_t.setHorizontalAlignment(SwingConstants.CENTER);
		indate_t.setColumns(10);
		indate_t.setBounds(115, 173, 150, 30);
		contentPane.add(indate_t);
		
		ap_t = new JTextField();
		//ap_t.setText("1¸í");
		ap_t.setHorizontalAlignment(SwingConstants.CENTER);
		ap_t.setColumns(10);
		ap_t.setBounds(115, 257, 150, 30);
		contentPane.add(ap_t);
		
		cname_t = new JTextField();
		cname_t.setHorizontalAlignment(SwingConstants.CENTER);
		//rname_t.setText("º¹¼øÀÌ");
		cname_t.setColumns(10);
		cname_t.setBounds(115, 133, 150, 30);
		contentPane.add(cname_t);
		
		JLabel indate = new JLabel("\uCCB4\uD06C\uC778\uC77C\uC790");
		indate.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 13));
		indate.setHorizontalAlignment(SwingConstants.LEFT);
		indate.setBounds(12, 178, 62, 18);
		contentPane.add(indate);
		
		JLabel room_type = new JLabel("°´½ÇÅ¸ÀÔ");
		room_type.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 13));
		room_type.setHorizontalAlignment(SwingConstants.LEFT);
		room_type.setBounds(12, 95, 62, 18);
		contentPane.add(room_type);
		
		JLabel cname = new JLabel("°í°´¸í");
		cname.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 13));
		cname.setHorizontalAlignment(SwingConstants.LEFT);
		cname.setBounds(12, 138, 62, 18);
		contentPane.add(cname);
		
		JLabel ap = new JLabel("ÀÎ¿ø¼ö");
		ap.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 13));
		ap.setHorizontalAlignment(SwingConstants.LEFT);
		ap.setBounds(12, 262, 62, 18);
		contentPane.add(ap);
		
		room_type_t = new JTextField();
		//room_type_t.setText("½ºÅÄ´Ùµå·ë");
		room_type_t.setHorizontalAlignment(SwingConstants.CENTER);
		room_type_t.setBounds(115, 93, 150, 30);
		contentPane.add(room_type_t);
		room_type_t.setColumns(10);
		
		rnum_t = new JTextField();
		rnum_t.setForeground(new Color(255, 255, 255));
		rnum_t.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 25));
		//rnum_t.setText("101È£");
		rnum_t.setHorizontalAlignment(SwingConstants.CENTER);
		rnum_t.setBackground(new Color(255, 182, 193));
		rnum_t.setBounds(0, 0, 296, 68);
		contentPane.add(rnum_t);
		rnum_t.setColumns(10);
		
		btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel outdate = new JLabel("\uCCB4\uD06C\uC544\uC6C3\uC77C\uC790");
		outdate.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 13));
		outdate.setHorizontalAlignment(SwingConstants.LEFT);
		outdate.setBounds(12, 222, 91, 18);
		contentPane.add(outdate);
		btnNewButton.setBounds(92, 309, 105, 32);
		contentPane.add(btnNewButton);
		
		outdate_t = new JTextField();
		//textField.setText("2019-11-19~2019-11-20");
		outdate_t.setHorizontalAlignment(SwingConstants.CENTER);
		outdate_t.setColumns(10);
		outdate_t.setBounds(115, 217, 150, 30);
		contentPane.add(outdate_t);
		
		try {
			DBC.RoomState(rnum_t, room_type_t, cname_t, indate_t, outdate_t, ap_t);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
