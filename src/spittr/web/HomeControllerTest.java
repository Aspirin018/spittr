package spittr.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by liyu on 2017/8/7.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage(){
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }



}
