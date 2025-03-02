import java.util.*;
public class sortbubble {
    public static void main(String args[]){
    int arr[]={4,2,1,4,3};
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
          int temp=arr[j];
          if(arr[j]>arr[j+1]){
               arr[j]=arr[j+1];
               arr[j+1]=temp;
          }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}


// time complexity 0nsqaure.


