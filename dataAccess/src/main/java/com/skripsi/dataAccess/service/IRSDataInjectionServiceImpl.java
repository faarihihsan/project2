package com.skripsi.dataAccess.service;

import com.skripsi.dataAccess.model.KelasModel;
import com.skripsi.dataAccess.model.MahasiswaModel;
import com.skripsi.dataAccess.model.MatakuliahModel;
import com.skripsi.dataAccess.pubsub.schema.DaftarKelasTerdaftarSchema;
import com.skripsi.dataAccess.pubsub.schema.RencanaStudiSchema;
import com.skripsi.dataAccess.pubsub.schema.ValidateIRSSchema;
import com.skripsi.dataAccess.repository.KelasDb;
import com.skripsi.dataAccess.repository.MahasiswaDb;
import com.skripsi.dataAccess.repository.MatakuliahDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class IRSDataInjectionServiceImpl implements IRSDataInjectionService {
    @Autowired
    @Qualifier("validateIRSProducer")
    private KafkaTemplate validateIRSKafkaTemplate;

    @Autowired
    private MahasiswaDb mahasiswaDb;

    @Autowired
    private KelasDb kelasDb;

    @Autowired
    private MatakuliahDb matakuliahDb;

    @Override
    public void injectDataIRS(RencanaStudiSchema rencanaStudiSchema) {
//        MahasiswaModel mahasiswaModel = mahasiswaDb.findByNpm(rencanaStudiSchema.getNpm());
//
//        List<DaftarKelasTerdaftarSchema> listRencanaStudi = new ArrayList<>();
//        for (Integer idKelas : rencanaStudiSchema.getIdKelas()) {
//            KelasModel kelasModel = kelasDb.findById(idKelas.longValue()).get();
//
//            DaftarKelasTerdaftarSchema daftarKelasTerdaftarSchema = new DaftarKelasTerdaftarSchema();
//            daftarKelasTerdaftarSchema.setIdKelas(kelasModel.getId());
//            daftarKelasTerdaftarSchema.setIdMatakuliah(kelasModel.getMatakuliah().getId());
//            daftarKelasTerdaftarSchema.setNamaMatakuliah(kelasModel.getMatakuliah().getNama());
//            daftarKelasTerdaftarSchema.setSksMatakuliah(kelasModel.getMatakuliah().getSks());
//            daftarKelasTerdaftarSchema.setTerm(kelasModel.getTerm());
//            daftarKelasTerdaftarSchema.setIdJadwal(kelasModel.getIdJadwal());
//
//            listRencanaStudi.add(daftarKelasTerdaftarSchema);
//        }
//
//        ValidateIRSSchema validateIRSSchema = new ValidateIRSSchema();
//        validateIRSSchema.setIdMahasiswa(mahasiswaModel.getId());
//        validateIRSSchema.setNama(mahasiswaModel.getNama());
//        validateIRSSchema.setNpm(mahasiswaModel.getNpm());
//        validateIRSSchema.setIpk(mahasiswaModel.getIpk());
//        validateIRSSchema.setTerm(mahasiswaModel.getTerm());
//        validateIRSSchema.setTerm(mahasiswaModel.getJumlahSKSLulus());
//        validateIRSSchema.setDaftarKelasTerdaftar(listRencanaStudi);

        Integer IntegerValue = new Integer(1);
        List<DaftarKelasTerdaftarSchema> listRencanaStudi = new ArrayList<>();
        DaftarKelasTerdaftarSchema daftarKelasTerdaftarSchema = new DaftarKelasTerdaftarSchema(IntegerValue,IntegerValue,"s",IntegerValue,IntegerValue, IntegerValue);
        listRencanaStudi.add(daftarKelasTerdaftarSchema);
        ValidateIRSSchema validateIRSSchema = new ValidateIRSSchema(IntegerValue, "nama", IntegerValue, 4.0f, IntegerValue, IntegerValue, listRencanaStudi);

        Message<ValidateIRSSchema> message = MessageBuilder.withPayload(validateIRSSchema).setHeader(KafkaHeaders.TOPIC, "IRS_VALIDATE").build();
        validateIRSKafkaTemplate.send(message);
        return;
    }
}
