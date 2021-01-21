/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RABBAH Mahmoud Almostafa <mrabbah@ieee.org>
 */
public class Main {
    public static void main(String[] args) {
        Building building = new Building();        
        Office office = new Office();
        build(building);
        build(office);
        
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);
        
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);
        
        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);
        
        addHouseToList(houses);
        addHouseToList(buildings); 
        printBuildings(buildings);
        
    }
    
    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }
    
    static void printBuildings(List<? extends Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
    
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}
/*


? super F01 (classes mères à F01 + la classe F01)
? extends F01 (classes qui hérite à F01  + la classe F01)
        
                M00
          F01           F02
      F011  F012    F021   F022    

*/