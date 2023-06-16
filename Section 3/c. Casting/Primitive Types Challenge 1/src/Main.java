public class Main {

    public static void main (String[] args) {

        // bytes variabel - range 127 til -128
        byte myByte = 10;

        // short variabel - range 32767 til -32767
        short myShort = 20;

        // int variabel - range 2147483647 til -2147483647
        int myInt = 50;

        long myLong = 50000L + (10L * (myByte + myShort + myInt));

        System.out.println(myLong);

    }
}
