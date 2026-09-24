package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import com.applovin.impl.sdk.C1768p;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.applovin.impl.l0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1606l0 extends AppLovinWebViewBase {

    /* JADX INFO: renamed from: b */
    private static Boolean f2003b;

    /* JADX INFO: renamed from: a */
    private final AtomicReference f2004a;

    public AbstractC1606l0(Context context) {
        super(context);
        this.f2004a = new AtomicReference();
        if (f2003b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f2003b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                C1768p.m5167h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f2003b = Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3112a() {
        return this.f2004a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f2004a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f2004a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f2004a.set(MotionEvent.obtain(motionEvent));
        if (f2003b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
