package com.selenium.chart;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public class ChartController {

	private final ChartService chartService;

	public ChartController(ChartService chartService) {
		this.chartService = chartService;
	}
	
	
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST,headers = "Accept=application/json")
	public List chartData()
	{
		return chartService.getChartData();
	}
	
	
}
