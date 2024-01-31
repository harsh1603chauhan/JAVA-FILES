import java.io.*;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
       /* int i=1;
        while(i<=3){
            System.out.println(i);
            i++;
        }
        //code executed first then condition checked in do while
        int a=2;
        do{
            System.out.println(a);
            a++;
        }while(a<2);
        int n=s1.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println(i);

            }
        }

        int n=s1.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
        for(int i=0;i<10;i++){
            System.out.println("Harsh is great");
            if(i==5){
                System.out.println("Harsh wants to eat");
                break;
            }

        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println("\n");
        }
        for(int i=0;i<5;i++) {
            for (int j = 5-i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println("Enter n number of even no.s");
        int n=s1.nextInt();
        int sum=0;

            for(int i=0;i<n;i++){
                sum+=(2*i);
            }
            System.out.println("sum of even numbers:"+sum);*/

            Scanner console = new Scanner(System.in);
            System.out.println("Enter Start Number");
            int start = console.nextInt();
            System.out.println("Enter End Number");
            int end = console.nextInt();
            System.out.println("The even numbers between " + start + " and " + end + " are the following:");

            int t = start % 2 == 1 ? start + 1: start;
            int sum = ((t + end) / 2) * ((end - t + 2) / 2);

            while(t <= end) {
                System.out.println(t);
                t += 2;
            }

            System.out.println("The sum of even numbers between : " + start + " - " + end + " is : " + sum);
        }

}



