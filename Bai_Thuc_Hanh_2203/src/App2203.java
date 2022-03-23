import mypackage.*;

public class App2203 {
    public static void main(String[] args) throws Exception {
        //Test HCN
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        hcn.hienThiChuVi();
        hcn.hienThiDienTich();

        //Test Person
        Person ps = new Person();
        ps.nhap();
        ps.hienThi();

        //Test Sinh vien
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.hienThi();

        //Test PhuongTrinhBacHai
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhap();
        pt.giaiPT();
        pt.hienThi();
    }
}