package Baitapvenha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh{

    public ThiSinh timKiemTheoSoBaoDanh( ArrayList<ThiSinh> list,String sbd) {
        for (ThiSinh thiSinh : list) {
            if (thiSinh.laySoBaoDanh().equals(sbd)) {
                return thiSinh;
            }
        }
        return null;
    }
    public void themThiSinh(ArrayList<ThiSinh> list,ThiSinh thiSinh) {
        list.add(thiSinh);
    }
    public void hienThiThongTin(ThiSinh thiSinh) {
        System.out.println("So bao danh: " + thiSinh.laySoBaoDanh());
        System.out.println("Ho ten: " + thiSinh.getHoTen());
        System.out.println("Dia chi: " + thiSinh.getDiaChi());
        System.out.println("Muc uu tien: " + thiSinh.getMucUuTien());
        System.out.println("Khoi thi: " + thiSinh.layKhoiThi());
        System.out.println("Diem thi: " + thiSinh.getDiemThi());
    }
    public void timThiSinhDiemCaoNhat(ArrayList<ThiSinh> list) {
        double diemCaoNhatKhoiA = 0;
        double diemCaoNhatKhoiB = 0;
        double diemCaoNhatKhoiC = 0;
        ThiSinh thiSinhKhoiA = null;
        ThiSinh thiSinhKhoiB = null;
        ThiSinh thiSinhKhoiC = null;
    
        for (ThiSinh thiSinh : list) {
            if (thiSinh instanceof KhoiA) {
                if (thiSinh.getDiemThi() > diemCaoNhatKhoiA) {
                    diemCaoNhatKhoiA = thiSinh.getDiemThi();
                    thiSinhKhoiA = thiSinh;
                }
            } else if (thiSinh instanceof KhoiB) {
                if (thiSinh.getDiemThi() > diemCaoNhatKhoiB) {
                    diemCaoNhatKhoiB = thiSinh.getDiemThi();
                    thiSinhKhoiB = thiSinh;
                }
            } else if (thiSinh instanceof KhoiC) {
                if (thiSinh.getDiemThi() > diemCaoNhatKhoiC) {
                    diemCaoNhatKhoiC = thiSinh.getDiemThi();
                    thiSinhKhoiC = thiSinh;
                }
            }
        }
        
            System.out.println("--------------------------------");
            System.out.println("Thi sinh khoi A co diem cao nhat la:");
            hienThiThongTin(thiSinhKhoiA);
        
            System.out.println("-----------------------------------");
            System.out.println("Thi sinh khoi B co diem cao nhat la:");
            hienThiThongTin(thiSinhKhoiB);
        
            System.out.println("-----------------------------------------");
            System.out.println("Thi sinh khoi C co diem cao nhat la:");
            hienThiThongTin(thiSinhKhoiC);
    }
}
