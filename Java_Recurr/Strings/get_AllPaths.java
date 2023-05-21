package Strings;

import java.util.Arrays;

public class get_AllPaths {
    public static void main(String[] args) {
        boolean mat[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path=new int[mat.length][mat[0].length];
        Print_Allpaths("", 0, 0, mat,path,1);
    }
    static void Count_Allpaths(String s,int r,int c, boolean mat[][]){
        if(r==mat.length-1&&c==mat.length-1){
           System.out.println(s);
           return; 
        }
        if(!mat[r][c]){
            return;
        }
        //considering this block is my path
        mat[r][c]=false;
        if(r<mat.length-1){
            Count_Allpaths(s+'D', r+1, c,mat);
        }
        if(c<mat[0].length-1){
            Count_Allpaths(s+'R', r, c+1,mat);
        }
        if(r>0){
            Count_Allpaths(s+'U', r-1, c,mat);
        }
        if(c>0){
            Count_Allpaths(s+'L', r, c-1, mat);
        }

        //where the function will be over
        //so the function get removed and also remove changes  that were made by that function
        mat[r][c]=true;
    }
    static void Print_Allpaths(String s,int r,int c, boolean mat[][],int[][] path,int step){
        if(r==mat.length-1&&c==mat.length-1){
            path[r][c]=step;
           for(int[] i:path){
            System.out.println(Arrays.toString(i));
           }
           System.out.println(s);
           System.out.println();
           return; 
        }
        if(!mat[r][c]){
            return;
        }
        //considering this block is my path
        mat[r][c]=false;
        path[r][c]=step;
        if(r<mat.length-1){
            Print_Allpaths(s+'D', r+1, c,mat,path,step+1);
        }
        if(c<mat[0].length-1){
            Print_Allpaths(s+'R', r, c+1,mat,path,step+1);
        }
        if(r>0){
            Print_Allpaths(s+'U', r-1, c,mat,path,step+1);
        }
        if(c>0){
            Print_Allpaths(s+'L', r, c-1, mat,path,step+1);
        }

        //where the function will be over
        //so the function get removed and also remove changes  that were made by that function
        path[r][c]=0;
        mat[r][c]=true;
    }
}
