
public class customersData {
	
	
	private String firstName;
	private String lastName;
	private double AccountBalance;
	private Boolean isScoreGood;
	private String username;
	private String password;
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}
	public Boolean getIsScoreGood() {
		return isScoreGood;
	}
	public customersData(String firstName, String lastName, double accountBalance, Boolean isScoreGood, String username,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		AccountBalance = accountBalance;
		this.isScoreGood = isScoreGood;
		this.username = username;
		this.password = password;
	}
	public void setIsScoreGood(Boolean isScoreGood) {
		this.isScoreGood = isScoreGood;
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

	
	
	
	
	
	

}
