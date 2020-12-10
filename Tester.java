import java.util.ArrayList;
public class Tester{
  public static void main(String[]args){
    NoNullArrayList<String> first = new NoNullArrayList<String>();
    NoNullArrayList<String> second = new NoNullArrayList<String>(5);
    OrderedArrayList<String> third = new OrderedArrayList<String>();
    second.add("one");
    second.add("two");
    second.add("three");
    second.add("four");
    // System.out.println(first.toString());
    // System.out.println(second.toString());
    second.set(2,"set");
    //System.out.println(second.toString());
    //second.set(2,null);
    second.add("Added");
    //System.out.println(second.toString());
    //second.add(null);
    second.add(0,"One Half");
    ///System.out.println(second.toString());
    //second.add(0,null);
    // third.add("A");
    // third.add("C");
    // third.add("D");
    // third.add("B");
    // System.out.println(third.toString());
    third.add("A");
    third.add("C");
    third.add(1,"D");
    System.out.println(third.toString());

    third.set(0,"B");
    System.out.println(third.toString());

  }
}
