import javax.swing.text.rtf.RTFEditorKit;

public class sum_digits {
    public static void main(String[] args) {
       // System.out.println(sum(1234));
        concept(4);
    }
    static int sum(int n){
        // if(n==0){
        //     return 0;
        // }
        // return n%10+sum(n/10);

        //for product
        if(n%10==n){
            return n;
        }
        return n%10*sum(n/10);
    }
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       // concept(n--);
       concept(--n);
    }
}
