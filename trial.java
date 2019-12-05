package game;

import java.util.Scanner;
import java.util.Random;


public class trial {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to (TITLE), a fun adventure game that allows you to choose your destiny! You will be roleplaying as a ");
		System.out.println("freelancer who just accepted a bounty on a great evil demon.  Before you start, please select your first path. ");
		System.out.println("Do you wish to commit to one of the specializations or do you feel brave enough to venture into the unknown and….um…..wing it?");
		System.out.println("Please choose if you want to adventure with your current stats or do you want to specialize to become stronger: ");
		System.out.println("1) Choose a specialty or 2) Adventure into the wilderness"); 
		int number = input.nextInt();
		switch(number) {
		case 1:
			System.out.println("The world is a dangerous place, especially when you’re looking to defeat the evil demon. You’ve have decided that the best way");
			System.out.println("to combat through your venture is to prepare more and learn the trade of one of the classes. Which of the following classes to you wish to specialize?");
			System.out.println("4) Warrior or 5) Mage or 6) Archer");
			int role = input.nextInt();
			switch(role) {
			case 4: 
				System.out.println("You have chosen to be a warrior.");
				System.out.println("After spending quite a long time to master the arts of your chosen class you have finally decided that you already to head out. Which path do you choose:" );
				System.out.println("1) To take the merchant road or 2) To venture through the unforeseen forest");
				int route1 = input.nextInt();
				switch(route1) {
				case 1: 
					System.out.println("You have decided to take the merchant road armed and ready for your adventure! After awhile on the merchant road, you have reached a three way fork. ");
					System.out.println("Two of the paths have been blocked by fallen trees and the third has the remains of a recently raided stagecoach. All of a sudden a gang of bandits appears. ");
					System.out.println("Do you 3)Attack or 4)Wait or 5)Attempt to run past");
					int fattack = input.nextInt();
					switch(fattack) {
					case 3: 
						System.out.println("Your attack is successful and you have defeated all three bandits");
						System.exit(0);
					case 4:
						System.out.println("Your waiting has led to nothing happening. Do you choose 1) To attack or 2) Run past");
						int waiting = input.nextInt();
						switch(waiting) {
						case 1:
							System.out.println("Your attack is successful and you have defeated all three bandits");
							System.exit(0);
						case 2: 
							System.out.println("Your attempt to run past has led to your death. ");
							System.exit(0);
							
						}
					case 5:
						System.out.println("Your attempt to run past has led to your death. ");
						System.exit(0);
					}
				case 2:
					System.out.println("You have decided to bravely venture through the unforeseen forest. ");	
					System.out.println("As you navigate through the thick and mystic forest, you find a gigantic footprint belonging to the legenedary Forest Guardian, a gigantic grizzly bear. ");
					System.out.println("As a newly trained warrior, you start to feel unease at the sight of what remains to be the Forest Guardian's hunting ground. The sun eventually sets");
					System.out.println("and you have decided to make camp in order to rest for a night. While preparing for bed, you hear a loud noise from the shadows and your worst fears become true.");
					System.out.println("The Forest Guardian appears before you, showing its beastly teeth and claws, ready to make a meal out of you. ");
					System.out.println("Do you decide to: 1) Attack or 2) Wait or 3) Run past the Forest Guardian");
					int fg = input.nextInt();
					switch(fg)
					{
					case 1:
						System.out.println("Your attack is successful and you have defeated the Forest Guardian");
					case 2:
						System.out.println("Waiting has proven unsuccessful. Do you choose 1) To attack or 2)Run past");
						int waiting3 = input.nextInt();
						switch(waiting3) {
						case 1:
							System.out.println("Your attack is successful and you have defeated the forest guardian. ");
						case 2: 
							System.out.println("Your attempt to run past has led to your death. ");
							System.exit(0);
						
					case 3:
						System.out.println("Your attempt to run past has led to your death.");
						
						
					}
									
					}
				
				
			case 5:
				System.out.println("You have chosen to be a mage.");
				System.out.println("After spending quite a long time to master the arts of your chosen class you have finally decided that you already to head out. Which path do you choose:" );
				System.out.println("1) To take the merchant road or 2) To venture through the unforeseen forest");
				int route2 = input.nextInt();
				switch(route2) 
				{
				case 1: 
					System.out.println("You have decided to take the merchant road armed and ready for your adventure! After awhile on the merchant road, you have reached a three way fork. ");
					System.out.println("Two of the paths have been blocked by fallen trees and the third has the remains of a recently raided stagecoach. All of a sudden a gang of bandits appears. ");
					System.out.println("Do you 3)Attack or 4)Wait or 5)Attempt to run past");
					int fattack1 = input.nextInt();
					switch(fattack1) 
					{
					case 3: 
						System.out.println("Your attack is successful and you have defeated all three bandits");
						System.exit(0);
					case 4:
						System.out.println("Your waiting has led to nothing happening. Do you choose 1) To attack or 2) Run past");
						int waiting1 = input.nextInt();
						switch(waiting1) 
						{
						case 1:
							System.out.println("Your attack is successful and you have defeated all three bandits");
							System.exit(0);
						case 2: 
							System.out.println("Your attempt to run past has led to your death. ");
							System.exit(0);
					case 5:
						System.out.println("Your attempt to run past has led to your death. ");
						System.exit(0);
					}
				case 2:
					System.out.println("You have decided to bravely venture through the unforeseen forest. ");
					System.out.println("As you navigate through the thick and mystic forest, you find a gigantic footprint belonging to the legenedary Forest Guardian, a gigantic grizzly bear. ");
					System.out.println("As a newly trained warrior, you start to feel unease at the sight of what remains to be the Forest Guardian's hunting ground. The sun eventually sets");
					System.out.println("and you have decided to make camp in order to rest for a night. While preparing for bed, you hear a loud noise from the shadows and your worst fears become true.");
					System.out.println("The Forest Guardian appears before you, showing its beastly teeth and claws, ready to make a meal out of you. ");
					System.out.println("Do you decide to: 1) Attack or 2) Wait or 3) Run past the Forest Guardian");
					int fg1 = input.nextInt();
					switch(fg1)
					{
					case 1:
						System.out.println("Your attack is successful and you have defeated the Forest Guardian");
					case 2:
						System.out.println("Waiting has proven unsuccessful. Do you choose 1) To attack or 2)Run past");
						int waiting3 = input.nextInt();
						switch(waiting3) {
						case 1:
							System.out.println("Your attack is successful and you have defeated the forest guardian. ");
						case 2: 
							System.out.println("Your attempt to run past has led to your death. ");
							System.exit(0);
						
					case 3:
						System.out.println("Your attempt to run past has led to your death.");
						
						
					}
									
					}
				
				
				}
			case 6: 
				System.out.println("You have chosen to be an archer.");
				System.out.println("After spending quite a long time to master the arts of your chosen class you have finally decided that you already to head out. Which path do you choose:" );
				System.out.println("1) To take the merchant road or 5) To venture through the unforeseen forest");
				int route3 = input.nextInt();
				switch(route3) 
				{
				case 1: 
					System.out.println("You have decided to take the merchant road armed and ready for your adventure! After awhile on the merchant road, you have reached a three way fork. ");
					System.out.println("Two of the paths have been blocked by fallen trees and the third has the remains of a recently raided stagecoach. All of a sudden a gang of bandits appears. ");
					System.out.println("Do you 2)Attack or 3)Wait or 4)Attempt to run past");
					int fattack2 = input.nextInt();
					switch(fattack2) 
					{
					case 2: 
						System.out.println("Your attack is successful on two of the bandits and there is still one left. ");
					case 3:
						System.out.println("Your waiting has led to nothing happening. Do you choose 1) To attack or 2) Run past");
						int waiting2 = input.nextInt();
						switch(waiting2) {
						case 1:
							System.out.println("Your attack is successful and you have defeated all three bandits");
						case 2: 
							System.out.println("Your attempt to run past has led to your death. ");
							System.exit(0);
					case 4:
						System.out.println("Your attempt to run past has led to your death. ");
						System.exit(0);
					}
				case 5:
					System.out.println("You have decided to bravely venture through the unforeseen forest. ");
					System.out.println("As you navigate through the thick and mystic forest, you find a gigantic footprint belonging to the legenedary Forest Guardian, a gigantic grizzly bear. ");
					System.out.println("As a newly trained warrior, you start to feel unease at the sight of what remains to be the Forest Guardian's hunting ground. The sun eventually sets");
					System.out.println("and you have decided to make camp in order to rest for a night. While preparing for bed, you hear a loud noise from the shadows and your worst fears become true.");
					System.out.println("The Forest Guardian appears before you, showing its beastly teeth and claws, ready to make a meal out of you. ");
					System.out.println("Do you decide to: 1) Attack or 2) Wait or 3) Run past the Forest Guardian");
					int fg2 = input.nextInt();
					switch(fg2)
					{
					case 1:
						System.out.println("Your attack is successful and you have defeated the Forest Guardian");
					case 2:
						System.out.println("Waiting has proven unsuccessful. Do you choose 1) To attack or 2)Run past");
						int waiting3 = input.nextInt();
						switch(waiting3) {
						case 1:
							System.out.println("Your attack is successful and you have defeated the forest guardian. ");
						case 2: 
							System.out.println("Your attempt to run past has led to your death. ");
							System.exit(0);
						
					case 3:
						System.out.println("Your attempt to run past has led to your death.");
						
						
					}
									
					}
				
				}
				}
				
			
				}
				}
				
				
			
		}
		case 2:
			System.out.println("You are an overconfident fool in the eyes of those you wish to impress. You're mediocre at best. No one knows why you chose to pursue this quest, which is way too hard at the moment. ");
			System.out.println("Maybe you have something to prove or a death wish. Perhaps you're just an idiot. A very lucky idiot that no one really understood. ");
			System.out.println("After seeing the quest to defeat the demon king, do you wish to 1) Travel through the Whispering Cave or 2) Join the group of friends you see in the tavern");
			int choices = input.nextInt();
			switch(choices)
			{
			case 1:
				System.out.println("You decided to take the most dangerous and possibly the quickest shortcut to the demon king’s layer, the Whispering Cave. The Whispering Cave is known as the home to monstrous creatures");
				System.out.println("that are now serving the demon king. No one dares to venture there unless well-prepared, let alone going there alone. But being a fool that you are, you marches through the Cave. Minutes");
				System.out.println("after you entered the cave, you are lost. And the next thing you know you are surrounded by a murderous pack of goblins. Do you decide 1) To attack or 2) To wait for the counter");
				System.out.println("or 3) Do you attempt to run past the goblins or 4) Throw your gold away as a distraction and run away");
				int goblins = input.nextInt();
				switch(goblins)
				{
				case 1:
					System.out.println("You attack and miss. Sadly, you have now died. ");
					System.exit(0);
				case 2:
					System.out.println("You wait and the royal guard arrive. Luckily they defeat all the goblins and you join them");
					System.out.println("You manage to make it to the other end of the cave. When you exit the cave, you see two paths. Do you go through 1) The unforeseen forest or 2) The Holiday Inn");
					int inn = input.nextInt();
					switch(inn) 
					{
					case 1:
						System.out.println("You realize that you have stumbled into the Unforeseen forest. Suddenly the forest guardian appears before you. The guardian looks mighty hungry. Do you");
						System.out.println("1) Attack or 2) Wait for the counter or 3) Attempt to run past the forest guardian");
						int forest = input.nextInt();
						switch(forest) 
						{
						case 1:
							System.out.println("You attack and miss. Sadly, the forest guardian grabbed you and swallowed you whole. You are now dead. ");
							System.exit(0);
						case 2:
							System.out.println("You wait for your counter to charge. Your counter is super effective against the forest guardian");
							System.out.println("After defeating the forest guardian, the royal guard run into you. They congratulate you on defeating the forest guardian and give you two thousand gold coins.");
						case 3:
							System.out.println("You attempt to run past the forest guardian, who grabs you as you run past. He swallows you whole and you are now dead. ");
							System.exit(0);			
							
						}
					case 2:
						System.out.println("You decided to sleep at the Holiday Inn. The Inn also sells items that may aid you in your journey. You decide to look at them. ");
						System.out.println("1) New Weapon or 2) New Armor or 3) Lucky Charm 4) You don't want anything from the inn. ");
						int shop = input.nextInt();
						switch(shop) 
						{
						case 1:
							System.out.println("You decide to look at the weapon. It is a sword that raises your attack by fifty percent. Do you wish to get it? 1) Yes or 2) No");
							int s1 = input.nextInt();
							switch(s1)
							{
							case 1:
								System.out.print("Yes");
								System.exit(0);
							case 2:
								System.out.println("No");
								System.exit(0);
							}
							
						case 2:
							System.out.println("You decide to look at the armor. It is a bronze breastplate that raises your defense by thirty percent. Do you wish to get it?");
							int s2 = input.nextInt();
							switch(s2)
							{
							case 1:
								System.out.print("Yes");
								System.exit(0);
							case 2:
								System.out.println("No");
								System.exit(0);
							}
							
						case 3:
							System.out.println("You decide to look at the silver ring. It is a ring that raises your luck by forty percent. Do you wish to get it?");
							int s3 = input.nextInt();
							switch(s3)
							{
							case 1:
								System.out.print("Yes");
								System.exit(0);
							case 2:
								System.out.println("No");
								System.exit(0);
							}
							
						case 4:
							System.out.println("You decide to leave the inn since nothing is interesting. You head to the final boss fight");

						}
						
					
						
					}

				case 3:
					System.out.println("You attempt to run past the goblins. Unluckily, you trip and die. ");
					System.exit(0);
				case 4:
					System.out.println("You threw all your gold as a distraction and run away. You luckily survive since goblins love gold more than you");
					System.out.println("You manage to make it to the other end of the cave. When you exit the cave, you see two paths. Do you go through 1) The unforeseen forest or 2) The Holiday Inn");
						
				}
				
			case 2:
				System.out.println("Realizing how a fool you would be to travel alone, you decided to join, what you believe to be, an adventurer group. After buying them rounds of drinks and entertain them with your deeds"); 
				System.out.println("the group finally let you join their party. The next morning you and your new gang travel through the Merchant Road. When you arrived on the crossroad your party starts setting up ambush");
				System.out.println("on the passing stagecoach. Once the stagecoach arrived, your party attacks and raids the stagecoach, murdering and pillaging loots. You finally realized that you didn’t join an adventure");
				System.out.println("party, you instead join a BANDIT party. Too dumbfounded and awkward to say anything about the confusion to one of the bandits, you spotted an adventurer arriving to the crossroad. ");
				System.out.println("The bandits once again ambush the traveler. ");
				
			}
		}
	}
}

