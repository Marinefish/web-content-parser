package com.cparser.domain.Article;

import com.cparser.domain.Content;
import com.cparser.domain.ContentType;

import java.util.List;

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
    private List<Image> images;
    private String date;
    private String humanLanguage;

    public String getHtml() {
        return html;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public List<Image> getImages() {
        return images;
    }

    public String getDate() {
        return date;
    }

    public String getHumanLanguage() {
        return humanLanguage;
    }

    public ContentType getType(){
        return type;
    }

    public String getPageUrl(){
        return pageUrl;
    }
}
