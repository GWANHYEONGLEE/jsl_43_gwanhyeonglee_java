package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import common.DBConnectionOracle;
import dto.J0806_dto;


public class J0806_dao {
	DBConnectionOracle common = new DBConnectionOracle();
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;


	public ArrayList<J0806_dto> getScoreList(String gubun, String search){
		ArrayList<J0806_dto> arr = new ArrayList<>();
		String query=" select no, name, kor, eng, mat, total, ava\r\n" +
				" from t07_score\r\n" +
				" where "+gubun+" like '%"+search+"%'";



		try {
			connection = common.getConnection();
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				String no = rs.getString(1);
				String name = rs.getString(2);
				int kor = rs.getInt(3);
				int eng = rs.getInt(4);
				int math = rs.getInt(5);
				int tot = rs.getInt(6);
				int ava = rs.getInt(7);
				J0806_dto dto = new J0806_dto(no,name,kor,eng,math,tot,ava); // 1번째 방법
				//J0806_dto dto = new J0806_dto(rs.getString(1),rs.getString(2),
						                    //    rs.getInt(3),rs.getInt(4),rs.getInt(5),
						                    //   rs.getInt(6),rs.getInt(7)); // 2번째 방법
				arr.add(dto);
			}

		}catch(SQLException se) {
			System.out.println(" getScoreList() query 오류 ~" +query);
		}catch(Exception e) {
			System.out.println(" getScoreList() 오류 ~" +query);

		}finally {
			common.close(connection, ps, rs);
		}
		return arr;
	}


	public int saveScore(J0806_dto dto) {
		int result = 0;
		String query =" insert into t07_score\r\n" +
				" (no, name, kor, eng, mat, total, ava)\r\n" +
				" values ('"+dto.getNo()+"','"+dto.getName()+"',"+dto.getKor()+","+dto.getEng()+","+dto.getMat()+","+dto.getTotal()+","+dto.getAva()+")";
		try {
			connection = common.getConnection();
			ps = connection.prepareStatement(query);
			result = ps.executeUpdate();
		}catch(SQLException se) {
			System.out.println("saveScore() query 오류: "+query);
		}catch(Exception e) {
			System.out.println("saveScore() 오류");
		}finally {
			common.close(connection, ps);

		}
		return result;
	}
	public int getTotal(int k, int e, int m) {
		int total = k + e + m;
		return total;
	}
	public int getAva(int total, int count) {
		int ava = total / count;
		return ava;
	}
}








