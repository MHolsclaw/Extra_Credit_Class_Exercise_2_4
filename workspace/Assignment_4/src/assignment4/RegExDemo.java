package assignment4;


import javax.swing.JOptionPane;
public class RegExDemo {

	public static void main(String[] args)
	{
		String statement = JOptionPane.showInputDialog("Enter email");
//		String pattern = "\\w+@\\w+\\.\\w+";
//		System.out.println(statement.matches(pattern));
		
		System.out.println(statement.length());
		if(statement.length()<8)
		{
			System.out.println("Warning password length must be at least 8 characters.");
		}
	}
}
