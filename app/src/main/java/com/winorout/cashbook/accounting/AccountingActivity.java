package com.winorout.cashbook.accounting;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.winorout.cashbook.R;

/**
 * Created by Mr-x on 2016/12/04.
 */

public class AccountingActivity extends Activity implements View.OnClickListener {
    private ExpenseFragment expenseFragment = new ExpenseFragment();
    private IncomeFragment incomeFragment = new IncomeFragment();

    private View income_btn;
    private View expense_btn;
    private Button back_btn;
    private Button clean_btn;
    private TextView type_amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounting);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction0 = fragmentManager.beginTransaction();
        transaction0.replace(R.id.classify, expenseFragment);
        transaction0.commit();

        initView();
        initEvent();

    }

    public void initView() {
        clean_btn = (Button) findViewById(R.id.clean_btn);
        income_btn = findViewById(R.id.income_layout);
        expense_btn = findViewById(R.id.expense_layout);
        back_btn = (Button) findViewById(R.id.back_btn);
    }


    public void initEvent() {
        clean_btn.setOnClickListener(this);
        income_btn.setOnClickListener(this);
        expense_btn.setOnClickListener(this);
        back_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.income_layout:
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.classify, incomeFragment);
                transaction.show(incomeFragment);
                transaction.hide(expenseFragment);
                transaction.commit();
                break;

            case R.id.expense_layout:
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                transaction1.replace(R.id.classify, expenseFragment);
                transaction1.show(expenseFragment);
                transaction1.hide(incomeFragment);
                transaction1.commit();
                break;
            case R.id.back_btn:
                finish();
                break;

            case R.id.clean_btn:



            default:
                break;
//            case R.id.cloth_btn:
//                new Thread()
//                {
//                    @Override
//                    public void run() {
//                        Message message =new Message();
//                        message.what = 1;
//                        mHandler.sendMessage(message);
//                    }
//                }.start();
//                ImageView type_pic = (ImageView) findViewById(R.id.type_pic);
//                type_pic.setImageResource(R.drawable.cloth_png);
//
//                break;


        }

//        mHandler = new Handler()
//        {
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                if (msg.what == 1) {
//                    ImageView type_pic = (ImageView) findViewById(R.id.type_pic);
//                    type_pic.setImageResource(R.drawable.cloth_png);
//                }
//            }
//        };


    }


}
