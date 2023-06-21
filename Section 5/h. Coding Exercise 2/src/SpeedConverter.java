public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(10.25);
    }


    public static long toMilesPerHour(double kilometersPerHour) {

        long converted;

        if (kilometersPerHour < 0) {
            converted = -1;
        } else {
            converted = Math.round(kilometersPerHour / 1.609);
        }
        return converted;
    }


    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
