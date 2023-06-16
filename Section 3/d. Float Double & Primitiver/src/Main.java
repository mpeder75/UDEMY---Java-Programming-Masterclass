public class Main {

    public static void main (String[] args) {

        // Float Value Range is ( 1.401298464324817E-45 to 3.4028235E38)
        System.out.println("Float Value Range is ( " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");

        // Double Value Range is ( 4.9E-324 to 1.7976931348623157E308)
        System.out.println("Double Value Range is ( " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        // --------------------- Challenge ------------------------ //
        // Hvordan caster man "float myOtherFloat = 5.25;" ?

        float myOtherFloat = (float) 5.25;
        System.out.println(myOtherFloat);

        // ------------------------------------------------------- //

        // Casting til korrekt datatype, ellers vil Java give fejl
        float myOtherFloatValue = (float) 5.25;


    }
}
