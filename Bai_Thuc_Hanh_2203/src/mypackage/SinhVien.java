package mypackage;
import java.util.Scanner;

public class SinhVien {
    private int ID;
    private String name;
    private boolean gender;
    private String address;
    private String dateTime;

    public SinhVien(){
        ID = 0;
        name = "";
        gender = true;
        address = "";
        dateTime = "";
    }
    public SinhVien(int ID, String name, boolean gender, String address, String dateTime){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateTime = dateTime;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap sinh vien: ");
        System.out.print("ID: "); ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten: "); name = sc.nextLine();
        System.out.print("Gioi tinh: "); gender = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Dia chi: "); address = sc.nextLine();
        System.out.print("Ngay sinh: "); dateTime = sc.nextLine();
    }
    public void hienThi(){
        System.out.println("Sinh vien: ");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Date: " + dateTime);
    }

}