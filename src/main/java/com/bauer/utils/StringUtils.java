package com.bauer.utils;

public class StringUtils {

	/**
	 * @Title isEmpty
	 * @Description 
	 * @param str
	 * @return
	 * @author bauer
	 * @date 2017年1月1日 下午3:00:55
	 */
	public static boolean isEmpty(String str){
		if(str==null){
			return true;
		}
		if(str.length()==0){
			return true;
		}
		return false;
	}
}
