package com.skripsi.dataAccess.repository;

import com.skripsi.dataAccess.model.MahasiswaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaDb extends JpaRepository<MahasiswaModel, Long> {
    MahasiswaModel findByNpm(Integer npm);
}
