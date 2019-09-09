package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    private static Reverse reverse;

    @Before
    public void setUp() throws Exception {
        reverse = new Reverse();
    }


    @After
    public void tearDown() throws Exception {
        reverse = null;
    }

    @Test
    public void testreverseFun() {
        assertEquals(
                "testreverseFun() : Select fields extractions failed. The query string can have multiple fields separated by comma after the 'select' keyword. The extracted fields is supposed to be stored in a String array which is to be returned by the method getFields(). Check getFields() method",
                "No", reverse.reverseFun(12345));

        assertEquals(
                "testreverseFun() : Select fields extractions failed. The query string can have multiple fields separated by comma after the 'select' keyword. The extracted fields is supposed to be stored in a String array which is to be returned by the method getFields(). Check getFields() method",
                "Yes", reverse.reverseFun(12321));

        assertEquals(
                "testreverseFun() : Select fields extractions failed. The query string can have multiple fields separated by comma after the 'select' keyword. The extracted fields is supposed to be stored in a String array which is to be returned by the method getFields(). Check getFields() method",
                "Yes", reverse.reverseFun(1223221));

    }
}
