package com.winorout.cashbook.wxwan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.winorout.cashbook.R;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

/**
 * Created by Mr-x on 2016/12/12.
 */

public class Target extends Activity implements View.OnClickListener{
    private Button Tag;
    private EditText tag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.target);
        initView();
        initEvent();
    }

    private void initView()
    {
        Tag = (Button)findViewById(R.id.sure);
        tag = (EditText)findViewById(R.id.tag);
    }

    private void initEvent() {
        Tag.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.sure:
                Toast.makeText(this, "保存成功!", Toast.LENGTH_SHORT).show();
                tag.setText("");
                finish();
                break;
        }
    }
}
