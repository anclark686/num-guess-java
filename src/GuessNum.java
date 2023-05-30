import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        GuessNumGame();
    }

    public static void GuessNumGame() {
        Scanner sc = new Scanner(System.in);
        int num = 1 + (int)(100 * Math.random());

        System.out.println(
                "A number is chosen"
                + " between 1 to 100."
                + " Guess the number."
                + " Enter q to quit.");

        boolean found = false;

        while (!found) {
            String guess = sc.nextLine();
            guess = guess.toLowerCase();
            if (guess.charAt(0) == 'q') {
                System.out.println("Ending game!");
                break;
            }
            try {
                int guessNum = Integer.parseInt(guess);
                if (guessNum == num) {
                    System.out.println("You won! The number was: " + num);
                    found = true;
                } else {
                    if (guessNum > num) {
                        System.out.println("Sorry that was incorrect, the number is lower than " + guessNum);
                    } else {
                        System.out.println("Sorry that was incorrect, the number is higher than " + guessNum);
                    }
                }
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid number: ");
            }
        }
    }
}
