package com.pb.pojo;

import java.util.Date;

public class Member extends BaseEntity{
    private static final long serialVersionUID = 7480145947252095332L;
    private Integer m_id;

    private String m_readme;
    //
    private String m_sex;
    //
    private String m_mobile;
    //
    private String m_idcard;
    //
    private Date m_birthday;
    //
    private String m_email;
    //
    private Integer m_defPoint;
    //
    private Date m_createDate;
    //
    private Date m_modifyDate;
    //
    private Integer mr_id;

    @Override
    public String toString() {
        return "Member{" +
                "m_id=" + m_id +
                ", m_readme='" + m_readme + '\'' +
                ", m_sex='" + m_sex + '\'' +
                ", m_mobile='" + m_mobile + '\'' +
                ", m_idcard='" + m_idcard + '\'' +
                ", m_birthday=" + m_birthday +
                ", m_email='" + m_email + '\'' +
                ", m_defPoint=" + m_defPoint +
                ", m_createDate=" + m_createDate +
                ", m_modifyDate=" + m_modifyDate +
                ", mr_id=" + mr_id +
                '}';
    }

    public void setM_id (Integer m_id){
        this.m_id=m_id;
    }

    public Integer getM_id(){
        return this.m_id;
    }
    public void setM_readme (String m_readme){
        this.m_readme=m_readme;
    }

    public String getM_readme(){
        return this.m_readme;
    }
    public void setM_sex (String m_sex){
        this.m_sex=m_sex;
    }

    public String getM_sex(){
        return this.m_sex;
    }
    public void setM_mobile (String m_mobile){
        this.m_mobile=m_mobile;
    }

    public String getM_mobile(){
        return this.m_mobile;
    }
    public void setM_idcard (String m_idcard){
        this.m_idcard=m_idcard;
    }

    public String getM_idcard(){
        return this.m_idcard;
    }
    public void setM_birthday (Date m_birthday){
        this.m_birthday=m_birthday;
    }

    public Date getM_birthday(){
        return this.m_birthday;
    }
    public void setM_email (String m_email){
        this.m_email=m_email;
    }

    public String getM_email(){
        return this.m_email;
    }
    public void setM_defPoint (Integer m_defPoint){
        this.m_defPoint=m_defPoint;
    }

    public Integer getM_defPoint(){
        return this.m_defPoint;
    }
    public void setM_createDate (Date m_createDate){
        this.m_createDate=m_createDate;
    }

    public Date getM_createDate(){
        return this.m_createDate;
    }
    public void setM_modifyDate (Date m_modifyDate){
        this.m_modifyDate=m_modifyDate;
    }

    public Date getM_modifyDate(){
        return this.m_modifyDate;
    }
    public void setMr_id (Integer mr_id){
        this.mr_id=mr_id;
    }

    public Integer getMr_id(){
        return this.mr_id;
    }

}
