import java.util.Arrays;

public class M_arrows {
    public static void main(String[] args) {
        int[][] arr={{10,16},{2,8},{1,6},{7,12}};
        //Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
       Arrays.sort(arr);
       int c=1;
       int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>end){
                c++;
                end=arr[i][1];
            }
            System.out.println(arr[i]);
        }
       // System.out.println(c);
    }
}
