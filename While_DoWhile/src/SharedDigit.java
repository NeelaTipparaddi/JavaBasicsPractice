public class SharedDigit {

    public static void main(String[] args) {
        if(hasSharedDigit(98,58)){
            System.out.println(" Both numbers share common number");
        }
        else
        System.out.println(" Both numbers do not share common number");

    }
    public static boolean hasSharedDigit(int A, int B){

        while((A>=10&&A<=99&&B>=10&&B<=99)){
            int a=A%10;
            int b=A/10;
            int c=b%10;
            int d=B%10;
            int e=B/10;
            int f=e%10;
            return (a==d||a==f||b==d||b==f);

        }
        return false;
    }
}

