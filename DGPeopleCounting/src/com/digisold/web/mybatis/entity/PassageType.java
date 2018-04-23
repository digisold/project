package com.digisold.web.mybatis.entity;

import java.util.Date;

public class PassageType {
    private Integer id;

    private String storeId;

    private String name;

    private String creator;

    private Date createDate;

    private String updater;

    private Date updateDate;

    public PassageType(Integer id, String storeId, String name, String creator, Date createDate, String updater, Date updateDate) {
        this.id = id;
        this.storeId = storeId;
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;
        this.updater = updater;
        this.updateDate = updateDate;
    }

    public PassageType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}