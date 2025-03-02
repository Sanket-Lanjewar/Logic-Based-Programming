public class array_prefix_sum {
    public static void main(String[]args){
        int arr[]={2,3,4,4};
        int sum=0;
        for(int i=1;i<=arr.length;i++){
            sum=sum+arr[i-1];
            System.out.print(sum+" ");

        }
    }
    
}


//sum of array






