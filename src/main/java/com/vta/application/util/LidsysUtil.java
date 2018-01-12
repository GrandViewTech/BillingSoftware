package com.lidsys.application.util;

public class LidsysUtil
	{
		public static boolean isEmpty(String string)
			{
				return (org.springframework.util.StringUtils.isEmpty(string) || !org.springframework.util.StringUtils.hasLength(string));
			}		
	}
