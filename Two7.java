import java.util.*;
public class Two7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int n=(end+start);
        boolean[] check=new boolean[n+1];
        //check[n]=false;
        if(start==1){
        start+=1;
        }
        if(start==0){
            start+=2;
        }
        for(int i=start;i<=end;i++){
           
            if(check[i]==false){
                for(int j=i*i;j<=end;j+=i){
                    check[j]=true;
                }
            }
        }
        for(int i=start;i<=end;i++){
            if(check[i]==false&&check[i+2]==false)
            System.out.println(i+" "+(i+2));
        }
    }
}
