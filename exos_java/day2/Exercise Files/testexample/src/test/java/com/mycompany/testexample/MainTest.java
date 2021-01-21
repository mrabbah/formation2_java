
package com.mycompany.testexample;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author rabbah
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class MainTest {
   
    @Before
    public void init() {
        
    }
   
    
    @Test
    public void test_1() {
        float a = 8f;
        float b = 4f;
        Main m = new Main();
        
        float actual = m.sum(a, b);
        float expected = 12f;
        
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test_2() {
        float a = 8f;
        float b = 4f;
        Main m = new Main();
        
        float actual = m.division(a, b);
        float expected = 3f;
        
        Assert.assertEquals(expected, actual);

    
    }
}
