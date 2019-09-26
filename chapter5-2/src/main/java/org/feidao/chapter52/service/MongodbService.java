package org.feidao.chapter52.service;

import org.feidao.chapter52.model.Heroic;

import java.util.List;

/**
 * Created by feidao on 2019-09-17.
 */
public interface MongodbService {
    List<Heroic> findAll();
    Heroic findHeroicByName(String name) ;
    boolean addHeroic(Heroic heroic);
    boolean deleteHeroic(int id);
    boolean updateHeroic(Heroic heroic);
}
