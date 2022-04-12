import mypackage2.ToaDo;
import mypackage2.HinhTron;
public class App71 {

    public static void main(String[] args) {
        // Khởi tạo dối tượng hinhTron từ lớp HinhTron
        HinhTron hinhTron = new HinhTron();

        // set bán kính cho hinhTron thông qua phương thức setter
        hinhTron.setBanKinh(10);

        // Các tính toán khác
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hình tròn: " + chuVi + "; Và diện tích: " +dienTich);
    }
}
