package com.bauer.utils;

public class StringUtils {

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
