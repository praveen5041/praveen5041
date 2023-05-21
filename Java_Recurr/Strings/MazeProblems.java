package Strings;

import java.util.ArrayList;

public class MazeProblems {
    public static void main(String[] args) {
       // System.out.println(Count(3, 3));
       // Patt(" ", 3, 3);
       //System.out.println(Pattret("", 3, 3));
       boolean mat[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
       };
       //System.out.print(MazObst("", 0, 0, mat));
       MazObst("", 0, 0, mat);
      // System.out.println(PattretDia(" ", 3, 3));
    }
    static int Count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        return Count(r-1, c)+Count(r, c-1);
    }

    //printing the path
    static void Patt(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Patt(p+'D', r-1, c);
        }
        if(c>1){
            Patt(p+'R', r, c-1);
        }
    }

    //returning the ArrayList
    static ArrayList<String>Pattret(String s,int r,int c){
        if(r==1&&c==1){
            ArrayList<String>str=new ArrayList<>();
            str.add(s);
            return str;
        }
        ArrayList<String>str=new ArrayList<>();
        if(r>1){
            str.addAll(Pattret(s+'D', r-1, c));
        }
        if(c>1){
            str.addAll(Pattret(s+'R', r, c-1));
        }
        return str;
    }

    //including the diagonal patj also
    static ArrayList<String>PattretDia(String s,int r,int c){
        if(r==1&&c==1){
            ArrayList<String>str=new ArrayList<>();
            str.add(s);
            return str;
        }
        ArrayList<String>str=new ArrayList<>();
        if(r>1&&c>1){
            str.addAll(PattretDia(s+'D', r-1, c-1));
        }
        if(r>1){
            str.addAll(PattretDia(s+'V', r-1, c));
        }
        if(c>1){
            str.addAll(PattretDia(s+'H', r, c-1));
        }
        return str;
    }


    //Maze with obstacles
    static void MazObst(String p,int r,int c,boolean mat[][]){
        if(r==mat.length-1&&c==mat[0].length-1){
            System.out.println(p);
            return;
        }
        if(!mat[r][c]){
            return;
        }
        if(r<mat.length-1){
            MazObst(p+'D', r+1, c,mat);
        }
        if(c<mat.length-1){
            MazObst(p+'R', r, c+1,mat);
        }
    }
}
