import java.util.*;
import java.io.*;
public class profit {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int sp=sc.nextInt();
        System.out.println("enter a second number:");
        int cp=sc.nextInt();
        if(sp>cp){
          System.out.println("you gained a profit:");
          System.out.println(sp-cp);
        }
        else{System.out.println("you gained a loss:");
       System.out.println(cp-sp);}
    }
}





