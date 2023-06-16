public class Main {

    public static void main (String[] args) {

        // Her declares og initialiseres variabler med datatyper short, int, long
        short myShortValue = Short.MIN_VALUE;
        int myIntValue = Integer.MIN_VALUE;
        long myLongValue = Long.MIN_VALUE;

        System.out.println("Short " + myShortValue );
        System.out.println("int " + myIntValue );
        System.out.println("Long " + myLongValue);

        // declare en varaibel og assigne den med 2 værdier i et statement
        // MAN kan KUN declare en variabel, hvis de man assigner er samme datatype
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);


        // Her declares variablen myTotal som datatypen int, og assignes værdien af myIntValue / 2
        int myTotal = (myIntValue / 2);
        System.out.println(myTotal);

        // --------------- Casting --------------- //
        // Her declares variablen myNewByteValue som datatypen byte, og castes til datatypen byte
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        System.out.println(myNewByteValue);




    }
}
