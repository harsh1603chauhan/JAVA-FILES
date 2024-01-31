import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class elseIf {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        /*int st=s1.nextInt();
        if(st>=60){
            System.out.println("You are retireD");
        }else if(st>=56){
            System.out.println("You are close to retirement");
        }
        else if(st>=46){
            System.out.println("You have time now");

        }
        else if(st>=36){
            System.out.println("You have much time");

        }
        else{
            System.out.println("You are young champ work hard");

        }
        switch(st){
            case 18:
                System.out.println("You are now adult");
                break;

            case 23:
                System.out.println("You are going to get job");
                break;
            case 35:
                System.out.println("You are now working adult");
                break;
            case 60:
                System.out.println("You are retired");
                break;
            default:
                System.out.println("Enjoy your life");
             }
        System.out.println("marks of 1st sub");
        int a=s1.nextInt();
        System.out.println("marks of 2nd sub");
        int b=s1.nextInt();
        System.out.println("marks of 3rd sub");
        int c=s1.nextInt();
        float per=(a+b+c)/3;
        System.out.println(per);
        if(per>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("You are pass");
        }else{
            System.out.println("You failed");
        }
        System.out.println("Enter your Income");
        float income=s1.nextFloat();
        if(income>=250000 && income<500000){
            System.out.println("Your tax is 5%");
        }else if(income>=500000 && income<1000000){
            System.out.println("Your tax is 20%");
        }else if(income>=1000000){
            System.out.println("Your tax is 30%");
        }else{
            System.out.println("No tax");
        }
        float tax = 0;
        System.out.println("Enter the Income in lakhs per annum");
        float income = s1.nextFloat();
        if (income < 2.5f) {
            income = tax + 0;
        } else if (income > 2.5f && income < 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income >= 5f && income < 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }else if(income>=10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f*(income-10.0f);
        }
        System.out.println("total tax paid by you is: "+tax);
        System.out.println("Enter the number of day: ");
        int day=s1.nextInt();
        if(day==1){
            System.out.println("Today is Monday");
        }else if(day==2){
            System.out.println("Today is Tuesday");
        }else if(day==3){
            System.out.println("Today is Wednesday");
        }else if(day==4){
            System.out.println("Today is Thursday");
        }else if(day==5) {
            System.out.println("Today is Friday ");
        }else if(day==6){
            System.out.println("Today is Saturday");
        }else if(day==7){
            System.out.println("Today is Sunday");
        }else{
            System.out.println("Enter the number lesser than 7");
        }
        System.out.println("Enter the year: ");
        int year=s1.nextInt();
        if(year%4==0 && year%400==0 || year%100!=0){
            System.out.println("It is a leap Year");
        }else{
            System.out.println("It is a regular year not a leap year");
        }*/
        System.out.println("Enter the website: ");
        String web=s1.next();
                if(web.endsWith(".org")){
                    System.out.println("This is organizational website");
                }else if(web.endsWith(".in")){
                    System.out.println("This is Indian website");
                }else if(web.endsWith(".com")){
                    System.out.println("This is commercial website");
                }
        }


    }
