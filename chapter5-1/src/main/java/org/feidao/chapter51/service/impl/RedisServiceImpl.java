package org.feidao.chapter51.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import org.feidao.chapter51.common.RestResult;
import org.feidao.chapter51.util.RedisConstants;
import org.feidao.chapter51.model.Heroic;
import org.feidao.chapter51.service.RedisService;

/**
 * Created by feidao on 2019-09-16.
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean addHeroic(Heroic heroic) {
        redisTemplate.opsForValue().set(RedisConstants.key, heroic);
        return true;
    }

    @Override
    public boolean deleteHeroic() {
        if (redisTemplate.hasKey(RedisConstants.key)) {
            redisTemplate.delete(RedisConstants.key);
        }
        return true;
    }


    @Override
    public String selectHeroic() {
        RestResult restResult = new RestResult();
        if (redisTemplate.hasKey(RedisConstants.key)) {
            Object object = redisTemplate.opsForValue().get(RedisConstants.key);
            restResult.setCode(200);
            restResult.setData(object);
        } else {
            restResult.setCode(500);
            restResult.setMsg("江湖上暂没有英雄！");
        }
        return JSON.toJSONString(restResult);
    }
}
