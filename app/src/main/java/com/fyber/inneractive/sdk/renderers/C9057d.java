package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8172q0;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.response.C9088f;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9159j;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C9057d {

    /* JADX INFO: renamed from: b */
    public final RelativeLayout f21192b;

    /* JADX INFO: renamed from: i */
    public final C9063g f21199i;

    /* JADX INFO: renamed from: c */
    public float f21193c = 0.0f;

    /* JADX INFO: renamed from: d */
    public int f21194d = 1;

    /* JADX INFO: renamed from: e */
    public float f21195e = 0.0f;

    /* JADX INFO: renamed from: f */
    public long f21196f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f21197g = false;

    /* JADX INFO: renamed from: h */
    public boolean f21198h = false;

    /* JADX INFO: renamed from: j */
    public final RunnableC9053b f21200j = new RunnableC9053b(this);

    /* JADX INFO: renamed from: a */
    public final C9159j f21191a = new C9159j(4, new C9055c());

    public C9057d(C9088f c9088f, RelativeLayout relativeLayout, C9063g c9063g) {
        this.f21192b = relativeLayout;
        this.f21199i = c9063g;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX INFO: renamed from: a */
    public final void m21860a() {
        boolean z;
        String str;
        IAlog.m21945a("IAVisibilityTracker: onCheckVisibility", new Object[0]);
        float f = this.f21194d / 100.0f;
        C9159j c9159j = this.f21191a;
        Object objPoll = c9159j.f21456a.poll();
        if (objPoll == null) {
            objPoll = c9159j.f21457b.mo21857a();
        }
        Rect rect = (Rect) objPoll;
        RelativeLayout relativeLayout = this.f21192b;
        float fWidth = (relativeLayout.getParent() != null && relativeLayout.isShown() && relativeLayout.hasWindowFocus() && relativeLayout.getGlobalVisibleRect(rect)) ? (rect.width() * rect.height()) / (relativeLayout.getWidth() * relativeLayout.getHeight()) : 0.0f;
        this.f21191a.f21456a.offer(rect);
        this.f21193c = fWidth;
        if (fWidth >= f) {
            float f2 = this.f21195e * 1000.0f;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f21196f;
            if (f2 >= jCurrentTimeMillis - j || j == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        IAlog.m21945a("BannerVisibilityTracker | visible = %s, minVis = %f", Boolean.valueOf(z), Float.valueOf(f));
        if (!z || !this.f21197g) {
            if (this.f21197g) {
                float f3 = this.f21193c;
                if (f3 < f) {
                    this.f21196f = 0L;
                } else if (f3 >= f && this.f21196f == 0) {
                    this.f21196f = System.currentTimeMillis();
                }
                Handler handler = AbstractC9183r.f21478b;
                handler.removeCallbacks(this.f21200j);
                handler.postDelayed(this.f21200j, 50L);
                return;
            }
            return;
        }
        if (this.f21199i == null || this.f21198h) {
            return;
        }
        this.f21198h = true;
        IAlog.m21945a("BannerVisibilityTracker | firing viewable", new Object[0]);
        C9070n c9070n = this.f21199i.f21208a;
        c9070n.getClass();
        try {
            AbstractC8236x abstractC8236x = c9070n.f17958b;
            if (abstractC8236x == null || ((C8172q0) abstractC8236x).f18374b == null || (str = ((C9088f) ((C8172q0) abstractC8236x).f18374b).f21321u) == null || str.trim().length() <= 0) {
                return;
            }
            IAlog.m21949e("%sfiring banner mrc visibility impression!", IAlog.m21943a(c9070n));
            IAlog.m21948d("MRC_VISIBILITY_IMPRESSION", new Object[0]);
            C8435z0.m20813b(str);
        } catch (Exception unused) {
        }
    }
}
