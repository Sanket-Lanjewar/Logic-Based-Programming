public class array_number_count {
    public static void main(String[] args) {
        int[] arr={2,4,3,4,4,5,4,4}; 
         int count=0;
         int x=4;
        for (int i=1;i<arr.length;i++){
            if(x==arr[i]){
                count++;

            }
           
        }
        System.out.println(count);
    }
}







