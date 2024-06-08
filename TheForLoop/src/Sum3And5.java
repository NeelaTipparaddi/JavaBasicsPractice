public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
//              sum=sum+i;
                System.out.println(i + " is divisible by 3 & 5");
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum of numbers divisible by 3 & 5 = " + sum);

    }
}
