import java.util.Scanner;

import static java.lang.System.*;

public class baiThucHanh1502 {
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        var scanner = new Scanner(in);

        out.println("Nhập vào số nguyên dương bất kỳ: ");
        n = scanner.nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

        out.println("Tổng các chữ số = " + tong);
    }
}
