package org.feidao.chapter52.service.impl;

import org.feidao.chapter52.dao.MongodbDao;
import org.feidao.chapter52.model.Heroic;
import org.feidao.chapter52.service.MongodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by feidao on 2019-09-17.
 */
@Service
public class MongodbServiceImpl implements MongodbService {
    @Autowired
    private MongodbDao mongodbDao;

    @Override
    public List<Heroic> findAll() {
        return mongodbDao.findAll();
    }

    @Override
    public Heroic findHeroicByName(String name) {
        return mongodbDao.findHeroicByName(name);
    }

    @Override
    public boolean addHeroic(Heroic heroic) {
        return mongodbDao.insertHeroic(heroic);
    }

    @Override
    public boolean deleteHeroic(int id) {
        return mongodbDao.deleteHeroic(id);
    }

    @Override
    public boolean updateHeroic(Heroic heroic) {
        return mongodbDao.updateHeroic(heroic);
    }
}
