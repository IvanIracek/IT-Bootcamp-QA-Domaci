package Test;

import Base.Login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin extends Login {
    String p = "secret_sauce";
    String expected = "https://www.saucedemo.com/inventory.html";

    @Test
    public void testFalse(){
        String u = "asfdasdf";
        String p = "fsdfasgd";
        Assert.assertNotEquals(logIn(u,p), expected);
    }
    @Test
    public void testFalse2(){
        String u = "sdfgs";
        String p = "fdfdhfgdhv";
        Assert.assertNotEquals(logIn(u,p), expected);
    }
    @Test
    public void testFalse3(){
        String u = "standarduser";
        Assert.assertNotEquals(logIn(u,p), expected);
    }
    @Test
    public void testFalse4(){
        String u = "problemuser";
        Assert.assertNotEquals(logIn(u,p), expected);
    }
    @Test
    public void testFalse5(){
        String u = "performanceglitchuser";
        Assert.assertNotEquals(logIn(u,p), expected);
    }

    @Test
    public void testCorrect() {
        String u = "standard_user";
        Assert.assertEquals(logIn(u,p), expected);
    }
    @Test
    public void testCorrect1() {
        String u = "locked_out_user";
        Assert.assertEquals(logIn(u,p), expected);
    }
    @Test
    public void testCorrect2() {
        String u = "problem_user";
        Assert.assertEquals(logIn(u,p), expected);
    }
    @Test
    public void testCorrect3() {
        String u = "performance_glitch_user";
        Assert.assertEquals(logIn(u,p), expected);
    }
}
