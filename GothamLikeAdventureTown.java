import java.util.*;
public class GothamLikeAdventureTown
{
	public GothamLikeAdventureTown()
	{

		String[] firstName = {"Liam", "Noah", "Logan", "Mason", "David", "Rahul", "James", "Joe", "Anirudh", "Neel"};
		String[] lastName = {"Datle", "Gongrara", "Samsung", "Hegt", "Russ", "Patel", "Madison", "Kistle", "Mandu", "Telidevara"};

		int badguy = 0;
		int goodguy = 0;

		while (badguy == goodguy){
			badguy = (int)(Math.random()*50)+1;
			goodguy = (int)(Math.random()*50)+1;
		}

		ArrayList<Person> dailyPlanetStreet = new ArrayList<Person>();

		for(int x = 0; x < 50; x++)
		{
			String fullName = "";
			int first = (int)(Math.random()*11)+0;
			int last = (int)(Math.random()*11)+0;

			fullName += firstName[first];
			fullName += " ";
			fullName += lastName;


			dailyPlanetStreet.add(new NormalGuy(fullName, "Works at BankOfAmerica", 100, 200, 5));
		}

	}
	public static void main(String args[])
	{
		//This is the main execution section that calls the constructor
		//and starts the application
		GothamLikeAdventureTown app=new GothamLikeAdventureTown ();
	}

}

