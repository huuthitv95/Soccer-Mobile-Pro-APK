package com.ironsource.adqualitysdk.sdk.p286i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ji */
/* JADX INFO: loaded from: classes6.dex */
public final class C12060ji {

    /* JADX INFO: renamed from: ﮐ */
    private static int f29635 = 263;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29636 = 1;

    /* JADX INFO: renamed from: ﱡ */
    private static boolean f29637 = true;

    /* JADX INFO: renamed from: ﺙ */
    private static boolean f29638 = true;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29639;

    /* JADX INFO: renamed from: ﻛ */
    private static C12060ji f29640;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29641 = {334, 371, 374, 361, 360, 347, 380, 362, 367, 339, 368, 378, 379, 364, 373, 377, 346, 381, 332, 295, 366, 382, 351, 352, 370, 365, 349, 375, 384, 383};

    /* JADX INFO: renamed from: ｋ */
    private InterfaceC12064jm f29643;

    /* JADX INFO: renamed from: ﻐ */
    private Map<RelativeLayout, Object> f29642 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾒ */
    private C12034ij f29644 = new C12034ij(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ View.OnLayoutChangeListener m30675(C12060ji c12060ji, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = f29639 + 13;
        f29636 = i2 % 128;
        int i3 = i2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListenerM30679 = c12060ji.m30679(viewGroup);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = f29636 + 29;
        f29639 = i5 % 128;
        if (i5 % 2 == 0) {
            return onLayoutChangeListenerM30679;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30680(C12060ji c12060ji, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f29636 + 19;
        f29639 = i2 % 128;
        int i3 = i2 % 2;
        c12060ji.m30678(viewGroup, onLayoutChangeListener);
        int i4 = f29639 + 31;
        f29636 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ ViewGroup m30681(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i = 2 % 2;
        int i2 = f29639 + 19;
        f29636 = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroupM30686 = m30686(viewGroup, viewGroup2);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return viewGroupM30686;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m30683(View view, ViewOnTouchListenerC12007hj.a aVar) {
        int i = 2 % 2;
        int i2 = f29636 + 19;
        f29639 = i2 % 128;
        int i3 = i2 % 2;
        m30677(view, aVar);
        int i4 = f29639 + 25;
        f29636 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    static /* synthetic */ void m30685(C12060ji c12060ji, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        int i2 = f29639 + 11;
        f29636 = i2 % 128;
        int i3 = i2 % 2;
        c12060ji.m30692(viewGroup, onLayoutChangeListener);
        int i4 = f29639 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29636 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m30689(C12060ji c12060ji, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f29639 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29636 = i2 % 128;
        int i3 = i2 % 2;
        c12060ji.m30682(motionEvent);
        int i4 = f29636 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29639 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ void m30690(C12060ji c12060ji, C12034ij c12034ij) {
        int i = 2 % 2;
        int i2 = f29636 + 21;
        f29639 = i2 % 128;
        int i3 = i2 % 2;
        c12060ji.m30684(c12034ij);
        int i4 = f29636 + 103;
        f29639 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public static synchronized C12060ji m30687() {
        int i = 2 % 2;
        int i2 = f29639 + 41;
        f29636 = i2 % 128;
        int i3 = i2 % 2;
        if (f29640 == null) {
            f29640 = new C12060ji();
            int i4 = f29639 + 83;
            f29636 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        return f29640;
    }

    private C12060ji() {
    }

    /* JADX INFO: renamed from: ﻐ */
    public final synchronized void m30693() {
        int i = 2 % 2;
        int i2 = f29639 + 33;
        f29636 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.f29643 == null) {
            this.f29643 = new InterfaceC12064jm() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.3
                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12064jm
                /* JADX INFO: renamed from: ﾇ */
                public final void mo28222(View view) {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12064jm
                /* JADX INFO: renamed from: ﾒ */
                public final void mo28223(View view) {
                    if (!C12092s.m30994().m31000()) {
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroupM30681 = (ViewGroup) view;
                            if (viewGroupM30681.getContext() instanceof Activity) {
                                viewGroupM30681 = C12060ji.m30681(viewGroupM30681, (ViewGroup) ((Activity) viewGroupM30681.getContext()).findViewById(R.id.content));
                            }
                            C12060ji c12060ji = C12060ji.this;
                            C12060ji.m30680(c12060ji, viewGroupM30681, C12060ji.m30675(c12060ji, viewGroupM30681));
                            return;
                        }
                        return;
                    }
                    C12060ji.this.m30695();
                }
            };
            C12057jf.m30656().m30661(this.f29643);
            int i3 = f29636 + 105;
            f29639 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final synchronized void m30695() {
        int i = 2 % 2;
        int i2 = f29636 + 93;
        f29639 = i2 % 128;
        int i3 = i2 % 2;
        if (this.f29643 != null) {
            for (RelativeLayout relativeLayout : this.f29642.keySet()) {
                int i4 = f29639 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f29636 = i4 % 128;
                int i5 = i4 % 2;
                ViewParent parent = relativeLayout.getParent();
                if (parent instanceof ViewGroup) {
                    int i6 = f29636 + 5;
                    f29639 = i6 % 128;
                    int i7 = i6 % 2;
                    ((ViewGroup) parent).removeView(relativeLayout);
                }
            }
            this.f29642.clear();
            C12057jf.m30656().m30662(this.f29643);
            this.f29643 = null;
            int i8 = 2 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized C12034ij m30694() {
        C12034ij c12034ij;
        int i = 2 % 2;
        int i2 = f29639;
        int i3 = i2 + 43;
        f29636 = i3 % 128;
        int i4 = i3 % 2;
        c12034ij = this.f29644;
        int i5 = i2 + 89;
        f29636 = i5 % 128;
        int i6 = i5 % 2;
        return c12034ij;
    }

    /* JADX INFO: renamed from: ｋ */
    private synchronized void m30684(C12034ij c12034ij) {
        int i = 2 % 2;
        int i2 = f29636;
        int i3 = i2 + 57;
        f29639 = i3 % 128;
        int i4 = i3 % 2;
        this.f29644 = c12034ij;
        int i5 = i2 + 11;
        f29639 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static ViewGroup m30686(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i = 2 % 2;
        Object obj = null;
        if (viewGroup2 == null) {
            int i2 = f29639 + 69;
            f29636 = i2 % 128;
            if (i2 % 2 != 0) {
                return viewGroup;
            }
            super.hashCode();
            throw null;
        }
        ViewGroup viewGroup3 = viewGroup2;
        while (viewGroup2 != null) {
            int i3 = f29636 + 31;
            f29639 = i3 % 128;
            int i4 = i3 % 2;
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                int i5 = f29639 + 109;
                f29636 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            } else {
                int i6 = f29639 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f29636 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 66 / 0;
                    if (viewGroup3 == viewGroup2) {
                        return viewGroup2;
                    }
                } else if (viewGroup3 == viewGroup2) {
                    return viewGroup2;
                }
                return viewGroup3;
            }
        }
        int i8 = f29639 + 43;
        f29636 = i8 % 128;
        int i9 = i8 % 2;
        return viewGroup2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private View.OnLayoutChangeListener m30679(final ViewGroup viewGroup) {
        int i = 2 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.2

            /* JADX INFO: renamed from: ﮐ */
            private static int f29646 = 1;

            /* JADX INFO: renamed from: ﱡ */
            private static int f29647 = 0;

            /* JADX INFO: renamed from: ﻏ */
            private static char f29648 = 18459;

            /* JADX INFO: renamed from: ﻛ */
            private static char f29649 = 8890;

            /* JADX INFO: renamed from: ﾇ */
            private static char f29650 = 18328;

            /* JADX INFO: renamed from: ﾒ */
            private static char f29651 = 21443;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                if (C12092s.m30994().m31000()) {
                    return;
                }
                int i11 = f29647 + 39;
                f29646 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        C12060ji.m30680(C12060ji.this, viewGroup, this);
                        int i12 = 47 / 0;
                    } else {
                        C12060ji.m30680(C12060ji.this, viewGroup, this);
                    }
                    int i13 = f29646 + 51;
                    f29647 = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 2 / 0;
                    }
                } catch (Throwable th) {
                    C12080kb.m30845(m30696("등췂\udfce뜮\ude20⯝ꆖ\uf47c걟赩亘읷ꎓ衁㐔縃ઠ榉㦔샔쌮ㄏ뗎퓡䡩뇇", 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m30696("\u1c8b㒚૭벗븫酮坐ထ㢗䫐䐿歆ઉ䫠ܧ꼠槛䀻Ü滐쨺呉\ue774ﯷ", 23 - (Process.myPid() >> 22)).intern(), th, false);
                }
            }

            /* JADX INFO: renamed from: ﻐ */
            private static String m30696(String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (C12078k.f29776) {
                    char[] cArr2 = new char[cArr.length];
                    C12078k.f29775 = 0;
                    char[] cArr3 = new char[2];
                    while (C12078k.f29775 < cArr.length) {
                        cArr3[0] = cArr[C12078k.f29775];
                        cArr3[1] = cArr[C12078k.f29775 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f29649)) ^ ((c2 >>> 5) + f29648)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29651) ^ ((c3 + i3) ^ ((c3 << 4) + f29650))));
                            i3 -= 40503;
                        }
                        cArr2[C12078k.f29775] = cArr3[0];
                        cArr2[C12078k.f29775 + 1] = cArr3[1];
                        C12078k.f29775 += 2;
                    }
                    str2 = new String(cArr2, 0, i2);
                }
                return str2;
            }
        };
        int i2 = f29636 + 9;
        f29639 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m30678(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        if (viewGroup == null || m30691(viewGroup)) {
            return;
        }
        Activity activityM30871 = C12083kh.m30871(viewGroup);
        if (!(!C12063jl.m30700().m30705(activityM30871))) {
            if (viewGroup.findViewById(160766228) == null) {
                int i2 = f29636 + 63;
                f29639 = i2 % 128;
                if (i2 % 2 == 0) {
                    m30688(viewGroup, onLayoutChangeListener);
                    return;
                } else {
                    m30688(viewGroup, onLayoutChangeListener);
                    throw null;
                }
            }
            return;
        }
        if (C12063jl.m30700().m30703(activityM30871)) {
            m30692(viewGroup, onLayoutChangeListener);
            int i3 = f29636 + 115;
            f29639 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m30688(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.ji.5
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                C12060ji.m30689(C12060ji.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f29642.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m30692(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        int i = 2 % 2;
        final ViewOnTouchListenerC12007hj.a aVar = new ViewOnTouchListenerC12007hj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.ViewOnTouchListenerC12007hj.a
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo29841(ViewOnTouchListenerC12007hj viewOnTouchListenerC12007hj, View view, MotionEvent motionEvent) {
                C12060ji.m30689(C12060ji.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.8
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C12060ji.m30683(viewGroup, aVar);
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ViewGroup) {
                        C12060ji.m30685(C12060ji.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        C12060ji.m30683(childAt, aVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        int i2 = f29636 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29639 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m30677(View view, ViewOnTouchListenerC12007hj.a aVar) {
        int i = 2 % 2;
        int i2 = f29636 + 13;
        f29639 = i2 % 128;
        int i3 = i2 % 2;
        C12075jx.m30784(view, aVar);
        int i4 = f29636 + 43;
        f29639 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private void m30682(MotionEvent motionEvent) {
        int i = 2 % 2;
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.6

                /* JADX INFO: renamed from: ﮐ */
                private static int f29659 = 1;

                /* JADX INFO: renamed from: ﱡ */
                private static int f29660 = 0;

                /* JADX INFO: renamed from: ﺙ */
                private static byte[] f29661 = {-82, Ascii.NAK, Ascii.f22490CR, 6, Ascii.ETB, 32, 37, -12, 32, 10, Ascii.f22493FS, 4, Ascii.DC4, Ascii.f22494GS, 48, -9, Ascii.CAN, 1, Ascii.f22491EM, 46, -5, Ascii.f22498RS, Ascii.DC2, 6, Ascii.SYN, 56, -59, -127, Ascii.f22492FF, -19, 52, Ascii.ETB, 57, Ascii.f22491EM, 43, 43, Ascii.CAN, 41, 38, 50, 105, -45, 53, Ascii.f22493FS, Ascii.f22502US, 44, 51, 104, -32, Ascii.f22494GS, 117, -46, 37, 44, 117, -30, 37, Ascii.NAK, 51, 42, 40, 36, Ascii.f22491EM, 120, -46, 44, 47, Ascii.NAK, 55, 107, -34, 43, Ascii.DC4, 44, 65, -106, 99, -107, -92, -46, -69, -45, -24, -77, -52, Ascii.f22493FS, 127, -46, Ascii.SYN, 123, -48, -54, -51, -6};

                /* JADX INFO: renamed from: ﻏ */
                private static short[] f29662 = null;

                /* JADX INFO: renamed from: ﻛ */
                private static int f29663 = 894089879;

                /* JADX INFO: renamed from: ｋ */
                private static int f29664 = 242204776;

                /* JADX INFO: renamed from: ﾒ */
                private static int f29665 = 108;

                /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
                
                    if (com.ironsource.adqualitysdk.sdk.p286i.C12074jw.m30771(r3, r9) != false) goto L9;
                 */
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void mo28224() {
                    /*
                        Method dump skipped, instruction units count: 446
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12060ji.AnonymousClass6.mo28224():void");
                }

                /* JADX INFO: renamed from: ﾇ */
                private static String m30697(int i2, short s, int i3, byte b, int i4) {
                    String string;
                    synchronized (C12086m.f29832) {
                        StringBuilder sb = new StringBuilder();
                        int i5 = f29665;
                        int i6 = i4 + i5;
                        int i7 = i6 == -1 ? 1 : 0;
                        if (i7 != 0) {
                            byte[] bArr = f29661;
                            if (bArr != null) {
                                i6 = (byte) (bArr[f29664 + i2] + i5);
                            } else {
                                i6 = (short) (f29662[f29664 + i2] + i5);
                            }
                        }
                        if (i6 > 0) {
                            C12086m.f29836 = ((i2 + i6) - 2) + f29664 + i7;
                            C12086m.f29833 = b;
                            C12086m.f29837 = (char) (i3 + f29663);
                            sb.append(C12086m.f29837);
                            C12086m.f29834 = C12086m.f29837;
                            C12086m.f29835 = 1;
                            while (C12086m.f29835 < i6) {
                                byte[] bArr2 = f29661;
                                if (bArr2 != null) {
                                    int i8 = C12086m.f29836;
                                    C12086m.f29836 = i8 - 1;
                                    C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i8] + s)) ^ C12086m.f29833));
                                } else {
                                    short[] sArr = f29662;
                                    int i9 = C12086m.f29836;
                                    C12086m.f29836 = i9 - 1;
                                    C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i9] + s)) ^ C12086m.f29833));
                                }
                                sb.append(C12086m.f29837);
                                C12086m.f29834 = C12086m.f29837;
                                C12086m.f29835++;
                            }
                        }
                        string = sb.toString();
                    }
                    return string;
                }
            });
            int i2 = f29639 + 63;
            f29636 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30676(null, 127 - Color.argb(0, 0, 0, 0), null, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m30676(null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, null, "\u0098\u0096\u0085\u0090\u0094\u0090\u0083\u0094\u0097\u0096\u0085\u0090\u0094\u0089\u0088\u0087\u0083\u008d\u0094\u0095\u008f\u008b\u008d\u008d\u008e\u0095\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static boolean m30691(ViewGroup viewGroup) {
        int i = 2 % 2;
        try {
            if (viewGroup.getChildCount() == 0) {
                return false;
            }
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                int i3 = f29636 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f29639 = i3 % 128;
                int i4 = i3 % 2;
                if (!(viewGroup.getChildAt(i2) instanceof TextView)) {
                    int i5 = f29639 + 49;
                    f29636 = i5 % 128;
                    return i5 % 2 == 0;
                }
            }
            return true;
        } catch (Throwable th) {
            C12085l.m30922(m30676(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m30676(null, 127 - ExpandableListView.getPackedPositionType(0L), null, "\u008c\u0096\u008e\u008b\u009b\u008d\u009e\u008e\u0086\u0094\u009d\u0082\u008f\u0083\u0094\u008c\u008f\u008b\u0085\u008d\u008f\u0083\u0088\u0094\u009c\u0087\u0083\u0090\u0081\u0096\u008e\u008b\u009b\u0094\u009a\u008b\u0094\u0095\u008f\u008b\u0099\u0088\u008e\u0089\u0088\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30676(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f29641;
            int i2 = f29635;
            if (f29637) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f29638) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
