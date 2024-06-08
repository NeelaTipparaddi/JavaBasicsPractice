public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of even = "+getEvenDigitSum(123456789));
    }
        public static int getEvenDigitSum(int number){
            if(number<0)
                return -1;

            int evenDigit=0, sum=0;
            while(number!=0){
                evenDigit=number%10;
                number=number/10;
                if(evenDigit%2==0){
                    sum+=evenDigit;
                }

            }
            return sum;
        }
    }

