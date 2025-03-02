public class targetsum3digit {
    public static void main(String[]args){
        int [] arr={5,5,5,5,6,6,6,7,3,2,5,6,7,23,4,3,5};
        int t=15;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=1;j<=arr.length-1;j++){
                for(int k=2;k<=arr.length-1;k++){
                    if(arr[i]+arr[j]+arr[k]==t){
                        System.out.println(arr[i]+" "+arr[j]+" " +arr[k]);
                        return;
                    }
                }
            }
        }System.out.println("pair not found");
    }
    
}








