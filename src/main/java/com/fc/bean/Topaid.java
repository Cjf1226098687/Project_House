package com.fc.bean;

import java.util.Date;

public class Topaid {
    private Integer id;

    private String houseId;

    private Date date;

    private Integer userlistId;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUserlistId() {
        return userlistId;
    }

    public void setUserlistId(Integer userlistId) {
        this.userlistId = userlistId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}