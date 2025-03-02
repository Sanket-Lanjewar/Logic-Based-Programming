 class parent{
    public int a=34;
    String b="sanket";
}
    public class classobject {
    public static void main(String[]args){
        parent obj=new parent();
        
        System.out.println(obj.a);
        System.out.println(obj.b);
        parent obj2=new parent();
        obj2.a=43;
         obj2.b="Akshay";

        
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        

    }
}


