package Shape;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Point {
    // thuộc tính

    private String a;
    private int x;
    private int y;

    // phương thức
    public void Point(){
        x=0;y=0;
    }
    public void Ponit (String a, int x, int y){
        this.x=x;
        this.y=y;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    // getter của thuộc tính x
    public int getX() {

        return x;
    }
    // setter của thuộc tính x
    public void setX(int x) {

        this.x = x;
    }
    // getter của thuộc tính y
    public int getY() {
        return y;
    }
    // setter của thuộc tính y
    public void setY(int y) {
        this.y = y;
    }
    public void Nhap() {
        Scanner sc = new Scanner(in);
        out.println("Nhap ten diem: ");
        a = sc.nextLine();
        out.println("nhap hoanh do x: ");
        x = Integer.parseInt(sc.nextLine());
        out.println("nhap tung do y:");
        y = Integer.parseInt(sc.nextLine());
    }
    public void HienThi(){
        out.println("Diem vua nhap: "+a+"("+x+","+y+")");
    }
    public double tinhKC(Point d2){
        return Math.sqrt((x-d2.x)*(x-d2.x)+(y-d2.y)*(y-d2.y));
    }
}
