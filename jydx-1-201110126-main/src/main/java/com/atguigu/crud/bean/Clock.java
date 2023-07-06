package com.atguigu.crud.bean;


import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

public class Clock {
    private Integer clockId;
    private String clockName;
    private String clockStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date clockTime;

    public Clock(String clockName, String clockStatus, Date clockTime) {
        this.clockName = clockName;
        this.clockStatus = clockStatus;
        this.clockTime = clockTime;
    }
    public Clock() {

    }

    public Integer getClockId() {
        return clockId;
    }

    public void setClockId(Integer clockId) {
        this.clockId = clockId;
    }

    public String getClockName() {
        return clockName;
    }

    public void setClockName(String clockName) {
        this.clockName = clockName;
    }

    public String getClockStatus() {
        return clockStatus;
    }

    public void setClockStatus(String clockStatus) {
        this.clockStatus = clockStatus;
    }

    public Date getClockTime() {
        return clockTime;
    }

    public void setClockTime(Date clockTime) {
        this.clockTime = clockTime;
    }
}