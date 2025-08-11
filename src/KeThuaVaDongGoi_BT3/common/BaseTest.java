package KeThuaVaDongGoi_BT3.common;

public class BaseTest {
    protected static void createDriver()
    {
        System.out.println("Browser: " +Constants.browser);
        System.out.println("Headless: " +Constants.headless);
        System.out.println("Report: " +Constants.report);
    }
    protected static void closeDriver(String browser)
    {
        System.out.println("Closed browser: " + browser);
    }
    protected static void setName(String name)
    {
        System.out.println(name);
    }
    protected static String setEmail(String email)
    {
        return email;
    }

    protected static String setPassWord(String passWord)
    {
        return passWord;
    }
}
