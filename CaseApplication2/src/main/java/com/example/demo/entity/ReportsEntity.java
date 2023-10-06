package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "REPORTS")
@Entity
public class ReportsEntity {
@Id
@SequenceGenerator(name = "reports_seq_gen", sequenceName = "reports_seq", allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name = "PATIENT_ID")
private Long patientId;

@Column(name = "REPORT")
private String report;

@Column(name = "REPORT_TEXT")
private String reportText;

public Long getPatientId() {
	return patientId;
}

public void setPatientId(Long patientId) {
	this.patientId = patientId;
}

public String getReport() {
	return report;
}

public void setReport(String report) {
	this.report = report;
}

public String getReportText() {
	return reportText;
}

public void setReportText(String reportText) {
	this.reportText = reportText;
}


}
