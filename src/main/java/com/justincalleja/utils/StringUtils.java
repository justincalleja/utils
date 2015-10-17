package com.justincalleja.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringUtils {

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static <T> String join(List<T> l, String separator) {
		return StringUtils.join((Collection<T>) l, separator);
	}

	public static <T> String join(Collection<T> c, String separator) {
		StringBuilder strBuilder = new StringBuilder();
		Iterator<T> iterator = c.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			strBuilder.append(next.toString());
			if (iterator.hasNext()) {
				strBuilder.append(separator);
			}
		}
		return strBuilder.toString();
	}
	
	/**
	 * Returns the prefix of given str up to x characters
	 * or the original str if x exceeds str's length or
	 * x is negative. "" if x is 0. 
	 * Does not throw exceptions.
	 * @param str
	 * @param x
	 * @return a substring of str starting from first character of str up till x character of str
	 */
	public static String firstXCharacters(String str, int x) {
		if(x == 0) {
			return "";
		} else if(x < 0) {
			return str;
		} else {
			try {
				// throws exception if x > str.length()
				return str.substring(0, x);
			} catch(IndexOutOfBoundsException e) {
				return str;
			}
		}
	}

}
