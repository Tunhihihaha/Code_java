import java.util.Scanner;

public class App2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap he so thu nhat cua phuong trinh 1 : a1 = ");
        double a1 = App2.scanner.nextFloat();
        System.out.print("Nhap he so thu hai cua phuong trinh 1 : b1 = ");
        double b1 = App2.scanner.nextFloat();
        System.out.print("Nhap he so thu ba cua phuong trinh 1 : c1 = ");
        double c1 = App2.scanner.nextFloat();
        System.out.print("Nhap he so thu nhat cua phuong trinh 2 : a2 = ");
        double a2 = App2.scanner.nextFloat();
        System.out.print("Nhap he so thu hai cua phuong trinh 2 : b2 = ");
        double b2 = App2.scanner.nextFloat();
        System.out.print("Nhap he so thu ba cua phuong trinh 2 : c2 = ");
        double c2 = App2.scanner.nextFloat();
        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx + Dy == 0)
            System.out.println("Phuong trinh vo so nghiem!");
            else
            System.out.println("Phuong trinh vo nghiem!");
        }
        else {
        double x = Dx / D ;
        double y = Dy / D ;
        System.out.println("Phuong trinh co nghiem la: "
        + "x = " + x + " và y = " + y);
        }
}
}