import java.util.*;

public class Tests {
     public  void solution(int[] a,int vidx,int n,int k,int[] subset,int ssf,ArrayList<ArrayList<Integer>>ans){

        if(vidx==a.length){
            if(ssf==k){
                boolean f=true;
                for(int i=0;i<subset.length-1;i++){
                    if(subset[1]!=subset[i+1]){
                        f=false;
                        break;
                    }
                }
                if(f){
                    for(ArrayList<Integer>part:ans){
                        System.out.println(part);
                    }
                    System.out.println();
                }
            }
            return;
        }

        for(int i=0;i<ans.size();i++){
            if(ans.get(i).size()>0){
                ans.get(i).add(a[vidx]);
                subset[i]+=a[vidx];
                solution(a, vidx, n, k, subset, ssf, ans);
                subset[i]-=a[vidx];
                ans.get(i).remove(ans.get(i).size()-1);
                
            }
            else{
                ans.get(i).add(a[vidx]);
                subset[i]+=a[vidx];
                solution(a, vidx, n, k, subset, ssf+1, ans);
                subset[i]-=a[vidx];
                ans.get(i).remove(ans.get(i).size()-1);
                break;
            }
        }
     }
       static Tests t=new Tests();  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        int n=sc.nextInt();
         int[] a=new int[n];
         int s=0;
       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s+=a[i];
        }
        int k=sc.nextInt();
        if(k==1){
            System.out.print("Partion is");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            return;
        }
        if(k>n||s%k!=0){
            System.out.println("not possible");
        }
        int[] subSet_sum=new int[k];
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(new ArrayList<>());
        }
        Tests o=new Tests();
        o.solution(a,0,n,k,subSet_sum,0,ans);
        
    }
}

