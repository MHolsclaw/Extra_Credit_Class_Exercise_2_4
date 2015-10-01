import javax.swing.JOptionPane;
public class Class_Exercise_3_5 
{
	public static void main(String[] args)
	{
		
		String role = JOptionPane.showInputDialog("Enter your role (case sensitive!): Admin, Faculty, Staff, Student, or Guest");
		switch(role)
		{
		case "Admin": 
			System.out.println("Welcome administrator!");
			break;
		case "Faculty":
			System.out.println("Welcome faculty member!");
			break;
		case "Staff":
			System.out.println("Welcome staff member!");
			break;
		case "Student":
			System.out.println("Welcome student!");
			break;
		case "Guest":
			System.out.println("Welcome guest!");
			break;
		default:
			System.out.println("Error: Please try again and choose from the listed options.");
		}
	}
}