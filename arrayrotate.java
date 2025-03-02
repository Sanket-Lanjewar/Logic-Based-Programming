public class arrayrotate {
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7,8,9};
        int sum=0;
        int n=arr.length;
        int j=0;
        int k=3;
        int m=k%n;
        
       // int ans[]=new int[n];

        for(int i=n-m;  i<n;  i++){
           System.out.print(arr[i]+" ");
        }
        for(int i=0; i<n-m;  i++){
           System.out.print(arr[i]+" ");
        
        }

    }
}

//array rotate to same array














