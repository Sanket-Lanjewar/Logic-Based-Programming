public class numberperamid {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }System.out.println();
        }
    }
}






