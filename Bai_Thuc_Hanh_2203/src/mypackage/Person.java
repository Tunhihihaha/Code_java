package mypackage;
import java.util.Scanner;

public class Person {
    private String personID;
    private String personName;
    private boolean gender;
    private String address;

    public Person(){
        personID = "";
        personName = "";
        gender = true;
        address = "";
    }
    public Person(String personID, String personName, boolean gender, String address){
        this.personID = personID;
        this.personName = personName;
        this.gender = gender;
        this.address = address;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Person: ");
        System.out.print("Nhap ID: "); personID = sc.next();
        sc.nextLine();
        System.out.print("Nhap ten: "); personName = sc.nextLine();
        System.out.print("Nhap gioi tinh: "); gender = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nhap dia chi: "); address = sc.nextLine();
    }
    public void hienThi(){
        System.out.println("Person: ");
        System.out.println("ID: " + personID);
        System.out.println("Ten: " + personName);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Dia chi: " + address);
    }
}