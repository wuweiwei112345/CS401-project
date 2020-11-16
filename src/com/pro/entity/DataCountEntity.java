package com.pro.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @describe Data count entity
 * @author wuwei
 */
public class DataCountEntity {
	
	private String dataStructureName;
	private List<Long> dataCountList;
	
	public DataCountEntity(String dataStructureName,int dataCountMaxNum) {
		this.dataStructureName = dataStructureName;
		this.dataCountList = new ArrayList<Long>(dataCountMaxNum);
	}
	
	public Long avgDataCount() {
		List<Long> dataCountList = this.dataCountList;
		Long dataCountTotal = 0L;
		for(Long countData : dataCountList) {
			dataCountTotal += countData;
		}
		Long avg = dataCountTotal / dataCountList.size();
		return avg;
	}

	public String getDataStructureName() {
		return dataStructureName;
	}

	public List<Long> getDataCountList() {
		return dataCountList;
	}

}
