import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class AddCollection {
    Collection<String> names = new ArrayList<>();
    
    public AddCollection(){
        names.add("Max");
        names.add("Verstappen");
        names.addAll(Arrays.asList("Verstappen", "Max", "F1", "Handal"));
    }
    public void getInfo(){
        for (String names : names) {
            System.out.println(names);
        }
    }
}