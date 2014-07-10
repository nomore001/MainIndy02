package fillRegisterProfile;

public class Login {
	private String username;
	private String password;
	private String status;
	public Login() {
		
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString(){
		String text = "";
		text += "ส่วนที่ 3 ข้อมูลการเข้าสู่ระบบ\n";
		text += "\tชื่อผู้ใช้ : " + this.username;
		text += "\n\tรหัสผ่าน : " + this.password;
		return text;
	}
}
