public class stringg_countt {
    public static void main(String[] args) {
        String str="aaaaabbbabccddd";
        int count=0;
        String ans=""+str. charAt(0);

        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);
            if(curr==pre){
                count++;
            }

            else{
                if(count>1)
                ans=ans+count;
                ans=ans+curr;
                count=1; 
            } 

        }
        if(count>1)
        ans+=count;
        System.out.println(ans);
       
     

    }

    }







