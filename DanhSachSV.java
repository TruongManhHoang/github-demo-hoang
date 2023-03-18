
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSV {
    public static void main(String[] args) {
        // SinhVien sinhvien0 = new SinhVien("Nguyen Van A", 2003, 3.5f);
        // SinhVien sinhvien1 = new SinhVien("Nguyen Van B", 2003, 2.5f);
        // SinhVien sinhvien2 = new SinhVien("Nguyen Van C", 2003, 2.3f);
        // SinhVien sinhvien3 = new SinhVien("Nguyen Van D", 2003, 2f);
        // SinhVien sinhvien4 = new SinhVien("Nguyen Van E", 2003, 2.7f);

        // ArrayList<SinhVien> list = new ArrayList<>();
        // list.add(sinhvien0);
        // list.add(sinhvien1);
        // list.add(sinhvien2);
        // list.add(sinhvien3);
        // list.add(sinhvien4);
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap gia tri cho n: ");
            n = sc.nextInt();
        } while (n <= 0);
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.nhapThongTin();
            list.add(sv);
        }
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
        System.out.println("------------------------------------");
        for (SinhVien sinhVien : list) {
            if (sinhVien.tinhDiemTB().equals("Gioi") || sinhVien.tinhDiemTB().equals("Kha")) {
                System.out.println(sinhVien);
            }
        }

        System.out.println("--------------------------------------");
        Collections.sort(list, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o2.getDiemTB() > o1.getDiemTB()) {
                    return 1;
                } else if (o2.getDiemTB() < o1.getDiemTB()) {
                    return -1;
                } else
                    return 0;
            }

        });
        for (SinhVien sinhvien : list) {
            System.out.println(sinhvien);
        }

    }
}
