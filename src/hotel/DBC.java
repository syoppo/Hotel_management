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
	
	//DB연결 함수
	public static void open() {
		driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 검색 성공!");
		} catch(Exception ex) {
            System.err.println("드라이버검색 실패 error: " + ex);
		}
		
		String url = "jdbc:mysql://localhost:3306/hotel?useUnicode=true&characterEncoding=UTF-8";
		
		try {
			conn = DriverManager.getConnection(url,"root","apmsetup");
			stmt = conn.createStatement();
			System.out.println("데이터베이스 연결 성공!");  
		} catch(Exception e) {
    		e.printStackTrace();
			System.out.println("데이터베이스 연결 실패!");
		}
	}

	//DB연결 해제 함수
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
			System.out.println("데이터베이스 연결 해제!");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//DB쿼리 함수
	public static void query(String sql) {
		
		try {
			stmt = conn.createStatement();
			
			if (stmt.execute(sql)) {
				rs = stmt.getResultSet();
				System.out.println("쿼리 성공");
			}
		} catch(SQLException ex) {
			System.out.println("쿼리 실패");
		}
	}
	
	//로그인
	public static boolean loginServiece(String managerid, String managerpwd) {
		boolean flag = false;
		
		PreparedStatement pstmt = null;
		String getPass = null;
		
		try {
			String sql = "select * from manager where managerid = '" +managerid+ "'";

			conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","apmsetup");	
            pstmt = conn.prepareStatement(sql);
			System.out.println("데이터베이스 연결 성공!");  
            
            rs = pstmt.executeQuery();
            
			if(rs.next()) {
	            getPass = rs.getString("managerpwd");	//데이터베이스 내의 비밀번호를 getPass에 넣는다.

				if(getPass.equals(managerpwd)) {
					System.out.println("받아온 비밀번호 : " + getPass);
					flag = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//관리자 비밀번호 수정
	public static void Change(JTextField managerid, JTextField managerpwd, JTextField managerpwd2) {
		boolean equals = managerpwd.getText().equals(managerpwd2.getText());
		open();
		if(managerid.getText().equals("") || managerpwd.getText().equals("") || managerpwd2.getText().equals(""))	//셋 중에 하나라도 비어있다면 if문 실행
			JOptionPane.showMessageDialog(null, "비어있는 항목이 있습니다.");
		else if(equals != true)	//비밀번호와 비밀번호확인 텍스트필드의 내용이 다르면 실행
			JOptionPane.showMessageDialog(null, "비밀번호와 비밀번호확인이 일치하지 않습니다. 다시 시도해 주세요.");
			else {
				try {
					String sql = "update manager set managerpwd = '" + managerpwd.getText() + "' where managerid = '" + managerid.getText() + "'";
					query(sql);
				} catch(Exception e1) {
					e1.printStackTrace();
				} JOptionPane.showMessageDialog(null, "수정되었습니다.");
			}
		close();
		}
	
	//룸정보
	public static void Information(Label rnum, JTextField room_type_t, JTextField basic_ap_t, JTextField max_ap_t, JTextField charge_t) throws SQLException {	
			open();
			
			int rnum_t = HotelRoom.rnum;	//HotelRoom클래스에서 저장한 방 번호값을 불러옴.

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
	
	//체크인체크아웃 방번호 불러오기
	public static void CheckinCheckout(JLabel rnum) throws SQLException {
		open();
		
		int rnum_t = HotelRoom.rnum;	//HotelRoom클래스에서 저장한 방 번호값을 불러옴.

        String sql = "select rnum from room where rnum = '" + rnum_t + "'";
        
        query(sql);
        
        if(rs.next())
        	rnum.setText(String.valueOf(rs.getLong("rnum")));
        
        close();
	}

	//객실 상태
	public static void RoomState(JTextField rnum, JTextField room_type, JTextField cname, JTextField indate, JTextField outdate, JTextField ap) throws SQLException {
		open();
		
		int rnum_t = HotelRoom.rnum;	//HotelRoom클래스에서 저장한 방 번호값을 불러옴.
		
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
