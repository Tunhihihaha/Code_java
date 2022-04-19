package Package;

import java.util.Scanner;
public class Person {

    protected int id;
    protected String ten;

    public Person(){

    }
    public Person(int id, String name) {
        this.id = id;
        this.ten = ten;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return ten;
    }
    public void setName(String name) {
        this.ten = ten ;
    }
    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap id: ");
        id = sc.nextInt();
        System.out.print("\tNhap ho ten: ");
        sc.nextLine();
    }
    public void xuatthongtin() {
        System.out.println("\tId: " + id);
        System.out.println("\tHo ten: " + ten);
    }

}