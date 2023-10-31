package abc;

import java.util.Scanner;

public class QLSieuThiDemo {

    static HangHoa dsHang[];
    static int n;
    static void nhapHang(){
        int chon, i = 0, j ;
        System.out.println("Nhap so luong hang trong sieu thi: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dsHang = new HangHoa[n];

        do{
            System.out.println("Loai san pham: \n1 - Dien May\n2- Sanh su\n3 - Thuc Pham");
            chon = sc.nextInt();
            HangHoa h;
            if(chon == 1)
                h = new HangDienMay();
            else if(chon == 2)
                h = new HangSanhSu();
            else if(chon ==3)
                h = new HangThucPham();
            else h = new HangHoa() {
                    @Override
                    protected String danhGiaMucDoBan() {
                        return null;
                    }
                } ;
            h.nhap();
            for(j = 0; j< i; j++){
                if(h.getMaHang().equalsIgnoreCase(dsHang[j].getMaHang())){
                    System.out.println("Mat Hang da ton tai!");
                    break;
                }

            }
            if(i==j){
                dsHang[i] = h;
                i = i+ 1;
            }
        }while(i < n);
    }
    static void inDSHang(){
        System.out.println("Danh sach hang sanh su: ");
        HangSanhSu.inTieuDe();
        for(HangHoa h : dsHang){
            if(h instanceof HangSanhSu)
                h.inDuLieu();
        }
        System.out.println("Danh sach hang Thuc Pham: ");
        HangThucPham.inTieuDe();
        for(HangHoa h : dsHang){
            if(h instanceof HangThucPham)
                h.inDuLieu();
        }
        System.out.println("Danh sach hang Dien May: ");
        HangDienMay.inTieuDe();
        for(HangHoa h : dsHang){
            if(h instanceof HangDienMay)
                h.inDuLieu();
        }
    }
    public static void main(String[] args){
        nhapHang();
        inDSHang();
    }
}
