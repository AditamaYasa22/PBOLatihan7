import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSet {
    Set<String> names = new LinkedHashSet<>();

    public LinkedHasSet(){
    names.add("Max");
    names.add("Verstappen");
    names.add("Hubner");
    }
    
    public void getInfo(){
    for (String names : names){
        System.out.println(names);
    }
}
}

