package mypackage;
import java.util.Scanner;

public class HinhChuNhat {
    private double dai;
    private double rong;

    public HinhChuNhat(){
        dai = 0;
        rong = 0;
    }
    public HinhChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap chieu dai: ");
            dai = sc.nextDouble();
            if(dai <= 0){
                System.out.println("Nhap sai. Vui long nhap lai!");
            }
        } while(dai <= 0);

        do{
            System.out.print("Nhap chieu rong: ");
            rong = sc.nextDouble();
            if(rong <= 0){
                System.out.println("Nhap sai. Vui long nhap lai!");
            }
        } while(rong <= 0);
    }

    public void hienThiChuVi(){
        System.out.println("Chu vi hinh chu nhat: " + (2 * (dai + rong)));
    }
    public void hienThiDienTich(){
        System.out.println("Dien tich hinh chu nhat: " + (dai * rong));
    }
}