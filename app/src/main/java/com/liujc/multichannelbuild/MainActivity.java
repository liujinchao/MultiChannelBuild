package com.liujc.multichannelbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView show_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        show_msg = (TextView) findViewById(R.id.show_msg);
        show_msg.setText(ChannelUtil.getFlavorChannel(this));
    }
}
