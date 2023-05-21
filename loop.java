import java.util.*;
public class loop {
    public static void main(String[] arg){
       Scanner sc =new Scanner(System.in);
       int  s=sc.nextInt();
    //    System.out.println("enter the number");
       for(int i=1;i<=s;i++){
           for(int j=1;j<=i;j++){
                
                   System.out.print("*");
                
           }
           int sp=2*(s-i);
           for(int j=0;j<sp;j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
         
       }
       //lower pattern
       for(int i=s;i>0;i--){
        for(int j=1;j<=i;j++){
             
                System.out.print("*");
             
        }
        int sp=2*(s-i);
        for(int j=0;j<sp;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      
    } 
    }
    
}
