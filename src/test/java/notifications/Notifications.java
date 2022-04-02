package notifications;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Notifications {
    @Parameters({"URL", "TOKEN"})
    @Test(groups = {"smoke"})
    public void activeNotification(String url, String token){
        System.out.println("drop an email for active notification");
        System.out.println("printing parameter : "+url);
        System.out.println("printing parameter : "+token);
    }

    @Test
    public void dormantNotification(){
        System.out.println("drop an email for dormant notification");
    }

    @Test
    public void abandonedNotification(){
        System.out.println("drop an email for abandoned notification");
    }

    @Test
    public void testListener(){
        Assert.assertTrue(false);
    }
}
