//return all 3 digit armstrong number
import java.util.*;
public class arm {
    public static void main(String[] args){
    armstrong();
    Scanner read = new Scanner(System.in);
    int a = read.nextInt();
    armstrong(a);
}
static void armstrong(){
        for(int i =100;i<=999;i++){
            int org = i;
            int a =i;
            int digit =0;
            int check =0;
            while(a>0) {
                digit = a % 10;
                check = check + digit * digit * digit;
                a /= 10;
            }
            if(org==check){
                System.out.print(org + " ");
        }

        }
}
static void armstrong(int a){
        int org = a;
        int digit = 0;
        int check =0;
        while(a>0){
            digit = a%10;
            check = check+digit*digit*digit;
            a/=10;
        }
        if(org==check){
            System.out.println("Armstrong number/;)");
        }
        else{
            System.out.println("Not Armstrong Number/;(");
        }
    }
}
