package rulseWeb.domain;

import java.util.List;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/3/9
 * Time: 17:13
 */
public class RulesModel implements Cloneable{

    private String rulsName;//规则名称，要和实体类的变量对应起来
    private List<String> contentXpath;//该规则获取目标内容
    private List<String> ignoreXpath;//该规则过滤目标内容
    public List<RulesModel> nods;//规则内部的规则节点

    @Override
    public RulesModel clone(){
        RulesModel sc = null;
        try
        {
            sc = (RulesModel) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sc;
    }

    public List<RulesModel> getNods() {
        return nods;
    }

    public void setNods(List<RulesModel> nods) {
        this.nods = nods;
    }

    public String getRulsName() {
        return rulsName;
    }

    public void setRulsName(String rulsName) {
        this.rulsName = rulsName;
    }

    public List<String> getContentXpath() {
        return contentXpath;
    }

    public void setContentXpath(List<String> contentXpath) {
        this.contentXpath = contentXpath;
    }

    public List<String> getIgnoreXpath() {
        return ignoreXpath;
    }

    public void setIgnoreXpath(List<String> ignoreXpath) {
        this.ignoreXpath = ignoreXpath;
    }

}
