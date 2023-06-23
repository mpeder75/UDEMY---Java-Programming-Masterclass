public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    // ----- Method der beregner seconds til hours
    public static String getDurationString (int seconds){

        int minutes = seconds / 60;
        // her kaldes overloaded method med
        return getDurationString(minutes,seconds);
    }

    // Metode overloader den tidligere og bruger
    public static String getDurationString( int minutes, int seconds){

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m "  + remainingSeconds + "s";

    }
}
