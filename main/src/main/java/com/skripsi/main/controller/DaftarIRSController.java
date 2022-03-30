package com.skripsi.main.controller;

import com.skripsi.main.rest.DaftarIRSReq;
import com.skripsi.main.service.DaftarIRSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaftarIRSController {
    @Autowired
    private DaftarIRSService daftarIRSService;

    @PostMapping(value = "/daftarRencanaStudi")
    public String daftarRencanaStudi(
            @RequestBody DaftarIRSReq daftarIRSReq
            ){
        System.out.println("masuk ga");
        return daftarIRSService.SendDaftarIRS(daftarIRSReq);
    }
}
