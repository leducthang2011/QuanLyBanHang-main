package com.example.quanlybanhang.Entity;

public class CTHoaDon {
    private int id;
    private int idHoaDon;
    private String tenSP;
    private int giaBan;
    private int soLuong;
    private int thanhTien;

    public CTHoaDon(int id, int idHoaDon, String tenSP, int giaBan, int soLuong) {
        this.id = id;
        this.idHoaDon = idHoaDon;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return giaBan * soLuong;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = giaBan * soLuong;
    }

    @Override
    public String toString() {
        return String.format(" Tên sản phẩm: %s \n Giá bán: %s VNĐ \n Số lượng: %s \n Thành Tiền: %s VNĐ", tenSP, giaBan, soLuong, getThanhTien());
    }
}
