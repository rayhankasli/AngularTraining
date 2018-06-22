package com.selenium.file;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FileUploadService {

	private FileUploadDao testcaseDAO;

	@Autowired
	public FileUploadService(FileUploadDao testcaseDao) {
		this.testcaseDAO = testcaseDao;

	}

	public ArrayList<FileUploadDB> fileReadService(ArrayList<FileUploadDB> testCase) {
		return testcaseDAO.insertTestcase(testCase);

	}
}
