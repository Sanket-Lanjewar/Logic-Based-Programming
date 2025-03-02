class main {
    int a = 23;

    public static void r() {
        System.out.println("sanket");
    }
}

class main3 extends main {
    {
        System.out.println("akshay");

    }

    public class main2 {
        public static void main(String[] args) {
            main obj = new main();
            obj.r();

            System.out.println(obj.a);
        }
    }
}



