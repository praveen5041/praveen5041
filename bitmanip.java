import java.util.*;

import javax.xml.transform.Source;
public class bitmanip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=2<<pos;
        //to get bit
        if((bitmask&n)==0){
            System.out.println("bit is zero");
        }
        else 
            System.out.println("bit is one");
        //to set bit
        System.out.println(bitmask|n);
        //clear bit
        int r=~bitmask;
        System.out.println(r&n);
        //update bit
        //set and reset the bit
        //set the bit
        System.out.println(bitmask|n);
        //reset the bit;
        System.out.println((~bitmask)&n);
        // if((bitmask|n)==1){
        //     System.out.println("bit is one");
        // }
        // else    
        //     System.out.println("bit is zero");

    }
    
}
