package com.cparser.domain;

import com.syncthemall.diffbot.model.PageType;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/2/22
 * Time: 21:43
 */
public abstract class Content {

    public Content(){}
    public abstract String getUrl();
    public abstract PageType getPageType();

}
