
public class Class_Exercise_2_4 
{
	public static void main(String [] args)
	{
		
		String firstname = "matt";
		String lastname1 = new String("HOLSCLAW");
		String lastname2 = new String("holsclaw");
		String fullname = "matt holsclaw";
		String trimstring = "     This string will be trimmed";
		String concatString = lastname1.concat(lastname2);
		char letter = lastname1.charAt(4);
	
		System.out.println("charAt(4): " + letter);
		
		System.out.println("concat strings: " + concatString);
		
		if(lastname1.equals(lastname2))
			System.out.println("lastnames same");
		else
			System.out.println("lastnames not same");
		
		if(lastname1.equalsIgnoreCase(lastname2))
			System.out.println("lastnames same ignoring case");
		else
			System.out.println("lastnames not same");
		
		int index = fullname.indexOf(lastname2);
		System.out.println("lastname index of fullname: " + index);
		
		int lastindex = fullname.lastIndexOf(lastname2);
		System.out.println("last lastname index of fullname: " + lastindex);
		
		String firstnameLower = firstname.toLowerCase();
		System.out.println("firstname toLowerCase: " + firstnameLower);
		
		String firstnameUpper = firstname.toUpperCase();
		System.out.println("firstname toUpperCase: " + firstnameUpper);
		
		String newfirstname = firstname.replace('t','p');
		System.out.println("firstname t replaced with p: " + newfirstname);
		
		String substring = new String("Substring starts here: hello hello");
		System.out.println("substring start: " + substring.substring(23));
	    System.out.println("substring start & end: " + substring.substring(23, 28));
			
		String trimmed = trimstring.trim();
		System.out.println("trimmed string: " + trimmed);
	}
}
