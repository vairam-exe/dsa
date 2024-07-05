//Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.*;
public class pal {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        System.out.println(ispalindrome(a));
    }
    static boolean ispalindrome(int a){
        int org = a;
        int digit = 0;
        int check = 0;
        while (a>0){
            digit = a%10;
            check = check*10 + digit;
            a=a/10;

        }
        if(org==check){
            return true;
        }
        else{
            return false;
        }
    }
}
