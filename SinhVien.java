
import java.text.Format;

public class SinhVien {
    private String hoTen;
    private int namSinh;
    private float diemTB;

    public SinhVien() {

    }

    public SinhVien(String hoTen, int namSinh, float diemTB) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Diem trung binh: " + this.namSinh);
    }

    public String tinhDiemTB() {
        if (this.diemTB >= 3.2 && this.diemTB <= 3.5)
            return "Gioi";
        if (this.diemTB >= 2.5 && this.diemTB < 3.2) {
            return "Kha";
        }
        if (this.diemTB >= 2.0 && this.diemTB <= 2.5) {
            return "Yeu";
        } else {
            return "kem";
        }
    }

    public String toString() {
        return String.format("%15s%7d%12f", hoTen, namSinh, diemTB);
    }
}
