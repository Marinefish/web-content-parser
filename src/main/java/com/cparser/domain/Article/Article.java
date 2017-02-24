package com.cparser.domain.Article;

import com.cparser.domain.Content;
import com.cparser.domain.ContentType;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/2/24
 * Time: 21:16
 */
public class Article extends Content{

    private ContentType type;
    private String pageUrl;
    private String html;
    private String title;
    private String author;
    private String text;
    private String date;
    private String humanLanguage;

    public ContentType getType(){
        return type;
    }

    public String getPageUrl(){
        return pageUrl;
    }
}
