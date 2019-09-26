package org.feidao.chapter41.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.feidao.chapter41.model.Heroic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by feidao on 2019-09-10.
 */
public interface MybatisDao {
    List<Heroic> findAllList();

    boolean insert(@Param("heroic") Heroic heroic);

    boolean delete(int id);

    boolean update(@Param("heroic")Heroic heroic);


}
