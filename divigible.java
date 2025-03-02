import java.util.*;
import java.io.*;
public class divigible {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%5==0||n%3==0){
            System.out.println("divisible");

        }
        else{System.out.println("not divisible");}
    }
}





