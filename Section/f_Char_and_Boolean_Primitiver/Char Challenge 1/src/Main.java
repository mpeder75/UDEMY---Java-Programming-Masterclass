public class Main {
    public static void main (String[] args) {
        /*
        Create three char variables to store the character for the question-mark symbol
        1. mySimpleChar should be assigned the literal question-mark character ?.
        2. myUnicodeChar should be assigned the unicode value for the question-mark ?.
        3. myDecimalChar should be assigned the decimal value for the question-mark ?.
        Print all three variables in one statement, that starts with the label 'My values are '.
        */

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;

        System.out.println("My values are " + mySimpleChar +  myUnicodeChar + myDecimalChar);

    }
}