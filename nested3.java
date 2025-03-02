import java.util.*;
import java.io.*;
public class nested3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 number");
        int a=sc.nextInt();
        System.out.println("enter 2 number");
        int b=sc.nextInt();
        System.out.println("enter 3 number");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c){
                System.out.println("a is greater");

            }
            else{
                System.out.println("c is greater");
            }
        }
        else{
            if(b>c){
                System.out.println(" b is greater");

            }
            else{
                System.out.println("c is greater");
            }
        }
    }
}



