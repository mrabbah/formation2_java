
package lambdaexample;


/**
 *
 * @author Mahmoud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("RABBAH");    
        
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("RABBAH");
        
        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();
        
       
    }
    
}