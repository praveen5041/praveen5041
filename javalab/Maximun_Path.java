import java.util.Scanner;

public class Maximun_Path {
    int Count(int[][]ma,int x,int y,int z){
        if(x<0||y<0||x>=ma.length||y>=ma[0].length||ma[x][y]==-1){
            return 0;
        }
        if(ma[x][y]==2)
        return z==-1?1:0;
        ma[x][y]=-1;
        
        z--;
        int t_paths=Count(ma, x-1, y, z)+Count(ma, x+1, y, z)+Count(ma, x, y-1, z)+Count(ma, x, y+1, z);
        //int t_paths=Count(ma, x+1, y, z)+Count(ma, x, y+1, z);
        ma[x][y]=0;
        z++;
        return t_paths;
    }
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] ma=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ma[i][j]=sc.nextInt();
            }
        }
        int x=0,y=0,z=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(ma[i][j]==0)
                z++;
                if(ma[i][j]==1){
                    x=i;y=j;
                }
            }
        }
        //return Count(ma,x,y,z);
        Maximun_Path t=new Maximun_Path();
       System.out.println( t.Count(ma, x, y, z));
    }
}
