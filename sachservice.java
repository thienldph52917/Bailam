package com.example.ttph52917.TT;

public class sachservice {
    public void SuaTT(sach s,String tenSach, String tacGia, Integer namXuatBan, Float gia){
        if (s != null){
            s.setTenSach(tenSach);
            s.setTacGia(tacGia);
            s.setNamXuatBan(namXuatBan);
            s.setGia(gia);
        }
    }

    public static int hient(int [] arr){
        if (arr == null||arr.length==0){
            return 0;
        }
        int num = 0;
        for (int so : arr){
            if (so % 5 ==0){
                num = so;
            }
        }
        return num;
    }
}
