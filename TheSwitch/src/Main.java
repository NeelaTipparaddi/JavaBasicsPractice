public class Main {
    public static void main(String[] args) {
        int i=5, totalNumber=0, count=1, count1=0;
      while(i<=20//&&count<6
         ){
          i++;
          if(!isEvenNumber(i)) {
              count1++;
              continue;
          }
          count++;
          if(count>6){
              break;
          }
          totalNumber+=i;
          System.out.print(i+",");

      }
      System.out.println("\nTotal of all even numbers = "+ totalNumber);
        System.out.println("Total number of odds = "+count1);
        System.out.println("Total number of evens = "+count);
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

}
