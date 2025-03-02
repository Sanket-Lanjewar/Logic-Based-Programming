import java .util.*;
public class seat_count {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n=sc.nextInt();
        if(n>1&&n<10){
            System.out.println("Lower Double");}
            else if(n>10&&n<15){
                System.out.println("Lower Single");
            }
            else if(n>15&& n<25){
                System.out.println("upper double");
            }
            else if(n>25&&n<30){
                System.out.println("upper single");

            }
        
    }
    
}



//shubham question send by whatsapp