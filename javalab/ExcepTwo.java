package javalab;

public class ExcepTwo {
    public static void main(String[] args) {
        try {
           // int[] a=new int[3];
           // a[4]=6;
         //  a[2]=10/0;
         String s="hi";
         System.out.println(s.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch exception");
        }
        catch(ArithmeticException e){
            System.out.println("exception caught");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finall block excuted allways");
        }
    }
}
