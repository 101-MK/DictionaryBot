package dictionaryPackage;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Games {
	
	/*
	 * Fill in the blank game
	 * Input: 3 Strings
	 * Output: void
	 */
	public static void main(String[] args) {
		//Create Word Objects
		Word word1 = new Word("dog","the dog definition goes here","I just purchased a ?");
		Word word2 = new Word("cat","the cat definition goes here","I dislike ?");
		Word word3 = new Word("house","the house definition goes here","I sleep inside of a ?");
		Word word4 = new Word("donut","the donut definition goes here","I just ate a ?");
		Word word5 = new Word("coffee","the coffee definition goes here","This is a good morning drink?");
		Word word6 = new Word("bird","the bird definition goes here","My ? can fly");
		
		// Create ArrayList
		ArrayList<Word> allWords = new ArrayList<Word>();
		
		// Add all of our words
		allWords.add(word1);
		allWords.add(word2);
		allWords.add(word3);
		allWords.add(word4);
		allWords.add(word5);
		allWords.add(word6);
		
		/*
		for(Word w : allWords) {
			System.out.println(w.getName());
		}
		 */
		
		Games game1 = new Games();
		game1.matching(allWords);
		
	}

	public void fillInTheBlank(ArrayList<Word> allWords) {
		// Stop Flag
		boolean continueFlag = true;
		
		// While True Continue Playing Game
		while(continueFlag == true) {
			printfillInTheBlankMenu();
			
			// Get User Selection (1 or 2)
			String userInput;
			Scanner k= new Scanner(System.in);
			userInput=k.nextLine();
			
			// Check not equal to 1 
			if(!userInput.equals("1")) {
				System.out.println("Thank you for playing!");
				return;
			}
			
			// The Game Continues
			
			// Create Random Class
			Random rand = new Random();
			
			// Get random element as the answer
			int answerIdx = rand.nextInt(allWords.size());
			Word answer = allWords.get(answerIdx);
			
			// Get wrong choice 1
			int wrongChoice1Idx = rand.nextInt(allWords.size());
			// check to make sure it wasn't the answerIdx
			while(wrongChoice1Idx == answerIdx) {
				wrongChoice1Idx = rand.nextInt(allWords.size());
			}
			Word wordChoice1 = allWords.get(wrongChoice1Idx);
			
			// Get wrong choice 2
			int wrongChoice2Idx = rand.nextInt(allWords.size());
			// check to make sure it wasn't the answerIdx and wordChoice1
			while(wrongChoice2Idx == answerIdx || wrongChoice2Idx == wrongChoice1Idx) {
				wrongChoice2Idx = rand.nextInt(allWords.size());
			}
			Word wordChoice2 = allWords.get(wrongChoice2Idx);
						
			// Display Game 
			int optionDisplay = rand.nextInt(3);
			System.out.println(answer.getSentence());
			
			if(optionDisplay == 0) {
				
				System.out.println("\tOption 1: " + answer.getName());
				System.out.println("\tOption 2: " + wordChoice1.getName());
				System.out.println("\tOption 3: " + wordChoice2.getName());
				System.out.println("\nMake your selection! 1, 2, or 3:");
				System.out.println(">");
				
				// Get user input 
				userInput=k.nextLine();
				
				if(userInput.equals("1")) {
					System.out.println("Congrats! The correct word was: " + answer.getName());
				} else {
					
					while (!userInput.equals("1")) {
							
						System.out.println("Incorrect! Please try again.");
						System.out.println("Make your selection! 1, 2, or 3:");
						System.out.println("> ");
						// Get user input 
						userInput=k.nextLine();
					}
					
					System.out.println("Congrats! The correct word was: " + answer.getName());
				} // end if statement
				
			} 
			else if (optionDisplay == 1) {
				
					System.out.println("\tOption 1: " + wordChoice2.getName());
					System.out.println("\tOption 2: " + wordChoice1.getName());
					System.out.println("\tOption 3: " + answer.getName());
					System.out.println("\nMake your selection! 1, 2, or 3:");
					System.out.println(">");
					
					// Get user input 
					userInput=k.nextLine();
					
					if(userInput.equals("3")) {
						System.out.println("Congrats! The correct word was: " + answer.getName());
					} else {
						
						while (!userInput.equals("3")) {
								
							System.out.println("Incorrect! Please try again.");
							System.out.println("Make your selection! 1, 2, or 3:");
							System.out.println("> ");
							// Get user input 
							userInput=k.nextLine();
						}
						
						System.out.println("Congrats! The correct word was: " + answer.getName());
					} // end if statement
			}
			else if (optionDisplay == 2) {
				
					System.out.println("\tOption 1: " + wordChoice2.getName());
					System.out.println("\tOption 2: " + answer.getName());
					System.out.println("\tOption 3: " + wordChoice1.getName());
					System.out.println("\nMake your selection! 1, 2, or 3:");
					System.out.println(">");
					
					// Get user input 
					userInput=k.nextLine();
					
					if(userInput.equals("2")) {
						System.out.println("Congrats! The correct word was: " + answer.getName());
					} else {
						
						while (!userInput.equals("2")) {
								
							System.out.println("Incorrect! Please try again.");
							System.out.println("Make your selection! 1, 2, or 3:");
							System.out.println("> ");
							// Get user input 
							userInput=k.nextLine();
						}
						
						System.out.println("Congrats! The correct word was: " + answer.getName());
					} // end if statement
					
			} else {
				
					System.out.println("\tOption 1: " + wordChoice2.getName());
					System.out.println("\tOption 2: " + wordChoice1.getName());
					System.out.println("\tOption 3: " + answer.getName());
					System.out.println("\nMake your selection! 1, 2, or 3:");
					System.out.println(">");
					
					// Get user input 
					userInput=k.nextLine();
					
					if(userInput.equals("3")) {
						System.out.println("Congrats! The correct word was: " + answer.getName());
					} else {
						
						while (!userInput.equals("3")) {
								
							System.out.println("Incorrect! Please try again.");
							System.out.println("Make your selection! 1, 2, or 3:");
							System.out.println("> ");
							// Get user input 
							userInput=k.nextLine();
						}
						
						System.out.println("Congrats! The correct word was: " + answer.getName());
					} // end if statement
					
			}
	
		}// end "game" while loop	
		
	} // end method
	
	/*menu for the fillintheblank game*/
	public static void printfillInTheBlankMenu() {
		System.out.println("\n ----------------------------------------");
		System.out.println("***Welcome to the Fill In The Blank Game***");
		System.out.println("---------------------------------------- \n");
		System.out.println("Please select one of the following:");
		System.out.println("[1] : Play Game");
		System.out.println("[2] : Exit");
		System.out.println(">");
	}

	
	public void matching(ArrayList<Word> allWords) {
		printfillmatching();
		Scanner myAnswer = new Scanner(System.in);

		Random rand = new Random();
		Word answer = allWords.get(rand.nextInt(allWords.size()));
		Word wrongchoice1 = allWords.get(rand.nextInt(allWords.size()));
		Word wrongchoice2 = allWords.get(rand.nextInt(allWords.size()));
		System.out.println("What word fits with this definition?\n" + answer.getDefinition() + "\n");
		int correct = rand.nextInt(3);
		String[] choices = {answer.getName(), wrongchoice1.getName(), wrongchoice2.getName()};
		if(correct == 0) {
			System.out.println("A. " + choices[0] + "\n" + "B. " + choices[1] + "\n" + "C. " + choices[2] + "\n");
		}else if(correct == 1) {
			System.out.println("A. " + choices[1] + "\n" + "B. " + choices[0] + "\n" + "C. " + choices[2] + "\n");
		}else if(correct == 2) {
			System.out.println("A. " + choices[1] + "\n" + "B. " + choices[2] + "\n" + "C. " + choices[0] + "\n");
		}
		String thechoice = myAnswer.nextLine();
		while(!thechoice.equals(choices[0]) && !thechoice.equals(choices[1]) && !thechoice.equals(choices[2])) {
			System.out.println("Can you please take this seriously?\n");
			System.out.println("Please pick a word from the options given.\n");
			thechoice = myAnswer.nextLine();
		}
		if(thechoice.equals(answer.getName())){
			System.out.println("Good job! Hope you didn't cheat!\n");
		}else{
			System.out.println("Too bad. The correct answer was " + answer.getName() + ". You need to study harder.\n");
		}
		System.out.println("Thanks for playing!\n");
	}
	
	/*menu for the matching game*/
	public static void printfillmatching() {
		System.out.println("Welcome to matching! Here are the rules.\n");
		System.out.println("We will give you a definition, and you have to figure out the word that matches it.\n");
		System.out.println("Do you want to play?\n");
		System.out.println("[1] Yes\n");
		System.out.println("[2] No\n");
	}
	
	

}
