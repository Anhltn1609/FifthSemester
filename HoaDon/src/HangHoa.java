import java.util.Scanner;

public class HangHoa {
    private String ten;
    private long donGia;
    private int soLuong;

    public HangHoa() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang hoa: ");
        ten = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextLong();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();
    }

    public static void inTieuDe(){
        System.out.printf("%15s %15s %15s %15s %n","Ten hang", "Đơn giá", "Số lượng", "Thành tiền");
    }

    public void xuat(){
        System.out.printf("%15s %15s %15s %15s %n",ten, donGia, soLuong, thanhTien());
    }

    public long thanhTien() {
        return donGia*soLuong;
    }

}
