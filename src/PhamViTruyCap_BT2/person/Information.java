package PhamViTruyCap_BT2.person;

public class Information {
    public static void main(String[] args) {
        Person ps1 = new Person("dung", 22, "female", "HN", "01234567");

        ps1.getName();
        ps1.getAge();
        ps1.getAddress();
        ps1.getGender();
        ps1.getPhone();
    }
}
