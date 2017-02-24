package com.cparser.test;

import com.syncthemall.diffbot.model.PageType;
import com.syncthemall.diffbot.model.article.Article;
import com.syncthemall.diffbot.model.frontpage.Item;
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
//        String url  = "http://kitchen.sayidaty.net/%D8%A7%D9%84%D8%A8%D9%8A%D8%AA%D8%B2%D8%A7";
//        String url1 = "https://www.baidu.com";
//        Document document = Jsoup.connect(url).header("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2").get();
//        System.out.println(document.outerHtml());
        Article article = new Article();
        article.set("url","www.baidu.com");
        article.set("author","testwww.baidu.com");
        article.set("type",PageType.valueOf("ARTICLE"));

        System.out.println( article.getType());
//        for(PageType type:PageType.values() ){
//            System.out.println(type.getKey());
//        }
    }


}
