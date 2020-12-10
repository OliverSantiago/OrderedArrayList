import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int Capacity){
    super(Capacity);
  }

  public boolean add(T element){
    super.add(FindIndex(this, element),element);
    return true;
  }

  public void add(int index, T element){
    super.add(FindIndex(this, element),element);
  }

  private int FindIndex(OrderedArrayList<T> currentlist, T element){
    for (int i = 0; i < currentlist.size(); i++){
      if (currentlist.get(i).compareTo(element)==1||currentlist.get(i).compareTo(element)==0){
        return i;
      }
    }
    return currentlist.size();
  }
}
