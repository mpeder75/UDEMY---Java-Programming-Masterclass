public class ConvertFromInchToCentimeters {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    // -------- metode omregner inches til cm -------- //
    public static double convertToCentimeters(int heightInches) {
        double convertedToCm = (double)heightInches * 2.54;
        return convertedToCm;
    }

    // Her kaldes første method onvertToCentimeters(heightFeet) og der lægges remainingHeightInches til
    public static double convertToCentimeters(int heightFeet, int remainingHeightInches) {
       //return convertToCentimeters((heightFeet * 12) + remainingHeightInches);

        int feetToInches = heightFeet * 12;
        int totalInches = feetToInches + remainingHeightInches;
        double result = convertToCentimeters(totalInches);
        return result;

    }
}
