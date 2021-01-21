/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_class;

/**
 *
 * @author Mahmoud
 */
public class ThreadExample extends Thread {
    
    @Override
    public void run() {
        int i = 1;
        while(!Thread.currentThread().isInterrupted()) {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }

    @Override
    public void destroy() {
        System.out.println(this.getName() + " se termine");
        super.destroy(); 
    }
    
    
    
}
