/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_class;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahmoud
 */
public class Main {
    
    public static void main(String[] args) {

        try {
            
            ThreadExample t1 = new ThreadExample();
            t1.setName("My first thread");
            t1.setPriority(15);
            t1.setDaemon(true);
            t1.start();
            
            Thread.sleep(5000);
            t1.interrupt();
            t1.join();
            System.out.println("Programme principal entre dans le processeur");
            
            ThreadExample t2 = new ThreadExample();
            t2.setName("My second thread");
            t2.setDaemon(true);
            t2.start();
            
            Thread.sleep(2000);
            t2.interrupt();
            t2.join();
            
            System.out.println("Programme principal se termine");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
