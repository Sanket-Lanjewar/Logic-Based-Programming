import java.util.*;
import java.io.*;
public class nestedrectangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);{
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=1;i<=3;i++){
                for(int j=1;j<6;j++){
                    if(i==1||i==a||j==1||j==b){
                        System.out.print("*");}
                        else
                         {
                            System.out.println(" ");
                
                    }
                }
            }
        }
    }
}







