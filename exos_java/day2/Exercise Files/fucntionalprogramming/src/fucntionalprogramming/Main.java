/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fucntionalprogramming;

/**
 *
 * @author RABBAH Mahmoud Almostafa <mrabbah@ieee.org>
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Square s = new Square(4);

        Shapes shapes1 = new Shapes() {
            @Override
            public int getArea(Square shape) {
                
                return shape.calculateArea();
            }
        };
        
        Shapes shapes2 = (Square shape) -> {
            return shape.calculateArea();
        };
        
        Shapes shapes3 = Square::calculateArea;
        
        System.out.println("Surface du carre est : " + shapes3.getArea(s));

    }
}
