import java.util.*;
import java.io.*;

public class percentage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         if(n<100&&n>90){System.out.println("excellent");}
         else if(n>70&&n<80){System.out.println("very good");}
         else if(n>50&&n<70){
            System.out.println("good");
         }
         else{System.out.println("normal or fail");}
    }
}












