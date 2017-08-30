package com.lans.mybatis.bean;

import java.util.Date;

public class Day {
    private Integer id;

    private Date date;

    private Byte isBusinessDay;

    private Date createTime;

    private Date lastTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Byte getIsBusinessDay() {
        return isBusinessDay;
    }

    public void setIsBusinessDay(Byte isBusinessDay) {
        this.isBusinessDay = isBusinessDay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}