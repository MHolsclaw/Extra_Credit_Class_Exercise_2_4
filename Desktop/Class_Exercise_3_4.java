import javax.swing.JOptionPane;

public class Class_Exercise_3_4 
{
	public static void main(String[] args)
	{
		String numPeopleInput = JOptionPane.showInputDialog("Enter # of People");
			
		int numPeople = Integer.parseInt(numPeopleInput);
		int groupSize;
			
		if(numPeople > 10)
		{
			groupSize = numPeople / 2;
			JOptionPane.showMessageDialog(null, "People = " + numPeople + ", Group Size = " + groupSize);
		}
		else if(numPeople >= 3 && numPeople <= 10)
		{
			groupSize = numPeople / 3;
			JOptionPane.showMessageDialog(null, "People = " + numPeople + ", Group Size = " + groupSize);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
		}
	
		String numPlayersInput = JOptionPane.showInputDialog("Enter # of Players");
		
		int numPlayers = Integer.parseInt(numPlayersInput);
		int teamSize;
		
		if(numPlayers >= 11 && numPlayers <= 55)
		{
			teamSize = numPlayers / 11;
			JOptionPane.showMessageDialog(null, "Players = " + numPlayers + ", Team Size = " + teamSize);
		}
		else
		{
			teamSize = 1;
			JOptionPane.showMessageDialog(null, "Players = " + numPlayers + ", Team Size = " + teamSize);
		}
	}
}
