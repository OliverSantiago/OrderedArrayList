import java.util.ArrayList;
public class Tester{
  public static void main(String[]args){
    NoNullArrayList<String> first = new NoNullArrayList<String>();
    NoNullArrayList<String> second = new NoNullArrayList<String>(5);
    System.out.println(first.toString());
    System.out.println(second.toString());
  }
}
