package Exercise_3;

import java.util.Scanner;

public class Space_Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your current earth weight:");
		
		Scanner userInput = new Scanner (System.in);
		float spaceWeight = userInput.nextFloat();
		
		System.out.println("Select a planet according to it's Number");
		 planetOption();
		
		int selection = userInput.nextInt();
		userInput.close();
		
		current_earth_weight (selection, spaceWeight);
	}

	static void planetOption () {
		
		System.out.println("1. Venus");
		System.out.println("2. Mars");
		System.out.println("3. Jupiter");
		System.out.println("4. Saturn");
		System.out.println("5. Uranus");
		System.out.println("6. Neptune");
		
	}
		
		static void current_earth_weight (int selection, float spaceWeight) {
			float  myAge = 1;
			switch (selection) {
			case 1:
				myAge = (float)0.78;
				break;
			case 2:
				myAge = (float)0.39;
				break;
			case 3:
				myAge = (float)2.65;
				break;
			case 4:
				myAge = (float)1.17;
				break;
			case 5:
				myAge = (float)1.05;
				break;
			case 6:
				myAge = (float)1.23;
				break;
			default:
				System.out.println("Enter a Valid selection");
				break;
		
			}
			
			float newWeight = myAge * spaceWeight;
			System.out.println("Your Planet Waight is " + newWeight);
		}
		
		
	}
	


