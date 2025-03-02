public class array_sortevenoddnumber {
    public static void main(String args[]){
        int []arr={3,4,2,1,4,3,21,4,6};
        int arr2[]=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               System.out.print(arr[i]+" ");
            }
        }
        
    }
    
}













