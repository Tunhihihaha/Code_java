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
class NhanVien{
    public String MaNV,Ten,DiaChi;
}
public class AppArr{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nhân viên: ");
        int n = input.nextInt();
 
        ArrayList<NhanVien> danhSach = new ArrayList();
 
        for (int i = 0; i < n; i++) {
            input.nextLine();
            NhanVien x = new NhanVien();
            System.out.println("Thông tin nhân viên thứ " + i);
            System.out.print("Mã Nhân Viên :  ");
            x.MaNV = input.nextLine();
            System.out.print("Họ và Tên:  ");
            x.Ten = input.nextLine();
            System.out.print("Địa chỉ: ");
            x.DiaChi = input.nextLine();
            danhSach.add(x);
        
        }
        System.out.println("Nhập số nhân viên được thêm: ");
        int m = input.nextInt();
        ArrayList<NhanVien> danhSach2 = new ArrayList();
 
        for (int i = 0; i < m; i++) {
            input.nextLine();
            NhanVien y = new NhanVien();
            System.out.println("Thông tin nhân viên được thêm thứ " + i);
            System.out.print("Mã Nhân Viên :  ");
            y.MaNV = input.nextLine();
            System.out.print("Họ và Tên:  ");
            y.Ten = input.nextLine();
            System.out.print("Địa chỉ: ");
            y.DiaChi = input.nextLine();
            danhSach2.add(y);
            
    }
        danhSach.addAll(danhSach2);
        System.out.print("danh sach nhân viên khi được thêm là : ");
        showList(danhSach);
         danhSach.removeAll(danhSach2);
           System.out.print("danh sách nhân vien còn lại là:");
            showList(danhSach);
    }
      public static void showList(ArrayList<NhanVien> danhSach) {
        // Show list through for-each
        for (NhanVien obj : danhSach) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}


