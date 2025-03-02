import java.util.*;
import java.io.*;
public class areaperimeter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("enter a second number:");
        int b=sc.nextInt();
        int c=a*b;
        
        int p=2*(a+b);
        if(c>p){System.out.println("area is greater than the perimer");}
        else{System.out.println("area is not greater than the perimeter");}
    }
}






    