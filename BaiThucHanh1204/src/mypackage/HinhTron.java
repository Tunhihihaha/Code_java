package mypackage;

import java.util.Scanner;

public class HinhTron extends HinhHoc {

    public float banKinh;

    // Constructor
    public HinhTron() {
        ten = "Hình tròn";
    }

    public void nhapBanKinh() {
        System.out.println("Bán kinh = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh;
    }
}



