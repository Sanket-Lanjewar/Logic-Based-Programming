public class oddevensubstactadd {
    public static void main(String[]args){
        int ans=0;
        for(int i=0;i<=5;i++){
            if(i%2==0){
                ans-=i;
            }else{
                ans+=i;
            }
        }System.out.println(ans);
    }
    
}





