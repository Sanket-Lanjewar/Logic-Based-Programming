import java.util.*;
import java.io.*;
public class power {

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);{
            System.out.print("enter 1 number:");
            int a=sc.nextInt();
            System.out.print("enter 2 number:");
            int b=sc.nextInt();
            int power=1;
            for(int i=1;i<=b;i++){
                power=power*a;

            }
            System.out.println("ans is:"+power);

        }
    }
    
}





