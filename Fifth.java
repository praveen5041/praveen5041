package javalab;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of eggs:");
        int eggs=sc.nextInt();
        int numberGross=eggs/144;
        int remain=eggs%144;
        int noDozne=remain/12;
        int remainigEggs=remain%12;
        System.out.println("NuberOfGross:"+numberGross+" NumberofDozen"+noDozne+"Remaining eggs"+remainigEggs);
        System.out.println(numberGross*144+noDozne*12+remainigEggs);


    }
}
