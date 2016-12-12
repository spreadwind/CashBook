package com.winorout.cashbook.common.model;

import java.util.Date;

/**
 * Created by micheal-yan on 2016/12/2.
 */

public class Finace {

    private int id;
    private int userId;			//用户Id
    private int categoryId;		//类目Id
    private double amount;		//金额
    private Date date;			//日期
    private String note;		//备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
