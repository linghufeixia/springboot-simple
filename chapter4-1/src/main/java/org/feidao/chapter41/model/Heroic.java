package org.feidao.chapter41.model;

import java.io.Serializable;

/**
 * Created by feidao on 2019-09-10.
 * 英雄的实体
 */
public class Heroic implements Serializable {
    public int id;
    public String name = "";
    public String remarks = "";

    public Heroic(){

    }

    public Heroic(int id, String name, String remarks) {
        this.id= id;
        this.name = name;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
