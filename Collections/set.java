import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class set {
    public boolean Ma(int n[]){
        Set<Integer> s=new HashSet<>();
        for(Integer i:n){
            if(!s.add(i)){
                return true;
            }

        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        set s=new set();
        System.out.println(s.Ma(a));
        

    }
}
