package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5305Gj extends FrameLayout implements InterfaceC6407Yi {
    public static byte[] A0F;
    public static String[] A0G = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0H;
    public boolean A00;
    public ViewGroup A01;
    public boolean A02;
    public final AbstractC7077jd A03;
    public final C6056Sx A04;
    public final C6902gi A05;
    public final InterfaceC6192VA A06;
    public final C6200VI A07;
    public final C6365Y2 A08;
    public final AbstractC6400Yb A09;
    public final InterfaceC6406Yh A0A;
    public final InterfaceC6455ZU A0B;
    public final C6847fp A0C;
    public final ViewOnSystemUiVisibilityChangeListenerC6360Xx A0D;
    public final AbstractC6846fo A0E;

    public static String A0Z(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0b() {
        A0F = new byte[]{-22, -19, -4, -23, -24};
    }

    public abstract void A0g();

    public abstract void A0h();

    public abstract void A0k(C5976Re c5976Re);

    public abstract boolean A0l();

    public abstract boolean A0m();

    static {
        A0b();
        A0H = new RelativeLayout.LayoutParams(-1, -1);
    }

    public AbstractC5305Gj(C6902gi c6902gi, InterfaceC6455ZU interfaceC6455ZU, InterfaceC6192VA interfaceC6192VA, AbstractC7077jd abstractC7077jd, C6056Sx c6056Sx, InterfaceC6406Yh interfaceC6406Yh) {
        super(c6902gi);
        this.A02 = false;
        this.A0E = new C5330H8(this);
        this.A08 = new C6365Y2();
        this.A00 = false;
        this.A05 = c6902gi;
        this.A0B = interfaceC6455ZU;
        this.A06 = interfaceC6192VA;
        this.A03 = abstractC7077jd;
        this.A04 = c6056Sx;
        this.A0A = interfaceC6406Yh;
        this.A07 = new C6200VI(this.A03.A2E(), this.A06);
        this.A0C = new C6847fp(this, 1, new WeakReference(this.A0E), this.A05);
        this.A0C.A0W(this.A03.A0m());
        this.A0C.A0X(this.A03.A0n());
        this.A09 = A0Y();
        this.A0D = new ViewOnSystemUiVisibilityChangeListenerC6360Xx(this);
        this.A0D.A05(EnumC6359Xw.A02);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC6400Yb A0Y() {
        AbstractC6400Yb abstractC6400YbA0c = A0c();
        abstractC6400YbA0c.setFullscreen(true);
        int iA04 = this.A03.A29().A0H().A04();
        abstractC6400YbA0c.setPageDetails(this.A03.A2C(), this.A03.A2E(), iA04, this.A03.A2D());
        abstractC6400YbA0c.A0D(this.A03.A28().A01(), ViewOnClickListenerC5560Kr.A05(this.A03));
        if (this.A03.A29().A0H().A02() == 0) {
            this.A02 = true;
            abstractC6400YbA0c.setToolbarActionMode(8);
        } else if (iA04 < 0 && this.A03.A29().A0S()) {
            abstractC6400YbA0c.setToolbarActionMode(4);
        }
        if (this.A03.A29().A0H().A02() >= 0) {
            abstractC6400YbA0c.setProgressSpinnerInvisible(true);
        }
        abstractC6400YbA0c.setToolbarListener(new C5307Gl(this));
        return abstractC6400YbA0c;
    }

    private void A0a() {
        if (this.A03.A29().A0W()) {
            C6725dq c6725dqA0F = new C6723do(this.A05, this.A03.A29().A0I(), this.A03.A2C()).A0A(this.A03.A28().A01()).A0F();
            AbstractC6202VK.A04(c6725dqA0F, this.A07, EnumC6199VH.A0U);
            addView(c6725dqA0F, A0H);
            c6725dqA0F.A04(new C5320Gy(this));
            return;
        }
        A0h();
    }

    public AbstractC6400Yb A0c() {
        if (A0m()) {
            if (this.A03.A1W()) {
                return new C5854Pe(this.A05, getAppOpenAdVariant(), this.A03, 8, new C5311Gp(this));
            }
            return new C5845PU(this.A05, this.A03, 1);
        }
        return new FullScreenAdToolbar(this.A05, this.A0A, this.A07, 1, this.A03.A22(), this.A03.A1s());
    }

    public void A0d() {
        Rect requestedMargins;
        if (!this.A03.A1W() || (requestedMargins = this.A09.getRequestedMargins()) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A09.getLayoutParams();
        layoutParams.setMargins(requestedMargins.left, requestedMargins.top, requestedMargins.right, requestedMargins.bottom);
        this.A09.setLayoutParams(layoutParams);
    }

    public final void A0e() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public final void A0f() {
        if (this.A09.getToolbarActionMode() == 8) {
            this.A09.setToolbarActionMode(2);
        }
        if (this.A03.A29().A0H().A07() != null) {
            this.A03.A29().A0H().A07().A0S(0);
        }
        this.A03.A2K(false);
        this.A03.A29().A0M(-1);
    }

    public final void A0i(int i, AbstractRunnableC6279Wc abstractRunnableC6279Wc, C5110DZ c5110dz) {
        new C6325XO(i, new C5322H0(this, i, c5110dz, abstractRunnableC6279Wc)).A07();
    }

    public final void A0j(ViewGroup viewGroup) {
        if (this.A03.A1W() && getAppOpenAdVariant() == EnumC6405Yg.A08) {
            C6596bl c6596bl = new C6596bl(this.A05);
            c6596bl.setRadius(AbstractC6332XV.A0v);
            c6596bl.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
            this.A01 = c6596bl;
            return;
        }
        this.A01 = viewGroup;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AAu(Intent intent, Bundle bundle, C5976Re c5976Re) {
        this.A0A.A45(this, A0H);
        A0k(c5976Re);
        A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AIv(Bundle bundle) {
    }

    private EnumC6405Yg getAppOpenAdVariant() {
        if (this.A03.A0v().equals(A0Z(0, 5, 93))) {
            return EnumC6405Yg.A08;
        }
        return EnumC6405Yg.A09;
    }

    public Integer getBackgroundColorForToolbar() {
        if (this.A03.A1W()) {
            return getAppOpenAdVariant().A03;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public String getCurrentClientToken() {
        return this.A03.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        A0d();
        if (A0G[6].charAt(4) == 'Z') {
            throw new RuntimeException();
        }
        A0G[3] = "kF6RESICu85JPno09mseATff07y9WxI4";
    }

    public void onDestroy() {
        this.A0D.A03();
        if (!TextUtils.isEmpty(this.A03.A2E())) {
            this.A06.AB7(this.A03.A2E(), new C6558b9().A03(this.A0C).A02(this.A08).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A08.A06(this.A05, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC6406Yh interfaceC6406Yh) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC6359Xw enumC6359Xw;
        if (z) {
            enumC6359Xw = EnumC6359Xw.A03;
        } else {
            enumC6359Xw = EnumC6359Xw.A02;
        }
        this.A0D.A05(enumC6359Xw);
    }
}
