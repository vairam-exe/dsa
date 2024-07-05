//Write a program to print the factorial of a number by defining a method named 'Factorial'.

import java.util.*;
public class fact {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        System.out.println(factorial(a));
    }
    static int factorial(int a){
        int fact=1;
        for(int i =1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
}
