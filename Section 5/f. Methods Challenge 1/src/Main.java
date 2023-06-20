public class Main {
    public static void main(String[] args) {

        // Her declares highScorePosition som har værdien af calculateHighScorePosition med argumentet 1500
        int highScorePosition = calculateHighScorePosition(1500);
        // Nu kaldes displayHighScorePosition, hvor der passes et navn og værdien af highScorePosition(1500)
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Poul", highScorePosition);
    }


    // Method 1 - Opsættes efter opgave beskrivelse
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into " + highScorePosition + " on the high score list");
    }

    // Method 2 - opsættes efter opgavebeskrivelse
    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
          return position;
    }
}



