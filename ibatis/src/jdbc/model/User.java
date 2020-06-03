package jdbc.model;

/**
 * @Author: zhanghan
 * @Date: 2020/6/3 15:21
 * @Description:
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String password;
	private String mobile;
	private String email;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
