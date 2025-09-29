package Servlet;

// 테이블에 있는 컬럼과 똑같이 생성하는것이 기본
public class UserDto {
	private String username;
	private String password;
	
	// 디폴트생성자
	public UserDto(){}
	
	// 모든 인자 생성자
	public UserDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	// getter and setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// toString
	@Override
	public String toString() {
		return "UserDto [username=" + username + ", password=" + password + "]";
	}
	
	
}
