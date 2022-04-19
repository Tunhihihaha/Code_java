package Package;

import java.util.Scanner;
public class FullTimeEmployee extends Employee {
    private int ngaylamviec;

    public FullTimeEmployee(String ten) {
        this.ten = ten;
    }
    public FullTimeEmployee(String ten, int ngaylamviec){
        this.ten = ten;
        this.ngaylamviec = ngaylamviec;
    }

    public String loailaodong() {
        return "Lao dong chinh";
    }
    public void nhapngaylamviec() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay lam viec =");
        Scanner scanner = new Scanner(System.in);
        ngaylamviec = scanner.nextInt();
    }
    public void inngaylamviec() {
        System.out.println("ten nhan vien : " + ten);
        System.out.println("loai lao dong : lao dong chinh");
        System.out.println("Gio lam viec: " + ngaylamviec);

    }
}