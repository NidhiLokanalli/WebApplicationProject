package com.Zeotap.WebApplication.repository;

import com.Zeotap.WebApplication.model.Cell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellRepository extends JpaRepository<Cell, Long> {
    Cell findByRowColumnId(String rowColumnId);
}
