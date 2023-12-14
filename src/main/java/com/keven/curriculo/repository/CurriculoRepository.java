package com.keven.curriculo.repository;

import com.keven.curriculo.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}