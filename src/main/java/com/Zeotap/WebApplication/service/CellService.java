package com.Zeotap.WebApplication.service;



import com.Zeotap.WebApplication.model.Cell;
import com.Zeotap.WebApplication.repository.CellRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CellService {

    private final CellRepository cellRepository;

    public CellService(CellRepository cellRepository) {
        this.cellRepository = cellRepository;
    }

    public Cell getCell(String id) {
        return cellRepository.findByRowColumnId(id);
    }

    public List<Cell> getAllCells() {
        return cellRepository.findAll();
    }

    public void saveCell(Cell cell) {
        cellRepository.save(cell);
    }

    public double calculateSum(List<String> cellIds) {
        return cellIds.stream()
                .map(this::getCell)
                .mapToDouble(cell -> Double.parseDouble(cell.getContent()))
                .sum();
    }

    // Other functions like AVERAGE, MIN, MAX
}
