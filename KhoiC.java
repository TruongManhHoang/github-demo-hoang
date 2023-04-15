package Baitapvenha;

public class KhoiC extends ThiSinh {
    
    private double van;
    private double su;
    private double dia;

    public KhoiC(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, float diemThi, Double van, Double su, Double dia) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien, diemThi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public KhoiC() {
    }


    public double getVan() {
        return this.van;
    }

    public void setVan(Double van) {
        this.van = van;
    }

    public double getSu() {
        return this.su;
    }

    public void setSu(Double su) {
        this.su = su;
    }

    public double getDia() {
        return this.dia;
    }

    public void setDia(Double dia) {
        this.dia = dia;
    }

    public void nhapThiSinhKhoiB(){
        super.nhapThiSinh();
        System.out.println("Diem mon van: ");
        this.van = sc.nextFloat();
        System.out.println("Diem mon su: ");
        this.su = sc.nextFloat();
        System.out.println("Diem mon dia: ");
        this.dia = sc.nextFloat();
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.println("Van: " + this.van);
        System.out.println("Su: " + this.su);
        System.out.println("Dia: " + this.dia);
}

    @Override
    public String layKhoiThi() {
        return "C";
    }
}
