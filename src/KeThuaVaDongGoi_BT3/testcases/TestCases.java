package KeThuaVaDongGoi_BT3.testcases;

import KeThuaVaDongGoi_BT3.common.BaseTest;
import KeThuaVaDongGoi_BT3.common.Constants;

import javax.security.auth.login.LoginContext;
import java.util.EmptyStackException;

public class TestCases extends BaseTest {

    //Loại case để trống thông tin
    public static void login(String name, String username, String password)
    {
        createDriver();
        setName(name);
        System.out.println("step 1: mở trình duyet :https://cms.anhtester.com/login");
        System.out.println("step 2: Nhập username: " + username);
        System.out.println("step 3: Nhập username: " + password);
        System.out.println("step 4: Click button Login");
        System.out.println("step 5: Check alert - Vui lòng nhập trường này");
        closeDriver("Chrome");
    }

    public static void addCategory(String name, String username, String password)
    {
        createDriver();
        setName(name);
        System.out.println("step 1: mở trình duyet :https://cms.anhtester.com/login");
        System.out.println("step 2: Nhập username: " + username);
        System.out.println("step 3: Nhập username: " + password);
        System.out.println("step 4: Click button Login");
        System.out.println("step 5: Thêm danh mục");
        closeDriver("Chrome");
    }

    public static void main(String[] args) {
        login("Testcase Login", "admin@example.com", "123456");
        System.out.println("=====================================");
        addCategory("Testcase AddCategory", "admin@example.com", "123456");

    }

}
