package javalab;

import java.io.IOException;

class IOE{
     void method(int n) throws IOException,ClassNotFoundException{
        if(n==1){
            throw new IOException("ioe exception occured");
        }
        else{
            throw new ClassNotFoundException("class not found exception");
        }
     } 
}
public class ExceptThree {
    public static void main(String[] args) {
      try {
        IOE obj=new IOE();
        obj.method(6);
      } catch (Exception e) {
        System.out.println(e);
        //TODO: handle exception
      }  
    }
}
