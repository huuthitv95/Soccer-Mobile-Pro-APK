package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: renamed from: com.mbridge.msdk.widget.a */
/* JADX INFO: compiled from: MBridgeNoDoubleClick.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractViewOnClickListenerC14227a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private long f41177a = 0;

    /* JADX INFO: renamed from: a */
    protected abstract void mo38475a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f41177a > 2000) {
            this.f41177a = timeInMillis;
            mo38475a(view);
        }
    }
}
