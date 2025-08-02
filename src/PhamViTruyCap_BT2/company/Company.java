package PhamViTruyCap_BT2.company;

import PhamViTruyCap_BT2.person.Person;

public class Company extends Person
{
    public Company(String name, int age, String gender, String address, String phone)
    {
        super(name, age, gender, address, phone);
    }

    public static void main(String[] args) {
        Person ps2 = new Person("hai", 25, "male", "ha nội", "01234566789");
//        System.out.println(ps2.name);
//        System.out.println(ps2.age);
//        System.out.println(ps2.gender);

        ps2.getName();
        ps2.getAge();
        ps2.getGender();
//        ps2.getPhone();
//        ps2.getAddress();

        Company c = new Company("hai", 25, "male", "ha nội", "01234566789");
        c.getName();
        c.getAge();
        c.getGender();
//        c.getAddress();
    }
}
