import java.util.*;
public class checknumberinarray {
    public static void main(String[]args){
        int arr[]={3,4,5,6,6,7,6,4,4,3,2,6,4,5,3,2,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("How many test cases do you want?");
        int t=sc.nextInt();

        while(t-->0){
        System.out.println("enter number:");
        int n=sc.nextInt();

        boolean a=true;

            for(int j=0;j<arr.length;j++){
                if(arr[j]==n){
                    a= true;
                    break;
                }else{
                    a=false;
                }
            }

        if(a)
        System.out.println("Contains--->"+n);
        else
        System.out.println("NOt Contain--->"+n);
        }
        }
    }   







