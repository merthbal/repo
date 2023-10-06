package com.example.demo.dto;
import java.io.Serializable;
import lombok.Data;
@Data
public class ReportsDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	String report;
	Long patientId;
	String reportText;
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getReportText() {
		return reportText;
	}
	public void setReportText(String reportText) {
		this.reportText = reportText;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
