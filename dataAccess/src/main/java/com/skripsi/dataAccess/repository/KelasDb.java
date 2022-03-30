package com.skripsi.dataAccess.repository;

import com.skripsi.dataAccess.model.KelasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KelasDb extends JpaRepository<KelasModel, Long> {
}
