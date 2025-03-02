public class array_greater_number_thanvariable {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,7,9};
        int x=7;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
        if(arr[i]>x){
            count++;
        }
       }
        System.out.println(count);

    }
}





