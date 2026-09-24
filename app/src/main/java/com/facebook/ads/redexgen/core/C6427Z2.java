package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Z2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6427Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C7082ji A01;
    public final AbstractC7077jd A02;
    public final C6902gi A03;
    public final InterfaceC6192VA A04;
    public final C6200VI A05;
    public final C6365Y2 A06;
    public final C5812Ow A07;
    public final AbstractC5806Oq A08;
    public final AbstractC6846fo A09;
    public final C6847fp A0A;
    public final String A0B;
    public final WeakReference<InterfaceC6426Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C6427Z2(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, C6056Sx c6056Sx, WeakReference<InterfaceC6426Z1> weakReference, int i, int i2, int i3, int i4, C7082ji c7082ji, String str) {
        super(c6902gi);
        this.A06 = new C6365Y2();
        this.A03 = c6902gi;
        this.A04 = interfaceC6192VA;
        this.A01 = c7082ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC7077jd abstractC7077jdA0F = this.A01.A0F();
        if (abstractC7077jdA0F == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        AbstractC6374YB.A0N(this, -1);
        this.A05 = new C6200VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i4, i2, i3);
        LinearLayout linearLayout = new LinearLayout(c6902gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c6056Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(abstractC7077jdA0F);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, Ascii.f22494GS, -39, Ascii.f22494GS, Ascii.SUB, 45, Ascii.SUB, -39, Ascii.ESC, 46, 39, Ascii.f22494GS, 37, Ascii.f22498RS, -39, 34, 44, -39, Ascii.f22493FS, Ascii.SUB, 39, 39, 40, 45, -39, Ascii.ESC, Ascii.f22498RS, -39, 39, 46, 37, 37, 52, SignedBytes.MAX_POWER_OF_TWO, 62, -1, 55, 50, 52, 54, 51, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, Base64.padSymbol, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (AbstractC6334XX.A02 * 40.0f);
    }

    private C5812Ow A02(AbstractC7077jd abstractC7077jd) {
        C5728Na c5728NaA00;
        C5719NR c5719nrA29 = abstractC7077jd.A29();
        AbstractC5846PW abstractC5846PW = new AbstractC5846PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i4 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC6406Yh
            public final void A4j(String str) {
                C5818P2.A00(this.A00.A03).A07(new Intent(str + A00(0, 1, 92) + this.A00.A0B));
            }
        };
        if (getOrientation() == 1) {
            c5728NaA00 = abstractC7077jd.A28().A01();
        } else {
            C5715NN c5715nnA28 = abstractC7077jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            c5728NaA00 = c5715nnA28.A00();
        }
        C5812Ow c5812Ow = new C5812Ow(this.A03, A0F, c5728NaA00, c5719nrA29.A0J().A06(), A09(32, 31, 110), this.A04, abstractC5846PW, this.A0A, this.A06, abstractC7077jd.A2A());
        c5812Ow.setInfo(c5719nrA29.A0I(), c5719nrA29.A0J(), this.A01.A7O(), abstractC7077jd.A2C().A01(), null, null);
        if (C6171Up.A1N(this.A03)) {
            c5812Ow.A0k();
        }
        return c5812Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC5806Oq A04(C6056Sx c6056Sx) {
        final ViewOnClickListenerC6424Yz viewOnClickListenerC6424Yz = new ViewOnClickListenerC6424Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c6056Sx, this.A01) && videoUrl != null) {
            C47036g videoView = new C47036g(this.A03, this.A04, c6056Sx, this.A05, viewOnClickListenerC6424Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C6171Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C6219Vb c6219VbA0H = this.A01.A0H();
        if (c6219VbA0H == null) {
            return null;
        }
        final C6902gi c6902gi = this.A03;
        final C6200VI c6200vi = this.A05;
        final AbstractC7077jd abstractC7077jd = this.A02;
        C47136q c47136qA0I = new AbstractC5806Oq(c6902gi, viewOnClickListenerC6424Yz, c6200vi, abstractC7077jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C6554b5 A00;

            {
                super(c6902gi, viewOnClickListenerC6424Yz, c6200vi, abstractC7077jd);
                this.A00 = new C6554b5(c6902gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    AbstractC6374YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC5806Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C47136q A0I(String str) {
                new AsyncTaskC5591LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C5807Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5806Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(c6219VbA0H.getUrl());
        if (C6171Up.A1P(this.A03)) {
            setViewAsCTA(c47136qA0I);
        }
        return c47136qA0I;
    }

    private C5791Ob A06() {
        return new C5791Ob(this);
    }

    private C6847fp A07(int i, int i2, int i3, int i4) {
        C6847fp c6847fp = new C6847fp(this, i, i2, true, new WeakReference(this.A09), this.A03);
        c6847fp.A0W(i3);
        c6847fp.A0X(i4);
        return c6847fp;
    }

    private void A0C() {
        String strA0M = this.A01.A0M();
        if (!TextUtils.isEmpty(strA0M)) {
            C6307X6 c6307x6 = new C6307X6();
            C6902gi c6902gi = this.A03;
            Uri uriA00 = AbstractC6312XB.A00(strA0M);
            String adChoicesLinkUrl = this.A01.A7O();
            C6307X6.A0O(c6307x6, c6902gi, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(EnumC6199VH.A0A, null);
        if (!AbstractC5797Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC6464Zd abstractC6464ZdA01 = AbstractC6465Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (abstractC6464ZdA01 == null) {
            A0C();
            return;
        }
        AbstractC6374YB.A0W(this);
        addView(abstractC6464ZdA01, new FrameLayout.LayoutParams(-1, -1));
        abstractC6464ZdA01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C6056Sx c6056Sx, C7082ji c7082ji) {
        String strA0e = c7082ji.A0e();
        if (TextUtils.isEmpty(strA0e)) {
            return false;
        }
        String videoUrl = c6056Sx.A0T(strA0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        AbstractC6374YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC5806Oq abstractC5806Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC5806Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C6847fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new ViewOnClickListenerC6425Z0(this));
    }
}
