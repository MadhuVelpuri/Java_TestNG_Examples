package com.javang;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String p[]) {
		String s = "VvMadhuvV";
		System.out.println("String is : " + s);
		stringTokenizer();
		stringBuffer();

	}

	public static void stringTokenizer() {
		StringTokenizer str = new StringTokenizer("Madhu babu Velpuri");
		System.out.println("String tokenizer result is : ");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

	}

	public static void stringBuffer() {

		StringBuffer strbuf = new StringBuffer("csegeek");
		System.out.println("StringBuffer : " + strbuf);
		// System.out.println("Length of the string : " + strbuf.length());
		strbuf.setCharAt(0, 'C');
		strbuf.append(".com");
		System.out.println("StringBuffer result is : " + strbuf);
	}
}
