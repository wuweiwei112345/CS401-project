package com.pro.entity;

/**
 * @describe Data structure info entity
 * @author Wei Wu
 */
public class DataStructureInfoEntity {
	
	public DataStructureInfoEntity() {
		
	}
	
	public DataStructureInfoEntity(String code,String describe,String bigO,Integer isBounded,Integer isSorted,Integer searchType) {
		this.code = code;
		this.describe = describe;
		this.bigO = bigO;
		this.isBounded = isBounded;
		this.isSorted = isSorted;
		this.searchType = searchType;
	}
	
	private String code;
	private String describe;
	private String bigO;
	private String analysisText;
	private Integer isBounded;//1 bounded 2 unbounded
	private Integer isSorted;//1 sorted 2 unsorted
	private Integer searchType;//1 line 2 binary
	
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
	public Integer getIsBounded() {
		return isBounded;
	}
	public void setIsBounded(Integer isBounded) {
		this.isBounded = isBounded;
	}
	public Integer getIsSorted() {
		return isSorted;
	}
	public void setIsSorted(Integer isSorted) {
		this.isSorted = isSorted;
	}
	public Integer getSearchType() {
		return searchType;
	}
	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
	}

}
