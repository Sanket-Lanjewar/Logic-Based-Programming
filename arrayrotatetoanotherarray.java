public class arrayrotatetoanotherarray {
    public static void main(String[]args){
        int arr[]={3,4,5,6,6};
        int ans[]=new int[arr.length];
        int k=8;
        k=k%arr.length;
        int j=0;
        
        for(int i=arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
            
        }

        for( int i=0;i<arr.length-k;i++){
            ans[j++]=arr[i];
        }

        for(int element:ans ){
            System.out.print(element+" ");
        }

    }
    
}

//reverse array in another array 




