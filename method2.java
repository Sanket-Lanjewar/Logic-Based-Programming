public class method2 {
   
    static void m2() {
        System.out.println("without parameter");
    }

    static int m3(int x, int y) {
        int z = x + y;
        return z;
    }

    static void m4(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }
  
    static void m5(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    static void m6(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    static void m6(int x, int y, int u) {
        int z = x + y+u;
        System.out.println(z);
    }

    public  void m7(int x, int y, int u) {
        int z = x + y+u;
        System.out.println(z);
    }

   

    public static void main(String[]args){
        method2 obj=new method2();

        // m2();
        //   System.out.println( m3(3,4));
            //   m4(5,6);
            // m6(4,5,6);

           
           method2 obj3=new method2();
           obj3. m7(4,5,4);
    }
}











