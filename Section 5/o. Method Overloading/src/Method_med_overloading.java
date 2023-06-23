public class Method_med_overloading {

    public static void main(String[] args) {

        // Her kaldes den normale method
        int newScore = calculateScore("John", 500);
        System.out.println("New score is " + newScore);

        // Her kaldes overloaded method med andre parametre
        System.out.println(calculateScore(400));

        // Her kaldes overloaded method uden parametre
        System.out.println(calculateScore());
    }


    // ------- method --------- //
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // -------- method overloades med andre parametre --------- /
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // -------- method overloades igen uden parametre --------- /
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


}


