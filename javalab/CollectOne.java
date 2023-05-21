package javalab;

import java.util.ArrayList;

public class CollectOne {
    private ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> storeEvenNUmbers(int n){
        for(int i=2;i<=n;i++){
            if(i%2==0){
                list.add(i);
            }
        }
        return list;
    }
    public ArrayList<Integer> printEvenNUmbers(){
        ArrayList<Integer> newlist=new ArrayList<>();
        for(int i:list){
            newlist.add(i*2);
            System.out.println(i*2);
        }
        return newlist;
    }
    public void retrieveNumber(int n){
        this.list=new ArrayList<Integer>();
        boolean check=false;
        for(int i:list){
            if(i==n){
                 check=true;
                 //break;
                }
             else{
                check=false;
             }
        }
            if(check){
                System.out.println(n);
            }
            else{
                System.out.println(0);
            }
            
        }
    public static void main(String[] args) {
        CollectOne obj=new CollectOne();
        obj.storeEvenNUmbers(10);
        obj.printEvenNUmbers();
        obj.retrieveNumber(10);
    }
}
