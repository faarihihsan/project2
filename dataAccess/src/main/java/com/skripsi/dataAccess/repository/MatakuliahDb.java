package com.skripsi.dataAccess.repository;

import com.skripsi.dataAccess.model.MatakuliahModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatakuliahDb extends JpaRepository<MatakuliahModel, Long> {
}
