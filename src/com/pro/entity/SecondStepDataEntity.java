package com.pro.entity;

/**
 * @describe The second step data entity
 * @author Wei Wu
 */
public class SecondStepDataEntity {
	
	private int selectedType;
	private String filePath;
	private String separator;
	private String[] stringDataArr;
	private Integer[] numberDataArray;
	
	public int getSelectedType() {
		return selectedType;
	}
	public void setSelectedType(int selectedType) {
		this.selectedType = selectedType;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getSeparator() {
		return separator;
	}
	public void setSeparator(String separator) {
		this.separator = separator;
	}
	public String[] getStringDataArr() {
		return stringDataArr;
	}
	public void setStringDataArr(String[] stringDataArr) {
		this.stringDataArr = stringDataArr;
	}
	public Integer[] getNumberDataArray() {
		return numberDataArray;
	}
	public void setNumberDataArray(Integer[] numberDataArray) {
		this.numberDataArray = numberDataArray;
	}

}
