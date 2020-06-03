package ibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import ibatis.util.ParameterMap;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhanghan
 * @Date: 2020/6/3 16:07
 * @Description:
 */
public class IBatisDemo {

	private static String config = "ibatis/sqlMapConfig.xml";
	private static Reader reader;
	private static SqlMapClient sqlMap;

	static {
		try {
			reader = Resources.getResourceAsReader(config);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
	}

	public static List<HashMap> select() throws SQLException {
		return sqlMap.queryForList("getAllUsers");
	}

	public static HashMap select(String parameter) throws SQLException {
		return (HashMap) sqlMap.queryForObject("getUserByName", parameter);
	}

	public static HashMap select(Map parameterMap) throws SQLException {
		return (HashMap) sqlMap.queryForObject("getUserByRealNameAndMobile", parameterMap);
	}

	public static int insert(Map parameterMap) throws SQLException {
		return sqlMap.update("addUser", parameterMap);
	}

	public static int update() throws SQLException {
		return sqlMap.update("updateUser");
	}

	public static int delete(int userId) throws SQLException {
		return sqlMap.delete("deleteUser",userId);
	}

	public static void main(String[] args) throws SQLException {
		ParameterMap parameterMap1 = new ParameterMap("userName", "admin", "mobile", "18932322333");
		System.out.println(select(parameterMap1));


		ParameterMap parameterMap2 = new ParameterMap("userName", "sarin", "password", "123", "mobile", "1", "email", "@");
		System.out.println(insert(parameterMap2));

		System.out.println(update());

		System.out.println(delete(5));
	}
}
