import java.util.*;
public class GothamLikeAdventureTown
{
  public GothamLikeAdventureTown()
  {

    String[] firstName = {"Liam", "Noah", "Logan", "Mason", "David", "Rahul", "James", "Joe", "Anirudh", "Neel"};
    String[] lastName = {"Datle", "Gongrara", "Samsung", "Hegt", "Russ", "Patel", "Madison", "Kistle", "Mandu", "Telidevara"};

	String[] bonus = {" has won the battle !!!", "The simulation would choose a random damage value from 1 to 20 (the upper bound is equal to the maxDamage amount for ", " ). Those random values will be compared and used to decide whether ", "''s hitPoints total needs to be reduced or not."};
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
      int first = (int)(Math.random()*10)+0;
      int last = (int)(Math.random()*10)+0;

      //System.out.println(first);

      fullName += firstName[first];
      fullName += " ";
      fullName += lastName[last];

      dailyPlanetStreet.add(new NormalGuy(fullName, "Works at BankOfAmerica", 100, 200, 5));
    }

   GoodGuy goodHero = new GoodGuy("John Wells", "BANKER", 100, 20, 20, "invisible", true, 5000, "InvisiMan", "Got'em");
   dailyPlanetStreet.set(goodguy, goodHero);
//   dailyPlanetStreet.set(11, goodHero);

   BadGuy badHero = new BadGuy("Harrison Fatic", "DOCTOR", 100, 15, 14, "Glue", false, 5500, "Gluistic", "You gonna get Stuck", "Stickyyyy");
   dailyPlanetStreet.set(badguy, badHero);

	/*System.out.println("A-->"+dailyPlanetStreet.size());
		System.out.println("goodguy-->"+goodguy);
		System.out.println("badguy-->"+badguy);
		*/



   //----Start of Simulation----//

   	ArrayList<Person> safetyLand = new ArrayList<Person>();
   	int c;

    ArrayList<Person> unfortunatelyFatallyWoundedPeople = new ArrayList<Person>();
	while(dailyPlanetStreet.size() > 2 ){
		/*System.out.println("GOODHERO -->"+dailyPlanetStreet.indexOf(goodHero));
		System.out.println("BADHERO -->"+dailyPlanetStreet.indexOf(badHero));
		System.out.println("dailyPlanetStress-->"+dailyPlanetStreet.size());
     	System.out.println("Clean List-->"+unfortunatelyFatallyWoundedPeople.size());*/
		if ((dailyPlanetStreet.indexOf(badHero) == 0)&&(dailyPlanetStreet.indexOf(goodHero)==1))
		{
			//System.out.println("IF 1");
			unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(goodHero) + 1));
			//c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
			 print(badHero,goodHero);
		}
		else if ((dailyPlanetStreet.indexOf(badHero) == 1)&&(dailyPlanetStreet.indexOf(goodHero)==0))
		 {
			 //System.out.println("IF 2");
			unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) + 1));
			//c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));

			 print(badHero,goodHero);
		 }
		else if ((dailyPlanetStreet.indexOf(badHero) == 0)&&(dailyPlanetStreet.indexOf(goodHero)!=1))
		 {
			 //System.out.println("IF 3");
		   unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) + 1));
		   //c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
			 print(badHero,goodHero);
		   //System.out.println(badHero.getevilLaugh());
		   //System.out.println(goodHero.getCatchPhrase());
		 }
		 else if ((dailyPlanetStreet.indexOf(badHero) == (dailyPlanetStreet.size()-1))&&(dailyPlanetStreet.indexOf(goodHero)!= (dailyPlanetStreet.size()-2)))
		 {
			 //System.out.println("IF 4");
			 unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) - 1));
			 //c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
			 print(badHero,goodHero);
			 //System.out.println(badHero.getevilLaugh());
			 //System.out.println(goodHero.getCatchPhrase());
		 }
		 else if ((dailyPlanetStreet.indexOf(badHero) == (dailyPlanetStreet.size()-1))&&(dailyPlanetStreet.indexOf(goodHero)==(dailyPlanetStreet.size()-2)))
		 		 {
		 			 //System.out.println("IF 4a");
		 			 unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(goodHero)-1));
		 			 //c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
		 			 print(badHero,goodHero);
		 			 //System.out.println(badHero.getevilLaugh());
		 			 //System.out.println(goodHero.getCatchPhrase());
		 }
		 //GoodHero is not next to BadHero
		 else if ((dailyPlanetStreet.indexOf(goodHero)!= dailyPlanetStreet.indexOf(badHero)+1)&&(dailyPlanetStreet.indexOf(goodHero)!= dailyPlanetStreet.indexOf(badHero)-1)&&(dailyPlanetStreet.indexOf(badHero)!= 0)&&(dailyPlanetStreet.indexOf(badHero)!= 49))
		 {
			 //System.out.println("IF 5");
		   int num = (int)(Math.random()*2)+1;
		   if (num == 1){
			   //System.out.println("IF 6");
			 unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) - 1));
			 //c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
			 print(badHero,goodHero);
			 }
		   else{
			   //System.out.println("IF 7");
			 unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) + 1));
			 //c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
			 print(badHero,goodHero);
		   }
	   	}
	   	else if ((dailyPlanetStreet.indexOf(goodHero)- dailyPlanetStreet.indexOf(badHero)) == 1){
	   		unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) - 1));
	   		//c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
	   		//System.out.println("IF 8");
	   		print(badHero,goodHero);
		}
	   	else if (((dailyPlanetStreet.indexOf(goodHero)- dailyPlanetStreet.indexOf(badHero)) == -1)){
			//System.out.println("IF 9");
	   		unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(badHero) + 1));
	   		//c = (int)(Math.random()*(dailyPlanetStreet.size()))+1;
			//safetyLand.add(dailyPlanetStreet.remove(dailyPlanetStreet.indexOf(c)));
	   		print(badHero,goodHero);
		}

	}


 	//}

     System.out.println(dailyPlanetStreet);

     while((badHero.getHitPoint() > 0)  && (goodHero.getHitPoint() > 0))
     {
		 int oneortwo = (int)(Math.random()*2)+1;
		 int maxDamageBadguy = (int)(Math.random()*15)+1;
		 int defenseAbilityGoodguy = (int)(Math.random()*20)+1;
		 int maxDamageGoodguy = (int)(Math.random()*20)+1;
		 int defenseAbilityBadguy = (int)(Math.random()*14)+1;

		 if (oneortwo == 1){//goodguy goes first
			 if(maxDamageGoodguy > defenseAbilityBadguy)
			 {
				int tempBadHitPoint = badHero.getHitPoint()- maxDamageGoodguy;
				badHero.setHitPoint(tempBadHitPoint);
			 }
		}
		else if (oneortwo == 2){
			if(maxDamageBadguy > defenseAbilityGoodguy)
			{
				int tempGoodHitPoint = goodHero.getHitPoint() - maxDamageBadguy;
				goodHero.setHitPoint(tempGoodHitPoint);
			}
		}
	}

	System.out.println();
	System.out.println(goodHero.getName() + " is fighting " + badHero.getName());
	System.out.println(goodHero.getName() + bonus[0] + goodHero.getMaxDamage() + " and " + badHero.getName() + " has a maxDamage of " + badHero.getMaxDamage());
	System.out.println("The simulation would choose a random damage value from 1 to 20 (the upper bound is equal to the maxDamage amount for "
		+ goodHero.getMaxDamage() + " ) and a random defense value from 1 to 8 (the upper 	bound is equal to the defenseAbility of "
		+ badHero.getMaxDamage() + " ). Those random values will be compared and used to decide whether " + badHero.getName() + "''s hitPoints total needs to be reduced or not.");

	if (goodHero.getHitPoint() > badHero.getHitPoint())
		System.out.println("\n" + goodHero.getName()+ bonus[0]);

	else
		System.out.println("\n" + badHero.getName()+ bonus[0]);


}

 public void print(BadGuy badHero, GoodGuy goodHero){
	 System.out.println(badHero.getevilLaugh());
     System.out.println(goodHero.getCatchPhrase());
 }

  public static void main(String args[])
  {
    //This is the main execution section that calls the constructor
    //and starts the application
    GothamLikeAdventureTown app=new GothamLikeAdventureTown ();
  }

}



