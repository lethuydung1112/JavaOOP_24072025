package PhamViTruyCap_BT2.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Person(String name, int age, String gender, String address, String phone)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void getName()
    {
        System.out.println(name);
    }

    public void getAge()
    {
        System.out.println(age);
    }

    public void getGender()
    {
        System.out.println(gender);
    }

     void getAddress()
    {
        System.out.println(address);
    }

     void getPhone()
    {
        System.out.println(phone);
    }

}
