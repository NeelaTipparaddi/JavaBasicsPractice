public class ThePrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; count<3&&i <= 50; i++) {
            if(i==30){
                break;
            }
            if (isPrime(i)) {
                count++;
//                if(count==3);
//                break;
            }
        }
        System.out.println("Total number of prime numbers = " + count);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return (number == 2);
        }

        //for (int divisor = 2; divisor <= number/2; divisor++)
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        System.out.println("number " + number + " is prime number");
        return true;

    }
}

