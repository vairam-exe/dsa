//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;
public class minmax {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        System.out.println("minimum is" +" " + min(a,b,c));
        System.out.println("maximum is" + " "+ max(a,b,c));
    }

    static int min(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }

    static int max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }

    }
}
