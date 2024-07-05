
import java.util.*;
public class swaping {
    public static void swap(int num1, int num2){
        System.out.println("num1" + " : " + num1);
        System.out.println("num2" + " + " + num2);
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("Swap Applied");
        System.out.println("num1" + " : " + num1);
        System.out.println("num2" + " + " + num2);
    }

    public static void swap2(int num1, int num2){
        System.out.println("num1" + " : " + num1);
        System.out.println("num2" + " + " + num2);
        num2 = num1+num2;
        num1 = num2 - num1;
        num2  = num2 -num1;
        System.out.println("Swap Applied");
        System.out.println("num1" + " : " + num1);
        System.out.println("num2" + " + " + num2);
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        //swap(num1,num2);
        swap2(num1,num2);

    }
}
