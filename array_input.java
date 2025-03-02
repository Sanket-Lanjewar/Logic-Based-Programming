import java.util.*;
import java .io.*;
public class array_input {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter"+3+" ") ;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        } 
    }
}












