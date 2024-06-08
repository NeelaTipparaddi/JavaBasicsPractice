public class Main {
    public static void main(String[] args) {

        int a=7;
        if(isPerfectNumber(a))
            System.out.println(a+" is a perfect number");
        else
            System.out.println(a+" is not a perfect number");

    }
    public static boolean isPerfectNumber(int number){
        if(number<1)
            return false;

        int sum=0;
        for(int i=1; i<=number/2; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        return sum==number;


    }
}

