package org.feidao.chapter52.dao;

import java.util.List;

import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import com.mongodb.client.result.DeleteResult;

import org.feidao.chapter52.model.Heroic;

/**
 * Created by feidao on 2019-09-17.
 */
@Component
public class MongodbDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Heroic>  findAll(){
        return  mongoTemplate.findAll(Heroic.class);
    }

    public Heroic findHeroicByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        Heroic heroic = mongoTemplate.findOne(query, Heroic.class);
        return heroic;
    }

    public boolean insertHeroic(Heroic heroic){
        mongoTemplate.save(heroic);
        return true;
    }

    public boolean deleteHeroic(int id){
        Query query =  new Query(Criteria.where("id").is(id));
        DeleteResult deleteResult =  mongoTemplate.remove(query,Heroic.class);
        return true;
    }

    public boolean updateHeroic(Heroic heroic){
        Query query =  new Query(Criteria.where("id").is(heroic.id));
        Update update = new Update();
        if(!StringUtils.isEmpty(heroic.name)){
            update.set("name", heroic.name);
        }
        if(!StringUtils.isEmpty(heroic.remarks)) {
            update.set("remarks", heroic.remarks);
        }
        UpdateResult  updateResult= mongoTemplate.updateFirst(query,update, Heroic.class);
        return true;
    }


}
