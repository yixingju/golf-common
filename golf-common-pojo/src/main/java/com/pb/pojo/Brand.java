package com.pb.pojo;

import java.io.Serializable;
import java.util.Date;

public class Brand implements Serializable {
    private long id;
    private Date createDate;
    private Date modifyDate;
    private String chineseName;
    private String englishName;
    private String desc;
    private String logo;
    private Integer type;
    private String url;
    private String story;
    private Integer status;

    public Brand() {}
    public Brand(long id, Date createDate, Date modifyDate, String chineseName, String englishName, String desc, String logo, Integer type, String url, String story, Integer status) {
        this.id = id;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.chineseName = chineseName;
        this.englishName = englishName;
        this.desc = desc;
        this.logo = logo;
        this.type = type;
        this.url = url;
        this.story = story;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", chineseName='" + chineseName + '\'' +
                ", englishName='" + englishName + '\'' +
                ", desc='" + desc + '\'' +
                ", logo='" + logo + '\'' +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", story='" + story + '\'' +
                ", status=" + status +
                '}';
    }
}
