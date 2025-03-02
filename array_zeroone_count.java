import java.io.*;
import java.util.Scanner;
public class array_zeroone_count {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases do you want");
        int t=sc.nextInt();


        while(t-->0){
            System.out.println("Enter size of array");
            int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        int count0=0;
       
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count0++;
            }
            }
            System.out.println("Count of 0 is --->"+count0);
             int count1=a.length-count0;

            System.out.println("Count of 1 is --->"+count1);

            // while(count0!=0){
            //     System.out.print(0+" ");
            //     count0--;
            // }

            for(int i=count0;i>0;i--){
                System.out.print(0+" ");
            }

            while(count1!=0){
                System.out.print(1+" ");
                count1--;
            }
            System.out.println();
        }
        }
    }
    




//shubham make


