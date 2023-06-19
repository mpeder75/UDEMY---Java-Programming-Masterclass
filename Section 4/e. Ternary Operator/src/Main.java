public class Main {
    public static void main(String[] args) {

        // ------ Ternary Operator ------- //

        String makeOfCar = "Volkswagen";

        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

        if (isDomestic)
        {
            System.out.println("This car is domestic make ");
        }

        // ------ Ternary med shorthand ------ //

        String myName = "Poul";

        boolean isName = (myName != "Anders");

        if (isName)
        {
            System.out.println("Your name is not Anders");
        }


        // Eksempel

        boolean whatIsBeingPrinted = true;

        String s = (whatIsBeingPrinted) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);





    }
}