package com.cparser.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
        HashMap<String,String> header = new HashMap<String, String>();
        header.put("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2914.3 Safari/537.36");
       String url = "https://www.elfann.com/news/show/1113389/%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD-%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD-%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD-Emporio-Armani-%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD-2015";
        Document document = Jsoup.connect(url).data(header).get();
        //过滤js
        Elements elements = document.getElementsByTag("script");
        for(Element element:elements){
            element.empty();
        }
        System.out.println(document);
    }
}
