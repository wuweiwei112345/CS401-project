package com.pro.entity;

/**
 * @describe Data structure info entity
 * @author Wei Wu
 */
public class DataStructureInfoEntity {
	
	public DataStructureInfoEntity() {
		
	}
	
	public DataStructureInfoEntity(String code,String describe,String bigO) {
		this.code = code;
		this.describe = describe;
		this.bigO = bigO;
	}
	
	private String code;
	private String describe;
	private String bigO;
	private String analysisText;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
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
	

}
