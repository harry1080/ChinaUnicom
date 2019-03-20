/**
 * 
 */
package com.yue.converter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author 流星紫蝶雨 2019年2月22日
 */
@Component
public class StringToDateConverter implements Converter<String, Date> {
	/**
	 * String转sql.data
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.
	 * Object)
	 */
	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		if (source != null) {
			try {
				java.util.Date date = dateFormat.parse(source);
				return new Date(date.getTime());
			} catch (ParseException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return null;
	}

}
