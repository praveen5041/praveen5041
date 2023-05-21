import java.util.*;;
public class recurrsion {
    // public static void stringReverse(String str,int idx){
    //     if(idx==0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     stringReverse(str, idx-1);
    // }
    //occrance of character
    // static int  first=-1;
    // static int last=-1;
    // public static void charOccrance(String str, int idx, char ele){
    //     if(idx==str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currentChar=str.charAt(idx);
    //     if(currentChar==ele){
    //         if(first==-1){
    //             first=idx;
    //         }
    //         else{
    //             last=idx;
    //         }
    //     }
    //     charOccrance(str, idx+1, ele);
    // }

    //check is array is sorted are not
    // public static boolean isSorted(int a[],int idx){
    //     if(idx==a.length-1){
    //         return true;
    //     }
    //     if(a[idx]<a[idx+1]){
    //        return isSorted(a, idx+1);
    //     }
    //     else{
    //         return false;
    //     }
    //    // return false;
    // }

    public static void move(String str, int idx,String s, int c){
        if(idx==str.length()){
            for(int i=0;i<c;i++){
                s+='x';
            }
            System.out.println(str);
            return;
        }
            char cuchar=str.charAt(idx);
            if(cuchar=='x'){
                c++;
                move(str, idx+1, s, c);
            }
            else{
                s+=cuchar;
                move(str, idx+1, s, c);
            }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
      // stringReverse(str, str.length()-1); 
     // charOccrance(str, 0, 'a');
    //  int n=sc.nextInt();
    //  int a[]=new int[n];
    //  for(int i=0;i<n;i++){
    //      a[i]=sc.nextInt();
    //  }
    //  System.out.println (isSorted(a, 0));
    move(str,0," ",0);
     }
   
    
}
