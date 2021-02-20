package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class HotelInquiry extends JFrame implements ActionListener{
	
	static String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	static String url = "jdbc:odbc:hotel?useUnicode=yes&characterEncoding=UTF8";
	static String colNames[] = {"예약번호","객실번호","고객명","체크인일자","체크아웃일자", "투숙인원"};	//테이블 데이터 모델 객체 생성
	private static DefaultTableModel model = new DefaultTableModel(colNames, 0);
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	

	private JPanel contentPane;
	private JTextField search;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) throws SQLException {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelInquiry frame = new HotelInquiry();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		viewData();
	}
	
	/**
	 * Create the frame.
	 */
	public HotelInquiry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 586);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		search = new JTextField();
		search.setBounds(359, 129, 187, 24);
		contentPane.add(search);
		search.setColumns(10);
		
		JButton btnNewButton = new JButton("검색하기");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(555, 129, 105, 24);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("예약조회");
		label.setBounds(12, 115, 105, 42);
		label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 25));
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 175, 660, 362);
		contentPane.add(scrollPane);
		
		table_1 = new JTable(model);
		scrollPane.setViewportView(table_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 713, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("\uAC1D\uC2E4");
		menu.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\uAC1D\uC2E4 \uD55C\uB208\uC5D0 \uBCF4\uAE30");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRoom.main(null);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu = new JMenu("\uC608\uC57D");
		mnNewMenu.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uC608\uC57D\uB4F1\uB85D");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelRegistration.main(null);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("\uD22C\uC219\uAC1D\uC815\uBCF4");
		mnNewMenu_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\uD22C\uC219\uAC1D \uC815\uBCF4");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					HotelGuest.main(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mntmNewMenuItem_6.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		mntmNewMenuItem_6.setBackground(SystemColor.menu);
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu menu_1 = new JMenu("\uBA54\uC778");
		menu_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		menuBar.add(menu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uBA54\uC778\uD654\uBA74");
		mntmNewMenuItem_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HotelLoginMain.main(null);
				dispose();
			}
		});
		menu_1.add(mntmNewMenuItem_1);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uACE0\uAC1D\uC774\uB984"}));
		comboBox.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(261, 129, 86, 24);
		contentPane.add(comboBox);
	}
	
	public static void viewData() {
		String sql = "Select * From reservation";
		
		//데이터 출력 전 테이블 초기화
		try {
			for(int i = 0; i<5; i++) {
				model.removeRow(0);
				}
		} catch(Exception e2) {}
		
		try {
			DBC.open();
			conn = (Connection) DBC.conn;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			DBC.query(sql);
			
			 while (rs.next()) {
		        	model.addRow(new Object[] {rs.getString("renum"), rs.getString("rnum"),
		        	rs.getString("cname"), rs.getString("indate"),
					rs.getString("outdate"), rs.getString("ap")});
			
			 } 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String sql = "select * from reservation where cname = '" +search.getText()+ "'";
		
		PreparedStatement pstmt = null;
		try {
			DBC.open();	
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			DBC.query(sql);
			
			//겁색된 데이터 출력 전 테이블 초기화
			try {
				for(int i = 0; i<5; i++) {
					model.removeRow(0);
					}
			} catch(Exception e2) {}
			
			//검색된 데이터 출력
			while (rs.next()) {
	        	model.addRow(new Object[] {rs.getString("renum"), rs.getString("rnum"),
	        	rs.getString("cname"), rs.getString("indate"),
				rs.getString("outdate"), rs.getString("ap")});
		
		 } 
			}catch (Exception e1) {
	        	e1.printStackTrace();
	            
	}

}

	
}
