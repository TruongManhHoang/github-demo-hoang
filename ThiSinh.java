package Baitapvenha;

import java.util.Scanner;

public abstract class ThiSinh {
    Scanner sc = new Scanner(System.in);
    private String sbd;
    private String hoTen;
    private String diaChi;
    private String mucUuTien;
    private float diemThi;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String hoTen, String diaChi, String mucUuTien, float diemThi) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.diemThi = diemThi;
    }
    public abstract String layKhoiThi();
    public String laySoBaoDanh() {
        return sbd;
    }

    public String getSbd() {
        return this.sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMucUuTien() {
        return this.mucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public float getDiemThi() {
        return this.diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    
    public void nhapThiSinh(){
        System.out.print("So bao danh: ");
        this.sbd = sc.nextLine();
        System.out.print("Ho va ten: ");
        this.hoTen = sc.nextLine();
        System.out.println();
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.println();
        System.out.print("Muc uu tien: ");
        this.mucUuTien = sc.nextLine();
        System.out.println();
        System.out.print("Diem Thi: ");
        this.diemThi = sc.nextFloat();
    }
    public void inThongTin(){
        System.out.println("So bao danh: " + this.sbd);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Khu vuc uu tien: " + this.mucUuTien);
    }
}
