package Bai1;

import java.util.Scanner;

public class BaiMang {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri cho n:");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max = " + max);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int tam = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
                }
            }
        }
        System.out.print("\nThu tu tang dan cua mang la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
