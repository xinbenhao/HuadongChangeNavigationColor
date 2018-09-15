package com.xinda.huadongchangenavigationcolor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by lenovo on 2018/9/11.
 */

//设置ScrollView 为了监听ScrollView的滑动
public class MyScrollView extends ScrollView {

    //设置一个监听器
    public interface ScrollViewListener {
        void onScrollChanged(MyScrollView scrollView, int x, int y, int oldx, int oldy);
    }
    //定义一个监听器对象
    private ScrollViewListener scrollViewListener = null;


    //定义三个构造器方法
    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if(scrollViewListener!=null)
        {
            scrollViewListener.onScrollChanged(this,l,t,oldl,oldt);
        }
    }
}
