/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample;

import java.util.LinkedList;

/**
 *
 * @author RABBAH Mahmoud Almostafa <mrabbah@ieee.org>
 */
public class Store {
    
    public static void main(String[] args) {                
       
        /*
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
              
        System.out.println(queue);
        
        serveCustomers(queue);
        
        System.out.println(queue);*/
        //System.out.println(queue.toString());
        
        
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);

    }
    
    static void serveCustomers(LinkedList<Customer> queue) {
        Customer c = queue.poll();
        c.serve();
    }
    
}