package com.gregacucnik.edittextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout llContainer = (LinearLayout)findViewById(R.id.llContainer);

        llContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llContainer.requestFocus();
            }
        });
    }
}
