package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score");
        }


        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}
