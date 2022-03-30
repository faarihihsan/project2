package com.skripsi.dataAccess.controller;

import com.skripsi.dataAccess.rest.request.CreateKelasReq;
import com.skripsi.dataAccess.rest.request.CreateMahasiswaReq;
import com.skripsi.dataAccess.rest.request.CreateMatakuliahReq;
import com.skripsi.dataAccess.service.CreateDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateDataController {
    @Autowired
    private CreateDataService createDataService;

    @PostMapping(value = "/add-matakuliah")
    public String createMatakuliah(@RequestBody CreateMatakuliahReq createMatakuliahReq){
        return createDataService.createMatakuliah(createMatakuliahReq);
    }

    @PostMapping(value = "/add-kelas")
    public String createKelas(@RequestBody CreateKelasReq createKelasReq){
        return createDataService.createKelas(createKelasReq);
    }

    @PostMapping(value = "/add-mahasiswa")
    public String createMahasiswa(@RequestBody CreateMahasiswaReq createMahasiswaReq){
        return createDataService.createMahasiswa(createMahasiswaReq);
    }
}
