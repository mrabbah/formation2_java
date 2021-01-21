/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

/**
 *
 * @author RABBAH Mahmoud Almostafa <mrabbah@ieee.org>
 */
public class House extends Building {
    
    public int numberOfRooms = 10;

    @Override
    public String toString() {
        return ("house");
    }
            
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
