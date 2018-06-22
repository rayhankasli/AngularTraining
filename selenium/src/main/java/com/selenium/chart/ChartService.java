package com.selenium.chart;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ChartService {
	
	private final ChartDao chartDao;

	public ChartService(ChartDao chartDao) {
		this.chartDao = chartDao;
	}
	
	@SuppressWarnings("rawtypes")
	public List getChartData()
	{
		return chartDao.getChartData();
	}
	

}
