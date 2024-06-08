public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10||second<10){
            return -1;
        }
        int i=0, divisor=0;
        while(i!=first&&i!=second){
            i++;
            if(first%i==0 && second%i==0){
                divisor=i;
            }
        }
        return divisor;
    }
}