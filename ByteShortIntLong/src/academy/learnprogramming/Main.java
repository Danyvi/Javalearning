package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewSHortValue = (short) (myMinShortValue/2);

        byte myByteChallengeVariable = 42;
        short myShortChallengeVariable = 12000;
        int myIntChallengeVariable = 1_500_000;
        long myLongChallengeVariable = 50000 + 10 * (myByteChallengeVariable + myShortChallengeVariable + myIntChallengeVariable);
        System.out.println("The LongChallengeVariable is : " + myLongChallengeVariable);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

//        int myIntValue = 5;
//        float myFloatValue = (float)5.25; //by default Java looks for double by default. We can use 5.25f instead of casting
//        double myDoubleValue = 5.25d;

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d; // we could write 5.00/3.00 since Java looks for doubles

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("myDoubleValue = "+myDoubleValue);

        // Convert a given number of pounds to kilograms:
        double myDoublePounds = 5.23;
        double myDoubleKilograms = myDoublePounds*0.45359237;
        System.out.println(myDoublePounds+" pounds are "+ myDoubleKilograms+" kilograms");

    }
}
