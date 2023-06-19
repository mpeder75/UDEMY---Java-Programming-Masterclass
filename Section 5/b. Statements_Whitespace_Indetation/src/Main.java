public class Main {
    public static void main(String[] args) {

        // ------------ Statements -------------- //

        /*
        Statement er HELE kodelinjen og afsluttes altid med et semikolon ;
         */

        // Statement eksempel
        int myVariabel = 50;

        // Statement eksempel
        myVariabel++;

        // Statement eksempel
        myVariabel--;

        // Statement eksempel
        System.out.println("The statement is the whole code line incl. semicolon");

        // Multiple statements on a line
        int anotherVariabel = 50; anotherVariabel--; System.out.println("My variabel equals " + anotherVariabel);


        // --------- Whitespaces & Reformat code ----- //

        /*

        1. Select all code: Ctrl + a

        2. Reformat code Ctrl + Alt + L

        */

        if (myVariabel == 0) {
            System.out.println("myVariabel is now zero");
        }


    }
}