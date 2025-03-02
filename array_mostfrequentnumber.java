public class array_mostfrequentnumber {
    public static void main(String[]args){
        int n[]={2,2,2,4,4,4,4,4,4,4,4,4,2,1,1,1};
         int max=0;

         int element=0;
         int var=0;
         for(int i=0;i<n.length;i++){
            int count=0;

            for(int j=0; j<n.length; j++){
                if(n[i]==n[j]){
                    count++;
                }
            }
                 if(element<count){
                    element=count;
                    var=n[i];
                 }

            }
        System.out.println("the element is" +" " +var+" "+"maximum time "  +element);
    }
}
















