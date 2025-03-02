 import java.util.*;
 import java.io.*;
 public class tringle_conditon {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(b+c>a&& a+c>b&&a+b>c){
            System.out.println("valid tringle");
        }
        else{System.out.println("not a valid tringle");}
    }
}









