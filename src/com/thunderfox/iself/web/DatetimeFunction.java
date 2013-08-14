package com.thunderfox.iself.web;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

/**
 * EL表达式日期格式化函数
 * @author macrotea@qq.com
 * @version 1.0
 * @date 2013-8-12 下午20:17:23
 * @note
 */
public class DatetimeFunction {

	/**
	 * 格式化到日期时间
	 * @author macrotea@qq.com
	 * @date 2013-8-12 下午20:17:23
	 * @param date
	 * @return
	 */
	public static String ftdt(Date date) {
		return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(date);
	}

	/**
	 * 格式化到日期
	 * @author macrotea@qq.com
	 * @date 2013-8-12 下午20:17:23
	 * @param date
	 * @return
	 */
	public static String ftd(Date date) {
		return DateFormatUtils.ISO_DATE_FORMAT.format(date);
	}
	
	/**
	 * 格式化到时间
	 * @author macrotea@qq.com
	 * @date 2013-8-12 下午20:17:23
	 * @param date
	 * @return
	 */
	public static String ftt(Date date) {
		return DateFormatUtils.ISO_TIME_NO_T_FORMAT.format(date);
	}
	
	/**
	 * 字符串减缩
	 * @author macrotea@qq.com
	 * @date 2013-8-12 下午20:17:23
	 * @param text
	 * @param fixLen
	 * @return
	 */
	public static String cut(String text, int fixLen) {
		if (StringUtils.isBlank(text) || text.length() <= fixLen) {
			return text;
		}
		return StringUtils.abbreviateMiddle(text, "...", fixLen);
	}
	
	public static void main(String[] args) {
		System.out.println(DatetimeFunction.cut("我爱你中国我爱你中国我爱你中国我爱你中国我爱你中国我爱你中国我爱你中国我爱你中国", 20));;
		System.out.println(DatetimeFunction.ftdt(new Date()));;
		System.out.println(DatetimeFunction.ftd(new Date()));;
		System.out.println(DatetimeFunction.ftt(new Date()));;
	}
}

