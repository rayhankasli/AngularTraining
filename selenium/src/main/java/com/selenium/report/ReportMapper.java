package com.selenium.report;

import org.springframework.stereotype.Component;

@Component
public class ReportMapper {

	public ReportResource fromEntity(ReportDB reportDB) {
		ReportResource reportResource;

		reportResource = new ReportResource();
		reportResource.setId(reportDB.getTestid());
		reportResource.setTestcaseid(reportDB.getTestcaseid());
		reportResource.setTestdescripation(reportDB.getTestdescripation());
		reportResource.setTeststep(reportDB.getTeststep());
		reportResource.setMonthsday(reportDB.getMonthsday());
		reportResource.setReport(reportDB.getReport());
		reportResource.setCloseofbusiness(reportDB.getCloseofbusiness());
		reportResource.setSearchby(reportDB.getSearchby());
		reportResource.setReporttype(reportDB.getReporttype());
		reportResource.setReportformat(reportDB.getReportformat());
		reportResource.setToastmessage(reportDB.getToastmessage());
		reportResource.setFilename(reportDB.getFilename());
		reportResource.setExpectedresult(reportDB.getExpectedresult());
		reportResource.setDatatorun(reportDB.getDatatorun());
		reportResource.setPassfailskip(reportDB.getPassfailskip());
		reportResource.setExecutiondate(reportDB.getExecutiondate());

		return reportResource;

	}

}
