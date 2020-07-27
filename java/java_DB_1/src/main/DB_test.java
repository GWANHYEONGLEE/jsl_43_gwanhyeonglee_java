package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import common.DBConnectionOracle;

public class DB_test {

	public static void main(String[] args) {
		DBConnectionOracle dbConnection = new DBConnectionOracle();
		Connection con = dbConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String query = "select id, name, area, age from member";
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery(); 	// 4명이 들어있음.

			while(rs.next()) {  		// result의 행수만큼 돈다.
				String id = rs.getString(1);
				String name = rs.getString("name");
				String area = rs.getString(3);
				int age = rs.getInt(4);
				System.out.println(" id:" +id+" name:" +name+" area:" +area+" age:" +age);

			}

		}catch(Exception e) {
			System.out.println(" db 오류 1 ~~~");
		}
	}
}
