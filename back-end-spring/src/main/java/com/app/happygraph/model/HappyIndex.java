package com.app.happygraph.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class HappyIndex implements Serializable {

    //required
    private String id;
    private String userName;
    private Date indexDate;
    private int indexValue;
    //optional
    private String description;
    private Date createdDate;
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIndexValue() {
        return indexValue;
    }

    public void setIndexValue(int indexValue) {
        this.indexValue = indexValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getIndexDate() {
        return indexDate;
    }

    public void setIndexDate(Date indexDate) {
        this.indexDate = indexDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappyIndex that = (HappyIndex) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HappyIndex{");
        sb.append("id='").append(id).append('\'');
        sb.append(", indexValue=").append(indexValue);
        sb.append(", description='").append(description).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", indexDate=").append(indexDate);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append('}');
        return sb.toString();
    }
}
