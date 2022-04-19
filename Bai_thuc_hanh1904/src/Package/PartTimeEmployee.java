package Package;

import java.util.Scanner;
public class PartTimeEmployee extends Employee {
    private int gioLamViec;

    public PartTimeEmployee(String ten) {
        this.ten = ten;
    }
    public PartTimeEmployee(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    public String loailaodong() {
        return "Lao dong tam thoi";
    }
    public void nhapgiolamviec() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gio lam viec =");
        Scanner scanner = new Scanner(System.in);
        gioLamViec = scanner.nextInt();
    }

    public void ingiolamviec() {
        System.out.println("ten nhan vien : " + ten);
        System.out.println("loai lao dong : lao dong tam thoi");
        System.out.println("Gio lam viec: " + gioLamViec);

    }

}