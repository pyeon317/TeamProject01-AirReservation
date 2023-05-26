package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InternationalDAO {

	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;

	public InternationalDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("CLASS FOR NAME ERR");
		}
	}
	
	//항공사 입력 시 조회하는 메서드
	public List<InternationalVO> getDepts(String airline) {
		String sql = "SELECT * FROM INTERNATIONAL WHERE AIRLINE = ?";

		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		List<InternationalVO> list = null;

		
		return list;

	}
	
	
	
	
	
}
