package com.Zeotap.WebApplication.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rowColumnId; // e.g., "A1"
    private String content; // Display value
    private String formula; // Formula like "=SUM(A1:A5)"
    private String style; // JSON-encoded styles
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRowColumnId() {
		return rowColumnId;
	}
	public void setRowColumnId(String rowColumnId) {
		this.rowColumnId = rowColumnId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

    // Getters and Setters
}
