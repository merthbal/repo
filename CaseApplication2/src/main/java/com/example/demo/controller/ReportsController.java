package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reportApi")
@RequiredArgsConstructor
public class ReportsController {
	@GetMapping("/getReports")
	public String getReportInfo() {
		return "HastaRaporları";
	}

}
