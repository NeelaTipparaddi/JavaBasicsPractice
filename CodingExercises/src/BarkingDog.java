public class BarkingDog {
    public static void main(String[] args) {

        if(shouldWakeUp(true,10)){
            System.out.println("Dog is barking");
        }
        else
        System.out.println("Dog is not barking");

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay<0||hourOfDay>23){
            return false;
        }
        return barking && (hourOfDay<8||hourOfDay>22);

    }
}


