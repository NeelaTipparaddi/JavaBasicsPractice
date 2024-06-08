public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(727));
        System.out.println(isPalindrome(71));
    }
    // public class NumberPalindrome {
    //     public static boolean isPalindrome(int number){
    //         int a=number, reverse=0;
    //         while(number!=0&&number>9){
    //             reverse= (reverse+(number%10))*10;
    //             number=number/10;
    //             }
    //             reverse=reverse+number;
    //             return reverse==a;

    //         }
    //         return false;
    //     }
    //     }

        public static boolean isPalindrome(int number) {

            int reverse = 0;
            int original = number;
            while (original != 0) {
                reverse = reverse * 10 + original % 10;
                original /= 10;
            }
            return reverse == number;
        }
    }

