package com.selenium.file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.annotation.MultipartConfig;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@MultipartConfig
@RequestMapping("/uploadfile")
public class FileUploadController {

	private FileUploadService fileUploadService;

	@Autowired
	public FileUploadController(FileUploadService fileUploadService) {

		this.fileUploadService = fileUploadService;
	}

	@SuppressWarnings("unchecked")
	@ResponseBody
	@PostMapping(consumes = "multipart/form-data")
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public ArrayList<FileUploadDB> uploadFile(@RequestParam("file") MultipartFile file)
			throws IOException, JSONException {
		POIFSFileSystem sourceBr;
		ObjectMapper mapper = new ObjectMapper();
		JSONArray rows = new JSONArray();

		ArrayList<FileUploadDB> testCase = null;

		if (file != null) {
			sourceBr = new POIFSFileSystem(file.getInputStream());

			Workbook workbook = WorkbookFactory.create(sourceBr);
			int cellIterator = 0;
			Sheet sheet = workbook.getSheetAt(0);
			ArrayList<String> Key = new ArrayList<String>();

			for (Iterator<Row> rowsIT = sheet.rowIterator(); rowsIT.hasNext();) {

				Row row = rowsIT.next();

				if (row.getRowNum() == 0) {
					for (int i = 0; i < row.getLastCellNum(); i++) {
						Cell cell = row.getCell(cellIterator++);
						Key.add(cell.getStringCellValue());

					}
				} else {

					JSONObject json = new JSONObject();
					cellIterator = 0;
					FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
					for (int i = 0; i < row.getLastCellNum(); i++) {
						Cell cell = row.getCell(cellIterator++);
						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							json.put(Key.get(i), cell.getNumericCellValue());

							break;

						case Cell.CELL_TYPE_STRING:
							json.put(Key.get(i), cell.getStringCellValue());

							break;
						}

					}

					// Create the JSON.
					rows.put(json);

				}

			}

			// Get the JSON text.

			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			String jsonData = rows.toString();
			testCase = (ArrayList<FileUploadDB>) mapper.reader().forType(new TypeReference<ArrayList<FileUploadDB>>() {
			}).readValue(jsonData);

		}

		return fileUploadService.fileReadService(testCase);

	}

}
