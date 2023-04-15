package Baitapvenha;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
            TuyenSinh tuyenSinh = new TuyenSinh();
            ArrayList<ThiSinh> list = new ArrayList<>();
            tuyenSinh.themThiSinh(list, new KhoiA("A001", "Nguyen Van A", "Ha Noi", "Loai1", 1, 8.0, 7.5, 9.0));
            tuyenSinh.themThiSinh(list, new KhoiA("A002", "Nguyen Van A2", "Ha Noi", "Loai2", 3, 8.0, 7.5, 9.0));
            tuyenSinh.themThiSinh(list,new KhoiB("B001", "Nguyen Van B", "Hai Phong,","Loai1", 2, 9.0, 8.5, 7.0));
            tuyenSinh.themThiSinh(list,new KhoiB("B002", "Nguyen Van B2", "Hai Phong,","Loai2", 3, 9.0, 8.5, 7.0));
            tuyenSinh.themThiSinh(list,new KhoiC("C001", "Tran Thi C", "Da Nang","Loai1", 3, 7.0, 8.0, 9.5));
            tuyenSinh.themThiSinh(list,new KhoiC("C002", "Tran Thi C2", "Da Nang","Loai2", 4, 7.0, 8.0, 9.5));
            
            ThiSinh thiSinh = tuyenSinh.timKiemTheoSoBaoDanh(list,"B001");
            System.out.println("Tim thi sinh theo so bao danh:");
            if (thiSinh != null) {
                tuyenSinh.hienThiThongTin(thiSinh);
            }
            
            tuyenSinh.timThiSinhDiemCaoNhat(list);
        }
    }
