package KeThuaVaDongGoi_BT3.testcases;

import KeThuaVaDongGoi_BT3.common.BaseTest;

import java.util.EmptyStackException;

public class TestCases extends BaseTest {

    //Loại case để trống thông tin
    public static void Login(String empty)
    {
        createDriver();
        setName(empty);
        System.out.println("step 1: " + empty);
        System.out.println("step 2: Click button Login");
        System.out.println("step 3: Check alert - Vui lòng nhập trường này");
        closeDriver("https://cms.anhtester.com/login");
    }

    //loại case để check remember me
    public static void Login(String email, String password)
    {
        System.out.println("Check action button remember me");
        System.out.println("step 1: Enter email - " + setEmail(email));
        System.out.println("step 2: Enter password - " + setPassWord(password));
        System.out.println("step 3: Click checkbox Remember me");
        System.out.println("step 4: Click button Login");
    }

    //Loại case để check forgot password

    //loại case để check login success


    public static void main(String[] args) {
        Login("Để trống email");
        Login("Để trống password");
        Login("leethuydung789@gmail.com","123456");

    }

}
