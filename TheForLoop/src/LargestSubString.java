public class LargestSubString {


    String input;

    LargestSubString(String input){
        this.input=input;}


    public void String() {
        int count1=0;
        int count=0;
        int index=0;
        int a=0;
        int n = input.length();
        //int i =0;
        for(int i=0;i<=n;i++){
            for(int j=i+1; j<n;j++) {
                if(input.charAt(i) != input.charAt(j)) {
                    count++;
                }
                else if(count1>count){
                    count1=count;
                    a=i+1;
                    continue;
                }
                else


            }

        }
        System.out.print(input.substring(a,a+count));


    }
}

