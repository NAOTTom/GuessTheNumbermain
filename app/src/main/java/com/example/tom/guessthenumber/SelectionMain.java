package com.example.tom.guessthenumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.View.OnClickListener;

public class SelectionMain extends AppCompatActivity implements OnClickListener {
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.blackbutton:
                themeUtils.changeToTheme(this, themeUtils.BLACK);
                break;
            case R.id.bluebutton:
                themeUtils.changeToTheme(this, themeUtils.BLUE);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_selection_main);

        Button button_number = (Button) findViewById(R.id.button_number);
        button_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionMain.this, GameActivity.class));
            }
        });
        Button button_more = (Button) findViewById(R.id.button_more);
        button_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionMain.this, SaveActivity.class));
            }
        });
        Button button_bottle = (Button) findViewById(R.id.button_bottle);
        button_bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionMain.this, MainActivityTwo.class));
            }
        });
        Button button_coin = (Button) findViewById(R.id.button_coin);
        button_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionMain.this, MainActivityThree.class));
            }
        });

        findViewById(R.id.bluebutton).setOnClickListener(this);
        findViewById(R.id.blackbutton).setOnClickListener(this);


    }
}





