package com.example.TinhToan.TinhToan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTinhtoan {

    TinhToanService service = new TinhToanService();

    @Test
    public void tinhHieu() {
        assertEquals(40, service.tinhHieu(50, 10));
        assertEquals(5, service.tinhHieu(15, 10));
        assertEquals(15, service.tinhHieu(35, 20));
        assertEquals(13, service.tinhHieu(23, 10));
        assertEquals(10, service.tinhHieu(53, 43));
    }

    @Test
    public void tinhThuong() {
        assertEquals(10, service.tinhThuong(100, 10));
        assertEquals(3, service.tinhThuong(9, 3));
        assertEquals(10, service.tinhThuong(70, 7));
        assertEquals(2, service.tinhThuong(6, 3));
        assertEquals(5, service.tinhThuong(10, 2));
    }

    @Test
    public void tinhTich() {
        assertEquals(100, service.tinhTich(10, 10));
        assertEquals(90, service.tinhTich(9, 10));
        assertEquals(60, service.tinhTich(6, 10));
        assertEquals(40, service.tinhTich(4, 10));
        assertEquals(50, service.tinhTich(5, 10));
    }

    @Test
    public void tinhTong() {
        assertEquals(20, service.tinhTong(10, 10));
        assertEquals(19, service.tinhTong(9, 10));
        assertEquals(16, service.tinhTong(6, 10));
        assertEquals(14, service.tinhTong(4, 10));
        assertEquals(15, service.tinhTong(5, 10));
    }

    @Test
    public void tinhTBC() {
        assertEquals(20, service.tinhTBC(30, 60,-30));
        assertEquals(9, service.tinhTBC(9, 10,8));
        assertEquals(5, service.tinhTBC(6, 2,7));
        assertEquals(8, service.tinhTBC(5, 10,9));
        assertEquals(7, service.tinhTBC(5, 10,6));
    }

    @Test
    public void timViTri() {
        int[] mang = {1, 2, 3, 4, 5,6,7,8,9,10};
        assertEquals(2, service.timViTri(mang, 3));
        assertEquals(5, service.timViTri(mang, 6));
        assertEquals(-1, service.timViTri(mang, 11));
        assertEquals(6, service.timViTri(mang, 7));
        assertEquals(3, service.timViTri(mang, 4));
    }

    @Test
    public void tinhTongn() {
        int[] mang = {1, 2, 3, 4, 5};
        assertEquals(15, service.tinhTongn(mang));

        int[] mangRong = {};
        assertEquals(0, service.tinhTongn(mangRong));

        int[] mang1 = {1, 2, 3, 4, 5,6};
        assertEquals(21, service.tinhTongn(mang1));

        int[] mang2 = {1, 2, 3, 4,};
        assertEquals(10, service.tinhTongn(mang2));

        int[] mang3 = {15, 30, 20, 10, 5};
        assertEquals(80, service.tinhTongn(mang3));
    }


    @Test
    public void tinhTongSoLe() {
        int[] mang1 = {1, 2, 3, 4, 5};
        assertEquals(9, service.tinhTongSoLe(mang1));

        int[] mang2 = {2, 4, 6};
        assertEquals(0, service.tinhTongSoLe(mang2));

        int[] mang3 = {};
        assertEquals(0, service.tinhTongSoLe(mang3));

        int[] mang4 = {5,6,7,8,9};
        assertEquals(21, service.tinhTongSoLe(mang4));

        int[] mang5 = {3,4,5,6,7,8,9};
        assertEquals(24, service.tinhTongSoLe(mang5));
    }
}
