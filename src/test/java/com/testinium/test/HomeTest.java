package com.testinium.test;
import com.testinium.driver.Base_Test;
import com.testinium.page.HomePage;
import org.junit.Test;

public class HomeTest extends Base_Test {


    public void HomeTest(){
        HomePage homePage = new HomePage();
        homePage.home();

    }
}
