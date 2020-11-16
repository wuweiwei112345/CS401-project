package com.pro.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @describe Data count entity
 * @author wuwei
 */
public class DataCountEntity {
	
	private static final String DATA_RESULT_TIME_STRING_TEMPLATE = "Execution of ${num},time:${time} microsecond!";
	private static final String DATA_RESULT_AVGTIME_STRING_TEMPLATE = "Avg time is:${avgtime} microsecond!";
	private static final String DATA_RESULT_BIG_O_STRING_TEMPLATE = "The complexity is:${O}";
	
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
	
	public long createResultToString() {
		StringBuffer sb = new StringBuffer();
		List<Long> dataCountList = this.dataCountList;
		Long dataCountTotal = 0L;
		for(Long countData : dataCountList) {
			sb.append(DATA_RESULT_TIME_STRING_TEMPLATE.replace("${num}", ""));
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
