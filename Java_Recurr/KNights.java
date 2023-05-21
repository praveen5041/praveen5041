public class KNights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] mat=new boolean[n][n];
        NKinghts(mat, 0, 0, n);
    }
    static void NKinghts(boolean[][] mat,int r,int c,int k){
        if(k==0){
            display(mat);
            System.out.println();
            return;
        }
        if(r==mat.length-1&&c==mat.length){
            return;
        }
        if(c==mat.length){
            NKinghts(mat, r+1, 0, k);
            return;
        }
        if(isSafe(mat, r, c)){
                mat[r][c]=true;
                NKinghts(mat, r, c+1, k-1);
                mat[r][c]=false;
        }
        NKinghts(mat, r, c+1, k);
    }
    static boolean isSafe(boolean[][] mat, int r,int c){
        if(isValid(mat, r-1, c+2)){
            if(mat[r-1][c+2]){
                return false;
            }
        }
        if(isValid(mat, r-2, c+1)){
            if(mat[r-2][c+1]){
                return false;
            }
        }
        if(isValid(mat, r-1, c-2)){
            if(mat[r-1][c-2]){
                return false;
            }
        }
        if(isValid(mat, r-2, c-1)){
            if(mat[r-2][c-1]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] mat,int r,int c){
        if(r>=0&&r<mat.length&&c>=0&&c<mat.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] arr:board){
            for(boolean i:arr){
                if(i){
                    System.out.print('K');
                }
                else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
}
