package javalab;
import java.io.*;
    class ThrowExample { 
        void myMethod(String num)throws IOException, ClassNotFoundException{ 
           if(num==null)
              throw new IOException("IOException Occurred");
           else
              throw new ClassNotFoundException("ClassNotFoundException");
        } 
      } 
      
      public class ExceptFour{ 
        public static void main(String args[]){ 
         try{ 
           ThrowExample obj=new ThrowExample(); 
           obj.myMethod("num"); 
         }catch(Exception ex){
           System.out.println(ex);
          } 
        }
      }
