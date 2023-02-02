package testCases;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
    @Test(groups= {"Sanity","Master"}) //step8
    public void test_Login()
    {
        logger.info("Starting TC_002_LoginTest");

        try
       {
            HomePage hp=new HomePage(driver);

            hp.clickMyAccount();
            logger.info("clicked on my account");
            hp.clickLogin();
            logger.info("clicked on login link");
            LoginPage lp=new LoginPage(driver);
            logger.info("providing login details");
            lp.setEmail(rb.getString("email")); // valid email, get it from properties file

            lp.setPassword(rb.getString("password")); // valid password, get it from properties file

            lp.clickLogin();
            logger.info("clicked on login button");

          /*  MyAccountPage macc=new MyAccountPage(driver);
            boolean targetpage=macc.isMyAccountPageExists();
            Assert.assertEquals(targetpage, true);*/

        }
       catch(Exception e)
        {
            Assert.fail();
        }
        logger.info(" Finished TC_002_LoginTest");

    }

}
