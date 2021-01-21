
package customers;

import scheduling.Scheduler;


/**
 *
 * @author RABBAH
 */
public class Customer {
    
    public static void main(String[] args) {
        
        Scheduler scheduler = new Scheduler();
        scheduler.bookHaircut("Harry", "Monday");
        scheduler.bookHaircut("Jill", "Friday");
        
    }
    
}
