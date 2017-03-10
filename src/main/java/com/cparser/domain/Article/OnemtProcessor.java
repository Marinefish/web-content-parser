package com.cparser.domain.Article;

//import com.onemt.news.crawler.business.processor.domain.PageArticle;
//import com.onemt.news.crawler.cache.ArticleHotCache;
//import com.onemt.news.crawler.common.Constants;
//import com.onemt.news.crawler.utils.StringUtils;
//import us.codecraft.webmagic.Page;
//import us.codecraft.webmagic.Request;
//import us.codecraft.webmagic.Site;
//import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/3/4
 * Time: 14:42
 */
public class OnemtProcessor {
//    private ProcessorUtil processorUtil = new ProcessorUtil();
//    public Site site;
//    public CommonRulesDomain commonRulesDomain = null;
//    @Override
//    public void process(Page page) {
//        if (null != page.getRequest().getExtra("name")) {
//            if("index".equals(page.getRequest().getExtra("extend"))){
//                processIndex(page);
//            }else{
//                processList(page);
//            }
//        } else {
//            processDetail(page);
//        }
//    }
//
//    @Override
//    public Site getSite() {
//        return site;
//    }
//
//    /**
//     *
//     * @Title: processList
//     * @Description: 处理列表页面
//     * @param @param page
//     * @return void
//     * @throws
//     */
//    private void processList(Page page){
//        List<String> newUrls = new ArrayList<>();
//        for(String xpath:commonRulesDomain.getLinksRules().getXpathRules()){
//            newUrls.addAll(page.getHtml().xpath(xpath).all());
//        }
//        //去重
//        newUrls = new ArrayList<>(new HashSet<>(newUrls));
//        //转换链接中的阿语
//        newUrls = StringUtils.urlEncodeLastUrl(newUrls);
//        putNewPages(page,newUrls);
//    }
//
//
//    /**
//     *
//     * @Title: processIndex
//     * @Description: 处理热门页面（主页）
//     * @param page
//     */
//    private void processIndex(Page page) {
//       //TODO
//    }
//
//    /**
//     *
//     * @Title: processDetail
//     * @Description:  处理详情页面
//     * @param @param page
//     * @return void
//     * @throws
//     */
//    private void processDetail(Page page){
//        List<String> tags = new ArrayList<>();
////        PageArticle pageArticle = diffbotExtra.extra(page.getUrl().get());
//        //TODO 获取日期
////        detailFetch(page, pageArticle, tags);
//    }
//
//    /**
//     *
//     * @Title: putFeaturePages
//     * @Description: 热门链接加入
//     * @param @param page
//     * @param @param featureUrls
//     * @return void
//     * @throws
//     */
//    protected void putFeaturePages(Page page,List<String> featureUrls){
//        if(null!=featureUrls&&featureUrls.size()>0){
//            ArticleHotCache.getInstance(Constants.jp).setHots(featureUrls);
//        }
//
//    }
//    /**
//     *
//     * @Title: putNewPages
//     * @Description: 新链接加入池
//     * @param @param page
//     * @param @param newUrls
//     * @param @param featureUrls
//     * @return void
//     * @throws
//     */
//    protected void putNewPages(Page page,List<String> newUrls){
//        if(null==newUrls||newUrls.size()<=0){
//            return;
//        }
//        Map<String, Object> extras = processorUtil.getExtras(page);
//        for(String urlStr:newUrls){
//            Request request = new Request(urlStr);
//            request.setExtras(extras);
//            page.addTargetRequest(request);
//            page.setNeedCycleRetry(true);
//        }
//        page.getResultItems().setSkip(true);
//    }
//
//
//
//    /**
//     *
//     * @Title: detailFetch
//     * @Description: 组装文章页面详情,放入page
//     * @param @param page
//     * @param @param pageArticle
//     * @param @param tags
//     * @return void
//     * @throws
//     */
//    protected void detailFetch(Page page, PageArticle pageArticle, List<String> tags){
//        if(null!=pageArticle){
//            pageArticle.setTags(tags);
//            processorUtil.addPageFields(page,pageArticle);
//        }
//    }

}


