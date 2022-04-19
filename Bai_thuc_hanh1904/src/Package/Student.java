package Package;

import java.util.Scanner;
public class Student extends Person {
    private int tuoi;
    private String lop;

    public Student() {

    }
    public Student(int id, String name, int tuoi, String lop) {
        this.id = id;
        this.ten= ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getLop() {
        return ten;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }

    protected String loaiSinhvien() {
        return "";
    }

    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("\tNhap lop: ");
        sc.nextLine();
    }

    public void xuatthongtin() {
        System.out.println("\tTuoi: " + tuoi);
        System.out.println("\tLop: " + lop);
    }
}