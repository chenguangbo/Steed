package com.trs.测试;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test3 {

	public static void main(String[] args) throws IOException {

		Document html = Jsoup.connect("https://zhidao.baidu.com/question/571169183.html").get();
		Pattern pattern = Pattern.compile("[a-zA-z]+://[^\\s]*");
		Matcher matcher = pattern.matcher(html.toString());
		while (matcher.find()) {
			System.out.println("group   " + matcher.group(0));
		}
	}
}
