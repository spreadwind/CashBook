package com.winorout.cashbook.qmyan.personcenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.winorout.cashbook.R;
import com.winorout.cashbook.main.MainActivity;
import com.winorout.cashbook.qmyan.setting.SettingActivity;

public class PersonCenter extends Activity implements View.OnClickListener {

    private TextView title;
    private ImageView back;
    private TextView exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_person_center);

        initView();
        initEvent();
    }

    private void initEvent() {
        back.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    private void initView() {
        title = (TextView) findViewById(R.id.title);
        title.setText("个人中心");
        back = (ImageView) findViewById(R.id.back);
        exit = (TextView) findViewById(R.id.exit);
        exit.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                startActivity(new Intent(this, SettingActivity.class));
                finish();
                break;
            case R.id.exit:
                SharedPreferences.Editor editor = getSharedPreferences("loginUser", Context.MODE_PRIVATE).edit();
                editor.putBoolean("isLogin", false);
                editor.commit();
                startActivity(new Intent(PersonCenter.this, MainActivity.class));
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, SettingActivity.class));
        finish();
    }

}
