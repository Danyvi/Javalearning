package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    char myChar = 'D';
	    char myUnicodeChar = '\u0044'; // backslash u tells Java compiler that it is a unicode character
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; // good naming is like a question

        String myString = "This is a string";
        System.out.println(myString);
    }
}
