
package fucntionalprogramming;

public class Fucntionalprogramming {

    public static void main(String[] args) {
        
        Greeting gm1 = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        
        Greeting gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        
        gm1.greet("Rabbah");
        gm2.greet("Mahmoud ");
        
        MessagePrinter mp = () -> {
            System.out.println("Affichage message ");
        };
        
        mp.afficherMessage();
    }
    
}
