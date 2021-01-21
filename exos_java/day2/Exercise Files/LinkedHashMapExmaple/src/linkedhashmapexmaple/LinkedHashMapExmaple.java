
package linkedhashmapexmaple;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapExmaple {

    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, true);
        
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123); 
        phonebook.put("Gary", 22222); 
        
        /*for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key =" + key + " , value = " + value);
        }*/
        
        System.out.println("Kevin's number: " + phonebook.get("Jill"));
        System.out.println("Brenda's number: " + phonebook.get("Brenda"));
               
        System.out.println("\nList of contacts in phonebook:");
        
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
