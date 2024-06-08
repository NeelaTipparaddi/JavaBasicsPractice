public class Main {
    public static void main(String[] args) {
        int i=4, count=0, count1=0;
        while(i<=20){
            i++;
            if(!isEvenNumber(i)){
                count++;
                continue;

            }
            else {
                count1 += 1;
                if(count1>5){
                    break;
                }
                System.out.println(i);
            }
        }
        System.out.println("Total number of evens = "+count1);
        System.out.println("Total number of odds = "+count);
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

}
