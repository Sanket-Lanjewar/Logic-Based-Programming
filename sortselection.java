public class sortselection {
    public static void main(String args[]){
     int arr[]={3,3,4,5,6,4,3,3,3, 3,3,3,3};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min=j;
                }
            }
            
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
    }
}


}





