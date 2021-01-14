package cn.qd.peiwen.demo;

import androidx.appcompat.app.AppCompatActivity;
import cn.qd.peiwen.logger.PWLogger;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PWLogger.debug("debug");
        PWLogger.warn("warn");
        PWLogger.error("error");
        PWLogger.crash("dhdhhdhhd");
    }
}
