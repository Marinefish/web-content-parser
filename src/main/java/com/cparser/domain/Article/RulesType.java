package com.cparser.domain.Article;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/3/4
 * Time: 15:42
 */
public enum RulesType {
    LINKS("links"),
    ARTICLE("article");

    private String key;
    private RulesType(String key){
        this.key=key;
    }
    private String getKey(){
        return this.key;
    }

    /**
     * 是否包含该枚举类型key值
     * @param key
     * */
    public static boolean contains(String key){
        boolean contains = false;
        for(RulesType rulesType:RulesType.values()){
            if(rulesType.key.equalsIgnoreCase(key)){
                contains=true;
                break;
            }
        }
        return contains;
    }
}

