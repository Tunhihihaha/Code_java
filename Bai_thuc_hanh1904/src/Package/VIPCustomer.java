package Package;

import java.util.Scanner;
public class VIPCustomer  extends Customer {
    private int tuoi;
    private String quyenloi;

    public VIPCustomer() {

    }

    public VIPCustomer(int id, String name, int tuoi, String sanphamdat) {
        this.id = id;
        this.ten= ten;
        this.tuoi = tuoi;
        this.quyenloi =quyenloi;

    }

    public void nhapthongtinVIP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("\tquyen loi : ");
        sc.nextLine();
    }

    public void xuatthongtinVIP() {
        System.out.println("\tTen: " + ten);
        System.out.println("\tTuoi: " + tuoi);
        System.out.println("\tQuyen loi: " + quyenloi);
    }
}