package com.skripsi.dataAccess.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "mahasiswa")
public class MahasiswaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String nama;

    @NotNull
    private Integer npm;

    @NotNull
    private Float ipk;

    @NotNull
    private Integer term;

    @NotNull
    private Integer jumlahSKSLulus;

    public MahasiswaModel() {
    }

    public MahasiswaModel(String nama, Integer npm, Float ipk, Integer term, Integer jumlahSKSLulus) {
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
        this.term = term;
        this.jumlahSKSLulus = jumlahSKSLulus;
    }

    public MahasiswaModel(Integer id, String nama, Integer npm, Float ipk, Integer term, Integer jumlahSKSLulus) {
        this.id = id;
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
        this.term = term;
        this.jumlahSKSLulus = jumlahSKSLulus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getNpm() {
        return npm;
    }

    public void setNpm(Integer npm) {
        this.npm = npm;
    }

    public Float getIpk() {
        return ipk;
    }

    public void setIpk(Float ipk) {
        this.ipk = ipk;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getJumlahSKSLulus() {
        return jumlahSKSLulus;
    }

    public void setJumlahSKSLulus(Integer jumlahSKSLulus) {
        this.jumlahSKSLulus = jumlahSKSLulus;
    }
}
