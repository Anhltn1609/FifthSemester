import java.util.Scanner;

public class HoaDon {
    private String id;
    private String ngayBan;

    private KhachHang khachHang;
    private int n;
    private HangHoa[] hangHoas;

    public HoaDon() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public HangHoa[] getHangHoas() {
        return hangHoas;
    }

    public void setHangHoas(HangHoa[] hangHoas) {
        this.hangHoas = hangHoas;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoa don: ");
        System.out.println("Nhap ma hoa don: ");
        id = sc.nextLine();
        System.out.println("Nhap ngay ban(xx/yy/zzzz): ");
        ngayBan = sc.nextLine();
        khachHang = new KhachHang();
        khachHang.nhap();
        System.out.println("So hang hoa trong don: ");
        n = sc.nextInt();
        hangHoas = new HangHoa[n];
        for(int i =0; i<n; i++){
            HangHoa hangHoa = new HangHoa();
            hangHoa.nhap();
            hangHoas[i] = hangHoa;
        }
    }

    public void xuat(){
        System.out.println("=================================Hoa Don=====================================");
        System.out.printf("%20s %20s %n", "Mã HĐ: "+ id , "Ngày bán: " + ngayBan);
        System.out.printf("%20s %20s %n", "Khach hang: "+ khachHang.getTen() , "Địa chỉ: " + khachHang.getDiaChi());
        long thanhTien = 0;
        long soluongTong = 0;
        HangHoa.inTieuDe();
        for(HangHoa hangHoa : hangHoas){
            soluongTong += hangHoa.getSoLuong();
            thanhTien += hangHoa.thanhTien();
            hangHoa.xuat();
        }
        System.out.printf("%15s %30d %20d %n", "Tong tien", soluongTong, thanhTien);
    }
}
