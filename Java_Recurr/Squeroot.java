public class Squeroot {
    public static void main(String[] args) {
        //squer(40,3);
        Newtonsqr(40);
    }
    static void squer(int n,int p){
        int s=0;
        int e=n;
        //double ans=0.0;
        while(s<e){
            int m=s+(e-s)/2;
            if(n==m*m){
                System.out.println(m);
            }
            if(n<m*m){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
            double root=0.0;
            double ans=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
               root+=ans; 
            }
            root-=ans;
            ans/=10;
        
        }
        System.out.println("%.3f"+root);

    }

    static void Newtonsqr(double n){
        double x=n;
        double res;
        while(true){
            res=0.5*(x+(n/x));
            if(Math.abs(res-x)<1){
                break;
            }
            x=res;
        }
        System.out.println(res);
    }
}
