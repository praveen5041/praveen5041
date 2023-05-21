import java.io.*;
import java.util.Scanner;
public class Readfile{
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the created file");
        String str1=sc.nextLine();
        System.out.println("Create a new file:");
        String str=sc.nextLine();
        
        //to read the file
    //     FileInputStream fis=new FileInputStream(str);
    //     int res;
    //     while((res=fis.read())!=-1){
    //     System.out.print((char)res);
    //    }
    //     fis.close();

    //to write the file
    FileInputStream fis=new FileInputStream(str1);
    FileOutputStream fos=new FileOutputStream(str);
    int data;
    while((data=fis.read())!=-1){
        fos.write((char)data);
    }
    fos.close();
    fis.close();
    }
}