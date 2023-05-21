import java.util.Scanner;

public class Sieves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        int a=sc.nextInt();
        int b=sc.nextInt();
       // boolean[] arr=new boolean[b+1-a];
       int ans=find(a,b);
       System.out.println(ans);
    t--;    
        }
    }
    static int isPrime(int a,int b, boolean[] arr){
        for(int i=a;i*i<=b;i++){
            if(!arr[i]){
                for(int j=i*2;j<=b;j+=i){
                    arr[j]=true;
                }
            }
        }
        int c=0;
        for(int i=a;i<=b;i++){
            if(!arr[i]){
                c++;
                //System.out.print(arr[i]+" "+i+" ");
            }
        }
        return c;
    }
    static int find(int a,int b){
        int c=0,f;
        for(int i=a;i<=b;i++){
                if(i==1||i==0){
                    continue;
                }
                 f=1;
                for(int j=2;j<=i/2;++j){
                        if(i%j==0){
                            f=0;
                            break;
                        }
                }
                if(f==1){
                    c++;
                }
        
    }
    return c;
}
static int solve(int a,int b,boolean[] arr){
    int c=0;
    for(int i=a;i<=b;i++){
        if(i==1||i==0){
            continue;
        }
        if(!arr[i]){
            for(int j=2;j<=i/2;j++){
                
            }
        }
    }
}
}
