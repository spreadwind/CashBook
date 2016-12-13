package com.winorout.cashbook.qmyan.setting;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.winorout.cashbook.R;
import com.winorout.cashbook.qmyan.personcenter.PersonCenter;

public class SettingActivity extends Activity implements View.OnClickListener {

    private TextView title;
    private ImageView back;
    private LinearLayout personCenter;

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
    }

    private void initView() {
        title = (TextView) findViewById(R.id.title);
        title.setText("设置");
        back = (ImageView) findViewById(R.id.back);
        personCenter = (LinearLayout) findViewById(R.id.person_center);
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
        }
    }
}
