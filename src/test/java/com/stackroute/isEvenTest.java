package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;
public class isEvenTest {
    private static isEven isEven;
    @BeforeClass
    public static void setUp() throws Exception {
        isEven = new isEven();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
    @Test
    public void UTC_01_validInput()
    {
        boolean expected = true;
        boolean actual = isEven.isEvenNumber(4);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void UTC_02_validInput()
    {
        boolean expected = true;
        boolean actual = isEven.isEvenNumber(5);
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void UTC_03_validInput()
    {
        boolean actual = isEven.isEvenNumber(5);
        Assert.assertNotNull(actual);
    }
}