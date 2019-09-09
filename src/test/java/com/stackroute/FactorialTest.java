package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;
public class FactorialTest {
    public static Factorial factorial;
    @BeforeClass
    public static void setUp() throws Exception {
        factorial = new Factorial();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
    @Test
    public void UTC_01_validInput()
    {
        String expected = "120";
        String actual = Factorial.fact(5);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void UTC_02_validInput()
    {
        String expected = "the value is out  of range.";
        String actual = Factorial.fact(21);
        Assert.assertEquals(expected, actual);
    }
}