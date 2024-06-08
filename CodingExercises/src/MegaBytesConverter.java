public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-9);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int YY = kiloBytes/1024, ZZ = kiloBytes%1024;

        if(kiloBytes>=0){
            System.out.println(kiloBytes+" KB = " + YY + " MB and " + ZZ +" KB" );

        }
        else
            System.out.println("Invalid Value");
    }

}

