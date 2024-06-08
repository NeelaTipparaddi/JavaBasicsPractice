import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
        public static void inputThenPrintSumAndAverage() {
            Scanner scanner = new Scanner(System.in);
                int sum = 0;
                long avg = 0;
                int count = 1;
            System.out.println("Enter the number:");
                do{
                    String string = scanner.nextLine();
                    try {
                        int y = Integer.parseInt(string);
                        sum += y;
                       avg = Math.round((double)sum / count);
                        count++;

                    } catch (NumberFormatException nfe) {
                        System.out.println("SUM = " + sum + " AVG = " + avg);
                    }
                }while(count>=1);

            }
        }

