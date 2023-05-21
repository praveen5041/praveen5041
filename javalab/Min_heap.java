import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Min_heap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int tasks[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                tasks[i][j]=sc.nextInt();
            }
        }
        Min_heap o=new Min_heap();
        o.getOrder(tasks);
        // PriorityQueue<Integer>p=new PriorityQueue<>();
        // p.add(12);
        // p.add(0);
        // p.add(29);
        // System.out.println(p);
        // while(!p.isEmpty()){
        //     System.out.println(p.poll());
        // }
    }
    public int[] getOrder(int[][] tasks){
        int n=tasks.length;
        Task[] arr=new Task[n];
        for(int i=0;i<n;i++){
            arr[i]=new Task(i, tasks[i][0], tasks[i][1]);
        }
        Arrays.sort(arr,(a,b)->{
            return Integer.compare(a.eq_time, b.eq_time);
        });
        PriorityQueue<Task>p=new PriorityQueue<>((a,b)->{
            if(a.p_time==b.p_time){
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.p_time, b.p_time);
        });
        

    }
    class Task{
        int idx;
        int eq_time;
        int p_time;
        Task(int idx,int eq_time, int p_time ){
            this.idx=idx;
            this.eq_time=eq_time;
            this.p_time=p_time;
        }
    }
}