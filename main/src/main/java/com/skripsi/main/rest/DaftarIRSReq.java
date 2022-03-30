package com.skripsi.main.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DaftarIRSReq {
    @JsonProperty("npm")
    private Integer npm;

    @JsonProperty("idKelas")
    private List<Integer> idKelas;

    public DaftarIRSReq() {
    }

    public DaftarIRSReq(Integer npm, List<Integer> idKelas) {
        this.npm = npm;
        this.idKelas = idKelas;
    }

    public Integer getNpm() {
        return npm;
    }

    public void setNpm(Integer npm) {
        this.npm = npm;
    }

    public List<Integer> getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(List<Integer> idKelas) {
        this.idKelas = idKelas;
    }
}
