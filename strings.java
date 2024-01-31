import java.io.*;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="harsh ";
        /*int a=23;
        float b=2.64886f;
        System.out.printf("The value of a is %d and the value of b is %9.3f",a,b);
        System.out.format("The value of a is %d and the value of b is %f",a,b);
        String st=s.next();
        System.out.println(st);
        s.length()  s.toUpperCase()  s.toLowerCase()  s.substring()
        s.startsWith()  s.endsWith()  s.trim()  s.lastIndexOf() s.indexOf()
        s.equals()  s.equalsIgnoreCase()

        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(1,4));
        System.out.println(s1.trim());
        System.out.println(s1.replace("H","YTr"));
        System.out.println(s1.startsWith("Har"));
        System.out.println(s1.endsWith("yrs"));
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.indexOf("h",3));
        System.out.println(s1.lastIndexOf("h"));
        System.out.println(s1.lastIndexOf("sh",4));
        System.out.println(s1.equals("Harsh "));
        System.out.println(s1.equalsIgnoreCase("Harsh "));

        //Escape sequence Characters
        System.out.println("I am Harsh \"you should know me"); */
        String s2="Alex Curry   Sebastian";
        System.out.println(s2.replace(" ","_"));
        String letter="Dear <|name|>,Thanks a lot!";
        letter=letter.replace("<|name|>","Harsh");
        System.out.println(letter);
        String s3="This is Alan White   speaking to you  ";
        System.out.println(s3.indexOf("  ",21));
        System.out.println(s3.indexOf("   "));
        System.out.println(s3.indexOf("    "));
        System.out.println("\"Dear Harsh, This java course is nice\"");










    }


}
