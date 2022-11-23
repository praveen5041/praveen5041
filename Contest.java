import java.util.ArrayList;

public class Contest{
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(12);list.add(24);list.add(89);
    //traversing elements by using foreach
    list.forEach(System.out::println);
  }
} 