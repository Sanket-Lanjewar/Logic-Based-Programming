import java.util.*;
public class arrayreversetoanotherarray {
    public static void main(String[]args){
        int a[]={3,4,5,6};
        int ans[]=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            ans[j]=a[i];
           j++;
        }
        for(int element:ans){
            System.out.print(element+" ");
        }
    }
    
}


//array reverse to another array







