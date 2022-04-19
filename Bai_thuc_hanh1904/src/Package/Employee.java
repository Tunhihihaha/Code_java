package Package;

import java.util.Scanner;
public class Employee extends Person {
    private int tuoi;
    private String bangcap;

    public Employee() {

    }
    public Employee(int id, String name, int tuoi, String bangcap) {
        this.id = id;
        this.ten= ten;
        this.tuoi = tuoi;
        this.bangcap = bangcap;

    }

    protected String loailaodong() {
        return "";
    }

    public void nhapthongtinld() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("\tBang cap : ");
        sc.nextLine();
    }
    public void xuatthongtinld() {
        System.out.println("\tTuoi: " + tuoi);
        System.out.println("\tBang cap: " + bangcap);
    }
}
