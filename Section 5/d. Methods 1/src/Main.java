public class Main {

    public static void main(String[] args) {

        // Her kaldes metoden calculateScore med 4 argumenter
        calculateScore(true, 800, 5, 100);
    }


    // method calculateScore med 4 parameter
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your finalScore was " + finalScore);
        }
    }
}



