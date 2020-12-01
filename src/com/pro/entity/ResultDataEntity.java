package com.pro.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @describe Used to save analysis results
 * @author Wei Wu
 */
public class ResultDataEntity {
	
	private Map<Integer, Long> timeMap = new HashMap<Integer, Long>();
	private Map<Integer, Integer> stepNumMap = new HashMap<Integer, Integer>();
	private String timeUnit;
	private String bigO;
	private String analysisText;
	private String dataStructureCode;
	private String dataStructureName;
	
	public Map<Integer, Long> getTimeMap() {
		return timeMap;
	}
	public Map<Integer, Integer> getStepNumMap() {
		return stepNumMap;
	}
	public String getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}
	public String getBigO() {
		return bigO;
	}
	public void setBigO(String bigO) {
		this.bigO = bigO;
	}
	public String getAnalysisText() {
		return analysisText;
	}
	public void setAnalysisText(String analysisText) {
		this.analysisText = analysisText;
	}
	public String getDataStructureCode() {
		return dataStructureCode;
	}
	public void setDataStructureCode(String dataStructureCode) {
		this.dataStructureCode = dataStructureCode;
	}
	public String getDataStructureName() {
		return dataStructureName;
	}
	public void setDataStructureName(String dataStructureName) {
		this.dataStructureName = dataStructureName;
	}
	

}
