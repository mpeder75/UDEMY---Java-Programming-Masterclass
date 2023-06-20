public class Main {
    public static void main(String[] args) {

        // -------- If Then Else Statement -------//

        int score = 5000;

        if (score <= 5000) {
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("Your score was higher than 5000");
        }



        // ------- If with an Else if and Else block -------//


        int myScore = 5000;


        if (myScore < 5000 && myScore > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (myScore < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("You got here");
        }



    }
}