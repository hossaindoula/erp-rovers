package com.erp.inventory;


import com.erp.util.ERPBaseTest;

/**
 * Created with IntelliJ IDEA.
 * User: ronnie
 * Date: 12/26/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class InventoryTest extends ERPBaseTest {

    protected int value1, value2;

    // assigning the values
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    public void testAdd(){
        double result= value1 + value2;
        assertTrue(result == 6);
    }
}
