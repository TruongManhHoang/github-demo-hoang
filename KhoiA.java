package Baitapvenha;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private double toan;
    private double ly;
    private double hoa;

    Scanner sc = new Scanner(System.in);


    public KhoiA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien,float diemThi,Double toan, Double ly, Double hoa) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien, diemThi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
   
    public KhoiA() {
    }


    public double getToan() {
        return this.toan;
    }

    public void setToan(Double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return this.ly;
    }

    public void setLy(Double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return this.hoa;
    }

    public void setHoa(Double hoa) {
        this.hoa = hoa;
    }



    public void nhapThiSinhKhoiA(){
        super.nhapThiSinh();
        System.out.println("Diem mon toan: ");
        this.toan = sc.nextFloat();
        System.out.println("Diem mon ly: ");
        this.ly = sc.nextFloat();
        System.out.println("Diem mon hoa: ");
        this.hoa = sc.nextFloat();
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.println("Toan: " + this.toan);
        System.out.println("Ly: " + this.ly);
        System.out.println("Hoa: " + this.hoa);
}

    @Override
    public String layKhoiThi() {
       return "A";
    }
}
