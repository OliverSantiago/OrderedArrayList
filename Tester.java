import java.util.ArrayList;
public class Tester{
  public static void main(String[]args){
    NoNullArrayList<String> first = new NoNullArrayList<String>();
    NoNullArrayList<String> second = new NoNullArrayList<String>(5);
    second.add("one");
    second.add("two");
    second.add("three");
    second.add("four");
    // System.out.println(first.toString());
    // System.out.println(second.toString());
    second.set(2,"set");
    System.out.println(second.toString());
    //second.set(2,null);
    second.add("Added");
    System.out.println(second.toString());
    //second.add(null);
    second.add(0,"One Half");
    System.out.println(second.toString());
    second.add(0,null);
  }
}
