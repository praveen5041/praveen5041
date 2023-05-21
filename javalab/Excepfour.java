package javalab;

import java.io.IOException;

class pointerexcept{
    void method(String s)throws NullPointerException,ClassNotFoundException{
        if(s==null){
            throw new NullPointerException("NUll pointer exception caught");
        }
        else{
            throw new ClassNotFoundException("Calss not found exception occurs");
        }
    }
}
public class Excepfour {
    public static void main(String[] args) {
        try {
            pointerexcept obj=new pointerexcept();
            String s=null;
            obj.method(s);
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }
    }
}
