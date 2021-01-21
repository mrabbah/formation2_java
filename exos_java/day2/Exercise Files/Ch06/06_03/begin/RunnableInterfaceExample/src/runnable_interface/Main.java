
package runnable_interface;

/**
 *
 * @author Mahmoud
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample());
        t1.setName("Thread 1");
        t1.start();
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i <= 100) {
                    System.out.println(i++  + " " + Thread.currentThread().getName());
                }
            }
        });
        t2.setName("Thread 2");
        t2.start();
    }

}
