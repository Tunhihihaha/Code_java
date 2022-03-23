package mypackage;
import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a, b, c;
    private double x1, x2;
    private byte result;

    public PhuongTrinhBacHai(){
        a = 0;
        b = 0;
        c = 0;
    }
    public PhuongTrinhBacHai(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: "); a = sc.nextDouble();
        System.out.print("Nhap b: "); b = sc.nextDouble();
        System.out.print("Nhap c: "); c = sc.nextDouble();
    }

    public void giaiPT(){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0){
            result = 0;
        }
        else if(delta == 0){
            result = 1;
            x1 = - b / (2 * a);
        }
        else{
            result = 2;
            x1 = (- b - Math.sqrt(delta) / (2 * a));
            x2 = (- b + Math.sqrt(delta) / (2 * a));
        }
    }

    public void hienThi(){
        if(result == 0){
            System.out.println("Phuong trinh da cho vo nghiem");
        }
        else if(result == 1){
            System.out.println("Phuong trinh da cho co nghiem kep: " + x1);
        }
        else{
            System.out.println("Phuong trinh da cho co 2 nghiem phan biet: " + x1 + " va " + x2);
        }
    }
}