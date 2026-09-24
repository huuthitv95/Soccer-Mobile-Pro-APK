package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cw */
/* JADX INFO: loaded from: classes6.dex */
public final class C11885cw extends C11886cx {

    /* JADX INFO: renamed from: ﱡ */
    private static int f28359 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28360 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char f28361 = 6;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f28362 = {'E', 'r', 'o', ' ', 'c', 'e', 'a', 't', 'i', 'n', 'g', 'M', 'd', 'P', 'l', 'y', 'O', 'I', 'f', 'L', 's', 'S', 'k', 'C', 'm', 'p', AbstractJsonLexerKt.UNICODE_ESC, 'h', 'A', 'B', 'R', 'v', 'F', 'G', 'H', 'J'};

    /* JADX INFO: renamed from: ｋ */
    private static long f28363 = 1109723000517658641L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28364;

    /* JADX INFO: renamed from: ﾒ */
    private static char f28365;

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ List m29818(List list, Object[] objArr) {
        int i = 2 % 2;
        int i2 = f28360 + 77;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> listM29820 = m29820((List<Object>) list, objArr);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = f28359 + 103;
        f28360 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return listM29820;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final InterfaceC12036il m29832(final C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        int i = 2 % 2;
        final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            int i2 = f28359 + 73;
            f28360 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.addAll((Collection) m29851(list, 1, List.class));
        }
        if (c11906dq == null) {
            return null;
        }
        InterfaceC12036il interfaceC12036il = new InterfaceC12036il() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12036il
            /* JADX INFO: renamed from: ﻐ */
            public final void mo29849() {
                arrayList.add(0, this);
                c11906dq.m30048(c11907dr, c11877co, arrayList);
                arrayList.remove(0);
            }
        };
        int i4 = f28359 + 9;
        f28360 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return interfaceC12036il;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static Object m29814(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28360 + 99;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        C12055jd.m30631().m30635((InterfaceC12036il) m29851(list, 0, InterfaceC12036il.class));
        int i4 = f28360 + 67;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Object m29819(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + 11;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        C12055jd.m30631().m30633((InterfaceC12036il) m29851(list, 0, InterfaceC12036il.class));
        int i4 = f28360 + 11;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final Object m29830(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            c11877co2 = c11877co;
            try {
                ViewOnClickListenerC12002he.c cVar = new ViewOnClickListenerC12002he.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.9
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.ViewOnClickListenerC12002he.c
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo29844(ViewOnClickListenerC12002he viewOnClickListenerC12002he, View view) {
                        c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, viewOnClickListenerC12002he, view}));
                    }
                };
                int i2 = f28360 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f28359 = i2 % 128;
                int i3 = i2 % 2;
                return cVar;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29815("땜鱛᱖\uf5b0\udf2f縪㻘\ue0d9ꀒ凢늶̉ꨛ밥縛ｆ\u2ffeﾨἰ鸂蘷頶慵æ垽羝ᗛ◜岸牑怘긪紅\uf156", (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "蠑糯蜰ས", ViewConfiguration.getFadingEdgeLength() >> 16, "\ud81f阆聺ⴎ").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final Object m29831(List<Object> list) {
        int i = 2 % 2;
        View view = (View) m29851(list, 0, View.class);
        final ViewOnClickListenerC12002he.c cVar = (ViewOnClickListenerC12002he.c) m29851(list, 1, ViewOnClickListenerC12002he.c.class);
        Object obj = null;
        if (!m29816(list, 2)) {
            C12075jx.m30793(view, new ViewOnClickListenerC12002he.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.15
                @Override // com.ironsource.adqualitysdk.sdk.p286i.ViewOnClickListenerC12002he.c
                /* JADX INFO: renamed from: ﻛ */
                public final void mo29844(final ViewOnClickListenerC12002he viewOnClickListenerC12002he, final View view2) {
                    C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.15.2
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            cVar.mo29844(viewOnClickListenerC12002he, view2);
                        }
                    });
                }
            });
            int i2 = f28359 + 7;
            f28360 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 4;
            }
        } else {
            int i4 = f28360 + 93;
            f28359 = i4 % 128;
            if (i4 % 2 != 0) {
                C12075jx.m30793(view, cVar);
                super.hashCode();
                throw null;
            }
            C12075jx.m30793(view, cVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static View.OnClickListener m29817(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + 97;
        f28360 = i2 % 128;
        return C12075jx.m30791((View) m29851(list, i2 % 2 == 0 ? 1 : 0, View.class));
    }

    /* JADX INFO: renamed from: ﾒ */
    public final Object m29837(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            c11877co2 = c11877co;
            try {
                ViewOnTouchListenerC12007hj.a aVar = new ViewOnTouchListenerC12007hj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.11
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.ViewOnTouchListenerC12007hj.a
                    /* JADX INFO: renamed from: ﻐ */
                    public final boolean mo29841(ViewOnTouchListenerC12007hj viewOnTouchListenerC12007hj, View view, MotionEvent motionEvent) {
                        return c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, viewOnTouchListenerC12007hj, view, motionEvent})).m30065();
                    }
                };
                int i2 = f28360 + 7;
                f28359 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 82 / 0;
                }
                return aVar;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29815("놭\uef2e竌팩悎⟚艜杄⇳\uf412ᇿ㔡\ue225⥈ꤎ㑴뢔켗\ue419ኳ頼ᖍ⛏ᥖ䍿䢻댣ᱴ誷氓㞹駼钘\ue342", (char) View.resolveSizeAndState(0, 0, 0), "蠑糯蜰ས", TextUtils.indexOf("", "", 0), "ḁ∞씘C").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        com.ironsource.adqualitysdk.sdk.p286i.C12075jx.m30784(r1, new com.ironsource.adqualitysdk.sdk.p286i.C11885cw.AnonymousClass14());
        r5 = com.ironsource.adqualitysdk.sdk.p286i.C11885cw.f28359 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        com.ironsource.adqualitysdk.sdk.p286i.C11885cw.f28360 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if ((r5 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r5 = 4 % 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (m29816(r5, 5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (m29816(r5, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        com.ironsource.adqualitysdk.sdk.p286i.C12075jx.m30784(r1, r2);
     */
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m29835(java.util.List<java.lang.Object> r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11885cw.f28359
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11885cw.f28360 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L28
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object r1 = m29851(r5, r2, r1)
            android.view.View r1 = (android.view.View) r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hj$a> r2 = com.ironsource.adqualitysdk.sdk.p286i.ViewOnTouchListenerC12007hj.a.class
            java.lang.Object r2 = m29851(r5, r3, r2)
            com.ironsource.adqualitysdk.sdk.i.hj$a r2 = (com.ironsource.adqualitysdk.sdk.p286i.ViewOnTouchListenerC12007hj.a) r2
            r3 = 5
            boolean r5 = m29816(r5, r3)
            if (r5 == 0) goto L42
            goto L3e
        L28:
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object r1 = m29851(r5, r3, r1)
            android.view.View r1 = (android.view.View) r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hj$a> r3 = com.ironsource.adqualitysdk.sdk.p286i.ViewOnTouchListenerC12007hj.a.class
            java.lang.Object r2 = m29851(r5, r2, r3)
            com.ironsource.adqualitysdk.sdk.i.hj$a r2 = (com.ironsource.adqualitysdk.sdk.p286i.ViewOnTouchListenerC12007hj.a) r2
            boolean r5 = m29816(r5, r0)
            if (r5 == 0) goto L42
        L3e:
            com.ironsource.adqualitysdk.sdk.p286i.C12075jx.m30784(r1, r2)
            goto L58
        L42:
            com.ironsource.adqualitysdk.sdk.i.cw$14 r5 = new com.ironsource.adqualitysdk.sdk.i.cw$14
            r5.<init>()
            com.ironsource.adqualitysdk.sdk.p286i.C12075jx.m30784(r1, r5)
            int r5 = com.ironsource.adqualitysdk.sdk.p286i.C11885cw.f28359
            int r5 = r5 + 119
            int r1 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11885cw.f28360 = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L58
            r5 = 4
            int r5 = r5 % 3
        L58:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11885cw.m29835(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﻏ */
    public static View.OnTouchListener m29812(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28360 + 113;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        View.OnTouchListener onTouchListenerM30785 = C12075jx.m30785((View) m29851(list, 0, View.class));
        int i4 = f28360 + 111;
        f28359 = i4 % 128;
        if (i4 % 2 == 0) {
            return onTouchListenerM30785;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final Object m29836(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            c11877co2 = c11877co;
            try {
                C12000hc.c cVar = new C12000hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.13
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12000hc.c
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo29843(C12000hc c12000hc, MediaPlayer mediaPlayer) {
                        c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, c12000hc, mediaPlayer}));
                    }
                };
                int i2 = f28359 + 33;
                f28360 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 25 / 0;
                }
                return cVar;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29815("ﵰ摇ㄎ\uf2e2▤埲䣐쨔\uf0a2鼺鷂諌⠤Ӳ\u0de0ŋ巃硿챢\ue7b2划럣収\ue2a1担柴熎в\ue92e꼠廪귎\ua6ff㢎쉈戀풇㓭\u0ae5뢳\uf66d菱擏흟", (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63662), "蠑糯蜰ས", KeyEvent.normalizeMetaState(0), "㿗䉫긚蟸").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final Object m29834(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            c11877co2 = c11877co;
            try {
                C12004hg.d dVar = new C12004hg.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.12
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12004hg.d
                    /* JADX INFO: renamed from: ﻛ */
                    public final boolean mo29842(C12004hg c12004hg, MediaPlayer mediaPlayer, int i2, int i3) {
                        return c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, c12004hg, mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)})).m30065();
                    }
                };
                int i2 = f28360 + 15;
                f28359 = i2 % 128;
                int i3 = i2 % 2;
                return dVar;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29813("\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\t\u0000\u0011\t\u0007\u000e\u000f\t\f\u0000\u0002\u000f\n\u000f\u000b\u0014\u0000\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", 40 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((Process.myTid() >> 22) + 53)).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﺙ */
    public final Object m29827(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            c11877co2 = c11877co;
            try {
                C12001hd.e eVar = new C12001hd.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.18
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12001hd.e
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo29845(C12001hd c12001hd, MediaPlayer mediaPlayer) {
                        c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, c12001hd, mediaPlayer}));
                    }
                };
                int i2 = f28359 + 85;
                f28360 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 93 / 0;
                }
                return eVar;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29815("⩤\ue5d2ꀗ㸃䨎\uf6b2\ue506玛\uecda뽾\u0ee1㚔僴\ua7d2뢄汁ꅦ०\uf479꼾瓝ቊ⺣\uede5䦪㑓ꉹ廉䜔㉈凤袻\ue1e1\udc19몵袜ꔷ\ue908癒忏⾹ﻦ狯Ƣ褳훇", (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), "蠑糯蜰ས", (-1) - TextUtils.lastIndexOf("", '0', 0), "珑◙\uf0d5續").intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﱟ */
    public final Object m29823(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            c11877co2 = c11877co;
            try {
                C12006hi.d dVar = new C12006hi.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.20
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12006hi.d
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo29848(C12006hi c12006hi, MediaPlayer mediaPlayer) {
                        c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, c12006hi, mediaPlayer}));
                    }
                };
                int i2 = f28359 + 33;
                f28360 = i2 % 128;
                if (i2 % 2 != 0) {
                    return dVar;
                }
                throw null;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29813("\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\t\u0000\u0011\t\u0007\u000e\u000f\t\f\u0000\u0002\u000f\n\u0017\u0003\u0004\u0017\u0014\u0005\u0019\u001a\u0011\u0002\u000b\u0001\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", MotionEvent.axisFromString("") + 49, (byte) (126 - View.MeasureSpec.getSize(0))).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﮐ */
    public final Object m29821(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            final boolean zM29816 = m29816(list, 2);
            c11877co2 = c11877co;
            try {
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.1

                    /* JADX INFO: renamed from: ﮐ */
                    private static long f28366 = -6792767426505564234L;

                    /* JADX INFO: renamed from: ﱟ */
                    private static int f28367 = 1;

                    /* JADX INFO: renamed from: ﱡ */
                    private static int f28368;

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        int i10 = 2 % 2;
                        int i11 = f28367 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                        f28368 = i11 % 128;
                        int i12 = i11 % 2;
                        try {
                            final List<Object> listM29818 = C11885cw.m29818(list2, new Object[]{this, view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
                            if (zM29816) {
                                c11906dq.m30048(c11907dr, c11877co2, listM29818);
                                int i13 = f28368 + 55;
                                f28367 = i13 % 128;
                                int i14 = i13 % 2;
                                return;
                            }
                            C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.1.5
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    c11906dq.m30048(c11907dr, c11877co2, listM29818);
                                }
                            });
                            int i15 = f28367 + 113;
                            f28368 = i15 % 128;
                            int i16 = i15 % 2;
                        } catch (Throwable th) {
                            String strM29666 = c11877co2.m29666();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m29838("鿳뼧\ude02ﵰ᱈㯹媍秭颎렂휆\uf63bᕳ㑈厳犎釲냦퀨\uef0e\u0e64ⵎ䱑殟誗ꧮ죌\ue822܌♤䕞擫莿ꊛ쇣\ue0d6>弜縤", 8419 - TextUtils.indexOf("", "", 0, 0)).intern());
                            sb.append(c11906dq.m30049());
                            C11875cm.m29607(strM29666, sb.toString(), th);
                        }
                    }

                    /* JADX INFO: renamed from: ﻐ */
                    private static String m29838(String str, int i2) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (C11997h.f29102) {
                            C11997h.f29101 = i2;
                            char[] cArr2 = new char[cArr.length];
                            C11997h.f29103 = 0;
                            while (C11997h.f29103 < cArr.length) {
                                cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f28366);
                                C11997h.f29103++;
                            }
                            str2 = new String(cArr2);
                        }
                        return str2;
                    }
                };
                int i2 = f28360 + 33;
                f28359 = i2 % 128;
                if (i2 % 2 == 0) {
                    return onLayoutChangeListener;
                }
                throw null;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29813("\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0004\u000f\u0007\u0015\t\f\b \u000b\u0013\u0018\t\n\u000b\u0001\u0017\u000e\u001a\u000b\u0001\u000b\u0003Ó", View.combineMeasuredStates(0, 0) + 37, (byte) (145 - AndroidCharacter.getMirror('0'))).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    public final Object m29829(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final C11906dq c11906dq2 = (C11906dq) m29851(list, 1, C11906dq.class);
            final List<Object> list2 = m29854(list, 2);
            final boolean zM29816 = m29816(list, 3);
            c11877co2 = c11877co;
            try {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.2

                    /* JADX INFO: renamed from: ﭖ */
                    private static int f28413 = 0;

                    /* JADX INFO: renamed from: ﭴ */
                    private static char f28414 = 46272;

                    /* JADX INFO: renamed from: ﮌ */
                    private static int f28415 = 1;

                    /* JADX INFO: renamed from: ﮐ */
                    private static char f28416 = 755;

                    /* JADX INFO: renamed from: ﱟ */
                    private static char f28417 = 63210;

                    /* JADX INFO: renamed from: ﺙ */
                    private static char f28418 = 53888;

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        int i2 = 2 % 2;
                        int i3 = f28415 + 55;
                        f28413 = i3 % 128;
                        int i4 = i3 % 2;
                        m29847(c11906dq, view);
                        int i5 = f28413 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                        f28415 = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 54 / 0;
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        int i2 = 2 % 2;
                        int i3 = f28413 + 5;
                        f28415 = i3 % 128;
                        int i4 = i3 % 2;
                        m29847(c11906dq2, view);
                        int i5 = f28413 + 49;
                        f28415 = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                    }

                    /* JADX INFO: renamed from: ﾒ */
                    private void m29847(final C11906dq c11906dq3, View view) {
                        int i2 = 2 % 2;
                        try {
                            final List<Object> listM29818 = C11885cw.m29818(list2, new Object[]{this, view});
                            Object obj = null;
                            if (zM29816) {
                                c11906dq3.m30048(c11907dr, c11877co2, listM29818);
                                int i3 = f28415 + 97;
                                f28413 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    return;
                                }
                                super.hashCode();
                                throw null;
                            }
                            C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.2.1
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    c11906dq3.m30048(c11907dr, c11877co2, listM29818);
                                }
                            });
                            int i4 = f28415 + 45;
                            f28413 = i4 % 128;
                            if (i4 % 2 == 0) {
                                return;
                            }
                            super.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            String strM29666 = c11877co2.m29666();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m29846("枦碐꒳\ueffd︄ꮺ煘䀊䖗ᩛའ⩱ጛ\ue31a\ue47d眰뙺婢멚㻍\uef7c폕筏⦪\ue370\uf6bf\ue5f3゚됍쾠풐队鄡註\uf58e\ue302옇岾ࣼ⋏ꦻ뾀ྜྷ䈕", TextUtils.lastIndexOf("", '0', 0, 0) + 45).intern());
                            sb.append(c11906dq3.m30049());
                            C11875cm.m29607(strM29666, sb.toString(), th);
                        }
                    }

                    /* JADX INFO: renamed from: ﾇ */
                    private static String m29846(String str, int i2) {
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
                                    char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f28416)) ^ ((c2 >>> 5) + f28414)));
                                    cArr3[1] = c3;
                                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28417) ^ ((c3 + i3) ^ ((c3 << 4) + f28418))));
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
                int i2 = f28360 + 61;
                f28359 = i2 % 128;
                int i3 = i2 % 2;
                return onAttachStateChangeListener;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29813("\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0004\u000f\n\u001bîî\n\u0000!\u001b\b\u0007\u000b\u0001\u0015\u001d\u0007\n\u000b\u0004\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, (byte) (122 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﱡ */
    public final Object m29826(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28360 + 27;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m29851(list, 0, MediaPlayer.class);
        final C12006hi.d dVar = (C12006hi.d) m29851(list, 1, C12006hi.d.class);
        if (!m29816(list, 2)) {
            C12075jx.m30783(mediaPlayer, new C12006hi.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.3
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12006hi.d
                /* JADX INFO: renamed from: ﻐ */
                public final void mo29848(final C12006hi c12006hi, final MediaPlayer mediaPlayer2) {
                    C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            dVar.mo29848(c12006hi, mediaPlayer2);
                        }
                    });
                }
            });
            return null;
        }
        int i4 = f28360 + 9;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        C12075jx.m30783(mediaPlayer, dVar);
        return null;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final Object m29828(List<Object> list) {
        int i = 2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m29851(list, 0, MediaPlayer.class);
        final C12000hc.c cVar = (C12000hc.c) m29851(list, 1, C12000hc.c.class);
        if (!m29816(list, 2)) {
            C12075jx.m30792(mediaPlayer, new C12000hc.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.4
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12000hc.c
                /* JADX INFO: renamed from: ﻛ */
                public final void mo29843(final C12000hc c12000hc, final MediaPlayer mediaPlayer2) {
                    C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            cVar.mo29843(c12000hc, mediaPlayer2);
                        }
                    });
                }
            });
            int i2 = f28359 + 43;
            f28360 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f28360 + 43;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        C12075jx.m30792(mediaPlayer, cVar);
        return null;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final Object m29824(List<Object> list) {
        int i = 2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m29851(list, 0, MediaPlayer.class);
        final C12004hg.d dVar = (C12004hg.d) m29851(list, 1, C12004hg.d.class);
        if (!m29816(list, 2)) {
            C12075jx.m30782(mediaPlayer, new C12004hg.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.7
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12004hg.d
                /* JADX INFO: renamed from: ﻛ */
                public final boolean mo29842(final C12004hg c12004hg, final MediaPlayer mediaPlayer2, final int i2, final int i3) {
                    C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.7.5
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            dVar.mo29842(c12004hg, mediaPlayer2, i2, i3);
                        }
                    });
                    return false;
                }
            });
            return null;
        }
        int i2 = f28359 + 63;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        C12075jx.m30782(mediaPlayer, dVar);
        int i4 = f28360 + 59;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final Object m29822(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28360 + 49;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m29851(list, 0, MediaPlayer.class);
        final C12001hd.e eVar = (C12001hd.e) m29851(list, 1, C12001hd.e.class);
        if (m29816(list, 2)) {
            C12075jx.m30781(mediaPlayer, eVar);
        } else {
            C12075jx.m30781(mediaPlayer, new C12001hd.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.6
                @Override // com.ironsource.adqualitysdk.sdk.p286i.C12001hd.e
                /* JADX INFO: renamed from: ﻛ */
                public final void mo29845(final C12001hd c12001hd, final MediaPlayer mediaPlayer2) {
                    C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.6.5
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            eVar.mo29845(c12001hd, mediaPlayer2);
                        }
                    });
                }
            });
        }
        int i4 = f28360 + 7;
        f28359 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ */
    public static Object m29808(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + 27;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        InterfaceC12003hf interfaceC12003hf = (InterfaceC12003hf) m29851(list, 0, InterfaceC12003hf.class);
        if (interfaceC12003hf == null) {
            return null;
        }
        int i4 = f28360 + 73;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        return interfaceC12003hf.mo28813();
    }

    /* JADX INFO: renamed from: ﱡ */
    public final Object m29825(C11877co c11877co, List<Object> list, final C11907dr c11907dr) {
        final C11877co c11877co2;
        int i = 2 % 2;
        try {
            final C11906dq c11906dq = (C11906dq) m29851(list, 0, C11906dq.class);
            final List<Object> list2 = m29854(list, 1);
            final boolean zM29816 = m29816(list, 2);
            c11877co2 = c11877co;
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.8
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(final Context context, final Intent intent) {
                        if (zM29816) {
                            c11906dq.m30048(c11907dr, c11877co2, C11885cw.m29818(list2, new Object[]{this, context, intent}));
                        } else {
                            C12089p.m30935(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.8.1
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    AnonymousClass8.m29850(anonymousClass8, c11906dq, c11907dr, c11877co2, list2, context, intent);
                                }
                            });
                        }
                    }

                    /* JADX INFO: renamed from: ﻛ */
                    static /* synthetic */ void m29850(AnonymousClass8 anonymousClass8, C11906dq c11906dq2, C11907dr c11907dr2, C11877co c11877co3, List list3, Context context, Intent intent) {
                        c11906dq2.m30048(c11907dr2, c11877co3, C11885cw.m29818(list3, new Object[]{anonymousClass8, context, intent}));
                    }
                };
                int i2 = f28359 + 39;
                f28360 = i2 % 128;
                int i3 = i2 % 2;
                return broadcastReceiver;
            } catch (Exception e) {
                e = e;
                C11875cm.m29607(c11877co2.m29666(), m29813("\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\u001b\u0002\u0003\f\u0012\u0000\n\u0013\b#\u0000\u0005\u0000\u0007 \u0000\u0002", ExpandableListView.getPackedPositionType(0L) + 32, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 77)).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c11877co2 = c11877co;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final Object m29833(final C11877co c11877co, List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + 83;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        final boolean zBooleanValue = false;
        Class cls = (Class) m29851(list, 0, Class.class);
        Object obj = m29851(list, 1, (Class<Object>) Object.class);
        if (list.size() > 2) {
            int i4 = f28359 + 101;
            f28360 = i4 % 128;
            int i5 = i4 % 2;
            zBooleanValue = ((Boolean) m29851(list, 2, Boolean.class)).booleanValue();
        }
        final String simpleName = list.size() > 3 ? (String) m29851(list, 3, String.class) : cls.getSimpleName();
        Object objM30863 = C12082kd.m30863(cls, obj, new C12082kd.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cw.10

            /* JADX INFO: renamed from: ﱡ */
            private static int f28377 = 1;

            /* JADX INFO: renamed from: ﻏ */
            private static int f28378;

            /* JADX INFO: renamed from: ﻐ */
            private static int[] f28379 = {1034882845, -1197594538, 876839450, -127022386, 1335933787, -508013874, 332973642, -676724853, 722331685, -977185093, 275454129, -1935505365, 1530432921, 2110395307, -1060230474, -1166156579, -11148212, -401465950};

            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12082kd.a
            /* JADX INFO: renamed from: ﻛ */
            public final void mo29840(Object obj2, Method method, Object[] objArr) {
                List arrayList;
                int i6 = 2 % 2;
                int i7 = f28377 + 87;
                f28378 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        int i8 = 71 / 0;
                        if (method == null) {
                            return;
                        }
                    } catch (Exception e) {
                        String strM29666 = c11877co.m29666();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m29839(new int[]{1430847569, -1042531883, 225780656, 1990721385, 1045390630, -1250416021, 1955854570, 138883563}, MotionEvent.axisFromString("") + 16).intern());
                        sb.append(method.getName());
                        sb.append(m29839(new int[]{-290072526, 1861831634, 981155117, -842946688, 1735769585, -1574333051}, 11 - View.combineMeasuredStates(0, 0)).intern());
                        sb.append(simpleName);
                        sb.append(m29839(new int[]{-100196396, -612661350, -426795005, 2117462589, -1654589852, 1405934923}, 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                        C11875cm.m29607(strM29666, sb.toString(), e);
                        return;
                    }
                } else if (method == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(simpleName);
                sb2.append(m29839(new int[]{-1668874154, -1793604793}, (KeyEvent.getMaxKeyCode() >> 16) + 1).intern());
                sb2.append(method.getName());
                String string = sb2.toString();
                InterfaceC12003hf interfaceC12003hf = (InterfaceC12003hf) obj2;
                if (objArr != null) {
                    int i9 = f28377 + 37;
                    f28378 = i9 % 128;
                    int i10 = i9 % 2;
                    arrayList = Arrays.asList(objArr);
                } else {
                    arrayList = new ArrayList();
                }
                List<Object> listM29818 = C11885cw.m29818(arrayList, new Object[]{interfaceC12003hf});
                ArrayList arrayList2 = new ArrayList();
                if (zBooleanValue) {
                    int i11 = f28378 + 41;
                    f28377 = i11 % 128;
                    if (i11 % 2 == 0) {
                        arrayList2.add(listM29818);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    arrayList2.add(listM29818);
                    listM29818 = arrayList2;
                }
                c11877co.m29665().mo29605(string, listM29818);
            }

            /* JADX INFO: renamed from: ﾒ */
            private static String m29839(int[] iArr, int i6) {
                String str;
                synchronized (C11835b.f27464) {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f28379.clone();
                    C11835b.f27462 = 0;
                    while (C11835b.f27462 < iArr.length) {
                        cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                        cArr[1] = (char) iArr[C11835b.f27462];
                        cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                        cArr[3] = (char) iArr[C11835b.f27462 + 1];
                        C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                        C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                        C11835b.m28718(iArr2);
                        for (int i7 = 0; i7 < 16; i7++) {
                            int i8 = C11835b.f27463 ^ iArr2[i7];
                            C11835b.f27463 = i8;
                            C11835b.f27461 = C11835b.m28717(i8) ^ C11835b.f27461;
                            int i9 = C11835b.f27463;
                            C11835b.f27463 = C11835b.f27461;
                            C11835b.f27461 = i9;
                        }
                        int i10 = C11835b.f27463;
                        C11835b.f27463 = C11835b.f27461;
                        C11835b.f27461 = i10;
                        C11835b.f27461 = i10 ^ iArr2[16];
                        C11835b.f27463 ^= iArr2[17];
                        int i11 = C11835b.f27463;
                        int i12 = C11835b.f27461;
                        cArr[0] = (char) (C11835b.f27463 >>> 16);
                        cArr[1] = (char) C11835b.f27463;
                        cArr[2] = (char) (C11835b.f27461 >>> 16);
                        cArr[3] = (char) C11835b.f27461;
                        C11835b.m28718(iArr2);
                        cArr2[C11835b.f27462 << 1] = cArr[0];
                        cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                        cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                        cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                        C11835b.f27462 += 2;
                    }
                    str = new String(cArr2, 0, i6);
                }
                return str;
            }
        });
        int i6 = f28360 + 87;
        f28359 = i6 % 128;
        if (i6 % 2 == 0) {
            return objM30863;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ */
    public static boolean m29809(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM30865 = C12082kd.m30865(m29851(list, 0, Object.class));
        int i4 = f28360 + 53;
        f28359 = i4 % 128;
        if (i4 % 2 == 0) {
            return zM30865;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ */
    public static C12070js m29810(List<Object> list) {
        WebView webView;
        String strM29815;
        int i = 2 % 2;
        int i2 = f28360 + 55;
        f28359 = i2 % 128;
        if (i2 % 2 != 0) {
            webView = (WebView) m29851(list, 0, WebView.class);
            strM29815 = m29815("ᙞ˵襶⫥⺐铈岊덃䲅", (char) (TypedValue.complexToFraction(0, 2.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 0.0f) == 0.0f ? 0 : -1)), "蠑糯蜰ས", (ViewConfiguration.getKeyRepeatTimeout() * 71) - 747543349, "쭄煤\uddd3\uef34");
        } else {
            webView = (WebView) m29851(list, 0, WebView.class);
            strM29815 = m29815("ᙞ˵襶⫥⺐铈岊덃䲅", (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "蠑糯蜰ས", (-747543349) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "쭄煤\uddd3\uef34");
        }
        C12070js c12070jsM30734 = C12070js.m30734(webView, strM29815.intern());
        int i3 = f28359 + 79;
        f28360 = i3 % 128;
        if (i3 % 2 != 0) {
            return c12070jsM30734;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ */
    public static Object m29811(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + 59;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        ((C12070js) m29851(list, 0, C12070js.class)).m30741();
        int i4 = f28359 + 111;
        f28360 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﭖ */
    public static Object m29807(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28359 + 23;
        f28360 = i2 % 128;
        int i3 = i2 % 2;
        ((C12070js) m29851(list, 0, C12070js.class)).m30737();
        int i4 = f28359 + 77;
        f28360 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﬤ */
    public static WebViewClient m29805(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28360 + 71;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        WebViewClient webViewClientM30887 = C12084ki.m30887((WebView) m29851(list, 0, WebView.class));
        int i4 = f28359 + 47;
        f28360 = i4 % 128;
        if (i4 % 2 != 0) {
            return webViewClientM30887;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: סּ */
    public static WebChromeClient m29806(List<Object> list) {
        int i = 2 % 2;
        int i2 = f28360 + 13;
        f28359 = i2 % 128;
        int i3 = i2 % 2;
        WebChromeClient webChromeClientM30890 = C12084ki.m30890((WebView) m29851(list, 0, WebView.class));
        int i4 = f28360 + 51;
        f28359 = i4 % 128;
        if (i4 % 2 == 0) {
            return webChromeClientM30890;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static List<Object> m29820(List<Object> list, Object... objArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            int i2 = f28360 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f28359 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.addAll(list);
        }
        int i4 = f28360 + 85;
        f28359 = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m29816(List<Object> list, int i) {
        int i2 = 2 % 2;
        int i3 = f28359 + 33;
        f28360 = i3 % 128;
        int i4 = i3 % 2;
        if (list.size() <= i || !((Boolean) m29851(list, i, Boolean.class)).booleanValue()) {
            return false;
        }
        int i5 = f28359 + 97;
        f28360 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29815(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28363) ^ ((long) f28364)) ^ ((long) f28365));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m29813(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28362;
            char c = f28361;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
