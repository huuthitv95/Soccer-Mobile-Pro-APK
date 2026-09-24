package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5834PJ extends RelativeLayout implements InterfaceC6407Yi {
    public static byte[] A0I;
    public static String[] A0J = {"Y2tLUsDODtMhR26nUTjgcf2Vsahx4NqH", "jeJcN29vgPpMzSifPXWuZ7pAdZm9Wqf2", "wmqo1ZnOkD5hT7Q2PTM2Rmfb8E0dvO0q", "HRpfHPl8fLQTElVXg4xSXmMBPaXasYNs", "iTsM9Wr3SkT3Gti7sj459w9nLERpcX3u", "RuGpU2jfWShvYQ0LG0oJmnDCVLSRyRSk", "2xHjamT", "xqcRJe7Fu2poXHQJNQ1kBRmSVDyUhFcS"};
    public static final int A0K;
    public static final int A0L;
    public View A00;
    public C6325XO A01;
    public C6506aJ A02;
    public C6510aN A03;
    public C6725dq A04;
    public boolean A05;
    public boolean A06;
    public C5715NN A07;
    public C6770ea A08;
    public boolean A09;
    public final Handler A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC6360Xx A0B;
    public final InterfaceC6406Yh A0C;
    public final AbstractC7077jd A0D;
    public final C6902gi A0E;
    public final InterfaceC6192VA A0F;
    public final C6200VI A0G;
    public final AbstractC6400Yb A0H;

    public static String A0Q(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        A0I = new byte[]{-93, -81, -83, 110, -90, -95, -93, -91, -94, -81, -81, -85, 110, -95, -92, -77, 110, -87, -82, -76, -91, -78, -77, -76, -87, -76, -87, -95, -84, 110, -87, -83, -80, -78, -91, -77, -77, -87, -81, -82, 110, -84, -81, -89, -89, -91, -92};
    }

    public abstract AbstractC6400Yb A0b();

    public abstract void A0d();

    public abstract boolean A0l();

    public abstract int getCloseButtonStyle();

    static {
        A0X();
        A0K = (int) (AbstractC6334XX.A02 * 16.0f);
        A0L = (int) (AbstractC6334XX.A02 * 12.0f);
    }

    public AbstractC5834PJ(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, AbstractC7077jd abstractC7077jd) {
        super(c6902gi);
        this.A09 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0E = c6902gi;
        this.A0F = interfaceC6192VA;
        this.A0C = interfaceC6406Yh;
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC6360Xx(this);
        this.A0D = abstractC7077jd;
        this.A0G = new C6200VI(this.A0D.A2E(), this.A0F);
        this.A0H = A0b();
        if (this.A0D.A2M()) {
            A0R();
        }
        if (this.A0D.A2W()) {
            A0S();
        }
    }

    private C5728Na A0O(int i) {
        if (i == 1) {
            return this.A07.A01();
        }
        return this.A07.A00();
    }

    private void A0R() {
        this.A02 = AbstractC6511aO.A01(this.A0E, true, this.A0D, this.A0G, this.A0C, EnumC6509aM.A03, AbstractC6508aL.A00(this.A0D));
        AbstractC6374YB.A0K(this.A02);
    }

    private void A0S() {
        this.A03 = AbstractC6511aO.A02(this.A0E, EnumC6509aM.A03, this.A0D);
        this.A03.setBackgroundColor(-2145637581);
        AbstractC6374YB.A0K(this.A03);
    }

    private void A0T() {
        removeAllViews();
        AbstractC6374YB.A0J(this);
    }

    private void A0U() {
        if (this.A03 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            layoutParams.setMargins(A0K, A0L, 0, A0K);
            addView(this.A03, layoutParams);
        }
    }

    private void A0V() {
        if (this.A02 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, A0L, A0K, A0K);
            addView(this.A02, layoutParams);
        }
    }

    private void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0i() && this.A04 == null) {
            this.A06 = true;
            this.A04 = new C6723do(this.A0E, this.A0D.A29().A0I(), this.A0D.A2C()).A0A(this.A0D.A28().A01()).A0F();
            AbstractC6202VK.A04(this.A04, this.A0G, EnumC6199VH.A0U);
            this.A0C.A44(this, 0, layoutParams);
            this.A0C.A44(this.A04, 1, layoutParams);
            this.A04.A04(new C5839PO(this));
            return;
        }
        this.A0C.A44(this, 0, layoutParams);
    }

    private void A0Y(C5728Na c5728Na, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        AbstractC6374YB.A0K(this.A0H);
        if (this.A0D.A1a()) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, AbstractC6332XV.A0N, 0, 0);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
            this.A0H.A0D(c5728Na, ViewOnClickListenerC5560Kr.A05(this.A0D));
        }
        layoutParams.addRule(10);
        addView(this.A0H, layoutParams);
    }

    public final void A0c() {
        if (this.A00 == null || !(this.A00 instanceof AbstractC6614c3)) {
            return;
        }
        if (A0j()) {
            ((AbstractC6614c3) this.A00).A1G();
        } else {
            ((AbstractC6614c3) this.A00).A1F();
        }
    }

    public final void A0e(int i) {
        this.A01 = new C6325XO(i, new C5837PM(this, i));
        this.A05 = true;
        A0c();
        this.A01.A07();
    }

    public final void A0f(View view, boolean z, int i) {
        this.A0H.setFullscreen(z);
        this.A00 = view;
        this.A0B.A05(EnumC6359Xw.A02);
        A0T();
        C5728Na colorInfo = A0O(i);
        A0Y(colorInfo, z);
        AbstractC6374YB.A0N(this, colorInfo.A08(false));
        if (this.A0D.A2M() || this.A0D.A2W()) {
            AbstractC6374YB.A0J(this.A02);
            AbstractC6374YB.A0J(this.A03);
            A0V();
            A0U();
            this.A0H.A08();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A0D.A2M() && this.A02 != null) {
            layoutParams.addRule(2, this.A02.getId());
            layoutParams.addRule(3, this.A0H.getId());
        } else if (this.A0D.A2W() && this.A03 != null) {
            layoutParams.addRule(2, this.A03.getId());
            layoutParams.addRule(3, this.A0H.getId());
        } else {
            if (A0J[7].charAt(11) != 'o') {
                throw new RuntimeException();
            }
            A0J[6] = "TscrWlY";
            layoutParams.addRule(12);
            layoutParams.setMargins(0, z ? 0 : this.A0H.getToolbarHeight(), 0, 0);
        }
        if (this.A0D.A1a()) {
            layoutParams.addRule(3, this.A0H.getId());
        }
        addView(view, layoutParams);
        if (this.A0C != null) {
            A0W();
            if (A0J[4].charAt(20) == 'd') {
                throw new RuntimeException();
            }
            A0J[4] = "m39AQqqO1eeHQzy3cGs8gEkGcDq1cYC0";
            if (z) {
                this.A0B.A05(EnumC6359Xw.A03);
            }
        }
    }

    public final void A0g(C5976Re c5976Re) {
        this.A0B.A04(c5976Re.A05().getWindow());
        this.A07 = this.A0D.A28();
        C5719NR c5719nrA29 = null;
        C5719NR adInfo = this.A0D.A29();
        if (adInfo != null) {
            C5719NR adInfo2 = this.A0D.A29();
            if (adInfo2 != null) {
                c5719nrA29 = this.A0D.A29();
            }
        }
        this.A0H.setPageDetails(this.A0D.A2C(), this.A0D.A2E(), c5719nrA29 != null ? c5719nrA29.A0H().A04() : 0, this.A0D.A2D());
        this.A0H.setToolbarListener(new C5844PT(this, c5976Re));
    }

    public final void A0h(C5976Re c5976Re) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC6419Yu(this, this, c5976Re));
        startAnimation(alphaAnimation);
    }

    public final boolean A0i() {
        return !this.A0D.A2G().isEmpty() && this.A0D.A29().A0W();
    }

    public final boolean A0j() {
        return this.A05;
    }

    public final boolean A0k() {
        return this.A06;
    }

    public void AFA(boolean z) {
        if (this.A01 != null && this.A01.A05()) {
            this.A01.A06();
        }
        if (z) {
            return;
        }
        C6506aJ c6506aJ = this.A02;
        String[] strArr = A0J;
        if (strArr[2].charAt(15) == strArr[5].charAt(15)) {
            throw new RuntimeException();
        }
        A0J[3] = "yojvKCm4Uw77fUAiEEOH9Gl1ktXD1GAA";
        if (c6506aJ != null) {
            this.A02.A0P();
        }
    }

    public void AFi(boolean z) {
        if (this.A01 != null && !this.A01.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC6192VA getAdEventManager() {
        return this.A0F;
    }

    public InterfaceC6406Yh getAudienceNetworkListener() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public String getCurrentClientToken() {
        return this.A0D.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A0B.A03();
        this.A0H.setToolbarListener(null);
        this.A0A.removeCallbacksAndMessages(null);
        if (this.A02 != null) {
            this.A02.A0O();
        }
        A0T();
    }

    public void setImpressionRecordingFlag(C6365Y2 c6365y2) {
        c6365y2.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A09) {
                getAudienceNetworkListener().A4j(new C5647MG().A8G());
            } else {
                getAudienceNetworkListener().A4j(A0Q(0, 47, 27));
            }
        }
    }

    public void setListener(InterfaceC6406Yh interfaceC6406Yh) {
    }

    public void setServerSideRewardHandler(C6770ea c6770ea) {
        this.A08 = c6770ea;
    }
}
