package com.skripsi.dataAccess.pubsub.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ValidateIRSSchema {
    @JsonProperty("idMahasiswa")
    private Integer idMahasiswa;

    @JsonProperty("nama")
    private String nama;

    @JsonProperty("npm")
    private Integer npm;

    @JsonProperty("ipk")
    private Float ipk;

    @JsonProperty("term")
    private Integer term;

    @JsonProperty("jumlahLulusSKS")
    private Integer jumlahLulusSKS;

    @JsonProperty("daftarKelasTerdaftar")
    private List<DaftarKelasTerdaftarSchema> daftarKelasTerdaftar;

    public ValidateIRSSchema() {
    }

    public ValidateIRSSchema(Integer idMahasiswa, String nama, Integer npm, Float ipk, Integer term, Integer jumlahLulusSKS, List<DaftarKelasTerdaftarSchema> daftarKelasTerdaftar) {
        this.idMahasiswa = idMahasiswa;
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
        this.term = term;
        this.jumlahLulusSKS = jumlahLulusSKS;
        this.daftarKelasTerdaftar = daftarKelasTerdaftar;
    }

    public Integer getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(Integer idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
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

    public Integer getJumlahLulusSKS() {
        return jumlahLulusSKS;
    }

    public void setJumlahLulusSKS(Integer jumlahLulusSKS) {
        this.jumlahLulusSKS = jumlahLulusSKS;
    }

    public List<DaftarKelasTerdaftarSchema> getDaftarKelasTerdaftar() {
        return daftarKelasTerdaftar;
    }

    public void setDaftarKelasTerdaftar(List<DaftarKelasTerdaftarSchema> daftarKelasTerdaftar) {
        this.daftarKelasTerdaftar = daftarKelasTerdaftar;
    }
}
