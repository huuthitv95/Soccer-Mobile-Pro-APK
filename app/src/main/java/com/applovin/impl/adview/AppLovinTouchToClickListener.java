package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private final long f1017a;

    /* JADX INFO: renamed from: b */
    private final int f1018b;

    /* JADX INFO: renamed from: c */
    private final int f1019c;

    /* JADX INFO: renamed from: d */
    private final ClickRecognitionState f1020d;

    /* JADX INFO: renamed from: e */
    private long f1021e;

    /* JADX INFO: renamed from: f */
    private PointF f1022f;

    /* JADX INFO: renamed from: g */
    private boolean f1023g;

    /* JADX INFO: renamed from: h */
    private final Context f1024h;

    /* JADX INFO: renamed from: i */
    private final OnClickListener f1025i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(C1748l c1748l, C1831z4 c1831z4, Context context, OnClickListener onClickListener) {
        this.f1017a = ((Long) c1748l.m4801a(C1831z4.f3895c0)).longValue();
        this.f1018b = ((Integer) c1748l.m4801a(C1831z4.f3904d0)).intValue();
        this.f1019c = AppLovinSdkUtils.dpToPx(context, ((Integer) c1748l.m4801a(C1831z4.f3940h0)).intValue());
        this.f1020d = ClickRecognitionState.values()[((Integer) c1748l.m4801a(c1831z4)).intValue()];
        this.f1024h = context;
        this.f1025i = onClickListener;
    }

    /* JADX INFO: renamed from: a */
    private float m1890a(float f) {
        return f / this.f1024h.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: a */
    private float m1891a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return m1890a((float) Math.sqrt((f * f) + (f2 * f2)));
    }

    /* JADX INFO: renamed from: a */
    private void m1892a(View view, MotionEvent motionEvent) {
        this.f1025i.onClick(view, motionEvent);
        this.f1023g = true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1893a(MotionEvent motionEvent) {
        if (this.f1019c <= 0) {
            return true;
        }
        Point pointM3800b = AbstractC1677p0.m3800b(this.f1024h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.f1019c;
        float f = i;
        return rawX >= f && rawY >= f && rawX <= ((float) (pointM3800b.x - i)) && rawY <= ((float) (pointM3800b.y - i));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f1023g && this.f1020d == ClickRecognitionState.ACTION_POINTER_UP) {
                    m1892a(view, motionEvent);
                }
            } else if (!this.f1023g && this.f1020d == ClickRecognitionState.ACTION_UP) {
                m1892a(view, motionEvent);
            } else if (this.f1020d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1021e;
                float fM1891a = m1891a(this.f1022f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f1023g) {
                    long j = this.f1017a;
                    if ((j < 0 || jElapsedRealtime < j) && ((i = this.f1018b) < 0 || fM1891a < i)) {
                        m1892a(view, motionEvent);
                    }
                }
            }
        } else if (this.f1020d != ClickRecognitionState.ACTION_DOWN) {
            this.f1021e = SystemClock.elapsedRealtime();
            this.f1022f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f1023g = false;
        } else if (m1893a(motionEvent)) {
            m1892a(view, motionEvent);
        }
        return true;
    }
}
