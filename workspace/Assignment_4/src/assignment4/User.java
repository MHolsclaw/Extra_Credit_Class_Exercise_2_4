package assignment4;

public class User 
{
	private String name;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String confirmPassword;
	private AccountType accountType;
	
	public User() 
	{
		username = "root";
		password = "password";
		accountType = AccountType.Student;
	}
	
	public User(String username) 
	{
		this.username = username;
		password = "password";
		accountType = AccountType.Student;
	}
	
	public User(String username, String password) 
	{
		this.username = username;
		this.password = password;
		accountType = AccountType.Student;
	}
	
	public String getUserName() 
	{
		return this.username;
	}
	
	public void setUserName(String username) 
	{
		this.username = username;
	}
	
	public String toString() 
	{
		return this.username + "\t" + this.password + "\t" + this.accountType;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
}
