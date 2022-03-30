package com.skripsi.dataAccess.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateKelasReq {
    @JsonProperty("idMatkul")
    private Integer idMatkul;

    @JsonProperty("jadwal")
    private Integer jadwal;

    @JsonProperty("term")
    private Integer term;

    public CreateKelasReq() {
    }

    public CreateKelasReq(Integer idMatkul, Integer jadwal, Integer term) {
        this.idMatkul = idMatkul;
        this.jadwal = jadwal;
        this.term = term;
    }

    public Integer getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(Integer idMatkul) {
        this.idMatkul = idMatkul;
    }

    public Integer getJadwal() {
        return jadwal;
    }

    public void setJadwal(Integer jadwal) {
        this.jadwal = jadwal;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}
