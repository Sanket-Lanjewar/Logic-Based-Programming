
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class absolute {
   

   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Eneter a number:");
      int a= var1.nextInt();
     
      if (a > 0) {
          a= a*( -1);
      }

      System.out.println("Absolute value is:" + a);
   }
}







