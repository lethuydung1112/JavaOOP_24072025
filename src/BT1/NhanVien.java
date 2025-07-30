package BT1;

public class NhanVien {
    private String name;
    private int age;
    private String phoneNumber;
    private int salary;

    public NhanVien(String name, int age, String phoneNumber, int salary)
    {
        this.name = name;
        this.age = age ;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
    public void hienThiThongTin()
    {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Tuổi nhân viên: " + age);
        System.out.println("Số điện thoại nhân viên: " + phoneNumber);
        System.out.println("Mức lương: " + salary);
    }

}
