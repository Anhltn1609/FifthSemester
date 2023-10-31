package abc;

import java.util.Scanner;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected String ghiChu;
    protected double donGia;
    protected double slgTon;
    protected double VAT;

    public HangHoa() {
    }

    protected abstract String danhGiaMucDoBan();
    protected String getGhiChu(){
        return ghiChu;
    };
    protected void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin : ");
        System.out.println("Nhap ma Hang: ");
        maHang = sc.nextLine();
        System.out.println("Nhap ten Hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.println("So luong ton kho: ");
        slgTon= sc.nextDouble();
        sc.nextLine();
    };
    public String getMaHang(){
        return maHang;
    };

    protected static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %15s", "Mã Hàng", "Tên Hàng", "Đơn Giá", "Sl Tồn", "VAT");
    }

    public void inDuLieu(){
        System.out.printf("%15s %15s %15s %15s %15.2f", maHang, tenHang, donGia, slgTon, VAT);
    };

}
