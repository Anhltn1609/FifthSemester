import java.util.Scanner;

public class KhachHang {
    private String ten;
    private String diaChi;

    public KhachHang() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        ten =  sc.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi = sc.nextLine();

    }
}
