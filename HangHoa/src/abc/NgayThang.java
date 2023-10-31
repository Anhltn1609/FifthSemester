package abc;

import java.util.Scanner;

public class NgayThang {

    private int ngay;
    private int thang;
    private int nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhap(){
         Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap ngay: ");
            ngay = sc.nextInt();
        }while(ngay < 0 || ngay > 31);
        do{
            System.out.println("Nhap thang: ");

            thang = sc.nextInt();
        }while(thang < 1 || thang > 12);
        do {
            System.out.println("Nhap nam: ");
            nam = sc.nextInt();
        }while(nam < 2000);
    }



    @Override
    public String toString() {
        return ngay + "/"+ thang + "/" + nam;
    }
}
