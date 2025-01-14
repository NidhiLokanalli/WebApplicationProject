package com.Zeotap.WebApplication.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;



import com.Zeotap.WebApplication.model.Cell;
import com.Zeotap.WebApplication.service.CellService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cells")
public class SpreadsheetController {

    private final CellService cellService;

    public SpreadsheetController(CellService cellService) {
        this.cellService = cellService;
    }

    @GetMapping("/{id}")
    public Cell getCell(@PathVariable String id) {
        return cellService.getCell(id);
    }

    @PostMapping
    public void saveCell(@RequestBody Cell cell) {
        cellService.saveCell(cell);
    }

    @GetMapping("/sum")
    public double calculateSum(@RequestParam List<String> cellIds) {
        return cellService.calculateSum(cellIds);
    }
}
