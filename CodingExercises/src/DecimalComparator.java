public class DecimalComparator {
    public static void main(String[] args) {

        if(areEqualByThreeDecimalPlaces(-3.1756, 3.1758)) {
            System.out.println("Enetered numbers are equal by three decimal places");
        }
        else
            System.out.println("Enetered numbers are not equal by three decimal places");

    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second ){
        long firstRounded = (long) (first*1000);
        long secondRounded = (long) (second*1000);

        return firstRounded == secondRounded;
    }
}
