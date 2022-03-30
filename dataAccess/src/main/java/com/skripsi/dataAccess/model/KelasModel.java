package com.skripsi.dataAccess.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Entity
@Table(name = "kelas")
public class KelasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_matakuliah", referencedColumnName = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MatakuliahModel matakuliah;

    @NotNull
    private Integer idJadwal;

    @NotNull
    private Integer term;

    public KelasModel() {
    }

    public KelasModel(MatakuliahModel matakuliah, Integer idJadwal, Integer term) {
        this.matakuliah = matakuliah;
        this.idJadwal = idJadwal;
        this.term = term;
    }

    public KelasModel(Integer id, MatakuliahModel matakuliah, Integer idJadwal, Integer term) {
        this.id = id;
        this.matakuliah = matakuliah;
        this.idJadwal = idJadwal;
        this.term = term;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MatakuliahModel getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MatakuliahModel matakuliah) {
        this.matakuliah = matakuliah;
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
