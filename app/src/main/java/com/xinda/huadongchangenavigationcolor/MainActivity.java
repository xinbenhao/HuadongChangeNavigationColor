package com.xinda.huadongchangenavigationcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity implements MyScrollView.ScrollViewListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationchangecolor);

    }



    @Override
    public void onScrollChanged(MyScrollView scrollView, int x, int y, int oldx, int oldy) {

    }
}
