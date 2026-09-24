package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.h8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1574h8 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1790a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1791b;

    /* JADX INFO: renamed from: c */
    private final View f1792c;

    public C1574h8(View view, C1748l c1748l) {
        this.f1790a = c1748l;
        this.f1791b = c1748l.m4782Q();
        this.f1792c = view;
    }

    /* JADX INFO: renamed from: a */
    public long m2848a(AbstractC1589j3 abstractC1589j3) {
        long j;
        if (C1768p.m5160a()) {
            this.f1791b.m5171a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointM3800b = AbstractC1677p0.m3800b(this.f1792c.getContext());
        if (this.f1792c.isShown()) {
            j = 0;
        } else {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f1792c.getAlpha() < abstractC1589j3.m2979m0()) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f1792c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f1792c.getParent() == null) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f1792c.getContext(), this.f1792c.getWidth());
        if (iPxToDp < Math.min(abstractC1589j3.m2985s0(), pointM3800b.x)) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f1792c.getContext(), this.f1792c.getHeight());
        if (iPxToDp2 < abstractC1589j3.m2981o0()) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Rect rect = new Rect(0, 0, pointM3800b.x, pointM3800b.y);
        int[] iArr = {-1, -1};
        this.f1792c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.f1792c.getWidth() + i, iArr[1] + this.f1792c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity activityM2145b = this.f1790a.m4826e().m2145b();
        if (activityM2145b != null && !AbstractC1564g8.m2756a(this.f1792c, activityM2145b)) {
            if (C1768p.m5160a()) {
                this.f1791b.m5174b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (C1768p.m5160a()) {
            this.f1791b.m5171a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
