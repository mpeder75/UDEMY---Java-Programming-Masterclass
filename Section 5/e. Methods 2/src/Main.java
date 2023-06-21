public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // 1. Her kaldes metoden calculateScore med 4 argumenter i form af variabel navne ovenfor
        calculateScore(gameOver, score, levelCompleted, bonus);

        // 2. Nu assignes variablerne nye værdier
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // 3. Nu kaldes calculateScore med de nye værdier, der er assignet ovenfor
        calculateScore(gameOver,score,levelCompleted,bonus);

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


    // method der returnere beregning af to tal

    public static int calculateNumbers(int a, int b)
    {
        int calculatedNumber = a + b;
        return calculatedNumber;
    }
}


