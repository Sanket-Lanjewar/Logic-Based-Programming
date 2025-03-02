public class array_sumto_lmited_index {
    public static void main(String args[]){
        int arr[]={3,4,5,6,8,5,3};
        int sum=0;
       for(int i=1;i<=3;i++){
        sum=arr[i]+arr[i-1];
        System.out.print(sum+" ");
           }

    }
    
}





