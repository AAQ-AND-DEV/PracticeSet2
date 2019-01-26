package com.aaqanddev.practiceset2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        TextView tv = new TextView(this);
        tv.setText("wow! THIS IS GOING TO BE A BERRRRRRRRRYYYYYYYYYYYYYY LONG STRINGGGGGGGGGGGGGGG");
        tv.setAllCaps(true);
        tv.setTextSize(48);
        tv.setWidth(48);
        tv.setHeight(96);
        tv.setEllipsize(TextUtils.TruncateAt.END);
        tv.setShadowLayer(5, 1, 1, Color.parseColor("#000000"));
        tv.setTextColor(Color.parseColor("#dd2121"));
        //interesting that #ddd didn't work as shorthand for hexadecimal #dddddd
        tv.setBackgroundColor(Color.parseColor("#dddddd"));
        tv.setMaxLines(2);
        setContentView(tv);
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }
    public void display2AsFloat(float val){
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        String valAsString = String.valueOf(val);
        t.setText(valAsString);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }
}