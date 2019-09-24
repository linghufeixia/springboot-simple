package org.feidao.chapter3.model;

/**
 * Created by feidao on 2019-09-10.
 * 英雄的实体
 */
public class Heroic {
    public int id;
    public String name = "";
    public String remarks = "";

    public Heroic(int id, String name, String remarks) {
        this.id= id;
        this.name = name;
        this.remarks = remarks;
    }
}
