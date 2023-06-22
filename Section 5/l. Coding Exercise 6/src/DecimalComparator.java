public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.888,3.222));

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        /*
        Num1 * 1000 gør at decimalet flyttes 3 pladser ex. 55x1000 = 55.000
         */
        int myFirstCheck = (int) (num1 * 1000);
        int mySecondCheck = (int) (num2 * 1000);

        /*
        Her tjekkes om de omregnet variabler,med 3 decimaler, er lig hinanden
         */
        if (myFirstCheck - mySecondCheck == 0) {
            return true;
        } else {
            return false;
        }
    }
}

