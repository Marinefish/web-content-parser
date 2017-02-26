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
        header.put("Connection", "keep-alive");
        String url = "http://www.bbc.com/arabic/art-and-culture-39090884";
        Document document = Jsoup.connect(url).data(header).get();
//        Document document = Jsoup.parse(new File("D:\\GitHub\\web-content-parser\\src\\test\\test"),"utf-8");
        //过滤js
        Elements elements = document.getElementsByTag("script");
        for (Element element : elements) {
            element.empty();
        }
//        //获取网络语言
//        System.out.println("language: "+document.getElementsByTag("html").attr("lang"));
//        //获取tile
//        System.out.println("title: "+Xsoup.compile("//h1[@class='story-body__h1']/text()").evaluate(document).get());
//        //获取text
//        List<String> elements1 = Xsoup.compile("//div[@class='story-body__inner']//p/text()").evaluate(document).list();
//        System.out.print("content: ");
//        for(String str:elements1)
//            System.out.println(str);
//        //获取图片url
//        System.out.println("img_url: "+Xsoup.compile("//span[@class='image-and-copyright-container']/div/@data-src").evaluate(document).get());
//        //获取图片title
//        System.out.println("img_tile: "+Xsoup.compile("//span[@class='media-caption__text']//text()").evaluate(document).get());
        System.out.println(document);
    }
}
