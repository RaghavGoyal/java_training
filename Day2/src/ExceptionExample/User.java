package ExceptionExample;

public class User {
	
	private String uName;
	private String uMail;
	
	
	public User(String uName, String uMail) {
		super();
		this.uName = uName;
		this.uMail = uMail;
	}
	
	public String getuName() {
		return uName;
	}
	
	public void setuName(String uName) {
		this.uName = uName;
	}
	
	public String getuMail() {
		return uMail;
	}
	
	public void setuMail(String uMail) {
		this.uMail = uMail;
	}
	
	

}
