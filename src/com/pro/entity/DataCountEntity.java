package com.pro.entity;

import java.util.Map;

/**
 * @describe Data count entity
 * @author wuwei
 */
public class DataCountEntity {
	
	private String dataStructureName;
	private Map<String,String> dataCountMap;
	
	public DataCountEntity(String dataStructureName,Map<String,String> dataCountMap) {
		this.dataStructureName = dataStructureName;
		this.dataCountMap = dataCountMap;
	}

	public String getDataStructureName() {
		return dataStructureName;
	}

	public void setDataStructureName(String dataStructureName) {
		this.dataStructureName = dataStructureName;
	}

	public Map<String, String> getDataCountMap() {
		return dataCountMap;
	}

	public void setDataCountMap(Map<String, String> dataCountMap) {
		this.dataCountMap = dataCountMap;
	}

}
