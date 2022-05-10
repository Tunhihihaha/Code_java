/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith10_5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
 class SinhVien {
 
    public String hoTen;
    public int diem;
}
public class app112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      class SinhVien {
 
    public String hoTen;
    public int diem;
}
 
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        int n = input.nextInt();
 
        ArrayList<SinhVien> danhSach = new ArrayList();
 
        for (int i = 0; i < n; i++) {
            input.nextLine();
            SinhVien x = new SinhVien();
            System.out.println("Thông tin sinh viên thứ " + i);
            System.out.print("Họ và Tên: ");
            x.hoTen = input.nextLine();
            System.out.print("Điểm: ");
            x.diem = input.nextInt();
            danhSach.add(x);
        }
             System.out.println("------------------------------------------------");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Tên " + danhSach.get(i).hoTen + " ||  Điểm: " + danhSach.get(i).diem);
        }
    }
}
    
