package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Jay Patel May 23, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue(rand.nextInt(13) + 1);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[rand.nextInt(4)]);
            hand[i] = card;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = sc.nextInt();
        System.out.print("Enter the suit of your card (0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int suit = sc.nextInt();
        
         boolean foundMatch = false;
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit().equalsIgnoreCase(Card.SUITS[suit])) {
                foundMatch = true;
                break;
            }
        }
        
        if (foundMatch) {
            printInfo();
        }
        else {
            System.out.println("Doesn't Match. Better Luck Next Time.");
        }
    }



        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Jay Patel May 2023
     */
    private static void printInfo() {
        
        //I'm done!
        
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Jay Patel, but you can call me Jay");
        System.out.println("I am an international Student from India.");
        System.out.println();
        
        System.out.println("My hobbies:");
        System.out.println("-- Playing video games");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV/Sci-fi Movies");
        System.out.println("-- Riding my motorcycle");
    }

}
