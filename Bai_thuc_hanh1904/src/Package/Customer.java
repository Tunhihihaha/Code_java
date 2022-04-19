package Package;

import java.util.Scanner;
public class Customer extends Person {
    private int tuoi;
    private String sanphamdat;

    public Customer() {

    }
    public Customer(int id, String name, int tuoi, String sanphamdat) {
        this.id = id;
        this.ten= ten;
        this.tuoi = tuoi;
        this.sanphamdat =sanphamdat;

    }
    public void nhapthongtincus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("\tsanphamdat : ");
        sc.nextLine();
    }

    public void xuatthongtincus() {
        System.out.println("\tTen: " + ten);
        System.out.println("\tTuoi: " + tuoi);
        System.out.println("\tSan pham dat mua: " + sanphamdat);
    }
}