package org.feidao.chapter41.service.impl;

import org.feidao.chapter41.dao.MybatisDao;
import org.feidao.chapter41.model.Heroic;
import org.feidao.chapter41.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by feidao on 2019-09-10.
 */
@Service
public class MybatisServiceImpl implements MybatisService{
    @Autowired
    private MybatisDao mybatisDao;

    @Override
    public boolean insertHeroic(Heroic heroic) {
        return mybatisDao.insert(heroic);
    }

    @Override
    public boolean deleteHeroic(int id) {
        return mybatisDao.delete(id)                ;
    }

    @Override
    public boolean updateHeroic(Heroic heroic) {
        return mybatisDao.update(heroic);
    }

    @Override
    public List<Heroic> findList() {
        return mybatisDao.findAllList();
    }
}
