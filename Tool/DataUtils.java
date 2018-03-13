package com.trs.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * 2018年3月12日15:53:47
 * @author Administrator
 *
 */
public class DataUtils {

	/**
	 * 日期类型转换成字符串
	 * 
	 * @param date 转换前的日期
	 * @return     转换后的字符串格式
	 */
	public static String dateToString(Date date) {

		SimpleDateFormat simp = new SimpleDateFormat("yyyy-dd-mm");
		String format = simp.format(date);
		return format;
	}

	public static String dateToString2(Date date) {

		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simp.format(date);
		return format;
	}

	public static String dateToString3(Date date) {

		SimpleDateFormat simp = new SimpleDateFormat("yyyy年dd月mm日  hh:mm:ss");
		String format = simp.format(date);
		return format;
	}
	
	public static String dateToString4(Date date) {

		SimpleDateFormat simp = new SimpleDateFormat("yyyyMMddHHmmss");
		String format = simp.format(date);
		return format;
	}

	/**
	 * String转换成Date类型
	 * 
	 * @param str   转化前段的字符串
	 * @return      转换后的日期
	 * @throws ParseException   转换异常
	 */
	public static Date stringToDate(String str) throws ParseException {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy年dd月mm日 hh:mm:ss");
		return simp.parse(str);
	}

	public static Date stringToDate2(String str) throws ParseException {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simp.parse(str);
	}

	public static Date stringToDate3(String str) throws ParseException {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-dd-mm");
		return simp.parse(str);
	}

	/**
	 * 获取当前的时间日期
	 * @return 当前时间
	 */
	public static Date getNow() {
        Calendar cal = Calendar.getInstance();
        Date currDate = cal.getTime();
        return currDate;
    }
	
	/**
	 * 判断传入的日期字符串和指定的日期格式是否匹配
	 * 
	 * @param date   指定字符串类型的日期
	 * @param format 指定要匹配的格式
	 * @return   true/false
	 */
	public static boolean isDateStringCorrect(String date, String format) {  
        SimpleDateFormat df = new SimpleDateFormat(format);  
  
        try {  
            df.setLenient(false);  
            df.parse(date);  
            return true;  
        } catch (Exception e) {  
            return false;  
        }  
    }  
	
	
	public static void main(String[] args) throws ParseException {
		//System.out.println(dateToString4(getNow()));
		boolean b = isDateStringCorrect(dateToString4(getNow()), "yyyyMMddHHmmss");
		System.out.println(b);
	}

}
