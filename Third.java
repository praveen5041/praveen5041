package javalab;
import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How many quaters user want:");
        int quaters=sc.nextInt();
        System.out.println("How many dimes:");
        int dimes=sc.nextInt();
        System.out.println("How many nickles:");
        int nickles=sc.nextInt();
        System.out.println("How many pennies");
        int pennies=sc.nextInt();
        System.out.println("The total cost expressed in dollars:");
        double total=(0.25*quaters)+(dimes*0.10)+(nickles*0.05)+(pennies*0.01);
        System.out.println(total);
    }
}
