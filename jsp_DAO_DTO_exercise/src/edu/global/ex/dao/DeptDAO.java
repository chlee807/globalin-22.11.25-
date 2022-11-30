package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import edu.global.ex.dto.DeptDTO;

public class DeptDAO {
	// 커넥션풀을 사용하기 위한 소스코드 (DataSource를 import할 시 java.sql로 해야한다.
	// 커넥션 풀 객체
	private DataSource dataSource = null;

	/*
	 * <Resource auth="Container" driverClassName="oracle.jdbc.OracleDriver"
	 * maxIdle="10" maxTotal="20" maxWaitMillis="-1" name="jdbc/oracle1"
	 * password="tiger" type="javax.sql.DataSource"
	 * url="jdbc:oracle:thin:@127.0.0.1:1521:xe" username="scott" />
	 */

	public DeptDAO() {
		// 기존에driver를 설정하고 Class.forName(driver)를 넣는 방식과는 달리 context.xml에
		// 리소스를 설정해주었다. context.xml에 있는 소스를 읽기 위해 context객체 생성한다.
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<DeptDTO> deptList() {
		List<DeptDTO> depts = new ArrayList<>();

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;

		try {
			String query = "SELECT * FROM DEPT";
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				depts.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return depts;
	}
}