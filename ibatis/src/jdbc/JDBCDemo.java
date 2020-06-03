package jdbc;

import jdbc.model.User;
import jdbc.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: zhanghan
 * @Date: 2020/6/3 15:31
 * @Description:
 */
public class JDBCDemo {

	public static User getUser(int id) throws SQLException {
		User user = null;
		String sql = "select * from users where ID=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setUserId(rs.getInt("ID"));
				user.setUserName(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setMobile(rs.getString("MOBILE"));
				user.setEmail(rs.getString("EMAIL"));
			}
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} finally {
				try {
					if (pstmt != null) {
						pstmt.close();
					}
				} finally {
					if (conn != null) {
						conn.close();
					}
				}
			}
		}
		return user;
	}

	public static void main(String[] args) throws SQLException {
		System.out.println(getUser(1));
	}
}
