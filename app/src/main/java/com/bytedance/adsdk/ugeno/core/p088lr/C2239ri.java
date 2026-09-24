package com.bytedance.adsdk.ugeno.core.p088lr;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2239ri {

    /* JADX INFO: renamed from: ri */
    public String f5549ri = "GesThrough_";

    /* JADX INFO: renamed from: lr */
    private List<MotionEvent> f5548lr = new ArrayList();

    /* JADX INFO: renamed from: ik */
    private Set<String> f5547ik = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: ri */
    public void m7379ri(View view) {
        if (this.f5548lr.isEmpty() || this.f5547ik == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.f5549ri, "Re-dispatch motionEvents.size(): " + this.f5548lr.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.lr.ri.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : C2239ri.this.f5548lr) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        C2239ri.this.f5547ik.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                C2239ri.this.f5548lr.clear();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: ri */
    public void m7380ri(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.f5548lr == null) {
            return;
        }
        this.f5549ri = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.f5548lr.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i, i2);
        this.f5548lr.add(motionEventObtain);
    }

    /* JADX INFO: renamed from: ri */
    public void m7381ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (this.f5548lr.isEmpty() || this.f5547ik == null || abstractViewOnTouchListenerC2318ik == null || abstractViewOnTouchListenerC2318ik.m7879sf() == null || abstractViewOnTouchListenerC2318ik.m7879sf().getRootView() == null) {
            return;
        }
        m7379ri(abstractViewOnTouchListenerC2318ik.m7879sf());
    }

    /* JADX INFO: renamed from: ri */
    public void m7382ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        if (abstractViewOnTouchListenerC2318ik == null || motionEvent == null || this.f5548lr == null) {
            return;
        }
        m7380ri(abstractViewOnTouchListenerC2318ik.m7879sf(), abstractViewOnTouchListenerC2318ik.m7885xd(), motionEvent);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7383ri(MotionEvent motionEvent) {
        if (motionEvent == null || this.f5547ik == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.f5547ik.contains(motionEvent.getDownTime() + "_" + pointerId);
    }
}
