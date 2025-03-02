public class stringinbuildmethod {
    public static void main(String[] args) {
        StringBuffer sd=new StringBuffer("Shubha");
        System.out.println(sd.hashCode());
        sd.append("shinde");
        System.out.println(sd);
        System.out.println(sd.hashCode());


        String s=new String("durga");
        String s1="durga";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        String s2="sanket";
        String s3="sanket";
        String s4="sanket";
        String s5="sanket";
        String a="sanket";
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(a.hashCode());
        System.out.println(s2.hashCode()+" "+s3.hashCode());
        System.out.println(s2 == s3);
        System.out.println(a==s5);
        System.out.println(s2.equals(s3));

    }
    
}
