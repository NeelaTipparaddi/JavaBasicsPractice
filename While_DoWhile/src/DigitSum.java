public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Sum = "+sumDigit(-1));
        System.out.println("Sum = "+sumDigit(1234));
        System.out.println("Sum = "+sumDigit(2));
        System.out.println("Sum = "+sumDigit(0));

    }
    public static int sumDigit(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number>9){
            sum = sum+(number%10);
            System.out.println(sum);
            number=(number/10);
        }
        sum= sum+number;
        return sum;
    }
}
