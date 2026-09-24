package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.adsdk.ugeno.p090di.AbstractC2256ri;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.C3302pv;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3253di extends AbstractC2256ri<View> implements igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: di */
    private boolean f10942di;

    /* JADX INFO: renamed from: fi */
    private long f10943fi;
    private ri jbs;

    /* JADX INFO: renamed from: ka */
    private final Handler f10944ka;

    /* JADX INFO: renamed from: mj */
    private lr f10945mj;

    /* JADX INFO: renamed from: qt */
    private final Runnable f10946qt;

    /* JADX INFO: renamed from: sf */
    private final ViewTreeObserver.OnScrollChangedListener f10947sf;
    private boolean xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.di$lr */
    public interface lr {
        /* JADX INFO: renamed from: ri */
        void mo13775ri(boolean z);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.di$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo13776ri(boolean z);
    }

    public C3253di(Context context) {
        super(context);
        this.f10944ka = new igq(C3332vr.m14978lr().getLooper(), this);
        this.f10942di = true;
        this.xha = true;
        this.f10946qt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ka.di.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3253di.this.jbs != null) {
                    C3253di.this.jbs.mo13776ri(C3253di.this.xha);
                }
            }
        };
        this.f10947sf = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.di.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - C3253di.this.f10943fi > 500) {
                    C3253di.this.f10943fi = jElapsedRealtime;
                    C3253di.this.f10944ka.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void xha() {
        boolean zM14656ri = C3302pv.m14656ri(this, 50, -1, false);
        this.xha = zM14656ri;
        if (zM14656ri == this.f10942di) {
            return;
        }
        this.f10942di = zM14656ri;
        dzy.m16411ri(this.f10946qt);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f10947sf);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f10947sf);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        lr lrVar = this.f10945mj;
        if (lrVar != null) {
            lrVar.mo13775ri(z);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p090di.AbstractC2256ri
    /* JADX INFO: renamed from: qt */
    public View mo7476qt(int i) {
        return (View) this.f5611ri.get(i);
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what == 1) {
            xha();
        }
    }

    public void setSwiperVisibleChangeListener(ri riVar) {
        this.jbs = riVar;
    }

    public void setSwiperWindowFocusChangedListener(lr lrVar) {
        this.f10945mj = lrVar;
    }
}
