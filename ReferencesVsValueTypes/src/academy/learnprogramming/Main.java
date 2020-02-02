package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Value Types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Reference Types

        // in this case we have 2 references (the 2 arrays) pointing at the same array in memory
        // both holds the same address
        int[] myIntArray = new int[5]; //new object
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= "+ Arrays.toString(myIntArray)); // converts every element in the array to string
        System.out.println("anotherArray= "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("After change anotherArray= "+Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("After modify myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray= "+Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
