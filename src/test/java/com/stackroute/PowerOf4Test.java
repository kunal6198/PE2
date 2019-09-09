package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class PowerOf4Test {
    private static PowerOf4 obj;

    @BeforeClass
    public static void setUp() throws Exception {
        obj =new PowerOf4();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void testPowerOf4(){
        assertEquals(
                "testPowerOf4() : Select fields extractions failed. The query string can have multiple fields separated by comma after the 'select' keyword. The extracted fields is supposed to be stored in a String array which is to be returned by the method getFields(). Check getFields() method",
                "false", obj.isPowerOfFour(63));

        assertEquals(
                "testPowerOf4() : Select fields extractions failed. The query string can have multiple fields separated by comma after the 'select' keyword. The extracted fields is supposed to be stored in a String array which is to be returned by the method getFields(). Check getFields() method",
                        "false", obj.isPowerOfFour(128));

    assertNotEquals(
                "testPowerOf4() : Select fields extractions failed. The query string can have multiple fields separated by comma after the 'select' keyword. The extracted fields is supposed to be stored in a String array which is to be returned by the method getFields(). Check getFields() method",
                        "false", obj.isPowerOfFour(256));
        }



}