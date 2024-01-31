import java.util.*;
import java.util.Scanner;
class A{
    int age;

    public A(int val){
        age=val;
        System.out.println("AA");

    }
    public void fun(){
        System.out.println("I am A class");

    }
}
class B extends A{
    int age2;
    public void fun(){
        System.out.println("i am class B");

    }
    public B(int val2,int val3){
        super(val3);
        age2=val2;
        System.out.println("BB");

    }

}
class C extends B{
    int age3;


    public C(int val,int val2,int val3){
        super(val2,val3);
        age3=val3;
        System.out.println("CC from class c");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        C obj1=new C(1,2,3);
        System.out.println(obj1.age3);
        System.out.println(obj1.age2);
        System.out.println(obj1.age);


    }
}

