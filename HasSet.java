import java.util.HashSet;
import java.util.Set;

public class HasSet {
    Set<String> names = new HashSet<>();

    public HasSet(){
    names.add("Max");
    names.add("Verstappen");
    names.add("Hubner");
    }
    
    public void getInfo(){
        for(String names : names){
        System.out.println(names);
    }
}
}

