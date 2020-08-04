package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import common.DBConnectionOracle;
import dto.J0804_dto;

public class J0804_dao {
	DBConnectionOracle common = new DBConnectionOracle();
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int saveMember(J0804_dto dto){
		int result = 0;
		String query =" insert into t07_member \r\n" +
				" (no, name , area, age) \r\n" +
				" values('"+dto.getNo()+"','"+dto.getName()+"','"+dto.getArea()+"',"+dto.getAge()+")";

		try {
			connection = common.getConnection();
			ps = connection.prepareStatement(query);
			result = ps.executeUpdate();

		}catch(SQLException se) {
			System.out.println(" saveMember(dto) query ����~ : "+query);
		}catch(Exception e) {
			System.out.println(" saveMember(dto) ����~ : ");
		} finally {
			common.close(connection, ps);
		}
		return result;
	}

	  public int saveMember(String no, String name, String area, int age){
		int result = 0;
		String query =" insert into t07_member \r\n" +
				" (no, name , area, age) \r\n" +
				" values('"+no+"','"+name+"','"+area+"',"+age+")";

		try {
			connection = common.getConnection();
			ps = connection.prepareStatement(query);
			result = ps.executeUpdate();

		}catch(SQLException se) {
			System.out.println(" saveMember() query ����~ : "+query);
		}catch(Exception e) {
			System.out.println(" saveMember() ����~ : ");
		} finally {
			common.close(connection, ps);
		}
		return result;
	}
}



