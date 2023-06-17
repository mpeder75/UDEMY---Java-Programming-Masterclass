public class Main {
    public static void main(String[] args) {


    // -------- Ekstra Parenteser for at gør kode mere letlæselig -------- //

     int topScore = 80;

     int secondTopscore = 81;

     if ((topScore > secondTopscore) && (topScore < 100))
     {
         System.out.println("Greater than second top score and less than 100");
     }



    // -------- OR Operator - Blot en condition skal være true -------- //

        int oldTopScore = 80;
        int newTopScore = 85;

        if ((oldTopScore > 90) || (newTopScore <= 90))
        {
            System.out.println("Either or both of the condition is true");
        }


    }
}