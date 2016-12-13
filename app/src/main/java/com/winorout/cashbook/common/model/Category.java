package com.winorout.cashbook.common.model;

/**
 * Created by micheal-yan on 2016/12/2.
 */

public class Category {

    private int id;
    private String categoryType;	//收支类型（收入，支出）
    private String categoryName;	//类目名称
    private String categoryDesc;	//类目描述
    private byte[] categoryPic;		//类目图片

    public Category(String categoryType, String categoryName, String categoryDesc, byte[] categoryPic) {
        this.categoryPic = categoryPic;
        this.categoryType = categoryType;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public byte[] getCategoryPic() {
        return categoryPic;
    }

    public void setCategoryPic(byte[] categoryPic) {
        this.categoryPic = categoryPic;
    }
}
