package com.pb.pojo;

import java.util.Date;

/**
 * @ClassName Course 球场管理
 * @Description TODO
 * @Author 侨居
 * @Date 2019/2/20 13:45
 * @Version 1.0
 */
public class Course extends BaseEntity{

    private static final long serialVersionUID = -2289497005626430918L;

    private Long id;
    private Date createDate;
    private Date modifyDate;
    private String name;
    private String address;
    private String desc;
    private Double score;
    private Integer status;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                ", score=" + score +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    /** 获取球场状态 0-》开馆  1--》闭馆 */
    public Integer getStatus() {
        return status;
    }

    /** 设置球场状态 0-》开馆  1--》闭馆 */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
