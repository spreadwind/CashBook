package com.winorout.cashbook.xdwan;

import android.app.Activity;
import android.os.Bundle;

import com.winorout.cashbook.R;

import android.view.View;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by Mr-x on 2017/01/07.
 */

public class MoreinFormationKnows extends Activity implements View.OnClickListener{
    private TextView backs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.moreinformationknows);
        initValue();
        initEvent();
    }

    private void initValue() {
        backs = (TextView)findViewById(R.id.backs);
    }

    private void initEvent() {
        backs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.backs:
                finish();
                break;
        }
    }
}
