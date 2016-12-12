package com.winorout.cashbook.common.util;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.winorout.cashbook.common.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micheal-yan on 2016/12/2.
 */

public class DBUtils {

    //所有分类
    public static List<Category> categoryList = new ArrayList<>();

    /**
     * 初始化分类表，将所有默认分类存入其中
     * @param db 要存入的数据库
     */
    public static void initCategory(SQLiteDatabase db) {
        initCategoryList();
        for (int i = 0; i < categoryList.size(); i++) {
            ContentValues values = new ContentValues();
            values.put("categoryType", categoryList.get(i).getCategoryType());
            values.put("categoryName", categoryList.get(i).getCategoryName());
            values.put("categoryDesc", categoryList.get(i).getCategoryDesc());
            int id = (int) db.insert("Category", null, values);
            categoryList.get(i).setId(id);
            Log.d("TAG", "id : " + categoryList.get(i).getId()
                        + "\n categoryName : " + categoryList.get(i).getCategoryName());
        }
    }

    /**
     * 初始化类目集合，将所有类目存入其中
     */
    private static void initCategoryList() {
        categoryList.add(new Category("支出", "食物类", "面食、蔬菜、水果、零食、肉类、蛋类、豆类、海鲜、佐料、酒水、饮料、茶", null));
        categoryList.add(new Category("支出", "住房类", "水费、电费、暖气费、物业费、网络费、天然气费、数字电视费、房屋租赁费", null));
        categoryList.add(new Category("支出", "服饰类", "衣服、裤子、鞋子、内衣、包包、饰品、口罩、围巾、帽子、袜子", null));
        categoryList.add(new Category("支出", "交通类", "公交、出租、汽车、地铁、火车、飞机", null));
        categoryList.add(new Category("支出", "医药类", "药品、检查、住院", null));
        categoryList.add(new Category("支出", "生活类", "娱乐、理发、美容、健身、按摩、旅游、健身器材、书籍、学习", null));
        categoryList.add(new Category("支出", "日化类", "化妆品、清洁工具、厨房用品、卫生用品、洗涤用品", null));
        categoryList.add(new Category("支出", "通讯类", "话费、出差", null));
        categoryList.add(new Category("支出", "人情类", "见面礼、压岁钱、生日礼物、结婚随礼、请客吃饭、给父母", null));
        categoryList.add(new Category("支出", "其他", "", null));
        categoryList.add(new Category("收入", "工资", "", null));
        categoryList.add(new Category("收入", "红包", "", null));
        categoryList.add(new Category("收入", "兼职", "", null));
        categoryList.add(new Category("收入", "投资", "", null));
        categoryList.add(new Category("收入", "奖金", "", null));
        categoryList.add(new Category("收入", "利息", "", null));
        categoryList.add(new Category("收入", "生活费", "", null));
        categoryList.add(new Category("收入", "养老金", "", null));
        categoryList.add(new Category("收入", "其他", "", null));
    }
}
