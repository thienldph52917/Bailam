package com.example.TinhToan.TinhToan;

public class TinhToanService {

    public static int tinhThuong(int a, int b) {
        return a / b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich (int a, int b) {
        return a * b;
    }

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhTBC(int a, int b, int c) {
        return (a + b + c)/3;
    }

    public static int timViTri(int[] mang, int giaTri) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == giaTri) {
                return i;
            }
        }
        return -1;
    }

    public static int tinhTongn(int[] mang) {
        int tong = 0;
        for (int so : mang) {
            tong += so;
        }
        return tong;
    }

    public int tinhTongSoLe(int[] mang) {
        int tong = 0;
        for (int so : mang) {
            if (so % 2 != 0) {
                tong += so;
            }
        }
        return tong;
    }
}
