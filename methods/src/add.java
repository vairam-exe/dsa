import java.util.*;
public class add {
    public static int addition(int num1,int num2){
        return num1+num2;

    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        System.out.print(addition(num1,num2));
    }
}
