package com.selenium.report;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReportService {

	private final ReportDao reportDao;
	private final ReportMapper reportMapper;

	@Autowired
	public ReportService(ReportDao reportDao, ReportMapper reportMapper) {

		this.reportDao = reportDao;
		this.reportMapper = reportMapper;
	}

	public List<ReportResource> getAllReports() {
		return reportDao.getAllReports().stream().map(reportMapper::fromEntity).collect(Collectors.toList());
	}

	public List<ReportResource> getReportsByDate(Date executionDate) {
		return reportDao.getReportsByDate(executionDate).stream().map(reportMapper::fromEntity)
				.collect(Collectors.toList());
	}

	public List<ReportResource> getPerticularReport(String search) {
		return reportDao.getPerticularReport(search).stream().map(reportMapper::fromEntity)
				.collect(Collectors.toList());
	}

	public List<ReportResource> getReportByUsername(String username) {
		return reportDao.getReportsByUsername(username).stream().map(reportMapper::fromEntity)
				.collect(Collectors.toList());
	}

}
