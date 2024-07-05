import java.util.*;
public class primeornot {
    public static boolean isprime(double num1) {
        double limit = Math.sqrt(num1);
        int flag =0;
        for (int i = 2; i <= limit; i++) {
            if(num1%i==0){
                flag++;
            }
        }
        if(flag>0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        if(isprime(num1)){
            System.out.println("Its is prime number");
        }
        else{
            System.out.println("composite number");
        }
    }
}