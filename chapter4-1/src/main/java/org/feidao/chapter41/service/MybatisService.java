package org.feidao.chapter41.service;

import org.feidao.chapter41.model.Heroic;

import java.util.List;

/**
 * Created by feidao on 2019-09-10.
 */
public interface MybatisService {
    boolean insertHeroic(Heroic heroic);

    boolean deleteHeroic(int id);

    boolean updateHeroic(Heroic heroic);

    List<Heroic> findList();
}
