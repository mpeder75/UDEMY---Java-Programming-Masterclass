public class Main {
    public static void main(String[] args) {

        /*
        Step 1:  create a double variable with a value of 20.00.
        Step 2:  create a second variable of type double with a value 80.00.
        Step 3:  add both numbers together, then multiply by 100.00.
        Step 4:  use the remainder operator, to figure out what the remainder from the result of the operation in step 3, and 40.00, will be.
        Step 5:  create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
        Step 6:  output the boolean variable just to see what the result is.
        Step 7:  write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true
         */


        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;

        System.out.println("MyValuesTotal = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder is = " + theRemainder);

        boolean isTrueOrFalse = (theRemainder == 0.00d) ? true : false;

        System.out.println("is True or False = " + isTrueOrFalse);

        if (!isTrueOrFalse) {
            System.out.println("There is a remainder");
        }

    }
}