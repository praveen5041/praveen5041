import java.util.*;
public class Two4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] bubble=new int[size];
        for(int i=0;i<size;i++){
            bubble[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(bubble[j]>bubble[j+1]){
                    int t=bubble[j];
                    bubble[j]=bubble[j+1];
                    bubble[j+1]=t;
                }
                
            }
            //System.out.println(bubble[j]+" ");
        }
        for(int i=0;i<size;i++){
            System.out.print(bubble[i]+" ");
        }
    }
}
