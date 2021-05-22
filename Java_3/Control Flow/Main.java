
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        System.out.println("Pick a number between 1 and 10");
//        Scanner pick = new Scanner(System.in);
//
//        int inputtedNum = pick.nextInt();
//
//        if (inputtedNum < 5) {
//            System.out.println("Enjoy the good luck a friend brings you");
//        } else {
//            System.out.println("Your shoe selection will make you very happy today");
//        }


//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while (isOnRepeat) {
//            System.out.println("Playing current song");
//            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
//            String userInput = input.next();
//
//            if (userInput.equals("yes")) {
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("Playing next song");

        String question = "What is my name?";
        String choiceOne = "Piyush";
        String choiceTwo = "Guy";
        String choiceThree = "Kavan";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Is it: " +  choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");
        // Have the user input an answer
        Scanner input = new Scanner(System.in);

        // Retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        if (userInput.equals(choiceOne.toLowerCase())) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congrats! That's the correct answer!");
        }
        else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Incorrect. The correct answer is " + choiceOne + ".");
        }

    }

}