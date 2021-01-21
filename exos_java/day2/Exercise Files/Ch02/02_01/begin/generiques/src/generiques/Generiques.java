
package generiques;

import java.util.ArrayList;
import java.util.List;

public class Generiques {

    
    public static void main(String[] args) {
        
        List names = new ArrayList();
        names.add("RABBAH");
        String name = (String) names.get(0);
        System.out.println("Mon nom est " + name);
        names.add(7);
        
        System.out.println(names);
        
        //Generique
        
        List<String> names2 = new ArrayList<>();
        names2.add("Mahmoud");
        name = names2.get(0);
        System.out.println("Prenom = " + name);
      
        
    }
    
}
