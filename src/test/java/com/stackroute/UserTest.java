package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;
public class UserTest {
    private static User user;
    @BeforeClass
    public static void setUp() throws Exception {
        user = new User();
    }
    @AfterClass
    public static void tearDown() throws Exception {
    }
    @Test
    public void displayFullName() {
        String expected = "Kunal Singhal";
        String actual = user.getFullName("Kunal" , "Singhal");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void UTC_01(){
        int expected = 20;
        int actual = user.setAge(20);
        Assert.assertEquals(expected, actual);
    }
}