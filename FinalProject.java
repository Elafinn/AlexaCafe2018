import java.util.Scanner;
public class FinalProject {

	public static void main(String[] args) {
		System.out.println("Welcome to my Guide for School Shootings! "
				+ "\nThis program will inform you of what to do to hide or escape in the event of a school shooting.");
		Scanner userInput;
		userInput = new Scanner(System.in);
		System.out.println("Where are you in the building? \n1 In a room \n2 In the bathroom \n3 In the hallway \n4 Outside \n5 Quit the program");
		int playerChoice;
		int nextQuestion;
		playerChoice = userInput.nextInt();
		while (playerChoice != 5) {
			if (playerChoice == 1) {
			System.out.println("Are there windows? \n1 Yes \n2 No ");
			nextQuestion=userInput.nextInt();
			while (nextQuestion != 3) {
				if (nextQuestion == 1) { 
				System.out.println("Are there blinds? \n1 Yes \n2 No \n3 Exit Program");
				nextQuestion=userInput.nextInt();
				if (nextQuestion == 1){
					System.out.println("Close the blinds.");
					roomConstantAdvice();
				} else if (nextQuestion == 2) { 
					System.out.println("Turn off any lights and look for a place in shadow. Can you find one? \n1 Yes \n2 No \n3 Exit Program");
					nextQuestion=userInput.nextInt();
					if (nextQuestion == 1){
						System.out.println("You can hide there. Can you lock the entrance?\n1 Yes \n2 No \n3 Exit Program");
						nextQuestion = userInput.nextInt();
						if (nextQuestion == 1) {
							System.out.println("Lock the entrance.");
							roomConstantAdvice();
						}
					} else if (nextQuestion == 2) { //lock entrance?
						System.out.println("Can you barricade the entrance? \n1 Yes \n2 No \n3 Exit Program");
						nextQuestion=userInput.nextInt();
						if (nextQuestion == 1) {
							System.out.println("Barricade the entrance and hide in the shadow.");
							roomConstantAdvice();
						} else if (nextQuestion == 2) { //barricade entrance?
							System.out.println("Hide in the shadow away from the entrance.");
							roomConstantAdvice();
							}
						}
					}
					} else if (nextQuestion == 2) { //place in shadow?
						System.out.println("Is there anything that you can hide behind or under? \n1 Yes \n2 No \n3 Exit Program");
						nextQuestion = userInput.nextInt();
						if (nextQuestion == 1) {
							System.out.println("Can you lock the entrance? \n1 Yes \n2 No \n3 Exit Program");
							nextQuestion=userInput.nextInt();
							if (nextQuestion == 1) {
								System.out.println("Lock the entrance and hide.");
								roomConstantAdvice();
							} else if (nextQuestion == 2) { // lock entrance?
								System.out.println("Can you barricade the entrance? \n1 Yes \n2 No \n3 Exit Program");
								nextQuestion=userInput.nextInt();
								if (nextQuestion == 1) {
									System.out.println("Barricade the entrance and hide.");
									roomConstantAdvice();
								} else if (nextQuestion == 2) { //barricade entrance?
									System.out.println("Hide away from the entrance.");
									roomConstantAdvice();
								}
							}
						}else if (nextQuestion == 2) { //hide behind?
							System.out.println("Can you lock the entrance? \n1 Yes \n2 No \n3 Exit Program");
							nextQuestion=userInput.nextInt();
							if (nextQuestion == 1) {
								System.out.println("Lock the entrance and hide in a corner");
								roomConstantAdvice();
							} else if (nextQuestion == 2) { //lock entrance?
								System.out.println("Can you barricade the entrance? \n1 Yes \n2 No \n3 Exit Program");
								nextQuestion=userInput.nextInt();
								if (nextQuestion == 1) {
									System.out.println("Barricade the entrance and hide in a corner.");
									roomConstantAdvice();
								} else if (nextQuestion == 2) {//barricade entrance?
									System.out.println("Hide away from the entrance and in a corner.");
									roomConstantAdvice();
						} 
						}
					}
				}
					else {
					System.out.println("Enter a valid number.");
					nextQuestion = userInput.nextInt();
					}
				endingMessage();
			}
			
			} 
		else if (playerChoice == 2) {
			System.out.println("Are there any stalls that can lock?\n1 Yes \n2 No \n3 Exit Program");
			nextQuestion = userInput.nextInt();
			while (nextQuestion != 3) {	
				if (nextQuestion == 1) {
					System.out.println("If possible, lock or barricade the bathroom door. Then go into the stall and lock it, making sure no part of you can be seen."
							+ " If necessary, climb on the toilet seat.");
					roomConstantAdvice(); 
				} else if (nextQuestion == 2) {//any lock stalls
					System.out.println("Is there anything that you can hide behind or under? \n1 Yes \n2 No \n3 Exit Program");
					nextQuestion = userInput.nextInt();
					if (nextQuestion == 1) {
						System.out.println("Hide behind or under the object. If possible, lock or barricade the bathroom door.");
						roomConstantAdvice();
					} else if (nextQuestion == 2) {
						System.out.println("If possible, lock or barricade the bathroom door. Hide away from the door.");
						roomConstantAdvice();
					}
				}
				else {
					System.out.println("Enter a valid answer.");
					nextQuestion = userInput.nextInt();
				}
					
			} 
			endingMessage(); 
			}
			 
		 else if (playerChoice == 3) {
			System.out.println("Are you near a secure room? \n1 Yes \n2 No \n3 Exit Program"); 
			nextQuestion = userInput.nextInt();
			while (nextQuestion != 3) {
				if (nextQuestion == 1) {
				System.out.println("Can you enter the secure room? \n1 Yes \n2 No \n3 Exit Program");
				nextQuestion = userInput.nextInt();
				if (nextQuestion == 1) {
					System.out.println("Enter the secure room.");
					roomConstantAdvice();
				} else if (nextQuestion == 2) { // can enter secure room?
					System.out.println("Is there a room you can hide in? \n1 Yes \n2 No \n3 Exit Program");
					nextQuestion = userInput.nextInt();
					if (nextQuestion == 1) {
						System.out.println("Barricade yourself in the room and hide.");
						roomConstantAdvice();
					} else if (nextQuestion == 2) { // can barricade self in room?
						System.out.println("Are you near an exit? \n1 Yes \n2 No \n3 Exit Program");
						nextQuestion = userInput.nextInt();
						if (nextQuestion ==  1) {
							System.out.println("Exit the building.");
							outsideConstantAdvice();
						} else if (nextQuestion == 2){ // near emergency exit?
							System.out.println("Make your way towards an exit. Once at an exit, exit the building.");
							outsideConstantAdvice();
						}
					}
				}
			} else if (nextQuestion == 2) { //near secure room?
				System.out.println("Is there a room you can hide in? \n1 Yes \n2 No \n3 Exit Program");
				nextQuestion = userInput.nextInt();
				if (nextQuestion == 1) {
					System.out.println("Barricade yourself in the room and hide. \n3 Exit Program");
					roomConstantAdvice();
				} else if (nextQuestion == 2) { // can barricade self in room?
					System.out.println("Are you near an exit? \n1 Yes \n2 No \n3 Exit Program");
					nextQuestion = userInput.nextInt();
					if (nextQuestion ==  1) {
						System.out.println("Exit the building.");
						outsideConstantAdvice();
					} else if (nextQuestion == 2){ // near emergency exit?
						System.out.println("Make your way towards an exit. Once at an exit, exit the building.");
						outsideConstantAdvice();
					}
				}
			}
			else { 
				System.out.println("Enter a valid answer.");
				nextQuestion = userInput.nextInt();
			}
			}
			endingMessage();
		} 
		else if (playerChoice == 4) {
			System.out.println("Get away from the school.");
			outsideConstantAdvice();
			//outside
			//outsideConstantAdvice
		}
	else { 
			System.out.println("Enter a valid answer.");
			playerChoice = userInput.nextInt();
		} 
		}
			endingMessage();
	}
		
								

	
public static void roomConstantAdvice(){
		System.out.println("Turn off any lights and your phone. Keep your student ID with you. "
				+ "Stay quiet. \nTo calm down, breathe in for five, hold for five, and breathe out for five.");
		endingMessage();
	}
	
public static void outsideConstantAdvice(){
		System.out.println("Keep your student ID with you. \nDiscard any unnecessary weight, e.g. backpacks or loose jackets. "
				+ "\nKeep away from flat areas, e.g. parking lots. Go towards cover, such as woods. \nFind an emergency worker, e.g. police officer, as soon as possible.");
		endingMessage();
	}
public static void endingMessage() {
	System.out.println("Thank you for learning about this subject. \nPress Fn+F11 to run this program again.");
	System.exit(0);
}
}
