public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int reminder = kiloBytes % 1024;
//            System.out.println(kiloBytes+ " KB");
//            System.out.println(megaBytes+ " MB");
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + reminder + " KB");
        }
    }
}
