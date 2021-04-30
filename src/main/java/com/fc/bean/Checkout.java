package com.fc.bean;

public class Checkout {
    private Integer cid;

    private String houseId;

    private Integer userlistId;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public Integer getUserlistId() {
        return userlistId;
    }

    public void setUserlistId(Integer userlistId) {
        this.userlistId = userlistId;
    }
}