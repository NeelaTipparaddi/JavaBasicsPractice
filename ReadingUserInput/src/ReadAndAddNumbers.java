import java.util.Scanner;

public class ReadAndAddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + x + ":");
            String string = scanner.nextLine();
            try {
                double y = Double.parseDouble(string);
                sum += y;
                x++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Value");
            }

        }
        while (x <= 5);
        System.out.println("Sum = " + sum);

    }
}
