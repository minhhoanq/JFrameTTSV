/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7bai1_2_3;

/**
 *
 * @author Minh Hoanfg
 */
public class SinhVien {
    private String name;
    private double diem;
    private String nganh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public String getGrade(){
        if(diem < 3){
            return "Kém";
        }
        if(diem < 5){
            return "Yếu";
        }
        if(diem < 6.5){
            return "Trung bình";
        }
        if(diem < 7.5){
            return "Khá";
        }
        if(diem < 9){
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    public boolean isBonus(){
        return this.diem >= 7.5;
    }
}
