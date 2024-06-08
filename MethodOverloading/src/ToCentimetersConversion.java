public class ToCentimetersConversion {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5, 8));

    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;

    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
       // return convertToCentimeters((heightInFeet * 12) + heightInInches);
//Using Variables
        int feetToInches = heightInFeet*12;
        int totalHeight = feetToInches+heightInInches;
        double result= convertToCentimeters(totalHeight);
        return result;
    }

}
