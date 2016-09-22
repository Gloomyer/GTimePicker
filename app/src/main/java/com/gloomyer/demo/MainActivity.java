package com.gloomyer.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gloomyer.gtimepicker.GTimePIcker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GTimePIcker gtp = (GTimePIcker) findViewById(R.id.gtp);
        gtp.setTime(5, 59);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, gtp.getTime(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
