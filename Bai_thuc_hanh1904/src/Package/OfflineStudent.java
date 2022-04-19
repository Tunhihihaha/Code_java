package Package;

import java.util.Scanner;
public class OfflineStudent extends Student {
    private String ptien;

    public OfflineStudent(String ten) {
        this.ten = ten;
    }
    public OfflineStudent(String ten, String ptien) {
        this.ten = ten ;
        this.ptien = ptien;

    }
    public String loaiSinhvien() {
        return "Sinh vien offline";
    }
    public void nhapPtien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phương tien =");
        Scanner scanner = new Scanner(System.in);
        ptien = scanner.nextLine();
    }

    public void inPtien() {
        System.out.println("\tPhuong tien: " + ptien);

    }

}