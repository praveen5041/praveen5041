package Strings;

public class DIce {
    public static void main(String[] args) {
        dice("", 3);
    }
    static void dice(String emp,int t){
        if(t==0){
            System.out.println(emp);
            return;
        }
        for(int i=1;i<=6&&i<=t;i++){
            dice(emp+i, t-i);
        }
    }
}
