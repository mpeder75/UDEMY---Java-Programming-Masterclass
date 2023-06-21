public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // calculateScore kaldes med argumenter, og resultat calculateScore returnere gemmes i variablen highScore
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        // nu assignes variable med ny værdier
        score = 10000;
        levelCompleted = 8;
        bonus = 8;

        // Her printer man DIREKTE resultatet fra calculateScore
        System.out.println("The new highScore is " + calculateScore(gameOver,score,levelCompleted,bonus));

    }


    // method calculateScore med 4 parameter der returnere en int "finalScore"
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}





