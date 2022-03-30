package com.skripsi.main.pubsub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RencanaStudiSchema {
    @JsonProperty("npm")
    private Integer npm;

    @JsonProperty("idKelas")
    private List<Integer> idKelas;

    public RencanaStudiSchema() {
    }

    public RencanaStudiSchema(Integer npm, List<Integer> idKelas) {
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
