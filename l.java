public class l {
    public static void main(String args[]){
        int num=1345;
       String s=" ";
      
       while(num>0){
        int digit = num%10;

        s= Integer.toString(digit*digit)+ s;

        num=num/10;
           }
           
           System.out.print(s);

    }
    
}














