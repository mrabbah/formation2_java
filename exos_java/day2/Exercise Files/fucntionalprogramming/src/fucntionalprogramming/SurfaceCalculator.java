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
public class SurfaceCalculator {
    
    public int calculateArea(Object shape) {
        if(shape instanceof Square) {
            Square s = (Square) shape;
            return s.sideLength * s.sideLength;
        }
        return 0;
    }
}
