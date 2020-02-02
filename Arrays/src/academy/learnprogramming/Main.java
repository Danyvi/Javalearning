package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] myIntArray = new int[10];
//
//        myIntArray[5] = 50;
//
//        double[] myDoubleArray = new double[10];
//
//        System.out.println(myIntArray[5]);
//
//        int[] myIntArrayBis = { 1,2,3,4,5,6,7,8,9,10 };
//        System.out.println(myIntArrayBis[0]);
//        System.out.println(myIntArrayBis[6]);
//        System.out.println(myIntArrayBis[9]);

        int[] arrayFromLoop = new int[25];
        for (int i=0; i<arrayFromLoop.length; i++) {
            arrayFromLoop[i]=i*10;
        }

        printArray(arrayFromLoop);
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element "+i+" : "+array[i]);
        }
    }

}
