package rulseWeb.domain.rulses;

import com.cparser.domain.Article.RulesType;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import org.hibernate.validator.constraints.NotEmpty;
import rulseWeb.domain.RulesModel;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: fangxueshun
 * Description: 文章规则
 * Date: 2017/3/9
 * Time: 16:48
 */
public class EntityRules {
    @NotEmpty
    @NotNull
    private RulesType rulesType;
    @NotEmpty
    @NotNull
    private RulesModel rulesModel;

    public RulesType getRulesType() {
        return rulesType;
    }

    public void setRulesType(RulesType rulesType) {
        this.rulesType = rulesType;
    }

    public RulesModel getRulesModel() {
        return rulesModel;
    }

    public void setRulesModel(RulesModel rulesModel) {
        this.rulesModel = rulesModel;
    }

    public static void main(String[] args) {
        EntityRules articleRules = new EntityRules();
        List<String> xpath = new ArrayList<>();
        xpath.add("fatherxpath1");
        xpath.add("fatherxpath2");
        RulesModel rulesModel = new RulesModel();
        rulesModel.setRulsName("文章名");
        rulesModel.setContentXpath(xpath);
        rulesModel.setNods(Arrays.asList(rulesModel.clone()));
        articleRules.setRulesModel(rulesModel);
        articleRules.setRulesType(RulesType.ARTICLE);
        Gson gson = new Gson();
        String jsonStr = "{\"rulesType\":\"ARTICLE\",\"rulesModel\":{\"rulsName\":\"文章名\",\"contentXpath\":[\"fatherxpath1\",\"fatherxpath2\"],\"nods\":[{\"rulsName\":\"文章名\",\"contentXpath\":[\"fatherxpath1\",\"fatherxpath2\"]}]}}";
        JsonParser jsonParser = new JsonParser();
        EntityRules articleRules1 = gson.fromJson(jsonStr,EntityRules.class);
        System.out.println(gson.toJson(articleRules));
        System.out.println(gson.toJson(articleRules1));
    }
}
