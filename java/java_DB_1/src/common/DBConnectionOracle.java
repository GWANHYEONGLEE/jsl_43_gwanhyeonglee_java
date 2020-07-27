package common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionOracle {
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception ex) {
			System.out.println("드라이버 없음 ojdbc6.jar : " + ex.getMessage());
		}

		Connection con = null;

		try {
			String DB_URL = "jdbc:oracle:thin:@jsl70104:1521:ORCL";
			String DB_USER = "JSL43";
			String DB_PASSWORD= "1234";

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			if(con == null) System.out.println(" oracle db 연결실패===========");
			else System.out.println(" oracle db 연결 성공~~~~~");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
		}

		return con;
	}

	public void close(Connection con, PreparedStatement ps) {
		try {
			if(ps != null) 		ps.close();
			if(con != null)		con.close();
		} catch(Exception e) {
			System.out.println("=========== 종료 error ===========");
		}
    }

	public void close(Connection con, PreparedStatement ps, ResultSet result) {
		try {
			if(result != null)	result.close();
			if(ps != null) 		ps.close();
			if(con != null)		con.close();
		} catch(Exception e) {
			System.out.println("=========== 종료 error ===========");
		}
    }
}
