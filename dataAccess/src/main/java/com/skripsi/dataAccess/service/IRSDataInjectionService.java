package com.skripsi.dataAccess.service;

import com.skripsi.dataAccess.pubsub.schema.RencanaStudiSchema;

public interface IRSDataInjectionService {
    void injectDataIRS(RencanaStudiSchema rencanaStudiSchema);
}
