import java.util.Scanner;

public class App35 {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        if (a < b)
        System.out.println(a);
        else System.out.print(b);
       
    }
}
