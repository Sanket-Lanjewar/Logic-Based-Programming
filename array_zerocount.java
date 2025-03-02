public class array_zerocount {
    public static void main(String[]args){
        int a[]={1,1,1,1,1,1,0,0,0,0,0,0,0,0,0};
        int count0=0;


        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count0++;
            }

        }
        int count1=a.length-count0;


        for(int j=0;j<count0;j++){
            System.out.print(0+" ");

        }
        for(int j=count0;j<a.length;j++){
            System.out.print(1+" ");
        }
         
    }
}


//itself made





