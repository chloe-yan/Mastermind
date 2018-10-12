import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int correctGuesses = 0;
		int rounds = 0;
		String[] colors = new String[6];
			colors[0] = "red";
			colors[1] = "orange";
			colors[2] = "yellow";
			colors[3] = "green";
			colors[4] = "blue";
			colors[5] = "purple";
		System.out.println("Enter the number of pins you want");
		int numberOfPegs = in.nextInt();
		int[] pegList = new int[numberOfPegs];
		String[] guessList = new String[numberOfPegs];
		String[] coloredPins = new String[numberOfPegs];
		for (int i = 0; i < numberOfPegs; i++) {
			pegList[i] = rand.nextInt(6);
			coloredPins[i] = colors[pegList[i]];
			System.out.println(coloredPins[i]);
		}
		for(int k = 0; k <= numberOfPegs; k++) {
			System.out.println("");
			System.out.println("Enter your guess:");
			String userGuess = in.next();
			guessList[k] = userGuess;
			rounds ++;
				
			if(userGuess.equals(coloredPins[k])) {
				correctGuesses++;

			}
			if(correctGuesses == numberOfPegs) {
				System.out.println("");
				System.out.println("Congratulations, you won!");
				System.out.println("Points: " + correctGuesses);
				System.out.println("Rounds: " + rounds);
			}
		}	
		for(int j = 0; j < correctGuesses; j++) {
			System.out.print("*");
		}
	}
}
		
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Mastermind {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Random rand = new Random();
//		int pegNumber = in.nextInt();
//		System.out.println("Enter the amount pegs you would like to have.");		
//		ArrayList<String> pegList = new ArrayList<String>();
//		for(int i = 0; i < pegNumber; i++) {
//			
//		}
//		int peg1 = rand.nextInt(5);
//		String pegcolor1 = pegColor(peg1);
//		int peg2 = rand.nextInt(5);
//		String pegcolor2 = pegColor(peg2);
//		int peg3 = rand.nextInt(5);
//		String pegcolor3 = pegColor(peg3);
//		int peg4 = rand.nextInt(5);
//		String pegcolor4 = pegColor(peg4);
//		System.out.print(peg1);
//		System.out.print(peg2);
//		System.out.print(peg3);
//		System.out.print(peg4);
//		String yellow = "yellow";
//		String white = "white";
//		String black = "black";
//		String red = "red";
//		String green = "green";
//		String blue = "blue";
//
////		System.out.print(peg1);
////		System.out.print(peg2);
////		System.out.print(peg3);
////		System.out.println(peg4);
////		System.out.println(pegcolor1);
////		System.out.println(pegcolor2);
////		System.out.println(pegcolor3);
////		System.out.println(pegcolor4);
//		
//		int numberOfGuesses = 0;
//		String pegOutputWhite = "○";
//		int pegWhiteAmount = 0;
//		String pegOutputBlack = "•";
//		int pegBlackAmount = 0;
//
//		
//		for (int i = 0; i < 12; i++) {
//			int points = 0;
//			System.out.println("Enter your guess for peg #1");		
//			String guesspeg1 = in.next();
//			System.out.println("Enter your guess for peg #2");		
//			String guesspeg2 = in.next();
//			System.out.println("Enter your guess for peg #3");		
//			String guesspeg3 = in.next();
//			System.out.println("Enter your guess for peg #4");		
//			String guesspeg4 = in.next();
//			if(guesspeg1.equals(pegcolor1)) {
//				points ++;
//				if(guesspeg1.equals(yellow)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(white)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(black)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(red)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(green)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(blue)) {
//					pegBlackAmount ++;
//				}
//			}
//			if(guesspeg2.equals(pegcolor2)) {
//				points ++;
//				if(guesspeg1.equals(yellow)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(white)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(black)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(red)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(green)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(blue)) {
//					pegBlackAmount ++;
//				}
//			}
//			if(guesspeg3.equals(pegcolor3)) {
//				points ++;
//				if(guesspeg1.equals(yellow)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(white)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(black)) {
//				pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(red)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(green)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(blue)) {
//					pegBlackAmount ++;
//				}
//			}
//			if(guesspeg4.equals(pegcolor4)) {
//				points ++;
//				if(guesspeg1.equals(yellow)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(white)) {
//					pegWhiteAmount ++;
//				}
//				if(guesspeg1.equals(black)) {
//					pegWhiteAmount ++;
//				}					if(guesspeg1.equals(red)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(green)) {
//					pegBlackAmount ++;
//				}
//				if(guesspeg1.equals(blue)) {
//					pegBlackAmount ++;
//				}
//			}
//			numberOfGuesses ++;
//			String guessTotal = (guesspeg1 + guesspeg2 + guesspeg3 + guesspeg4);
//			String pegPattern = (pegcolor1 + pegcolor2 + pegcolor3 + pegcolor4);
//			System.out.println("------------------------");
//			System.out.println(" Points: " + points);
//			int timesPrintedWhite = 0;
//			int timesPrintedBlack = 0;
//			while(timesPrintedWhite < pegWhiteAmount) {
//				System.out.print("○");
//				timesPrintedWhite++;
//			}
//			while(timesPrintedBlack < pegBlackAmount) {
//				System.out.print("•");
//				timesPrintedBlack++;
//			}
//			System.out.println("");
//			System.out.println("________________________");
//			if (guessTotal.equals(pegPattern)) {
//			System.out.println("You won!");
//			System.out.println("Guesses: " + numberOfGuesses);
//			System.exit(1);
//			}
//		}
//	}
//	
//	public static String pegColor(int pegColor) {
//		if(pegColor == 0) {
//			return "yellow";
//		}
//		if(pegColor == 1) {
//			return "white";
//		}
//		else if(pegColor == 2) {
//			return "black";
//		}
//		else if(pegColor == 3) {
//			return "red";
//		}
//		else if(pegColor == 4) {
//			return "green";
//		}
//		else if(pegColor == 5) {
//			return "blue";
//		}
//		else {
//			return "";
//		}
//	}
//}