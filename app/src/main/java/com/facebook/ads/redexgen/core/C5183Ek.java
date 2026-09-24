package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5183Ek extends RelativeLayout implements InterfaceC6845fn, InterfaceC6778ei {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final C5146E9 A0H;
    public static final C5140E3 A0I;
    public static final C5138E1 A0J;
    public static final C5133Dw A0K;
    public static final C5132Dv A0L;
    public static final C5129Ds A0M;
    public static final C5127Dq A0N;
    public static final C5126Dp A0O;
    public float A00;
    public int A01;
    public C6200VI A02;
    public C6786eq A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C6902gi A0B;
    public final C6142UM<AbstractC6143UN, C6141UL> A0C;
    public final List<InterfaceC6790eu> A0D;
    public final InterfaceC6842fk A0E;

    public static String A0G(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
            i4++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{93, -80, -94, -96, 93, -79, -84, -79, -98, -87, 93, -76, -98, -79, -96, -91, 93, -79, -90, -86, -94, 125, -81, -84, -84, -97, -88, -82, -90, -77, 90, -101, -82, 90};
    }

    static {
        A0J();
        A0J = new C5138E1();
        A0H = new C5146E9();
        A0K = new C5133Dw();
        A0L = new C5132Dv();
        A0I = new C5140E3();
        A0M = new C5129Ds();
        A0O = new C5126Dp();
        A0N = new C5127Dq();
    }

    public C5183Ek(C6902gi c6902gi) {
        super(c6902gi);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C6142UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC6777eh(this);
        this.A0B = c6902gi;
        if (A0T(c6902gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC5074Cz(c6902gi);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC5073Cy(c6902gi);
        }
        A0H();
    }

    public C5183Ek(C6902gi c6902gi, AttributeSet attributeSet) {
        super(c6902gi, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C6142UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC6777eh(this);
        this.A0B = c6902gi;
        if (A0T(c6902gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC5074Cz(c6902gi, attributeSet);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC5073Cy(c6902gi, attributeSet);
        }
        A0H();
    }

    public C5183Ek(C6902gi c6902gi, AttributeSet attributeSet, int i) {
        super(c6902gi, attributeSet, i);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C6142UM<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC6777eh(this);
        this.A0B = c6902gi;
        if (A0T(c6902gi)) {
            this.A0E = new TextureViewSurfaceTextureListenerC5074Cz(c6902gi, attributeSet, i);
        } else {
            this.A0E = new TextureViewSurfaceTextureListenerC5073Cy(c6902gi, attributeSet, i);
        }
        A0H();
    }

    private float A06(InterfaceC6842fk interfaceC6842fk) {
        int videoHeight = interfaceC6842fk.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = interfaceC6842fk.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ C5133Dw A0E() {
        C5133Dw c5133Dw = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return c5133Dw;
    }

    private void A0H() {
        this.A07 = C6171Up.A0t(this.A0B);
        this.A0B.A0F().A3d();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new C6786eq(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        AbstractC6374YB.A0K(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new C5191Es(this), this.A01);
    }

    private final void A0K() {
        for (InterfaceC6790eu interfaceC6790eu : this.A0D) {
            boolean z = interfaceC6790eu instanceof AbstractC5150ED;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z) {
                A0R((AbstractC5150ED) interfaceC6790eu);
            }
            interfaceC6790eu.AAv(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (C6171Up.A10(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(EnumC6199VH enumC6199VH) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(enumC6199VH, null);
    }

    private void A0Q(InterfaceC6790eu interfaceC6790eu) {
        if (interfaceC6790eu instanceof AbstractC5150ED) {
            A0S((AbstractC5150ED) interfaceC6790eu);
        }
        interfaceC6790eu.AKV(this);
    }

    private void A0R(AbstractC5150ED abstractC5150ED) {
        if (abstractC5150ED.getParent() == null) {
            if (abstractC5150ED instanceof C45043S) {
                this.A03.A02(abstractC5150ED);
            } else {
                addView(abstractC5150ED);
            }
        }
    }

    private void A0S(AbstractC5150ED abstractC5150ED) {
        if (abstractC5150ED instanceof C45043S) {
            this.A03.A03(abstractC5150ED);
        } else {
            AbstractC6374YB.A0J(abstractC5150ED);
        }
    }

    private boolean A0T(C6902gi c6902gi) {
        return C6171Up.A31(c6902gi, C6829fX.A03());
    }

    public final void A0W() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0X() {
        if (A0n()) {
            return;
        }
        this.A0E.A9d();
    }

    public final void A0Y() {
        Iterator<InterfaceC6790eu> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0Z(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i == 1) {
            layoutParams.addRule(10);
        } else if (AbstractC6322XL.A05(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        C6786eq c6786eq = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        c6786eq.setLayoutParams(layoutParams);
    }

    public final void A0a(int i) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i);
    }

    public final void A0b(int i) {
        this.A0E.AKF(i);
    }

    public final void A0c(AnimatorSet animatorSet, boolean z) {
        this.A03.A01(animatorSet, z);
    }

    public final void A0d(EnumC6781el enumC6781el) {
        C5186En c5186En = new C5186En(this);
        if (this.A07) {
            ExecutorC6367Y4.A00(c5186En);
        } else {
            this.A09.post(c5186En);
        }
        this.A0E.AK1(enumC6781el.A03());
    }

    public final void A0e(EnumC6789et enumC6789et, int i) {
        if (this.A04 && this.A0E.getState() == EnumC6844fm.A06) {
            this.A04 = false;
        }
        this.A0E.AK6(enumC6789et, i);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0f(InterfaceC6790eu interfaceC6790eu) {
        this.A0D.add(interfaceC6790eu);
    }

    public final void A0g(InterfaceC6790eu interfaceC6790eu) {
        this.A0D.remove(interfaceC6790eu);
        A0Q(interfaceC6790eu);
    }

    public final void A0h(boolean z) {
        A0i(z, 0);
    }

    public final void A0i(boolean z, int i) {
        if (A0n()) {
            return;
        }
        this.A0E.AGr(z, i);
    }

    public final void A0j(boolean z, boolean z2, int i) {
        this.A06 = z2;
        A0i(z, i);
    }

    public final boolean A0k() {
        return this.A0E.A9q();
    }

    public final boolean A0l() {
        return this.A0E.A9r();
    }

    public final boolean A0m() {
        return getVolume() == 0.0f;
    }

    public final boolean A0n() {
        return getState() == EnumC6844fm.A05;
    }

    public final boolean A0o() {
        return A0n() && this.A0E.AAc();
    }

    public final boolean A0p() {
        return getState() == EnumC6844fm.A0A;
    }

    public final boolean A0q() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6778ei
    public final boolean AAQ() {
        return A0T(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6778ei
    public final boolean AAV() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6845fn
    public final void ADy(final long j, final long j2, final long j3, final float f) {
        if (!C6171Up.A20(this.A0B)) {
            return;
        }
        this.A0C.A02(new AbstractC5149EC(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.4F
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6845fn
    public final void AEo() {
        A0i(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6845fn
    public final void AEp() {
        A0e(EnumC6789et.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6845fn
    public final void AFr(int i, int i2) {
        C5188Ep c5188Ep = new C5188Ep(this, i, i2);
        if (this.A07) {
            ExecutorC6367Y4.A00(c5188Ep);
        } else {
            this.A09.post(c5188Ep);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6845fn
    public final void AGd(EnumC6844fm enumC6844fm) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C5190Er c5190Er = new C5190Er(this, enumC6844fm, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            ExecutorC6367Y4.A00(c5190Er);
        } else {
            this.A09.post(c5190Er);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6778ei
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public C6142UM<AbstractC6143UN, C6141UL> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6778ei
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<InterfaceC6790eu> getPlugins() {
        return this.A0D;
    }

    public EnumC6844fm getState() {
        return this.A0E.getState();
    }

    public Handler getStateHandler() {
        return this.A09;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0E;
    }

    public int getVideoHeight() {
        return this.A0E.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0E.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6778ei
    public EnumC6789et getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6778ei
    public float getVolume() {
        return this.A0E.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0C.A02(A0N);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0C.A02(A0O);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.A0E != null) {
            this.A0E.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C6200VI c6200vi) {
        this.A02 = c6200vi;
    }

    public void setIsFullScreen(boolean z) {
        this.A05 = z;
        this.A0E.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setRoundedCornerVideoView(float f) {
        this.A03.setRoundedCornersVideoStyle(f);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A01 = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0Y();
        } else {
            A0K();
            if (A0G[2].length() != 10) {
                throw new RuntimeException();
            }
            A0G[2] = "2vtziZXFfU";
            this.A0E.setup(uri);
        }
        this.A04 = false;
    }

    public void setVideoURI(String str) {
        this.A0B.A0F().A3k(str);
        setVideoURI(str != null ? AbstractC6312XB.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0M(EnumC6199VH.A0n);
            this.A0B.A0F().A3o();
        } else {
            A0M(EnumC6199VH.A0m);
            this.A0B.A0F().A3n();
        }
        this.A0E.setRequestedVolume(f);
        getEventBus().A02(A0M);
    }
}
