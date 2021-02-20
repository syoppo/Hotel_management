package hotel;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.util.Calendar;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;

public class HotelReservation2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField cname_t;
	private JTextField indate_t;
	private JTextField outdate_t;
	private JTextField ap_t;
	private JLabel outdate;
	private JLabel rnum;
	private JLabel ap;
	private JTextField rnum_t;
	private JTextField renum_t;
	
	JButton save;
	
	static String driver, url;
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static String tmpstr;
	


	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelReservation2 frame = new HotelReservation2();
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
	public HotelReservation2() {
	
		int rnumt = HotelReservation.rnum;	//HotelReservation¿¡¼­ ÀúÀåÇÑ ¹æ¹øÈ£°ª °¡Á®¿È.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 586);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		save = new JButton("¿¹¾àÇÏ±â");
		save.setBorderPainted(false);
		save.setForeground(new Color(255, 255, 255));
		save.setBackground(new Color(255, 182, 193));
		save.setFont(new Font("³ª´®°íµñ", Font.BOLD, 12));
		save.addActionListener(this);
		save.setBounds(118, 478, 105, 37);
		contentPane.add(save);
		
		JButton button_1 = new JButton("Ãë¼ÒÇÏ±â");
		button_1.setBorderPainted(false);
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBackground(new Color(255, 182, 193));
		button_1.setFont(new Font("³ª´®°íµñ", Font.BOLD, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		button_1.setBounds(266, 478, 105, 37);
		contentPane.add(button_1);
		
		JLabel cname = new JLabel("°í°´ÀÌ¸§");
		cname.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 18));
		cname.setBounds(34, 226, 78, 30);
		contentPane.add(cname);
		
		JLabel indate = new JLabel("\uCCB4\uD06C\uC778\uB0A0\uC9DC");
		indate.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 18));
		indate.setBounds(34, 291, 121, 30);
		contentPane.add(indate);
		
		outdate = new JLabel("\uCCB4\uD06C\uC544\uC6C3\uB0A0\uC9DC");
		outdate.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 18));
		outdate.setBounds(34, 357, 121, 30);
		contentPane.add(outdate);
		
		rnum = new JLabel("\uBC29 \uBC88\uD638");
		rnum.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 18));
		rnum.setBounds(34, 168, 121, 30);
		contentPane.add(rnum);
		
		indate_t = new JTextField();
		indate_t.setHorizontalAlignment(SwingConstants.CENTER);
		indate_t.setColumns(10);
		indate_t.setBounds(164, 289, 282, 38);
		contentPane.add(indate_t);
		
		outdate_t = new JTextField();
		outdate_t.setHorizontalAlignment(SwingConstants.CENTER);
		outdate_t.setColumns(10);
		outdate_t.setBounds(164, 355, 282, 38);
		contentPane.add(outdate_t);
		
		cname_t = new JTextField();
		cname_t.setHorizontalAlignment(SwingConstants.CENTER);
		cname_t.setBounds(164, 224, 282, 38);
		contentPane.add(cname_t);
		cname_t.setColumns(10);
		
		ap_t = new JTextField();
		ap_t.setHorizontalAlignment(SwingConstants.CENTER);
		ap_t.setColumns(10);
		ap_t.setBounds(164, 414, 282, 38);
		contentPane.add(ap_t);
		
		ap = new JLabel("\uC778\uC6D0\uC218");
		ap.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 18));
		ap.setBounds(34, 416, 121, 30);
		contentPane.add(ap);
		
		rnum_t = new JTextField();
		rnum_t.setEditable(false);
		rnum_t.setHorizontalAlignment(SwingConstants.CENTER);
		rnum_t.setColumns(10);
		rnum_t.setBounds(164, 166, 282, 38);
		rnum_t.setText(String.valueOf(rnumt));	//ºÒ·¯¿Â ¹æ ¹øÈ£¸¦ ÅØ½ºÆ®ÇÊµå¿¡ ³Ö¾îÁÜ.
		contentPane.add(rnum_t);
		
		JLabel renum = new JLabel("\uC608\uC57D\uBC88\uD638");
		renum.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 18));
		renum.setBounds(34, 112, 121, 30);
		contentPane.add(renum);
		
		renum_t = new JTextField();
		renum_t.setHorizontalAlignment(SwingConstants.CENTER);
		renum_t.setColumns(10);
		renum_t.setBounds(164, 112, 282, 38);
		contentPane.add(renum_t);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uB4F1\uB85D");
		lblNewLabel.setForeground(new Color(255, 182, 193));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 25));
		lblNewLabel.setBounds(118, 25, 228, 57);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(renum_t.getText());
		if(e.getSource() == save) {
			try {
				DBC.open();
				String sql = ("insert into reservation values('"+a+"','"+rnum_t.getText()+"','"+cname_t.getText()+"','"+indate_t.getText()+"','"+outdate_t.getText()+"','"+ap_t.getText()+"')");
				DBC.query(sql);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("»õÇ×¸ñ Ãß°¡¿Ï·á");
			DBC.close();
		}
	}
}
