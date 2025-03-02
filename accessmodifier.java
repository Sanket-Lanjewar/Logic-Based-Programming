public class accessmodifier {
    public String srt="public member";
   public void metho(){
        System.out.println("within a class"+ " "+srt);
    }
    public static void main (String[]args){
        accessmodifier obj=new accessmodifier();
         obj. metho();
         child obj3=new child();
         obj3.m();
    }
}

class child {
     void m(){
        accessmodifier obj2=new  accessmodifier ();
        System.out.print (obj2.srt);
    }  
}

 




