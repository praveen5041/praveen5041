public class NQueen {
    public static void main(String[] args) {
        int n=6;
        boolean mat[][]=new boolean[n][n];
        System.out.println(queens(mat, 0));
    }
    static int queens(boolean[][] mat,int r){
        if(r==mat.length){
            display(mat);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and checking every column and row
        for(int c=0;c<mat.length;c++){
            //place the queen if it is safe
            if(isSafe(mat,r,c)){
                mat[r][c]=true;
                count+=queens(mat, r+1);
                mat[r][c]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][]mat,int r,int c){
        //check vertical row
        for(int i=0;i<r;i++){
            if(mat[i][c]){
                return false;
            }
        }
        //diagonal left
        int dleft=Math.min(r,c);
        for(int i=1;i<=dleft;i++){
            if(mat[r-i][c-i]){
                return false;
            }
        }
        //diagonal right
        int dright=Math.min(r,mat.length-c-1);
        for(int i=1;i<=dright;i++){
            if(mat[r-i][c+i]){
                return false;
            }
        }
        //
        return true;
    }
    static void display(boolean[][] board){
        for(boolean[] arr:board){
            for(boolean i:arr){
                if(i){
                    System.out.print('Q');
                }
                else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
}
