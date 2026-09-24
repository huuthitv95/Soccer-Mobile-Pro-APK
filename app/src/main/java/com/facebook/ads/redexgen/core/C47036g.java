package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6g */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47036g extends AbstractC5806Oq {
    public static String[] A0E = {"vPMRmT88mgqFEke8ATcV4DjUXhfKSOnR", "vcxzG3inNeckkmEQerBRT2lbis8VS7m7", "eUyvpit7R4E8S", "81xoNnBskiL3NHuExK0jouL0xNUbAz24", "9rRUUXnOqMhF40SMgnak6Kzhg0roR6HI", "NGPySEd1uSK0pWi3", "38FqFi34P3eGFZ4PzNWUjtJ56H9UGtdy", "zzAANKTeXLAH5LLCmw3IQOJWh4jGOg5d"};
    public C45584L A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final C6056Sx A04;
    public final InterfaceC6192VA A05;
    public final C5183Ek A06;
    public final AbstractC5147EA A07;
    public final AbstractC5145E8 A08;
    public final C5120Dj A09;
    public final ViewOnClickListenerC5117Dg A0A;
    public final C5116Df A0B;
    public final AbstractC6846fo A0C;
    public final C6847fp A0D;

    public C47036g(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, C6056Sx c6056Sx, C6200VI c6200vi, View.OnClickListener onClickListener, AbstractC7077jd abstractC7077jd) {
        super(c6902gi, onClickListener, c6200vi, abstractC7077jd);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.6p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                if (C6171Up.A1T(((AbstractC5806Oq) this.A00).A08)) {
                    this.A00.A06.A0e(EnumC6789et.A02, 30);
                }
            }
        };
        this.A08 = new C47116o(this);
        this.A05 = interfaceC6192VA;
        this.A04 = c6056Sx;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new FrameLayout(c6902gi);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(c6200vi);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(c6200vi);
        AbstractC6374YB.A0K(this.A0B);
        A0F();
    }

    private C5805Op A00() {
        return new C5805Op(this);
    }

    private C5183Ek A01(C6200VI c6200vi) {
        C5183Ek c5183Ek = new C5183Ek(super.A08);
        AbstractC6374YB.A0K(c5183Ek);
        c5183Ek.setFunnelLoggingHandler(c6200vi);
        c5183Ek.getEventBus().A03(this.A07, this.A08);
        if (C6171Up.A1V(super.A08)) {
            c5183Ek.setVolume(0.0f);
        }
        if (!C6171Up.A1Q(super.A08)) {
            c5183Ek.setOnClickListener(new ViewOnClickListenerC6423Yy(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c5183Ek, videoLayoutParams);
        return c5183Ek;
    }

    private C5120Dj A03() {
        C5120Dj c5120Dj = new C5120Dj(super.A08);
        c5120Dj.setTextColor(-1);
        AbstractC6374YB.A0a(c5120Dj, false, 12);
        c5120Dj.setGravity(17);
        this.A06.A0f(c5120Dj);
        return c5120Dj;
    }

    private ViewOnClickListenerC5117Dg A04() {
        ViewOnClickListenerC5117Dg viewOnClickListenerC5117Dg = new ViewOnClickListenerC5117Dg(super.A08);
        this.A06.A0f(viewOnClickListenerC5117Dg);
        return viewOnClickListenerC5117Dg;
    }

    private C5116Df A06(C6200VI c6200vi) {
        C5116Df c5116Df = new C5116Df(super.A08, c6200vi, true);
        c5116Df.setBackgroundPaintColor(855638016);
        this.A06.A0f(c5116Df);
        return c5116Df;
    }

    private C6847fp A07() {
        return new C6847fp(this, 50, true, new WeakReference(this.A0C), super.A08);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
            return;
        }
        if (super.A05 != null) {
            super.A05.A0P();
        }
        this.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
    public final void A0D() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0W();
        if (super.A05 != null) {
            super.A05.A0O();
        }
        AbstractC6374YB.A0J(this.A06);
        if (this.A00 != null) {
            C45584L c45584l = this.A00;
            if (A0E[1].charAt(6) != 'i') {
                throw new RuntimeException();
            }
            A0E[6] = "QSSPJpdXUUt8XbGqouva3DO5ILergMU2";
            c45584l.A0p();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
    public final void A0E() {
        super.A0E();
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
    public final void A0F() {
        super.A0F();
        if (C6171Up.A1W(super.A08)) {
            AbstractC6374YB.A0J(this.A0A);
            this.A0A.setLayoutParams(A0C(true, false));
            addView(this.A0A);
        }
        if (C6171Up.A1S(super.A08)) {
            AbstractC6374YB.A0J(this.A09);
            this.A09.setLayoutParams(A0C(true, true));
            addView(this.A09);
        }
        if (C6171Up.A1U(super.A08)) {
            AbstractC6374YB.A0J(this.A0B);
            this.A0B.setLayoutParams(A0C(false, false));
            addView(this.A0B);
        }
        C6492a5 c6492a5 = super.A04;
        if (A0E[6].charAt(23) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[5] = "QWCSfSUWuFerXIpv";
        strArr[2] = "7tLHnRgEmKXMN";
        if (c6492a5 != null) {
            AbstractC6374YB.A0J(super.A04);
            if (C6171Up.A1U(super.A08)) {
                super.A04.setLayoutParams(AbstractC5806Oq.A0A(this.A0B));
            } else {
                super.A04.setLayoutParams(AbstractC5806Oq.A0A(null));
            }
            addView(super.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
    public final boolean A0G() {
        return this.A06.A0l();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
    public final boolean A0H() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) (((double) (getMeasuredWidth() - this.A06.getMeasuredWidth())) / 2.0d);
        int i = AbstractC5806Oq.A0D;
        int widthGap = AbstractC5806Oq.A0C;
        return measuredWidth > i + (widthGap * 2);
    }

    public final C47036g A0I(String str, String str2, String str3, String str4, String str5) {
        this.A06.setVideoURI(this.A04.A0T(str2));
        this.A00 = new C45584L(super.A08, this.A05, this.A06, str);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            new AsyncTaskC5591LM(this.A03, super.A08).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C5804Oo(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A08();
    }
}
