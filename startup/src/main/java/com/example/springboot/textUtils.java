package com.example.springboot;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
public class textUtils {
	private static String name="Chaya and Chana check if the string is empty";
	 

	public static String getText() {
		if (StringUtils.isEmpty(name)) 
			return "the text is empty";
		return "the text is:" + name;
	}

}
