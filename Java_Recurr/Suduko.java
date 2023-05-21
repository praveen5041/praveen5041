public class Suduko {
    public static void main(String[] args) {
        int[][] mat=new int[][]{ {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if(solve(mat)){
            display(mat);
        }
        else{
            System.out.println("cannot");
        }
    }
static boolean solve(int[][] mat){
    int n=mat.length;
    int r=-1;
    int c=-1;
    boolean emp_elem=true;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0){
                r=i;
                c=j;
                emp_elem=false;
                break;
            }
        }
        if(!emp_elem){
            break;
        }
    }
    if(emp_elem){
        return true;
    }
    //backtracking
    for(int num=1;num<=9;num++){
        if(isSafe(mat, r, c, num)){
            mat[r][c]=num;
            if(solve(mat)){
                // display(mat);
                // System.out.println();
                return true;
            }
            else{
                mat[r][c]=0;
            }
        }
    }
    return false;
}
static void display(int[][] mat){
    for(int[] i:mat){
        for(int j:i){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

    static boolean isSafe(int[][] sudo,int r,int c,int num){
        //for row
        for(int i=0;i<sudo.length;i++){
            if(sudo[r][c]==num){
                return false;
            }
        }
        //check the column
        for(int i=0;i<sudo.length;i++){
            for(int[]n:sudo){
                if(n[c]==num){
                    return false;
                }
            }
        }
        //for each invidual box
        int sqrt=(int)Math.sqrt(sudo.length);
        int rows=r-r%sqrt;
        int cols=c-c%sqrt;
        for(int i=rows;i<rows+sqrt;i++){
            for(int j=cols;j<cols+sqrt;j++){
                if(sudo[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
