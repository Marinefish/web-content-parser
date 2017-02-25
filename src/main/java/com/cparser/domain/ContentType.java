package com.cparser.domain;

import com.google.api.client.util.Value;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/2/22
 * Time: 21:46
 */
public enum  ContentType {

    ARTICLE("article"),
    IMAGE("image"),
    VIDEO("video");

    private String key;
    private ContentType(String key){
        this.key=key;
    }
    public String getKey(){
        return this.key;
    }

}
