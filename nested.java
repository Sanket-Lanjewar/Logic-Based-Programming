import java.util.*;
import java.io.*;
public class nested {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%5==0||n%3==0) && n%15!=0){
            System.out.println("condition fulfil");
        }
        else{
            System.out.println("not fulfil");
        }
    }
}





