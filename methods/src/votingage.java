//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class votingage {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();
        voteageornot(age);
    }
    static void voteageornot(int a){
        if(a>18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("wait for " + (18-a) +" years to vote");
        }

    }

}
