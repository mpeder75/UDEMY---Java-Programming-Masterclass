public class Main {

    public static void main(String[] args) {

        // ------- Equal operator ---------//

        boolean isAlien = false;

        if (isAlien == false)   // der tjekkes om isAlien variablen er false - Den tjekker altså linje 7
        {
            System.out.println("It is not a Alien");
            System.out.println("And I an scared of aliens");
        }



        // ------- Not Equal operator ---------//

        int topScore = 100;

        if (topScore != 100)    // der tjekkes om topscore variablen er forskellig for 100
        {
            System.out.println("You got the high score");
        }



        // ------- Greater than or equal operator ---------//

        int topNewScore = 100;

        if (topNewScore >= 100)    // der tjekkes om topNewScore variablen er større eller lig med 100
        {
            System.out.println("You got the high score");
        }



        // ------- AND operator ---------//

        int secondTopScorer = 60;

        // der tjekkes om topScore er større end secondTopScorer
        // OG topscore er større eller lig med 100
        if (topScore > secondTopScorer && topScore <= 100)
        {
            System.out.println("Greater than second top score and less or equal to 100");
        }



    }
}