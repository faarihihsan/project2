package com.skripsi.dataAccess.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateMahasiswaReq {
    @JsonProperty("nama")
    private String nama;

    @JsonProperty("npm")
    private Integer npm;

    @JsonProperty("ipk")
    private Float ipk;

    @JsonProperty("term")
    private Integer term;

    @JsonProperty("jumlahSKSLulus")
    private Integer jumlahSKSLulus;

    public CreateMahasiswaReq() {
    }

    public CreateMahasiswaReq(String nama, Integer npm, Float ipk, Integer term, Integer jumlahSKSLulus) {
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
        this.term = term;
        this.jumlahSKSLulus = jumlahSKSLulus;
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
