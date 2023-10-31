package abc;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends HangHoa {
    private NgayThang ngaySX;
    private NgayThang ngayHetHan;
    private String nhaCC;

    public HangThucPham() {
        VAT = 0.05F;
    }

    public HangThucPham(NgayThang ngaySX, NgayThang ngayHetHan, String nhaCC) {
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCC = nhaCC;
        VAT = 0.05F;
    }

    @Override
    protected String danhGiaMucDoBan() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        c.set(ngayHetHan.getNam(), ngayHetHan.getThang()-1, ngayHetHan.getNgay());
        if(slgTon!= 0  && (d.compareTo(c.getTime())> 0))
            return "Kho Ban";
        return "Binh thuong";
    }

    @Override
    protected void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay SX: ");
        ngaySX = new NgayThang();
        ngaySX.nhap();
        System.out.println("Nhap ngay hetHan: ");
        ngayHetHan = new NgayThang();
        ngayHetHan.nhap();
        System.out.println("Nhap nha cung cap");
        nhaCC   = sc.nextLine();
        VAT = 0.05F;
    }

    public static void inTieuDe() {
        HangHoa.inTieuDe();
        System.out.printf("%15s %10s %15s %20S %n", "NgaySX", "NgayHHt", "Nha cc", "Ghi Chu");

    }

    @Override
    public void inDuLieu() {
        super.inDuLieu();
        System.out.printf("%15s %10s %15s %20S %n", ngaySX, ngayHetHan, nhaCC, danhGiaMucDoBan());
    }
}
