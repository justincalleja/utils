package com.github.justincalleja.utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.justincalleja.utils.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void joinListTest() {
		List<String> list1;
		list1 = new ArrayList<String>();
		list1.add("abc");
		list1.add("def");
		list1.add("ghi");
		list1.add("jkl");
		list1.add("mno");

		assertEquals("abc,def,ghi,jkl,mno", StringUtils.join(list1, ","));
		assertEquals("abc:def:ghi:jkl:mno", StringUtils.join(list1, ":"));
	}

	@Test
	public void joinArrayTest() {
		String[] array1;
		array1 = new String[] { "hello", "world", "and", "goodbye" };
		assertEquals("hello,world,and,goodbye", StringUtils.join(array1, ","));
		assertEquals("SOP:tmp:WW002:", StringUtils.join(new String[] { "SOP", "tmp", "WW002", "" }, ":"));
	}
	
	@Test
	public void testPadLeft() {
		assertEquals("0123456789", StringUtils.padLeft("123456789", 10, '0'));
		assertEquals("0000000123", StringUtils.padLeft("123", 10, '0'));
		assertEquals("0000000000", StringUtils.padLeft("", 10, '0'));
		assertEquals("123456789123456789", StringUtils.padLeft("123456789123456789", 10, '0'));
		assertEquals(null, StringUtils.padLeft(null, 10, '0'));
	}
	
	@Test
	public void firstXCharactersTest() {
		final String str = "hello world";
		assertEquals("", StringUtils.firstXCharacters(str, 0));
		assertEquals(str, StringUtils.firstXCharacters(str, -1));
		assertEquals("hello", StringUtils.firstXCharacters(str, 5));
		assertEquals(str, StringUtils.firstXCharacters(str, 100));
		assertEquals(str, StringUtils.firstXCharacters(str, 11));
	}

}
