package abc;

import java.util.Scanner;

public class HangDienMay extends HangHoa {
    private int tgBaoHanh;
    private int congSuat;

    public int getTgBaoHanh() {
        return tgBaoHanh;
    }

    public void setTgBaoHanh(int tgBaoHanh) {
        this.tgBaoHanh = tgBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public HangDienMay() {
    }

    @Override
    public void inDuLieu() {
        super.inDuLieu();
        System.out.printf("%15s%15s%15s %n",tgBaoHanh, congSuat, danhGiaMucDoBan());

    }
    public static void inTieuDe(){
        HangHoa.inTieuDe();
        System.out.printf("%15s%15s%15s %n","TG bao hanh", "CongSuat", "Ghi Chu");
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap thoi gian bao hanh: ");
        tgBaoHanh = sc.nextInt();
        System.out.println("Nhap cong suat cua may: ");
        congSuat = sc.nextInt();
        VAT = 0.1F;
    }

    @Override
    protected String danhGiaMucDoBan() {
        if(slgTon < 3)
            return "Ban duoc";
        return "Khong ban duoc";
    }
}
