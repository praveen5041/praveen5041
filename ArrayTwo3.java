import java.util.*;
public class ArrayTwo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] student=new int[size];
        int totalMarks=0;
        for(int i=0;i<size;i++){
            student[i]=sc.nextInt();
            totalMarks+=student[i];
        }
        System.out.println("Student Total marks are: "+totalMarks);
        System.out.println("Student percentage:"+(totalMarks/size));
    }
}
