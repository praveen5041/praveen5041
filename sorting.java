import java.util.*;
public class sorting {
    public static void printarray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort technic
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //         //System.out.print(arr[j]+" ");
                
        //     }
        //selection sort
            // for(int i=0;i<arr.length-1;i++){
            //     int small=i;
            //     for(int j=i+1;j<arr.length;j++){
            //         if(arr[small]>arr[j]){
            //             small=j;
            //         }
            //     }
            //     int temp=arr[small];
            //     arr[small]=arr[i];
            //     arr[i]=temp;

            //insertion sort
            for(int i=1;i<arr.length;i++){
                int current=arr[i];
                int j=i-1;
                while(j>=0&& current<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=current;
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            printarray(arr);
    }
}
