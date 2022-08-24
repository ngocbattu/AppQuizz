package com.example.myapplication.Model;

import java.util.List;

public class CauHoiDapAn {
    private int idSoCauHoi;
    private String tenCauHoi;
    private List<CheckDapAn> list;

    public CauHoiDapAn() {
    }

    public CauHoiDapAn(int idSoCauHoi, String tenCauHoi, List<CheckDapAn> list) {
        this.idSoCauHoi = idSoCauHoi;
        this.tenCauHoi = tenCauHoi;
        this.list = list;
    }

    public int getIdSoCauHoi() {
        return idSoCauHoi;
    }

    public void setIdSoCauHoi(int idSoCauHoi) {
        this.idSoCauHoi = idSoCauHoi;
    }

    public String getTenCauHoi() {
        return tenCauHoi;
    }

    public void setTenCauHoi(String tenCauHoi) {
        this.tenCauHoi = tenCauHoi;
    }

    public List<CheckDapAn> getList() {
        return list;
    }

    public void setList(List<CheckDapAn> list) {
        this.list = list;
    }
}
