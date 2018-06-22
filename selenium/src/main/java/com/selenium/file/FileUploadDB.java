package com.selenium.file;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.selenium.global.GlobalData;

@Entity
@Table(name = "testcase")
@JsonInclude(value = Include.NON_NULL)
public class FileUploadDB implements Serializable {

	private static final long serialVersionUID = 4814011125213407952L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "testcaseid")
	private String testcaseid;

	@Column(name = "testdescripation")
	private String testdescripation;

	@Column(name = "teststep")
	private String teststep;

	@Column(name = "monthsday")
	private String monthsday;

	@Column(name = "report")
	private String report;

	@Column(name = "closeofbusiness")
	private String closeofbusiness;

	@Column(name = "searchby")
	private String searchby;

	@Column(name = "reporttype")
	private String reporttype;

	@Column(name = "reportformat")
	private String reportformat;

	@Column(name = "toastmessage")
	private String toastmessage;

	@Column(name = "filename")
	private String filename;

	@Column(name = "expectedresult")
	private String expectedresult;

	@Column(name = "datatorun")
	private String datatorun;

	@Column(name = "passfailskip")
	private String passfailskip;

	@Column(name = "executiondate")
	private Date executiondate = new Date();

	@Column(name = "username")
	private String username = GlobalData.getUsername();

	public Date getExecutiondate() {
		return executiondate;
	}

	public void setExecutiondate(Date executiondate) {
		this.executiondate = executiondate;
	}

	public int getTestid() {
		return id;
	}

	public void setTestid(int id) {
		this.id = id;
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

	public String getReportformat() {
		return reportformat;
	}

	public void setReportformat(String reportformat) {
		this.reportformat = reportformat;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
