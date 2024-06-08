public class Main {

    public static void main(String[] args) {
        for(double rate = 7.5; rate<=10;rate+=0.25){
            double interestAmount = calculateInterest(100,rate);
            if(interestAmount>8.5){
                break;
            }
            System.out.println("Interest = Rs"+ interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        amount = amount*(interestRate/100);
        return amount;

    }
}
