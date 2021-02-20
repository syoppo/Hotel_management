package hotel;

import java.awt.Label;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public final class DBC {
	static String driver, url;
	static Connection conn = null;
	private static Statement stmt = null;
	public static ResultSet rs = null;
	
	//DB���� �Լ�
	public static void open() {
		driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �˻� ����!");
		} catch(Exception ex) {
            System.err.println("����̹��˻� ���� error: " + ex);
		}
		
		String url = "jdbc:mysql://localhost:3306/hotel?useUnicode=true&characterEncoding=UTF-8";
		
		try {
			conn = DriverManager.getConnection(url,"root","apmsetup");
			stmt = conn.createStatement();
			System.out.println("�����ͺ��̽� ���� ����!");  
		} catch(Exception e) {
    		e.printStackTrace();
			System.out.println("�����ͺ��̽� ���� ����!");
		}
	}

	//DB���� ���� �Լ�
	public static void close() {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
			System.out.println("�����ͺ��̽� ���� ����!");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//DB���� �Լ�
	public static void query(String sql) {
		
		try {
			stmt = conn.createStatement();
			
			if (stmt.execute(sql)) {
				rs = stmt.getResultSet();
				System.out.println("���� ����");
			}
		} catch(SQLException ex) {
			System.out.println("���� ����");
		}
	}
	
	//�α���
	public static boolean loginServiece(String managerid, String managerpwd) {
		boolean flag = false;
		
		PreparedStatement pstmt = null;
		String getPass = null;
		
		try {
			String sql = "select * from manager where managerid = '" +managerid+ "'";

			conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","apmsetup");	
            pstmt = conn.prepareStatement(sql);
			System.out.println("�����ͺ��̽� ���� ����!");  
            
            rs = pstmt.executeQuery();
            
			if(rs.next()) {
	            getPass = rs.getString("managerpwd");	//�����ͺ��̽� ���� ��й�ȣ�� getPass�� �ִ´�.

				if(getPass.equals(managerpwd)) {
					System.out.println("�޾ƿ� ��й�ȣ : " + getPass);
					flag = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//������ ��й�ȣ ����
	public static void Change(JTextField managerid, JTextField managerpwd, JTextField managerpwd2) {
		boolean equals = managerpwd.getText().equals(managerpwd2.getText());
		open();
		if(managerid.getText().equals("") || managerpwd.getText().equals("") || managerpwd2.getText().equals(""))	//�� �߿� �ϳ��� ����ִٸ� if�� ����
			JOptionPane.showMessageDialog(null, "����ִ� �׸��� �ֽ��ϴ�.");
		else if(equals != true)	//��й�ȣ�� ��й�ȣȮ�� �ؽ�Ʈ�ʵ��� ������ �ٸ��� ����
			JOptionPane.showMessageDialog(null, "��й�ȣ�� ��й�ȣȮ���� ��ġ���� �ʽ��ϴ�. �ٽ� �õ��� �ּ���.");
			else {
				try {
					String sql = "update manager set managerpwd = '" + managerpwd.getText() + "' where managerid = '" + managerid.getText() + "'";
					query(sql);
				} catch(Exception e1) {
					e1.printStackTrace();
				} JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
			}
		close();
		}
	
	//������
	public static void Information(Label rnum, JTextField room_type_t, JTextField basic_ap_t, JTextField max_ap_t, JTextField charge_t) throws SQLException {	
			open();
			
			int rnum_t = HotelRoom.rnum;	//HotelRoomŬ�������� ������ �� ��ȣ���� �ҷ���.

	        String sql = "select * from room where rnum = '" + rnum_t + "'";
	        
	        query(sql);
	        
	        if(!rs.next()){
				System.out.println("!rs.next()");
			}
			else{
					System.out.println("rs.next()");
					
					rnum.setText(String.valueOf(rs.getLong("rnum")));
	            	room_type_t.setText(rs.getString("room_type"));
	            	basic_ap_t.setText(rs.getString("basic_ap"));
	        		max_ap_t.setText(rs.getString("max_ap"));
	        		charge_t.setText(rs.getString("charge"));
			}
	        close();
		}
	
	//üũ��üũ�ƿ� ���ȣ �ҷ�����
	public static void CheckinCheckout(JLabel rnum) throws SQLException {
		open();
		
		int rnum_t = HotelRoom.rnum;	//HotelRoomŬ�������� ������ �� ��ȣ���� �ҷ���.

        String sql = "select rnum from room where rnum = '" + rnum_t + "'";
        
        query(sql);
        
        if(rs.next())
        	rnum.setText(String.valueOf(rs.getLong("rnum")));
        
        close();
	}

	//���� ����
	public static void RoomState(JTextField rnum, JTextField room_type, JTextField cname, JTextField indate, JTextField outdate, JTextField ap) throws SQLException {
		open();
		
		int rnum_t = HotelRoom.rnum;	//HotelRoomŬ�������� ������ �� ��ȣ���� �ҷ���.
		
		String sql = "select rnum, room_type from room where rnum = '" + rnum_t + "'";
		
		query(sql);
		
		if(rs.next()) {
			rnum.setText(rs.getString("rnum"));
			room_type.setText(rs.getString("room_type"));
		}
		
		String sql1 = "select cname, indate, outdate, ap from reservation where rnum = '" + rnum_t +"'";
		
		query(sql1);
		if(rs.next()) {
			cname.setText(rs.getString("cname"));
			indate.setText(rs.getString("indate"));
			outdate.setText(rs.getString("outdate"));
			ap.setText(rs.getString("ap"));
		}
		close();
	}
}
