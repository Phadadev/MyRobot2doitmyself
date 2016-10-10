package com.pw.paphat.myrobot2doitmyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Explicit
        textView = (TextView) findViewById(R.id.data);
        seekBar = (SeekBar) findViewById(R.id.seekbar);



    }   //Main Method
}   //Main Class
