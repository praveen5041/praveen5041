
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] jag=new int[2][];
        int row=sc.nextInt();
        int col=sc.nextInt();
        jag[0]=new int[row];
        jag[1]=new int[col];
        System.out.println("enter array1");
        for(int i=0;i<row;i++){
            jag[0][i]=sc.nextInt();
        }
        System.out.println("Array two");
        for(int i=0;i<col;i++){
            jag[1][i]=sc.nextInt();
        }
        System.out.println("first Array elements");
        for(int i=0;i<row;i++){
            System.out.print(jag[0][i]+" "); 
        }
        System.out.println();
        System.out.println("Second array elements");
        for(int i=0;i<col;i++){
            System.out.print(jag[1][i]+" ");
        }
    }
}
