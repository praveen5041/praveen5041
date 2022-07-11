package javalab;

public class ExceptOne {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
        try {
            System.out.println(45/sum);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
         
    }
}
