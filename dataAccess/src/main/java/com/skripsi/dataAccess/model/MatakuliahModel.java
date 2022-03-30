package com.skripsi.dataAccess.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "matakuliah")
public class MatakuliahModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String nama;

    @NotNull
    private Integer sks;

    @OneToMany(mappedBy = "matakuliah", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<KelasModel> listKelas;


    public MatakuliahModel() {
    }

    public MatakuliahModel(String nama, Integer sks) {
        this.nama = nama;
        this.sks = sks;
    }

    public MatakuliahModel(Integer id, String nama, Integer sks) {
        this.id = id;
        this.nama = nama;
        this.sks = sks;
    }

    public MatakuliahModel(Integer id, String nama, Integer sks, List<KelasModel> listKelas) {
        this.id = id;
        this.nama = nama;
        this.sks = sks;
        this.listKelas = listKelas;
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

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public List<KelasModel> getListKelas() {
        return listKelas;
    }

    public void setListKelas(List<KelasModel> listKelas) {
        this.listKelas = listKelas;
    }
}
