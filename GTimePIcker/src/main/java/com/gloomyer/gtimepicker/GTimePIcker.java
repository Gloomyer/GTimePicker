package com.gloomyer.gtimepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.gloomyer.gtimepicker.adapter.WheelAdapter;
import com.gloomyer.gtimepicker.view.WheelView;

/**
 * 时间选择器
 *
 * @author Gloomy
 * @date 2016年9月22日14:15:27
 */

public class GTimePIcker extends FrameLayout {

    private WheelView hours;
    private WheelView minute;

    public GTimePIcker(Context context) {
        this(context, null);
    }

    public GTimePIcker(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GTimePIcker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.time_select, this);
        hours = (WheelView) findViewById(R.id.hours);
        minute = (WheelView) findViewById(R.id.minute);

        hours.setAdapter(new WheelAdapter<String>() {
            @Override
            public int getItemsCount() {
                return 24;
            }

            @Override
            public String getItem(int index) {
                return "" + index;
            }

            @Override
            public int indexOf(String o) {
                return Integer.parseInt(o);
            }
        });


        minute.setAdapter(new WheelAdapter<String>() {
            @Override
            public int getItemsCount() {
                return 60;
            }

            @Override
            public String getItem(int index) {
                return "" + index;
            }

            @Override
            public int indexOf(String o) {
                return Integer.parseInt(o);
            }
        });
    }

    /**
     * 获取选择的事件
     *
     * @return 格式为HH:mm
     */
    public String getTime() {
        int hours = this.hours.getCurrentItem();
        int minute = this.minute.getCurrentItem();
        return ((hours < 10 ? "0" : "") + hours)
                + ":"
                + ((minute < 10 ? "0" : "") + minute);
    }

    public void setTime(int hours, int minute){
        this.hours.setCurrentItem(hours);
        this.minute.setCurrentItem(minute);
    }
}
