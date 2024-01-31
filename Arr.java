//public class Arr {
//    public String name;
//    public int dob;
//    public String city;
//    public Arr(String name,int dob,String city){
//        this.name=name;
//        this.dob=dob;
//        this.city=city;
//    }
//    public String display(){
//        return ("Name"+this.name+", Dob="+this.dob+",city name="+this.city);
//    }
//
//    public static void main(String[] args) {
//        Arr[] arr= new Arr[5];
//        Arr h1=new Arr("Harsh",2004,"Bareilly");
//        Arr h2=new Arr("Aryan",2004,"Agra");
//        Arr h3= new Arr("Madhav",2004,"Saharanpur");
//        Arr h4=new Arr("Aryan Upadhayay",2004,"Agra");
//        Arr h5=new Arr("Sahil",2003,"Shambhajinagar");
//        System.out.println("Name="+h1.name+", Dob="+h1.dob+",city name="+h1.city);
//        System.out.println("Name="+h2.name+", Dob="+h2.dob+",city name="+h2.city);
//        System.out.println("Name="+h3.name+", Dob="+h3.dob+",city name="+h3.city);
//        System.out.println("Name="+h4.name+", Dob="+h4.dob+",city name="+h4.city);
//        System.out.println("Name="+h5.name+", Dob="+h5.dob+",city name="+h5.city);
//
//    }
//
//}

//import java.util.Arrays;
//
//// Main class
//class array {
//
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Get the Array
//        int intArr[] = { 23, 20, 32, 22, 12 };
//        Arrays.sort(intArr);
//        int Key=22;
//        System.out.println("sorted list: "+intArr);
//
//        // To convert the elements as List
//        System.out.println(Key+"Found at index: "
//                + Arrays.binarySearch(intArr,Key));
//    }
//}
//public class Arr{
//    private String name;
//    public Arr(){
//        name="Harsh";
//        System.out.println("Constructor called");
//        //System.out.println("Name is "+name);
//    };
////    private Arr(String n){
////        name=n;
////    }
//
//    public static void main(String[] args) {
//        Arr g1=new Arr();
//
//        System.out.println("Name is "+g1.name);
//
//    }
//}
//Calling one Constructor from Another
//
//Calling Constructor of SuperClass from Constrictor of SubClass
// class lang{
//    lang(int v1,int v2){
//        if(v1>v2){
//            System.out.println("The latest version is: "+v1);
//        }else{
//            System.out.println("The latest version is:"+v2);
//        }
//        }
//        }
// class gain extends lang{
//    gain(){
//        super(11,9);
//    }
//
//     public static void main(String[] args) {
//         gain obj=new gain();
//     }
// }
//class Test {
//
//    // create private constructor
//    private Test () {
//        System.out.println("This is a private constructor.");
//    }
//
//    // create a public static method
//    public static void instanceMethod() {
//
//        // create an instance of Test class
//        Test obj = new Test();
//    }
//
//}
//
//class gain {
//
//    public static void main(String[] args) {
//
//        // call the instanceMethod()
//      Test.instanceMethod();
//    }
//}

//class Language {
//
//    // create a public static variable of class type
//    private static Language language;
//
//    // private constructor
//    private Language() {
//        System.out.println("Inside Private Constructor");
//    }
//
//    // public static method
//    public static Language getInstance() {
//
//        // create object if it's not already created
//        if(language == null) {
//            language = new Language();
//        }
//
//        // returns the singleton object
//        return language;
//    }
//
//    public void display() {
//        System.out.println("Singleton Pattern is achieved");
//    }
//}
//class gain {
//    public static void main(String[] args) {
//        Language db1;
//
//        // call the getInstance method
//        db1= Language.getInstance();
//
//        db1.display();
//    }
//}
//import java.io.*;
//class Arr{
//    private static int x;
//    public int y;
//    private static void set1(int val){
//        x=val;
//    }
//    static void print1(int x1){
//        set1(x1);
//        System.out.println("Value of x : "+x);
//    }
//    void printdetail(){
//        System.out.println("Value of x : "+x);
//        System.out.println("value of y : "+y);
//    }
//
//    public static void main(String[] args) {
//
//
//
//    }
//}
import java.io.*;
class Arr{
    static void fun(int x){
        System.out.println("x : "+x);
    }
    static void fun(double x,double y){
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }

    public static void main(String[] args) {
        fun(2);
        fun(3,4);
    }
}