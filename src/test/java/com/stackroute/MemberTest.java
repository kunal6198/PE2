package com.stackroute;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class MemberTest {
    private static Member member;
    @BeforeClass
    public static void setUp() throws Exception{
        member = new Member();
    }
    @AfterClass
    public static void tearDown() throws Exception{
    }
    @Test
    public void displayDetails() {
        String expected = "kunal2150000.0";
        member.setName("kunal");
        member.setAge(21);
        member.setSalary(50000);
        String actual = member.displayDetails();
        Assert.assertEquals(expected,actual);
    }
}