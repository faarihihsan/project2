package com.skripsi.dataAccess.service;

import com.skripsi.dataAccess.rest.request.CreateKelasReq;
import com.skripsi.dataAccess.rest.request.CreateMahasiswaReq;
import com.skripsi.dataAccess.rest.request.CreateMatakuliahReq;

public interface CreateDataService {
    String createMatakuliah(CreateMatakuliahReq createMatakuliahReq);
    String createKelas(CreateKelasReq createKelasReq);
    String createMahasiswa(CreateMahasiswaReq createMahasiswaReq);
}
