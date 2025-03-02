import java.util.*;
import java.io.*;
public class HashOut {
public static void main(String[] args) {
    Scanner shub=new Scanner(System.in);

    System.out.println("Enter a String with inbuilt #");
    String str=shub.nextLine();


    int count=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='#'){
            count++;
        }
    }

    while(count!=0){
        System.out.print("#");
        count--;
    }

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='#'){
            continue;
        }else{
            System.out.print(str.charAt(i));
        }
    }

}    
}









