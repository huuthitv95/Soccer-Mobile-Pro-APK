package com.fyber.inneractive.sdk.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.mraid.AbstractC8349y;
import com.fyber.inneractive.sdk.mraid.C8319a0;
import com.fyber.inneractive.sdk.mraid.C8323c0;
import com.fyber.inneractive.sdk.mraid.C8325d0;
import com.fyber.inneractive.sdk.mraid.C8348x;
import com.fyber.inneractive.sdk.mraid.C8350z;
import com.fyber.inneractive.sdk.mraid.EnumC8329f0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.i1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9240i1 extends AbstractC9238i {

    /* JADX INFO: renamed from: A */
    public boolean f21614A;

    /* JADX INFO: renamed from: B */
    public boolean f21615B;

    /* JADX INFO: renamed from: C */
    public boolean f21616C;

    /* JADX INFO: renamed from: D */
    public boolean f21617D;

    /* JADX INFO: renamed from: E */
    public boolean f21618E;

    /* JADX INFO: renamed from: F */
    public boolean f21619F;

    /* JADX INFO: renamed from: G */
    public final EnumC9221c0 f21620G;

    /* JADX INFO: renamed from: H */
    public C8271e f21621H;

    /* JADX INFO: renamed from: I */
    public AbstractC8280e f21622I;

    /* JADX INFO: renamed from: J */
    public final RunnableC9228e1 f21623J;

    /* JADX INFO: renamed from: K */
    public final ViewTreeObserverOnPreDrawListenerC9231f1 f21624K;

    /* JADX INFO: renamed from: L */
    public final RunnableC9234g1 f21625L;

    /* JADX INFO: renamed from: M */
    public final RunnableC9237h1 f21626M;

    /* JADX INFO: renamed from: u */
    public int f21627u;

    /* JADX INFO: renamed from: v */
    public int f21628v;

    /* JADX INFO: renamed from: w */
    public int f21629w;

    /* JADX INFO: renamed from: x */
    public int f21630x;

    /* JADX INFO: renamed from: y */
    public int f21631y;

    /* JADX INFO: renamed from: z */
    public int f21632z;

    public AbstractC9240i1(boolean z, EnumC9221c0 enumC9221c0, C8006r c8006r) {
        super(z, c8006r);
        this.f21627u = -1;
        this.f21628v = -1;
        this.f21629w = -1;
        this.f21630x = -1;
        this.f21631y = -1;
        this.f21632z = -1;
        this.f21614A = false;
        this.f21615B = true;
        this.f21616C = false;
        this.f21617D = false;
        this.f21618E = false;
        this.f21622I = null;
        this.f21623J = new RunnableC9228e1(this);
        this.f21624K = new ViewTreeObserverOnPreDrawListenerC9231f1(this);
        this.f21625L = new RunnableC9234g1(this);
        this.f21626M = new RunnableC9237h1(this);
        this.f21620G = enumC9221c0;
    }

    /* JADX INFO: renamed from: a */
    public void mo22068a(Context context, boolean z) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        Rect rect = new Rect();
        boolean z2 = context instanceof Activity;
        if (z2 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.top;
        View viewFindViewById = (!z2 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(R.id.content);
        int top = viewFindViewById != null ? viewFindViewById.getTop() - i : 0;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        double d = i2;
        double d2 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d2 * d);
        int heightDp = (int) (d2 * ((double) i3));
        int iM21998b = (i3 - i) - top;
        C9248m c9248m = this.f21565b;
        if (c9248m == null || c9248m.getScaleX() == 1.0f || this.f21565b.getScaleY() == 1.0f) {
            this.f21627u = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * d);
        } else {
            widthDp = this.f21565b.getWidthDp();
            heightDp = this.f21565b.getHeightDp();
            iM21998b = (AbstractC9174o.m21998b(this.f21565b.getHeightDp()) - i) - top;
            this.f21627u = this.f21629w;
        }
        this.f21628v = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iM21998b));
        if (this.f21629w == widthDp && this.f21630x == heightDp) {
            return;
        }
        this.f21629w = widthDp;
        this.f21630x = heightDp;
        m22081a(new C8323c0(widthDp, heightDp));
        m22081a(new C8319a0(this.f21627u, this.f21628v));
        m22081a(new C8350z(this.f21627u, this.f21628v));
        int i4 = this.f21631y;
        if (i4 > 0 && this.f21632z > 0) {
            m22081a(new C8348x(AbstractC9174o.m22001c(i4), AbstractC9174o.m22001c(this.f21632z)));
            return;
        }
        C9248m c9248m2 = this.f21565b;
        if (c9248m2 == null || c9248m2.getWidth() <= 0 || this.f21565b.getHeight() <= 0) {
            return;
        }
        m22081a(new C8348x(AbstractC9174o.m22001c(this.f21565b.getWidth()), AbstractC9174o.m22001c(this.f21565b.getHeight())));
    }

    /* JADX INFO: renamed from: a */
    public final void m22081a(AbstractC8349y abstractC8349y) {
        if (this.f21565b != null) {
            String str = "{" + abstractC8349y.toString() + "}";
            this.f21565b.m22085a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.m21949e("Fire changes: %s", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22082a(ArrayList arrayList) {
        if (this.f21565b != null) {
            String string = arrayList.toString();
            if (string.length() < 2) {
                return;
            }
            String str = "{" + string.substring(1, string.length() - 1) + "}";
            this.f21565b.m22085a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.m21949e("Fire changes: %s", str);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo22075j() {
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            c9248m.m22085a("window.mraidbridge.fireReadyEvent();");
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo21938k() {
        ArrayList arrayList = new ArrayList();
        C9248m c9248m = this.f21565b;
        if (c9248m == null || c9248m.getScaleX() == 1.0f || this.f21565b.getScaleY() == 1.0f) {
            arrayList.add(new C8323c0(this.f21629w, this.f21630x));
            arrayList.add(new C8319a0(this.f21627u, this.f21628v));
        } else {
            int widthDp = this.f21565b.getWidthDp();
            int heightDp = this.f21565b.getHeightDp();
            arrayList.add(new C8323c0(widthDp, heightDp));
            arrayList.add(new C8319a0(widthDp, heightDp));
        }
        C9248m c9248m2 = this.f21565b;
        int iM22001c = AbstractC9174o.m22001c(c9248m2 != null ? c9248m2.getWidth() : this.f21627u);
        C9248m c9248m3 = this.f21565b;
        arrayList.add(new C8350z(iM22001c, AbstractC9174o.m22001c(c9248m3 != null ? c9248m3.getHeight() : this.f21628v)));
        m22082a(arrayList);
        m22081a(new C8325d0(EnumC8329f0.DEFAULT));
    }

    /* JADX INFO: renamed from: l */
    public final void m22083l() {
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            this.f21616C = true;
            if (this.f21614A) {
                c9248m.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            AbstractC9183r.f21478b.postDelayed(this.f21623J, 0L);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean mo22076m() {
        EnumC9221c0 enumC9221c0 = this.f21620G;
        return enumC9221c0 != null && enumC9221c0.equals(EnumC9221c0.INTERSTITIAL);
    }

    /* JADX INFO: renamed from: n */
    public void mo21939n() {
        C9248m c9248m;
        if (this.f21616C && this.f21617D && this.f21614A && (c9248m = this.f21565b) != null) {
            c9248m.m22085a("FyberMraidVideoController.play()");
            RunnableC9237h1 runnableC9237h1 = this.f21626M;
            if (runnableC9237h1 != null) {
                AbstractC9183r.f21478b.postDelayed(runnableC9237h1, 5000L);
            }
            if (this.f21618E) {
                this.f21565b.m22085a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    public void setAdDefaultSize(int i, int i2) {
        this.f21631y = i;
        this.f21632z = i2;
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.f21614A = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.f21615B = z;
    }

    public void setMuteMraidVideo(boolean z) {
        this.f21618E = z;
    }
}
