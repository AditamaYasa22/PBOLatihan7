import java.util.ArrayList;
import java.util.List;

public class Daftar {
   List<String> names = new ArrayList<>();
   
   public Daftar(){
   names.add("Max");
   names.add("Verstappen");
   names.add("Hubner");
   
   names.set(0, "Martin");
   }

   public void getInfo(){
   System.out.println(names.get(0));
   System.out.println(names.get(1));
   System.out.println(names.get(2));
   }
}
