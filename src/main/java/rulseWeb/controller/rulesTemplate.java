package rulseWeb.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import rulseWeb.domain.rulses.EntityRules;

/**
 * Author: fangxueshun
 * Description: 模板相关接口
 * Date: 2017/3/9
 * Time: 16:19
 */
@Controller
@RequestMapping("crawler/v0.1")
public class rulesTemplate {
    private Gson gson = new Gson();
    /*添加规则*/
    @RequestMapping(value = "/rules/template", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String getRulesTemplate(@RequestBody @Validated EntityRules entityRules, BindingResult result){
        if(result.hasErrors()){
            return gson.toJson("参数有误");
        }
        return gson.toJson(entityRules);
    }

}
