public class arrayCountMaximum {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,5,4,3,2,4,5,6,7,7,5,4,3,1,1,1,1,1,1,1};

        int maxCount=0;
        int element=0;

        for(int i=0;i<arr.length;i++){
            int count=0;
             for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
             }

             if(count>element){
                element=arr[i];
                maxCount=count;
             }
        }

        System.out.println("Number which has maximum count is "+element +" total count is ---->"+maxCount);
    }
}












