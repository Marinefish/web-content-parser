package com.cparser.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import us.codecraft.xsoup.Xsoup;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/2/21
 * Time: 18:34
 */
public class tset4 {
    public static void main(String[] args) throws Throwable {
        HashMap<String, String> header = new HashMap<String, String>();
        header.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2914.3 Safari/537.36");
        header.put("Connection", "keep-alive");
        String url = "http://www.bbc.com/arabic/world-39079264";
        Document document = Jsoup.connect(url).data(header).get();
        //过滤js
        Elements elements = document.getElementsByTag("script");
        for (Element element : elements) {
            element.empty();
        }
        //获取网络语言
        System.out.println("language: "+document.getElementsByTag("html").attr("lang"));

        System.out.println("title: "+Xsoup.compile("//h1[@class='story-body__h1']/text()").evaluate(document).get());
    }
}
