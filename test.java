package com.example.ttph52917.TT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class test {
    sachservice service = new sachservice();
    @Test
    public void testsua(){
        sach s = new sach("S001","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien","Nguyen Thi C",2025,5.5f);

        assertEquals("Thanh nien",s.getTenSach());
        assertEquals("Nguyen Thi C",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua2(){
        sach s = new sach("S002","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien2","Le Van Nam",2025,5.5f);

        assertEquals("Thanh nien2",s.getTenSach());
        assertEquals("Le Van Nam",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua3(){
        sach s = new sach("S003","Thieu nhi","Nguyen Van A",2024,8.5f);
        sachservice service = new sachservice();
        service.SuaTT(s,"Thanh nien3","Nguyen A",2025,5.5f);

        assertEquals("Thanh nien3",s.getTenSach());
        assertEquals("Nguyen A",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua4(){
        sach s = new sach("S004","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien4","Tran Van C",2025,5.5f);

        assertEquals("Thanh nien4",s.getTenSach());
        assertEquals("Tran Van C",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua5(){
        sach s = new sach("S005","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien5","Tran Thi D",2025,5.5f);

        assertEquals("Thanh nien5",s.getTenSach());
        assertEquals("Tran Thi D",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }
//
//    @Test
//    public void HT(){
//        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        assertEquals(,sachservice.hient(arr));
//    }
}
