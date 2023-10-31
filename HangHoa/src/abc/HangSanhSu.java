package abc;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangSanhSu extends HangHoa{
    private String nsx;
    private NgayThang ngayNhapKho = new NgayThang();
    @Override
    protected String danhGiaMucDoBan() {
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        d = c.getTime();
        c.set(ngayNhapKho.getNam(), ngayNhapKho.getThang(),ngayNhapKho.getNgay());
        c.roll(Calendar.DAY_OF_MONTH,10);
        if(slgTon > 50 && d.compareTo(c.getTime())>0)
            return "Ban cham";
        return "Binh thuong";
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap nam SX: ");
        nsx = sc.nextLine();
        System.out.println("Ngay nhap kho: ");
        ngayNhapKho.nhap();
        ghiChu = danhGiaMucDoBan();
        VAT = 0.1F;
    }
    public static void inTieuDe(){
        HangHoa.inTieuDe();
        System.out.printf("%15s %10s %15s %n","NamSX","NgayNhap", "GhiChu");
    }
    @Override
    public void inDuLieu(){
        super.inDuLieu();
        System.out.printf("%15s %10s %15s %n",nsx, ngayNhapKho , ghiChu);
    }
}
