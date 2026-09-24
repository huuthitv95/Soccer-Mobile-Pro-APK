package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12055jd {

    /* JADX INFO: renamed from: ﻛ */
    private static C12055jd f29572;

    /* JADX INFO: renamed from: ﮐ */
    private AbstractC12059jh f29573;

    /* JADX INFO: renamed from: ﻐ */
    private boolean f29574;

    /* JADX INFO: renamed from: ﾇ */
    private Choreographer.FrameCallback f29576;

    /* JADX INFO: renamed from: ｋ */
    private HashMap<InterfaceC12036il, AbstractRunnableC12044it> f29575 = new HashMap<>();

    /* JADX INFO: renamed from: ﾒ */
    private Handler f29577 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﱡ */
    static /* synthetic */ boolean m30622(C12055jd c12055jd) {
        c12055jd.f29574 = false;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static synchronized C12055jd m30631() {
        if (f29572 == null) {
            f29572 = new C12055jd();
        }
        return f29572;
    }

    private C12055jd() {
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$2, reason: invalid class name */
    final class AnonymousClass2 extends AbstractRunnableC12044it {
        AnonymousClass2() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            if (C12055jd.this.f29573 == null) {
                C12055jd.this.f29573 = new AbstractC12059jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28395(Activity activity) {
                        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.2.5
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                final C12055jd c12055jd = C12055jd.this;
                                C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5
                                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                    /* JADX INFO: renamed from: ﻛ */
                                    public final void mo28224() {
                                        C12055jd.m30622(C12055jd.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12059jh, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12061jj
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo28396(Activity activity) {
                        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.2.2
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                C12055jd.m30625(C12055jd.this);
                            }
                        });
                    }
                };
                C12055jd.this.f29577.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo28224() {
                        AbstractC12058jg.m30663().m30665(C12055jd.this.f29573);
                        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.2.3.1
                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() {
                                C12055jd.m30625(C12055jd.this);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m30634() {
        C12089p.m30935(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$3, reason: invalid class name */
    final class AnonymousClass3 extends AbstractRunnableC12044it {

        /* JADX INFO: renamed from: ﾒ */
        final /* synthetic */ InterfaceC12036il f29590;

        AnonymousClass3(InterfaceC12036il interfaceC12036il) {
            this.f29590 = interfaceC12036il;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            C12055jd.this.f29575.put(this.f29590, new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.3.5
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    AnonymousClass3.this.f29590.mo29849();
                }
            });
            C12055jd.m30625(C12055jd.this);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m30635(InterfaceC12036il interfaceC12036il) {
        C12089p.m30935(new AnonymousClass3(interfaceC12036il));
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jd$4, reason: invalid class name */
    final class AnonymousClass4 extends AbstractRunnableC12044it {

        /* JADX INFO: renamed from: ｋ */
        private /* synthetic */ InterfaceC12036il f29593;

        AnonymousClass4(InterfaceC12036il interfaceC12036il) {
            this.f29593 = interfaceC12036il;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            C12055jd.this.f29575.remove(this.f29593);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m30633(InterfaceC12036il interfaceC12036il) {
        C12089p.m30935(new AnonymousClass4(interfaceC12036il));
    }

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m30625(C12055jd c12055jd) {
        if (c12055jd.f29574 || new HashMap(c12055jd.f29575).isEmpty()) {
            return;
        }
        c12055jd.f29574 = true;
        C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (!C12055jd.this.f29574) {
                    C12055jd.this.f29576 = null;
                    return;
                }
                HashMap mapM30623 = C12055jd.m30623(C12055jd.this);
                Iterator it = mapM30623.keySet().iterator();
                while (it.hasNext()) {
                    C12055jd.this.f29577.post((Runnable) mapM30623.get((InterfaceC12036il) it.next()));
                }
                if (C12055jd.this.f29576 == null) {
                    C12055jd.this.f29576 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.2

                        /* JADX INFO: renamed from: ﻛ */
                        private static int f29579 = 1;

                        /* JADX INFO: renamed from: ｋ */
                        private static int f29580 = 0;

                        /* JADX INFO: renamed from: ﾒ */
                        private static long f29581 = 2925736792878201695L;

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            int i = 2 % 2;
                            int i2 = f29580 + 1;
                            f29579 = i2 % 128;
                            try {
                                if (i2 % 2 != 0) {
                                    C12089p.m30933(this);
                                    int i3 = f29580 + 15;
                                    f29579 = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i4 = 50 / 0;
                                        return;
                                    }
                                    return;
                                }
                                C12089p.m30933(this);
                                throw null;
                            } catch (Throwable th) {
                                C12085l.m30927(m30636("묞컪催\uda59決\uf626秐莜ᖮ齕ℱ듯", 30161 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), m30636("묹紭㜐\ue90aꍶ敤Ἅ톾讨䶲ޓ㧯\uf3d5뗍", 50707 - TextUtils.indexOf("", "")).intern(), th, false);
                            }
                        }

                        /* JADX INFO: renamed from: ｋ */
                        private static String m30636(String str, int i) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (C11997h.f29102) {
                                C11997h.f29101 = i;
                                char[] cArr2 = new char[cArr.length];
                                C11997h.f29103 = 0;
                                while (C11997h.f29103 < cArr.length) {
                                    cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29581);
                                    C11997h.f29103++;
                                }
                                str2 = new String(cArr2);
                            }
                            return str2;
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(C12055jd.this.f29576);
            }
        });
    }

    /* JADX INFO: renamed from: ﺙ */
    static /* synthetic */ HashMap m30623(C12055jd c12055jd) {
        return new HashMap(c12055jd.f29575);
    }
}
