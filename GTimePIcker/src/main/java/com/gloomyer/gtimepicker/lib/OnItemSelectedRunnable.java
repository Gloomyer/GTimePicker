package com.gloomyer.gtimepicker.lib;

import com.gloomyer.gtimepicker.view.WheelView;

public final class OnItemSelectedRunnable implements Runnable {
    final WheelView loopView;

    public OnItemSelectedRunnable(WheelView loopview) {
        loopView = loopview;
    }

    @Override
    public final void run() {
        loopView.onItemSelectedListener.onItemSelected(loopView.getCurrentItem());
    }
}
