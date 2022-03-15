import java.util.Scanner;
import static java.lang.System.*;
public class App {
    public static void main(String[] args)
    {
        double a, b, c, x1, x2, delta=0;
        try (var scanner = new Scanner(in)) {
            do {
                out.print("Nhập a (a # 0): ");
                a = scanner.nextDouble();
            }
            while (a == 0);
            out.print("Nhập b: ");
            b = scanner.nextDouble();
            out.print("Nhập c: ");
            c = scanner.nextDouble();
        }
        out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");

        if (0 < delta) {
            out.println("Phương trình vô nghiệm!");
        }
        else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
