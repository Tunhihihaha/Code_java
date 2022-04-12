
import mypackage.HinhChuNhat;
import mypackage.HinhHoc;
import mypackage.HinhTron;
import mypackage.HinhVuong;
import mypackage.HinhTru;

public class App1204 {

    public static void main(String[] args) {
        // Thử nghiệm với lớp Hình Tròn
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        // Thử nghiệm với lớp Hình Trụ
        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        // Thử nghiệm với lớp Hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        // Thử nghiệm với lớp Hình Vuông
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}
