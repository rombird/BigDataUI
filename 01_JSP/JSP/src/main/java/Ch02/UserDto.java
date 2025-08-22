package Ch02;

public class UserDto {
	private String userid;
	private String password;
	private String username;
	private Integer zipcode;
	private String addr1;
	private String addr2;
	private Integer phone1;
	private Integer phone2;
	private Integer phone3;
	
	// 디퐅트 생성자
	public UserDto() {}
	
	// 모든 인자 생성자
	public UserDto(String userid, String password, String username, Integer zipcode, String addr1, String addr2,
			Integer phone1, Integer phone2, Integer phone3) {
		super();
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.zipcode = zipcode;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
	}
	
	// getter and setter
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public Integer getPhone1() {
		return phone1;
	}

	public void setPhone1(Integer phone1) {
		this.phone1 = phone1;
	}

	public Integer getPhone2() {
		return phone2;
	}

	public void setPhone2(Integer phone2) {
		this.phone2 = phone2;
	}

	public Integer getPhone3() {
		return phone3;
	}

	public void setPhone3(Integer phone3) {
		this.phone3 = phone3;
	}


	// toString
	@Override
	public String toString() {
		return "UserDto [userid=" + userid + ", password=" + password + ", username=" + username + ", zipcode="
				+ zipcode + ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone1=" + phone1 + ", phone2=" + phone2
				+ ", phone3=" + phone3 + "]";
	}
}
