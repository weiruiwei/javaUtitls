package com.bauer.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

private static SimpleDateFormat sdf= new SimpleDateFormat();

	
	
	/**
	 * @Title parseDate
	 * @Description 
	 * @param pattern
	 * @param time
	 * @return
	 * @throws ParseException
	 * @author bauer
	 * @date 2017年1月1日 下午3:31:51
	 */
	public static Date parseDate(String pattern,String time) throws ParseException{
		if(pattern==null||time==null){
			return null;
		}
		sdf.applyPattern(pattern);
		return sdf.parse(time);
	}
	
	/**
	 * @Title formatDate
	 * @Description 
	 * @param pattern
	 * @param date
	 * @return if pattern or date is null,null will be returned 
	 * @author rui.wei
	 * @date 2016年10月19日 下午12:34:10
	 */
	public static String  formatDate(String pattern,Date date){
		if(pattern==null||date==null){
			return null;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	/**
	 * @Title formatDate
	 * @Description 
	 * @param pattern
	 * @return if pattern is null,null will be returned  else now date will will be returned
	 * @author rui.wei
	 * @date 2016年10月19日 下午12:34:10
	 */
	public static String  formatDate(String pattern){
		if(pattern==null){
			return null;
		}
		sdf.applyPattern(pattern);
		return sdf.format(new Date());
	}
	
	/**
	 * @Title addDays
	 * @Description 
	 * @param date
	 * @param offset
	 * @return
	 * @author rui.wei
	 * @date 2016年10月31日 上午9:48:01
	 */
	public static Date addDays(Date date,int offset){
		long currentDate=date.getTime();
		long wantDate=0;
		if(offset<=24&&offset>=-24){
			wantDate=currentDate+offset*24*3600*1000;
		}else{
			if(offset<0){
				wantDate=getBigDateTime(currentDate,-offset,"+");
			}else{
				wantDate=getBigDateTime(currentDate,offset,"-");
			}
		}
		return new Date(wantDate);
	}
	
	/**
	 * @Title addDays
	 * @Description 
	 * @param date
	 * @param offset
	 * @param flag
	 * @return
	 * @author rui.wei
	 * @date 2016年11月2日 下午4:07:34
	 */
	private static long getBigDateTime(long currentDate,long offset,String flag){
		long wantDate=0;
		if("+".equals(flag)){
			wantDate=currentDate+offset*24*3600*1000;
		}else{
			wantDate=currentDate-offset*24*3600*1000;
		}
		return wantDate;
	}
}
