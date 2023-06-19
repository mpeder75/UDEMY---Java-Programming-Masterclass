public class Main {
    public static void main(String[] args) {

        // Boolean variabel isAlien declares som assignes til at være false
        boolean isAlien = false;

        // If statement tjekker sin condition om variablen isAlive er falsk - evalueres det til true, køres code block
        if (isAlien == false)
        {
            System.out.println("It is not a Alien");
            System.out.println("And I an scared of aliens");
        }

        // Eller med shorthand i condition
        if (!isAlien)
        {
            System.out.println("It is not a Alien");
            System.out.println("And I an scared of aliens");
        }
    }
}