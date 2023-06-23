public class Method_uden_overloading {

    public static void main(String[] args) {

        int newScore = calculateScore("John", 500);
        System.out.println("New score is " + newScore);
    }

    // -------- Normal method uden overloading --------- /
    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score +" points");
        return score * 1000;
    }
}


