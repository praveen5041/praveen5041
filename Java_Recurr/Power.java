import javax.swing.text.html.MinimalHTMLWriter;

public class Power {
    public static void main(String[] args) {
        int base=2;
        int power=4;
        int c=0;
       
        
        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans*=base;
            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
         //find number of set bits
         int a=6;
         while(a>0){
            if((a&1)==1){
                c++;
            }
            a=a>>1;
        }
        System.out.println(c);
    }
}
