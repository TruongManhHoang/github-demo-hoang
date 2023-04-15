package Baitapvenha;

public class KhoiB extends ThiSinh {
    private double toan;
    private double hoa;
    private double sinh;

    public KhoiB() {
    }

    public KhoiB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien,float diemThi,Double toan, Double hoa, Double sinh) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien, diemThi);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public double getToan() {
        return this.toan;
    }

    public void setToan(Double toan) {
        this.toan = toan;
    }

    public double getHoa() {
        return this.hoa;
    }

    public void setHoa(Double hoa) {
        this.hoa = hoa;
    }

    public double getSinh() {
        return this.sinh;
    }

    public void setSinh(Double sinh) {
        this.sinh = sinh;
    }
    public void nhapThiSinhKhoiB(){
        super.nhapThiSinh();
        System.out.println("Diem mon toan: ");
        this.toan = sc.nextFloat();
        System.out.println("Diem mon hoa: ");
        this.hoa = sc.nextFloat();
        System.out.println("Diem mon sinh: ");
        this.sinh = sc.nextFloat();
    }

    public void inThongTin(){
        super.inThongTin();
        System.out.println("Toan: " + this.toan);
        System.out.println("Hoa: " + this.hoa);
        System.out.println("Sinh: " + this.sinh);
}

    @Override
    public String layKhoiThi() {
       return "B";
    }
}
