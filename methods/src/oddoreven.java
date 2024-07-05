//Define a program to find out whether a given number is even or odd.
import java.util.*;
public class oddoreven {
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        oddoreveprog(a);
    }

     static void oddoreveprog(int a) {
        if(a%2 ==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
