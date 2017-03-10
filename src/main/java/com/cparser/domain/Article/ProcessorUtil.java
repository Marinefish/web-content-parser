package com.cparser.domain.Article;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
//import com.onemt.news.crawler.business.processor.domain.PageArticle;
//import com.onemt.news.crawler.mysql.entity.CrawlerMediaCategory;
//import com.onemt.news.crawler.utils.DateUtils;
//import com.onemt.news.crawler.utils.StringUtils;
//import us.codecraft.webmagic.Page;
//import us.codecraft.webmagic.Request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/3/4
 * Time: 14:44
 */
public class ProcessorUtil {


//    private static final Gson GSON = new GsonBuilder().create();
//    /**
//     *获取Page对象中的扩展字段
//     * @param page Page对象
//     * @return Map类型的拓展字段
//     * */
//    public Map<String, Object> getExtras(Page page){
//        Map<String, Object> extras = new HashMap<String, Object>();
//        extras.put("mediaId",  page.getRequest().getExtra("mediaId"));
//        extras.put("mediaName",  page.getRequest().getExtra("mediaName"));
//        extras.put("mediaIcon",  page.getRequest().getExtra("mediaIcon"));
//        extras.put("mediaCategoryId",  page.getRequest().getExtra("mediaCategoryId"));
//        extras.put("newsCategoryId",  page.getRequest().getExtra("newsCategoryId"));
//        extras.put("newsRegionId",  page.getRequest().getExtra("newsRegionId"));
//        extras.put("sourceCategory",  page.getRequest().getExtra("sourceCategory"));
//        extras.put("categoryId", page.getRequest().getExtra("categoryId"));
//        extras.put("subcategoryId", page.getRequest().getExtra("subcategoryId"));
//        extras.put("region", page.getRequest().getExtra("region"));
//        extras.put("type", page.getRequest().getExtra("type"));
//        return extras;
//    }
//
//    /**
//     * 向 Page对象中添加拓展字段
//     * @param page
//     * @param pageArticle
//     * */
//    public void addPageFields(Page page, PageArticle pageArticle){
//        page.putField("pageArticle", pageArticle);
//        page.putField("mediaId", page.getRequest().getExtra("mediaId"));
//        page.putField("mediaName", page.getRequest().getExtra("mediaName"));
//        page.putField("mediaIcon", page.getRequest().getExtra("mediaIcon"));
//        page.putField("mediaCategoryId", page.getRequest().getExtra("mediaCategoryId"));
//        page.putField("newsCategoryId", page.getRequest().getExtra("newsCategoryId"));
//        page.putField("newsRegionId",  page.getRequest().getExtra("newsRegionId"));
//        page.putField("sourceCategory",  page.getRequest().getExtra("sourceCategory"));
//        page.putField("categoryId",  page.getRequest().getExtra("categoryId"));
//        page.putField("subcategoryId",  page.getRequest().getExtra("subcategoryId"));
//        page.putField("region",  page.getRequest().getExtra("region"));
//        page.putField("type",  page.getRequest().getExtra("type"));
//    }
//
//    /**
//     *
//     * @Title: formatUrls
//     * @Description: 格式化url
//     * @param extend
//     * @param url
//     * @return
//     */
//    public  String formatUrls(String extend,String url){
//        try {
//            HashMap<String,String> extendMap = GSON.fromJson(extend, new TypeToken<HashMap<String, String>>(){}.getType());
//            for (Map.Entry<String, String> entry : extendMap.entrySet()) {
//                switch (entry.getKey()) {
//                    case "Y":
//                        url=url.replaceAll("\\{Y\\}", DateUtils.format(new Date(), "yyyy"));
//                        break;
//                    case "D":
//                        Date oldDate = DateUtils.parse(entry.getValue(), "yyyy-MM-dd");
//                        Date newDate = DateUtils.parse(DateUtils.format(new Date(), "yyyy-MM-dd"), "yyyy-MM-dd");
//                        url=url.replaceAll("\\{D\\}", String.valueOf((newDate.getTime()-oldDate.getTime())/86400000));
//                        break;
//                    default:
//                        break;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return url;
//    }
//
//    /**
//     * 向 Request对象中添加拓展字段
//     * @param mc
//     * @param url
//     * */
//    public Request addRequestFields( CrawlerMediaCategory mc,String url){
//        Request request = new Request(url)
//                .putExtra(Request.CYCLE_TRIED_TIMES, 1000)
//                .putExtra("name", mc.getName())
//                .putExtra("regex", mc.getRegex())
//                .putExtra("mediaCategoryId", mc.getId())
//                .putExtra("mediaId", mc.getMediaId())
//                .putExtra("mediaName", StringUtils.encode(mc.getMediaName()))
//                .putExtra("mediaIcon", mc.getMediaIcon())
//                .putExtra("newsCategoryId", mc.getNewsCategoryId())
//                .putExtra("newsRegionId", mc.getNewsRegionId())
//                .putExtra("sourceCategory", mc.getSourceCategory())
//                .putExtra("extend", mc.getExtend())
//                //新增三个属性 v1.2
//                .putExtra("categoryId", mc.getCategoryId())
//                .putExtra("subcategoryId", mc.getSubcategoryId())
//                .putExtra("region", mc.getRegion())
//                //新增 v1.3
//                .putExtra("type", mc.getType());
//        return request;
//    }
}
