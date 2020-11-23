package com.pro.entity;

/**
 * The enum of data structure code
 * @author Wei Wu
 */
public enum DataStructureCodeEnum {
	
	BOUNDED_ORDERED_LIST_BASED_ON_ARRAY("000001"),
	BOUNDED_UNORDERED_LIST_BASED_ON_ARRAY("000002"),
	UNBOUNDED_ORDERED_LIST_BASED_ON_ARRAY("000003"),
	UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_ARRAY("000004"),
	BOUNDED_SORTED_LIST_BASED_ON_LINKED_LIST("000005"),
	BOUNDED_UNORDERED_LIST_BASED_ON_LINKED_LIST("000006"),
	UNBOUNDED_ORDERED_LIST_BASED_ON_LINKED_LIST("000007"),
	UNBOUNDED_AND_UNORDERED_LIST_BASED_ON_LINKED_LIST("000008"),
	BINARY_SEARCH_TREE("000009");
  
    private String code;
    
    private DataStructureCodeEnum(String code) {
        this.code = code;
    }
  
    public String getCode() {
        return code;
    }
	
}
