package com.skripsi.IRSValidate.pubsub.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DaftarKelasTerdaftarSchema {
    @JsonProperty("idKelas")
    private Integer idKelas;

    @JsonProperty("idMatakuliah")
    private Integer idMatakuliah;

    @JsonProperty("namaMatakuliah")
    private String namaMatakuliah;

    @JsonProperty("sksMatakuliah")
    private Integer sksMatakuliah;

    @JsonProperty("idJadwalKelas")
    private Integer idJadwal;

    @JsonProperty("termKelas")
    private Integer term;

    public DaftarKelasTerdaftarSchema() {
    }

    public DaftarKelasTerdaftarSchema(Integer idKelas, Integer idMatakuliah, String namaMatakuliah, Integer sksMatakuliah, Integer idJadwal, Integer term) {
        this.idKelas = idKelas;
        this.idMatakuliah = idMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.sksMatakuliah = sksMatakuliah;
        this.idJadwal = idJadwal;
        this.term = term;
    }

    public Integer getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(Integer idKelas) {
        this.idKelas = idKelas;
    }

    public Integer getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(Integer idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public Integer getSksMatakuliah() {
        return sksMatakuliah;
    }

    public void setSksMatakuliah(Integer sksMatakuliah) {
        this.sksMatakuliah = sksMatakuliah;
    }

    public Integer getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}
