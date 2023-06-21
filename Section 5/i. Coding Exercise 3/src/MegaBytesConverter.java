public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-1024);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int calculateMegabytes = (kiloBytes / 1024);
            int remainderCalculated = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + calculateMegabytes + " MB and " + remainderCalculated + " KB");
        }
    }
}


