package com.skripsi.dataAccess.service;

import com.skripsi.dataAccess.model.KelasModel;
import com.skripsi.dataAccess.model.MahasiswaModel;
import com.skripsi.dataAccess.model.MatakuliahModel;
import com.skripsi.dataAccess.repository.KelasDb;
import com.skripsi.dataAccess.repository.MahasiswaDb;
import com.skripsi.dataAccess.repository.MatakuliahDb;
import com.skripsi.dataAccess.rest.request.CreateKelasReq;
import com.skripsi.dataAccess.rest.request.CreateMahasiswaReq;
import com.skripsi.dataAccess.rest.request.CreateMatakuliahReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CreateDataServiceImpl implements CreateDataService{
    @Autowired
    private MatakuliahDb matakuliahDb;

    @Autowired
    private KelasDb kelasDb;

    @Autowired
    private MahasiswaDb mahasiswaDb;


    @Override
    public String createMatakuliah(CreateMatakuliahReq createMatakuliahReq) {
        try {
            MatakuliahModel matakuliahModel = new MatakuliahModel(createMatakuliahReq.getNama(), createMatakuliahReq.getSks());
            matakuliahDb.save(matakuliahModel);
            return "berhasil";
        } catch (Exception e){
            return "gagal : "+e.getMessage();
        }
    }

    @Override
    public String createKelas(CreateKelasReq createKelasReq) {
        try {
            Optional<MatakuliahModel> matakuliahModel = matakuliahDb.findById(createKelasReq.getIdMatkul().longValue());
            System.out.println(matakuliahModel.get().getNama());
            KelasModel kelasModel = new KelasModel(matakuliahModel.get(), createKelasReq.getJadwal(), createKelasReq.getTerm());
            kelasDb.save(kelasModel);
            return "berhasil";
        } catch (Exception e){
            return "gagal : "+e.getMessage();
        }
    }

    @Override
    public String createMahasiswa(CreateMahasiswaReq createMahasiswaReq) {
        try {
            MahasiswaModel mahasiswaModel = new MahasiswaModel(createMahasiswaReq.getNama(), createMahasiswaReq.getNpm(), createMahasiswaReq.getIpk(), createMahasiswaReq.getTerm(), createMahasiswaReq.getJumlahSKSLulus());
            mahasiswaDb.save(mahasiswaModel);
            return "berhasil";
        }catch (Exception e){
            return "gagal : "+e.getMessage();
        }
    }
}
