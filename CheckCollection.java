import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collection;

public class CheckCollection {
    Collection<String> names = new ArrayList<>();
    
    public CheckCollection(){
        names.add("Max");
        names.add("Verstappen");
        names.addAll(Arrays.asList("Max", "Verstappen", "Pembalap", "F1"));

        System.out.println(names.contains("Despacito"));
        System.out.println(names.containsAll(Arrays.asList("Max", "F1")));

        names.remove("Max");
        names.removeAll(Arrays.asList("Pembalap", "Verstappen"));
    }

        public void getInfo(){
            for (String names : names) {
                System.out.println(names);
            }

        }
    }