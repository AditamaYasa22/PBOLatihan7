import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DeleteCollection {
    Collection<String> names = new ArrayList<>();

    public DeleteCollection(){
        names.add("Max");
        names.add("Verstappen");
        names.addAll(Arrays.asList("Verstappen", "Max", "F1", "Handal"));

        names.remove("Max");
    }
    public void getInfo(){
        for (String names : names) {
            System.out.println(names);
        }

}
}
