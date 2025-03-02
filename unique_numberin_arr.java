import java.util.*;
import java.io.*;
public class unique_numberin_arr {
    public static void main(String[] args) {
       
        int arr[]={4,5,43,5,4,4, 9,18, 16};
        
        for (int i=0;i<=arr.length-1;i++){
            int count=0;
        for( int j=0;j<=arr.length-1;j++  ){
           if( arr[j]==arr[i]){count++;}

        }

    if(count==1)
    System.out.print(arr[i]+" ");
 
}
        
    }
    }
    





