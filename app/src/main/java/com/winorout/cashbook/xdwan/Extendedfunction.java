package com.winorout.cashbook.xdwan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.winorout.cashbook.R;
import android.widget.TextView;

/**
 * Created by Mr-x on 2017/01/07.
 */

public class Extendedfunction extends Activity implements View.OnClickListener{
    private TextView moreinformationknows;
    private TextView backtomain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.extendedfunction);
        iniVaules();
        iniEvent();
    }

    private void iniEvent() {
        moreinformationknows.setOnClickListener(this);
        backtomain.setOnClickListener(this);
    }

    private void iniVaules() {
        moreinformationknows = (TextView)findViewById(R.id.moreinformationknows);
        backtomain = (TextView)findViewById(R.id.backtomain);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.moreinformationknows:
                Intent intent = new Intent(Extendedfunction.this, MoreinFormationKnows.class);
                startActivity(intent);
                break;
            case R.id.backtomain:
                finish();
                break;
        }
    }
}
