package com.winorout.cashbook.qmyan.setting;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.winorout.cashbook.R;
import com.winorout.cashbook.qmyan.personcenter.PersonCenter;

public class SettingActivity extends Activity implements View.OnClickListener {

    private TextView title;
    private ImageView back;
    private LinearLayout personCenter;
    private LinearLayout help_layout;
    private LinearLayout update;
    private LinearLayout about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_setting);

        initView();
        initEvent();
    }

    private void initEvent() {
        back.setOnClickListener(this);
        personCenter.setOnClickListener(this);
        help_layout.setOnClickListener(this);
        update.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    private void initView() {
        title = (TextView) findViewById(R.id.title);
        title.setText("设置");
        back = (ImageView) findViewById(R.id.back);
        personCenter = (LinearLayout) findViewById(R.id.person_center);
        help_layout = (LinearLayout)findViewById(R.id.help_layout);
        update = (LinearLayout) findViewById(R.id.update_btn);
        about = (LinearLayout)findViewById(R.id.about_btn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.person_center:
                startActivity(new Intent(this, PersonCenter.class));
                finish();
                break;
            case R.id.help_layout:
                startActivity(new Intent(this,HelpActivity.class));
                finish();
                break;
            case R.id.update_btn:
                Toast.makeText(this,"当前已经是最新版",Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_btn:
                startActivity(new Intent(this,AboutActivity.class));
                finish();
                break;
        }
    }
}
