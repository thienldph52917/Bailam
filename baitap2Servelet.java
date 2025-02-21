package com.example.TinhToan.KTthu;

import java.util.ArrayList;
import java.util.List;

public class baitap2Servelet {
    private List<baitap2> list = new ArrayList<>();
    public void xoaTheoMa(String ma){
        // Kiểm tra nếu mã null hoặc rỗng (chỉ chứa khoảng trắng)
        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã bài hát không được rỗng hoặc null.");
        }
        boolean remove = list.removeIf(sp -> sp.getMa().equalsIgnoreCase(ma));;
        if(!remove){
            throw new IllegalArgumentException("Khong tim thay ma bai hat");
        }
    }
    public List<baitap2> getAll(){
        return list;
    }
}
