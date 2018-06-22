package com.selenium.report;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.selenium.global.GlobalData;

@RestController
@RequestMapping("/reports")
public class ReportController {

	private final ReportService reportService;

	@Autowired
	public ReportController(ReportService reportService) {

		this.reportService = reportService;
	}

	@RequestMapping(value = "/allReports", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<ReportResource> allreport() {

		return reportService.getAllReports();
	}

	@RequestMapping(value = "/byDateReports", method = RequestMethod.POST, headers = "Accept=application/json;charset=utf-8")
	@ResponseStatus(value = HttpStatus.OK)
	public List<ReportResource> getDateReports(@RequestBody ReportResource reportResource) {
		Date executionDate = reportResource.getExecutiondate();
		return reportService.getReportsByDate(executionDate);
	}

	@RequestMapping(value = "/perticularReport", params = "search", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public List<ReportResource> perticularreport(@RequestParam("search") String search) {
		return reportService.getPerticularReport(search);
	}

	@RequestMapping(value = "/reportByUsername", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public List<ReportResource> getReportByUsername() {
		return reportService.getReportByUsername(GlobalData.getUsername());
	}

}
