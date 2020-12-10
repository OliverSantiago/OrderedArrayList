import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int Capacity){
    super(Capacity);
  }

  public T set(int index, T element) throws IllegalArgumentException{
    if (element==null){
      throw new IllegalArgumentException();
    }else{
      return super.set(index, element);
    }
  }

  public boolean add(T element) throws IllegalArgumentException{
    if (element==null){
      throw new IllegalArgumentException();
    }else{
      return super.add(element);
    }
  }
}
