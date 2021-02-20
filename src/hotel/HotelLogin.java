package hotel;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import hotel.DBC;
import java.awt.Color;

public class HotelLogin extends JFrame {
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static String sql = null;
	
	private JPanel contentPane;
	private JTextField txtId;
	private JButton btnNewButton;
	private JPasswordField txtPw;
	private JLabel lblNewLabel;
	
	public static String managerid = null;
	public static String managerpwd = null;
	public static String password = null;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelLogin frame = new HotelLogin();
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
	
	
	public HotelLogin() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("PW");
		lblId.setBackground(new Color(255, 182, 193));
		lblId.setForeground(new Color(255, 192, 203));
		lblId.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lblId.setBounds(73, 161, 57, 15);
		contentPane.add(lblId);
		
		JLabel label = new JLabel("ID");
		label.setBackground(new Color(255, 182, 193));
		label.setForeground(new Color(255, 192, 203));
		label.setFont(new Font("나눔고딕", Font.BOLD, 12));
		label.setBounds(73, 118, 57, 15);
		contentPane.add(label);
		
		txtPw = new JPasswordField();
		txtPw.setBounds(167, 158, 116, 21);
		contentPane.add(txtPw);
		
		txtId = new JTextField();
		txtId.setBounds(167, 115, 116, 21);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false); 
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String managerid = txtId.getText();
				char[] pwd = txtPw.getPassword();
				String managerpwd = new String(pwd);
				
				if (managerid.equals("") || managerpwd.equals("")) {	//아이디 또는 비밀번호에 빈칸이 있으면 if문 실행
					JOptionPane.showMessageDialog(null, "빈칸이 있습니다. 다시 입력해 주세요.");
				} else {
					//입력한 아이디와 비밀번호를 DBC클래스의 loginServiece로 보낸다.
					boolean existLogin = DBC.loginServiece(managerid,managerpwd);
					
					if(existLogin) {
						//로그인 성공시
						JOptionPane.showMessageDialog(null, "로그인성공");
						txtId.setText("");
						txtPw.setText("");
						HotelLoginMain a = new HotelLoginMain();
						a.setVisible(true);
						dispose();
					}else
						JOptionPane.showMessageDialog(null, "로그인실패\n아이디 또는 비밀번호를 확인해주세요.");
				}
				password = null;
			}
		});
		
		btnNewButton.setBounds(42, 231, 97, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("\uAD00\uB9AC\uC790\uB85C\uADF8\uC778");
		lblNewLabel.setBackground(new Color(255, 182, 193));
		lblNewLabel.setForeground(new Color(255, 192, 203));
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 30));
		lblNewLabel.setBounds(82, 13, 168, 95);
		contentPane.add(lblNewLabel);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBorderPainted(false); 
		btnCancel.setBackground(new Color(255, 182, 193));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "취소되었습니다.");
				Hotel.main(null);
				dispose();
			}
		});
		btnCancel.setFont(new Font("나눔고딕", Font.BOLD, 12));
		btnCancel.setBounds(196, 231, 97, 23);
		contentPane.add(btnCancel);
	}

	
}
