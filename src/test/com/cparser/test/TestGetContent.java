package com.cparser.test;

import com.syncthemall.diffbot.model.article.Article;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/2/21
 * Time: 18:30
 */
public class TestGetContent {
    public static void main(String[] args) throws Exception {
//        String url  = "http://shabiba.com/article/169260/%D9%85%D8%AD%D9%84%D9%8A%D8%A7%D8%AA/%D9%85%D8%AD%D8%A7%D9%81%D8%B8%D8%A9-%D9%85%D8%B3%D9%82%D8%B7/%D8%AC%D8%A7%D9%85%D8%B9%D8%A9-%D8%A7%D9%84%D8%B3%D9%84%D8%B7%D8%A7%D9%86-%D9%82%D8%A7%D8%A8%D9%88%D8%B3-%D8%AA%D9%86%D8%AC%D8%AD-%D9%81%D9%8A-%D8%B2%D8%B1%D8%A7%D8%B9%D8%A9%D8%AE%D8%B6%D8%B1%D9%88%D8%A7%D8%AA-%D8%B0%D8%A7%D8%AA-%D9%82%D9%8A%D9%85%D8%A9-%D8%A7%D9%82%D8%AA%D8%B5%D8%A7%D8%AF%D9%8A%D8%A9-%D9%88%D8%B5%D8%AD%D9%8A%D8%A9";
//        String url1 = "https://www.baidu.com";
//        Document document = Jsoup.connect(url).header("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2").get();
//        System.out.println(document.outerHtml());
        Article article = new Article();
        article.set("url","www.baidu.com");
        article.set("author","testwww.baidu.com");

        System.out.println( article.getType());
    }


}
