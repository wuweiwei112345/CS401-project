package com.pro.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @describe Static data entity
 * @author Wei Wu
 */
public class StaticDataEntity {
	
	public static final Map<String,String> DATA_STRUCTURE_MAP = new HashMap<String, String>();
	
	static {
		//Array
		DATA_STRUCTURE_MAP.put("000000", "Array bounded list");
		DATA_STRUCTURE_MAP.put("000001", "Array bounded sorted list");
		DATA_STRUCTURE_MAP.put("000002", "Array unBounded list");
		DATA_STRUCTURE_MAP.put("000003", "Array unBounded sorted list");
		//Linked
		DATA_STRUCTURE_MAP.put("000004", "Linked bounded list");
		DATA_STRUCTURE_MAP.put("000005", "Linked bounded sorted list");
		DATA_STRUCTURE_MAP.put("000006", "Linked unBounded list");
		DATA_STRUCTURE_MAP.put("000007", "Linked unBounded sorted list");
		//Tree
		DATA_STRUCTURE_MAP.put("000008", "Binary search tree");
	}

}
