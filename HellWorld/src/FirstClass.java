public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hi");

        //Ternary operator/Conditional operator(A ? B : C)
        String makeOfCar = "Volkswagen";
        boolean isDomestic =  makeOfCar == "Volkswagen"  ? true : false ;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? ("This car is domestic") :("This car is not domestic");
        System.out.println(s);

        int myValue = 6;
        boolean myValue1 = myValue == 0 ? true : false;
        System.out.println("myValue is "+myValue);
        System.out.println("myValue1 is "+myValue1);


    }
}

