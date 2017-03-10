package rulseWeb.domain;

import java.util.List;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/3/4
 * Time: 15:21
 */
public class CommonRulesDomain {

    private String processorName;//处理器名，一个网站统一使用一个
    private String processorSite;//域名
    private LinksRules linksRules;
    private ArticleRules articleRules;


    public LinksRules getLinksRules() {
        return linksRules;
    }

    public void setLinksRules(LinksRules linksRules) {
        this.linksRules = linksRules;
    }

    public ArticleRules getArticleRules() {
        return articleRules;
    }

    public void setArticleRules(ArticleRules articleRules) {
        this.articleRules = articleRules;
    }


    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getProcessorSite() {
        return processorSite;
    }

    public void setProcessorSite(String processorSite) {
        this.processorSite = processorSite;
    }


    /**
     * 链接列表规则
     * */
    public class LinksRules {
        public List<String> getXpathRules() {
            return xpathRules;
        }

        public void setXpathRules(List<String> xpathRules) {
            this.xpathRules = xpathRules;
        }

        List<String> xpathRules;
    }

    /**
     * 文章规则
     * */
    public class ArticleRules{
        List<String> titleRules;
        List<String> authorRules;
        List<String> dateRules;
        List<String> contentRules;
        List<String> imageRules;

        public List<String> getTitleRules() {
            return titleRules;
        }

        public void setTitleRules(List<String> titleRules) {
            this.titleRules = titleRules;
        }

        public List<String> getAuthorRules() {
            return authorRules;
        }

        public void setAuthorRules(List<String> authorRules) {
            this.authorRules = authorRules;
        }

        public List<String> getDateRules() {
            return dateRules;
        }

        public void setDateRules(List<String> dateRules) {
            this.dateRules = dateRules;
        }

        public List<String> getContentRules() {
            return contentRules;
        }

        public void setContentRules(List<String> contentRules) {
            this.contentRules = contentRules;
        }

        public List<String> getImageRules() {
            return imageRules;
        }

        public void setImageRules(List<String> imageRules) {
            this.imageRules = imageRules;
        }
    }
}
