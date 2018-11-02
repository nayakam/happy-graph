package com.app.happygraph.model;

import java.util.Date;

public class HappyIndexBuilder {

    //required
    private String id;
    private String userName;
    private Date indexDate;
    private int indexValue;
    //optional
    private String description;
    private Date createdDate;
    private Date updateDate;

    public HappyIndex build() {
        HappyIndex happyIndex = new HappyIndex();
        happyIndex.setId(this.id);
        happyIndex.setUserName(this.userName);
        happyIndex.setIndexDate(this.indexDate);
        happyIndex.setIndexValue(this.indexValue);
        happyIndex.setDescription(this.description);
        happyIndex.setCreatedDate(this.createdDate);
        happyIndex.setUpdateDate(this.updateDate);
        return happyIndex;
    }

    public HappyIndexBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public HappyIndexBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public HappyIndexBuilder setIndexDate(Date indexDate) {
        this.indexDate = indexDate;
        return this;
    }

    public HappyIndexBuilder setIndexValue(int indexValue) {
        this.indexValue = indexValue;
        return this;
    }

    public HappyIndexBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public HappyIndexBuilder setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public HappyIndexBuilder setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }
}
