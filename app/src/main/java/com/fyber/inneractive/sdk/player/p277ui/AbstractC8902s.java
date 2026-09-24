package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.C8086d;
import com.fyber.inneractive.sdk.flow.endcard.C8088f;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.s */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8902s extends AbstractC8881e {

    /* JADX INFO: renamed from: j */
    public final int f20954j;

    /* JADX INFO: renamed from: k */
    public final int f20955k;

    /* JADX INFO: renamed from: l */
    public final int f20956l;

    /* JADX INFO: renamed from: m */
    public ViewGroup f20957m;

    /* JADX INFO: renamed from: n */
    public Button f20958n;

    /* JADX INFO: renamed from: o */
    public int f20959o;

    /* JADX INFO: renamed from: p */
    public int f20960p;

    /* JADX INFO: renamed from: q */
    public boolean f20961q;

    /* JADX INFO: renamed from: r */
    public ViewGroup f20962r;

    /* JADX INFO: renamed from: s */
    public ViewGroup f20963s;

    /* JADX INFO: renamed from: t */
    public final C9155h1 f20964t;

    /* JADX INFO: renamed from: u */
    public C9155h1 f20965u;

    /* JADX INFO: renamed from: v */
    public TextView f20966v;

    /* JADX INFO: renamed from: w */
    public final C8006r f20967w;

    /* JADX INFO: renamed from: x */
    public final String f20968x;

    /* JADX INFO: renamed from: y */
    public final C9155h1 f20969y;

    public AbstractC8902s(Context context, C8006r c8006r, String str) {
        super(context);
        this.f20959o = -1;
        this.f20960p = -1;
        this.f20961q = false;
        this.f20964t = new C9155h1(0, 0);
        this.f20969y = new C9155h1(0, 0);
        IAlog.m21945a("%sctor called", IAlog.m21943a(this));
        int tickFractions = getTickFractions();
        this.f20955k = tickFractions;
        this.f20954j = getMaxTickFactor();
        this.f20956l = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(C7809R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f20967w = c8006r;
        this.f20968x = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21432a(int i, int i2);

    /* JADX INFO: renamed from: a */
    public final void m21467a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new ViewOnTouchListenerC8894r(new GestureDetector(view.getContext(), new C8893q(this, view, new int[2], i))));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21433a(AbstractC8084b abstractC8084b, C8878b c8878b);

    /* JADX INFO: renamed from: a */
    public void mo21434a(C8086d c8086d, C8878b c8878b) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            InterfaceC8890n interfaceC8890n = this.f20882g;
            C8088f c8088f = (C8088f) c8086d.m20510f();
            c8088f.m20522a(c8878b, interfaceC8890n);
            ViewGroup viewGroup = c8088f.f17993c;
            AbstractC9195v.m22027a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            c8086d.m20521a(c8086d.f17986e, c8086d.f17984c);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21435a(boolean z);

    /* JADX INFO: renamed from: a */
    public void mo21436a(boolean z, int i, int i2) {
        this.f20959o = i;
        this.f20960p = i2;
        this.f20961q = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21437a(boolean z, EnumC8253m enumC8253m);

    /* JADX INFO: renamed from: a */
    public abstract void mo21438a(boolean z, String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo21440b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo21441c(boolean z);

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: c */
    public boolean mo21459c() {
        return this.f20962r.getVisibility() == 0 || this.f20963s.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo21442d(boolean z);

    public void destroy() {
        mo21448i();
        setVisibility(8);
        if (this.f20882g != null) {
            this.f20882g = null;
        }
        this.f20884i = null;
        IAlog.m21945a("%sdestroyed called", IAlog.m21943a(this));
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo21443e(boolean z);

    /* JADX INFO: renamed from: f */
    public abstract void mo21444f(boolean z);

    /* JADX INFO: renamed from: g */
    public abstract void mo21445g();

    /* JADX INFO: renamed from: g */
    public abstract void mo21446g(boolean z);

    public ViewGroup getDefaultEndCardContainer() {
        return this.f20962r;
    }

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public ViewGroup getTextureHost() {
        return this.f20957m;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.f20960p;
    }

    public int getVideoWidth() {
        return this.f20959o;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo21447h();

    /* JADX INFO: renamed from: i */
    public abstract void mo21448i();

    /* JADX INFO: renamed from: j */
    public abstract void mo21449j();

    /* JADX INFO: renamed from: k */
    public abstract void mo21450k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo21451l();

    /* JADX INFO: renamed from: m */
    public abstract void mo21452m();

    /* JADX INFO: renamed from: n */
    public abstract void mo21453n();

    /* JADX INFO: renamed from: o */
    public abstract void mo21454o();

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo21426a(this.f20969y, size, size2);
        C9155h1 c9155h1 = this.f20969y;
        int i3 = c9155h1.f21454a;
        if (i3 <= 0 || c9155h1.f21455b <= 0) {
            c9155h1.f21454a = size;
            c9155h1.f21455b = size2;
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f20969y.f21455b, 1073741824);
            i = iMakeMeasureSpec;
        }
        if (!this.f20964t.equals(this.f20969y)) {
            C9155h1 c9155h2 = this.f20964t;
            C9155h1 c9155h3 = this.f20969y;
            c9155h2.getClass();
            c9155h2.f21454a = c9155h3.f21454a;
            c9155h2.f21455b = c9155h3.f21455b;
            mo21454o();
        }
        super.onMeasure(i, i2);
    }

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);
}
