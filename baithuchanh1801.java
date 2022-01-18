import java.util.Scanner;
public class App {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap he so b: ");
        b = sc.nextDouble();
        System.out.println("Nhap he so c: ");
        c = sc.nextDouble();
        if (a == 0)
        {
            if (b == 0)
            {
                System.out.println("Vo nghiem!");
            }
            else 
            {
                System.out.println("Phuong trinh co nghiem: " + "x = " + (-c/b));
            }
        }
        double d = b*b - 4*a*c;
        double x1, x2;
        if (d > 0)
        {
            x1 = ((-b + Math.sqrt(d)) / (2*a));
            x2 = ((-b - Math.sqrt(d)) / (2*a));
        System.out.println("x1 = " + x1 + "x2 = " + x2);
        }
        else if ( d ==0 )
        {
            System.out.println("phuong trinh co nghiem kep: " + (-b / (2*a)));
        }
        else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
    }