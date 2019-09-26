package org.feidao.chapter52.model;

import java.io.Serializable;

/**
 * Created by feidao on 2019-09-16.
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
}
