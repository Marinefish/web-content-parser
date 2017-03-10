package rulseWeb.dao;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import rulseWeb.domain.rulses.EntityRules;

import javax.annotation.Resource;

/**
 * Author: fangxueshun
 * Description:
 * Date: 2017/3/10
 * Time: 10:26
 */
@Repository
public class RulesDao {
    @Resource(name = "mongoTemplateCrawlerContentParser")
    private MongoTemplate mongoTemplate;
    private final String COLLECTION_NAME = "rules";

    /*插入*/
    public void insert(EntityRules entityRules){
        createDb();
        mongoTemplate.insert(entityRules,COLLECTION_NAME);
    }

    public boolean createDb(){
        if(mongoTemplate.collectionExists(COLLECTION_NAME))
            return true;
        mongoTemplate.createCollection(COLLECTION_NAME);
        return mongoTemplate.collectionExists(COLLECTION_NAME);
    }
    public void creatIndex(){
        DBCollection dbCollection = mongoTemplate.getCollection(COLLECTION_NAME);
//        dbCollection.createIndex();
    }
}
