import java.util.Scanner;

public class App47 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int t = 0, a;
       while (t <= 100)
       {
           a = sc.nextInt();
           t += a;
       }
       System.out.println("Tong cac so vua nhap la: " + t);
    }
}