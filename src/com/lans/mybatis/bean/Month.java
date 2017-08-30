package com.lans.mybatis.bean;

import java.util.Date;

public class Month {
    private Integer id;

    private Short year;

    private Byte month;

    private Date startDate;

    private Date endDate;

    private Byte dayCount;

    private Byte businessDayCount;

    private Date firstBusinessDay;

    private Date lastBusinessDay;

    private Date createTime;

    private Date lastTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getDayCount() {
        return dayCount;
    }

    public void setDayCount(Byte dayCount) {
        this.dayCount = dayCount;
    }

    public Byte getBusinessDayCount() {
        return businessDayCount;
    }

    public void setBusinessDayCount(Byte businessDayCount) {
        this.businessDayCount = businessDayCount;
    }

    public Date getFirstBusinessDay() {
        return firstBusinessDay;
    }

    public void setFirstBusinessDay(Date firstBusinessDay) {
        this.firstBusinessDay = firstBusinessDay;
    }

    public Date getLastBusinessDay() {
        return lastBusinessDay;
    }

    public void setLastBusinessDay(Date lastBusinessDay) {
        this.lastBusinessDay = lastBusinessDay;
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