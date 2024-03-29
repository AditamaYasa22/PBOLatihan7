import java.util.List;
import java.util.Iterator;

public class Iteratorr {
    Iterable<String> names = List.of("Tama", "Yasa", "Kosasih");
    Iterator<String> iterator = names.iterator();

    public void getName(){
    while (iterator.hasNext()) {
    {
        String names = iterator.next();
        System.out.println(names);
    }
}
    }
}

/// public void setNames(){
   /// for (String name : names) {
       /// System.out.println(name);
   /// }
/// }