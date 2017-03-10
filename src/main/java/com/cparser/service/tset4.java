package com.cparser.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import us.codecraft.xsoup.Xsoup;

import java.io.File;
import java.util.HashMap;
import java.util.List;
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
//        header.put("Connection", "keep-alive");
//        String url = "http://www.bbc.com/arabic/art-and-culture-39090884";
        String url = "http://www.layalina.com/%D8%A3%D8%AD%D8%B0%D9%8A%D8%A9-%D9%87%D9%88%D8%AA-%D9%83%D9%88%D8%AA%D9%88%D8%B1-%D9%84%D8%AA%D8%AA%D8%A3%D9%84%D9%82%D9%8A-%D8%A8%D9%87%D8%A7-%D9%81%D9%8A-%D9%85%D9%86%D8%A7%D8%B3%D8%A8%D8%A7%D8%AA-2017-239398.html";
        Document document = Jsoup.connect(url).userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
                .postDataCharset("utf-8").timeout(10000).get();
//        Document document = Jsoup.parse(new File("D:\\GitHub\\web-content-parser\\src\\test\\test"),"utf-8");
        //过滤js
        Elements elements = document.getElementsByTag("script");
        elements.empty();
//        Elements elements1 = document.getElementsByTag("p");
//        for(Element element:elements1){
//            System.out.println(element.toString());
//        }

        //获取网络语言
//        System.out.println("language: "+document.getElementsByTag("html").attr("lang"));
//        //获取tile
//        System.out.println("title: "+Xsoup.compile("//h1[@class='story-body__h1']/text()").evaluate(document).get());
//        //获取text
//        List<String> elements1 = Xsoup.compile("//div[@class='story-body__inner']//p/text()").evaluate(document).list();
//        System.out.print("content: ");
//        for(String str:elements1)
//            System.out.println(str);
//        //获取图片url
//        List<String> var1 = Xsoup.compile("//span[@class='image-and-copyright-container']/div/@data-src").evaluate(document).list();
//        for(String str:var1){
//            System.out.println("img_url: "+var1);
//        }
//        Xsoup.compile("").evaluate(document).getElements();
//        //获取图片title
//        List<String> var2 = Xsoup.compile("//span[@class='media-caption__text']//text()").evaluate(document).list();
//        for(String str:var2){
//            System.out.println("img_title: "+str);
//        }

        System.out.println(document);
    }
}
