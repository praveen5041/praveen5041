import java.util.*;
public class Leap2One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        boolean leap=false;
        if(year%4==0){
            if(year%100==0){
                 if(year%400==0){
                    leap=true;
                 }
                 else
                    leap=false;
            }
            else
                leap=true;
        }
        else
            leap=false;
        if(leap){
        System.out.println(year +" is leap year");
        }
        else
            System.out.println(year+" isn't leap year");
    }
}
