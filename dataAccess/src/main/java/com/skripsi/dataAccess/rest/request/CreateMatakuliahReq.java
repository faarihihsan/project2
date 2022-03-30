package com.skripsi.dataAccess.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateMatakuliahReq {
    @JsonProperty("nama")
    private String nama;

    @JsonProperty("sks")
    private Integer sks;

    public CreateMatakuliahReq() {
    }

    public CreateMatakuliahReq(String nama, Integer sks) {
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
}
