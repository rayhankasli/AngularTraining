package com.selenium.file;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.selenium.global.GlobalData;

@JsonInclude(value = Include.NON_NULL)
public class FileUploadResource implements Serializable {

	private static final long serialVersionUID = -3029207814877380166L;
	private int testid;
	private String testcaseid;
	private String testdescripation;
	private String teststep;
	private String monthsday;
	private String report;
	private String closeofbusiness;
	private String searchby;
	private String reporttype;
	private String toastmessage;
	private String filename;
	private String expectedresult;
	private String datatorun;
	private String passfailskip;
	private Date executiondate;
	private String username = GlobalData.getUsername();

	public int getTestid() {
		return testid;
	}

	public void setTestid(int testid) {
		this.testid = testid;
	}

	public String getTestcaseid() {
		return testcaseid;
	}

	public void setTestcaseid(String testcaseid) {
		this.testcaseid = testcaseid;
	}

	public String getTestdescripation() {
		return testdescripation;
	}

	public void setTestdescripation(String testdescripation) {
		this.testdescripation = testdescripation;
	}

	public String getTeststep() {
		return teststep;
	}

	public void setTeststep(String teststep) {
		this.teststep = teststep;
	}

	public String getMonthsday() {
		return monthsday;
	}

	public void setMonthsday(String monthsday) {
		this.monthsday = monthsday;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getCloseofbusiness() {
		return closeofbusiness;
	}

	public void setCloseofbusiness(String closeofbusiness) {
		this.closeofbusiness = closeofbusiness;
	}

	public String getSearchby() {
		return searchby;
	}

	public void setSearchby(String searchby) {
		this.searchby = searchby;
	}

	public String getReporttype() {
		return reporttype;
	}

	public void setReporttype(String reporttype) {
		this.reporttype = reporttype;
	}

	public String getToastmessage() {
		return toastmessage;
	}

	public void setToastmessage(String toastmessage) {
		this.toastmessage = toastmessage;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getExpectedresult() {
		return expectedresult;
	}

	public void setExpectedresult(String expectedresult) {
		this.expectedresult = expectedresult;
	}

	public String getDatatorun() {
		return datatorun;
	}

	public void setDatatorun(String datatorun) {
		this.datatorun = datatorun;
	}

	public String getPassfailskip() {
		return passfailskip;
	}

	public void setPassfailskip(String passfailskip) {
		this.passfailskip = passfailskip;
	}

	public Date getExecutiondate() {
		return executiondate;
	}

	public void setExecutiondate(Date executiondate) {
		this.executiondate = executiondate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
