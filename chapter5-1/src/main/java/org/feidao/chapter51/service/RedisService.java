package org.feidao.chapter51.service;


import org.feidao.chapter51.model.Heroic;

import java.util.List;

/**
 * Created by feidao on 2019-09-16.
 */
public interface RedisService {
    boolean addHeroic(Heroic heroic);

    boolean deleteHeroic();

    String selectHeroic();
}
