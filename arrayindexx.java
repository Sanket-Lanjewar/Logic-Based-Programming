public class arrayindexx {
    public static void main(String[]args){
        {
            int arr[]={23,4,3,6,4,2};
             int x=6;
            int ans=0;
            for (int i=0; i<=arr.length-1;i++){
             if (arr[i]==x){
                ans=i;
                System.out.println("array index of x is:"+ans);
             }
               
            } 

        }
    }
}
    



