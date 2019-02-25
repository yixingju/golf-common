package com.pb.pojo;

public class Point extends BaseEntity{
    private static final long serialVersionUID = 2797826911351121472L;

    private Integer m_id;

    private Integer m_point;

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public Integer getM_point() {
        return m_point;
    }

    public void setM_point(Integer m_point) {
        this.m_point = m_point;
    }

    @Override
    public String toString() {
        return "Point{" +
                "mr_id=" + m_id +
                ", mr_point=" + m_point +
                '}';
    }
}
