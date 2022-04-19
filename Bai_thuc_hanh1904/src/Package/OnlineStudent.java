package Package;

import java.util.Scanner;
public class OnlineStudent extends Student {
    private String tbi;

    public OnlineStudent() {
        this.ten = ten;
    }
    public OnlineStudent(String tbi) {
        this.tbi = tbi;

    }

    public String loaiSinhvien() {
        return "Sinh vien online";
    }

    public void nhapTbi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Thiet bi hoc tap :");
        Scanner scanner = new Scanner(System.in);
        tbi = scanner.nextLine();
    }
    public void inTbi(){
        System.out.println("\tTrang bi: " + tbi);

    }

}