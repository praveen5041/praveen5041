public class Pyramid {
    public static void main(String[] args) {
        int n=5;
        pattern(n,n*2);
    }
    public static void pattern(int n,int n2){
        if(n==0||n2==0){
            return;
        }
        printstar(n-1);
        System.out.println();
        printAlpha(n2-1);
        pattern(n-1, n2-1);
    }
    static void printstar(int n){
        if(n==0){
            return ;
        }
        System.out.print("* ");
        System.out.println();
        printstar(n-1);
    }
    public static void printAlpha(int n){
        if(n==0){
            return;
        }
        System.out.print("A");
        System.out.println();
        printAlpha(n-1);
    }
    // public static void pattern(int n,int n1){
    //     if(n==0){
    //         return ;
    //     }
    //    printspace(n-1);
    //     printstar(n1-n+1);
    //     System.out.println("");
    //     pattern(n-1, n1);
    // }
    // static void printspace(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.print(" ");
    //     printspace(n-1);
    // }
    // static void printstar(int n){
    //     if(n==0){
    //         return ;
    //     }
    //     System.out.print("*");
    //     printstar(n-1);
    // }
}
