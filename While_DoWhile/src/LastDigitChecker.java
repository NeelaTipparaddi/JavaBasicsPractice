public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Atleast last digit of 2 numbers are same?\n"+hasSameLastDigit(79,988,68));
    }
    public static boolean hasSameLastDigit(int A, int B, int C){
        //while(A>9&&A<=1000&&B>9&&B<=1000&&C>9&&C<=1000){
        if(isValid(A)&&isValid(B)&&isValid(C)){
            int a=A%10;
            int b=B%10;
            int c=C%10;
            return (a==b||b==c||c==a);
        }
        return false;
        //}

    }

    public static boolean isValid(int A){
        return (A>9&&A<=1000);


    }
}