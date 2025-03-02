public class array_sortedornotcheck {
    public static void main(String[] args) {
        int[]arr={2,3,4,5};
        //int x=2;
        boolean s=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                s=false;
               break;
            }
        }
        if(s){
            System.out.println("array is sorted");
       }
       else{
        System.out.println("is not  sorted");
       }
               
    }
}








