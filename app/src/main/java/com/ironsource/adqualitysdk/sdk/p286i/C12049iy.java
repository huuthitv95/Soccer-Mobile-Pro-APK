package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.iy */
/* JADX INFO: loaded from: classes6.dex */
public final class C12049iy {

    /* JADX INFO: renamed from: ﺙ */
    private static int f29456 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f29457 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29458 = {'N', 'e', 't', 'w', 'o', 'r', 'k', 'M', 'a', 'n', 'g', 'U', 'b', 'l', ' ', 'p', 's', 'c', AbstractJsonLexerKt.UNICODE_ESC, 'm', 'q', 'i', 'h', 'R', 'L', 'H', 'd', 'v', 'S', 'O', 'P', 'Q', 'T', 'V', 'W', 'X'};

    /* JADX INFO: renamed from: ﾒ */
    private static char f29459 = 6;

    /* JADX INFO: renamed from: ｋ */
    private final C12047iw f29460;

    /* JADX INFO: renamed from: ﾇ */
    private boolean f29461 = false;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.iy$c */
    interface c {
        /* JADX INFO: renamed from: ﻐ */
        C12045iu mo30567();
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ void m30562(C12049iy c12049iy, InterfaceC12046iv interfaceC12046iv, c cVar) {
        int i = 2 % 2;
        int i2 = f29456 + 113;
        f29457 = i2 % 128;
        int i3 = i2 % 2;
        c12049iy.m30561(interfaceC12046iv, cVar);
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = f29457 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29456 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ C12047iw m30563(C12049iy c12049iy) {
        int i = 2 % 2;
        int i2 = f29457;
        int i3 = i2 + 79;
        f29456 = i3 % 128;
        int i4 = i3 % 2;
        C12047iw c12047iw = c12049iy.f29460;
        if (i4 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 25;
        f29456 = i5 % 128;
        int i6 = i5 % 2;
        return c12047iw;
    }

    public C12049iy(Context context) {
        this.f29460 = new C12047iw(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: ﻛ */
    public final C12047iw m30564() {
        int i = 2 % 2;
        int i2 = f29456 + 85;
        int i3 = i2 % 128;
        f29457 = i3;
        int i4 = i2 % 2;
        C12047iw c12047iw = this.f29460;
        int i5 = i3 + 59;
        f29456 = i5 % 128;
        if (i5 % 2 != 0) {
            return c12047iw;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30565() {
        int i = 2 % 2;
        int i2 = f29457 + 87;
        f29456 = i2 % 128;
        int i3 = i2 % 2;
        this.f29460.m30542();
        this.f29461 = true;
        int i4 = f29456 + 37;
        f29457 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30566(final String str, final JSONObject jSONObject, InterfaceC12046iv interfaceC12046iv) {
        int i = 2 % 2;
        int i2 = f29456 + 95;
        f29457 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = f29457 + 7;
            f29456 = i4 % 128;
            int i5 = i4 % 2;
            C12085l.m30910(m30560("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\t\u000b\u0002\u0000", (ViewConfiguration.getLongPressTimeout() >> 16) + 14, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46)).intern(), m30560("\u0006\n\u0006\u000e\u0013\u0007\u0014\b\u0002\u0010\u0010\u0003\u000e\u0004\u000f\f\u0016\f\u0003\u0005\u0014\r\u0000\u0002\u0015\u0013\u0004\r\b\u0014\u0003\u0013\u0004\u0014\u0002\u0000\u0011\b\u0012\u001d\u0010\u0002\u0002\u0011\u0000\u0002\u0011\u0010\u0003\n\r\u0004\u001a\u0007\b\u001b\u0013\u0007\u0002\u0011\u0004\u0002\u0000\u0002\u000f\b\u0005\u0003\u000f\u0010\u0000\u0005!\u001b\u0019\u0002Ç", 76 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 99)).intern());
            return;
        }
        m30561(interfaceC12046iv, new c() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12049iy.c
            /* JADX INFO: renamed from: ﻐ */
            public final C12045iu mo30567() {
                return C12048ix.m30552(jSONObject, str);
            }
        });
        int i6 = f29457 + 75;
        f29456 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private void m30561(final InterfaceC12046iv interfaceC12046iv, final c cVar) {
        int i = 2 % 2;
        int i2 = f29457 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29456 = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.f29461) {
                C12085l.m30929(m30560("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\t\u000b\u0002\u0000", 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (46 - View.MeasureSpec.getMode(0))).intern(), m30560("\"\n\u0019\u0007\u0003\n\u0002\r\u0003\u0000\u0013\u0003 \u0014\u0003\u0005\u000f\u0014\u000f!\u0000\n\u0005\u0013\u0002\u0013\u0013\u0000\u000e\u0004\u000f\u0002\u0013\u0004\b\u000f\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\t\u000b\u0002\u0000\u000f\u0002\n\u000e\u000f\u0011\u0017\u0013\b \u0005\u0004Å", Color.rgb(0, 0, 0) + 16777279, (byte) (87 - (ViewConfiguration.getEdgeSlop() >> 16))).intern());
                return;
            }
            C12072ju.m30751(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5

                /* JADX INFO: renamed from: ﱡ */
                private static int f29464 = 1;

                /* JADX INFO: renamed from: ﻐ */
                private static long f29465 = 4361090893648540107L;

                /* JADX INFO: renamed from: ﾒ */
                private static int f29466;

                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() {
                    int i3 = 2 % 2;
                    int i4 = f29466 + 75;
                    f29464 = i4 % 128;
                    int i5 = i4 % 2;
                    InterfaceC12046iv interfaceC12046iv2 = interfaceC12046iv;
                    if (i5 != 0) {
                        m30568(interfaceC12046iv2, cVar);
                        return;
                    }
                    m30568(interfaceC12046iv2, cVar);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }

                /* JADX INFO: renamed from: ﻐ */
                private void m30568(final InterfaceC12046iv interfaceC12046iv2, c cVar2) {
                    int i3 = 2 % 2;
                    int i4 = f29466 + 67;
                    f29464 = i4 % 128;
                    int i5 = i4 % 2;
                    if (!C12049iy.m30563(C12049iy.this).m30541()) {
                        m30569(interfaceC12046iv2, cVar2);
                        int i6 = f29464 + 25;
                        f29466 = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                        return;
                    }
                    try {
                        final C12045iu c12045iuMo30567 = cVar2.mo30567();
                        if (c12045iuMo30567 != null) {
                            String strM30554 = C12048ix.m30554(c12045iuMo30567);
                            String strIntern = m30570("놅됝뫙ꂥꝨ귆鎒陣鰲苮襔輝\uf5caﮮ", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1460).intern();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m30570("놌橏٩∪\ude06塚阺닓滰૫⚀슡ﺼ鬄띣卫༈⬠윢\ue3d4鿤믩埙现⾱졗\ue478耢밌報琳\u10c8쳎\ue8f2蓝ꂝ岮祈ᕁㄦ\ued17褉ꔱ䇓綕ᦤ", (-16720917) - Color.rgb(0, 0, 0)).intern());
                            sb.append(strM30554);
                            C12085l.m30909(strIntern, sb.toString());
                            C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5.2
                                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                                /* JADX INFO: renamed from: ﻛ */
                                public final void mo28224() throws Exception {
                                    interfaceC12046iv2.mo28398(c12045iuMo30567);
                                }
                            });
                            return;
                        }
                        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5.4

                            /* JADX INFO: renamed from: ﱡ */
                            private static int f29475 = 1;

                            /* JADX INFO: renamed from: ﺙ */
                            private static int f29476 = 0;

                            /* JADX INFO: renamed from: ﻛ */
                            private static char f29477 = 27268;

                            /* JADX INFO: renamed from: ｋ */
                            private static int f29478;

                            /* JADX INFO: renamed from: ﾒ */
                            private static long f29479;

                            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo28224() throws Exception {
                                int i7 = 2 % 2;
                                int i8 = f29476 + 55;
                                f29475 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    C12045iu c12045iu = c12045iuMo30567;
                                    int iM30528 = c12045iu != null ? c12045iu.m30525().m30528() : -1;
                                    InterfaceC12046iv interfaceC12046iv3 = interfaceC12046iv2;
                                    C12045iu c12045iu2 = c12045iuMo30567;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(m30571("嬩\uef5c\uf887\ueb47豙ⱨ쾴셹类鑮龳Η烴뉤\uf431ऋ뱑덿ﰽꃏ쬵꘤㲊\ue92b냦絶\u0dd7\ue998\udfc2ဍ䭅䫃ឦ뷀\uec72㶐é叔樭⬌煐枕ぜ伂港\uef93헾훎꠆\ue426謾홛ꙝ긻吧ⓨ┟ꨴ吥䎛ㄳ\ufb1a띚㓬㟔㩰\uf08cඣ癣", (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 11396), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1504610271, "⋚典莦贬").intern());
                                    sb2.append(iM30528);
                                    interfaceC12046iv3.mo28399(c12045iu2, sb2.toString());
                                    int i9 = f29475 + 53;
                                    f29476 = i9 % 128;
                                    if (i9 % 2 != 0) {
                                        int i10 = 84 / 0;
                                        return;
                                    }
                                    return;
                                }
                                Object obj = null;
                                super.hashCode();
                                throw null;
                            }

                            /* JADX INFO: renamed from: ﻐ */
                            private static String m30571(String str, char c2, String str2, int i7, String str3) {
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
                                    cArr4[0] = (char) (c2 ^ cArr4[0]);
                                    cArr5[2] = (char) (cArr5[2] + ((char) i7));
                                    int length = cArr3.length;
                                    char[] cArr6 = new char[length];
                                    C12051j.f29511 = 0;
                                    while (C12051j.f29511 < length) {
                                        int i8 = (C12051j.f29511 + 2) % 4;
                                        int i9 = (C12051j.f29511 + 3) % 4;
                                        C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i8]) % 65535);
                                        cArr5[i9] = (char) (((cArr4[i9] * 32718) + cArr5[i8]) / 65535);
                                        cArr4[i9] = C12051j.f29509;
                                        cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i9] ^ cArr3[C12051j.f29511])) ^ f29479) ^ ((long) f29478)) ^ ((long) f29477));
                                        C12051j.f29511++;
                                    }
                                    str4 = new String(cArr6);
                                }
                                return str4;
                            }
                        });
                    } catch (Exception e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m30570("놞월彈ퟺ汣\ue49b絍\uf5a8ਬ茒ᯒ遵⣩ꄒ㧅丷욮弹푍泇\ue572綮\uf20fઉ茢᮷郔⥓ꇣ㘦", 30578 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                        sb2.append(e.getLocalizedMessage());
                        interfaceC12046iv2.mo28399(null, sb2.toString());
                    }
                }

                /* JADX INFO: renamed from: ｋ */
                private void m30569(final InterfaceC12046iv interfaceC12046iv2, final c cVar2) {
                    int i3 = 2 % 2;
                    C12049iy.m30563(C12049iy.this).m30540(new InterfaceC12041iq() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12041iq
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo28406() {
                            C12049iy.m30563(C12049iy.this).m30544(this);
                            C12049iy.m30562(C12049iy.this, interfaceC12046iv2, cVar2);
                        }
                    });
                    int i4 = f29464 + 87;
                    f29466 = i4 % 128;
                    int i5 = i4 % 2;
                }

                /* JADX INFO: renamed from: ﾇ */
                private static String m30570(String str, int i3) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (C11997h.f29102) {
                        C11997h.f29101 = i3;
                        char[] cArr2 = new char[cArr.length];
                        C11997h.f29103 = 0;
                        while (C11997h.f29103 < cArr.length) {
                            cArr2[C11997h.f29103] = (char) (((long) (cArr[C11997h.f29103] ^ (C11997h.f29103 * C11997h.f29101))) ^ f29465);
                            C11997h.f29103++;
                        }
                        str2 = new String(cArr2);
                    }
                    return str2;
                }
            });
            int i3 = f29457 + 99;
            f29456 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30560(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29458;
            char c2 = f29459;
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
                        C11970g.f28963 = C11970g.f28964 / c2;
                        C11970g.f28959 = C11970g.f28964 % c2;
                        C11970g.f28966 = C11970g.f28965 / c2;
                        C11970g.f28960 = C11970g.f28965 % c2;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c2) - 1) % c2;
                            C11970g.f28966 = ((C11970g.f28966 + c2) - 1) % c2;
                            int i2 = (C11970g.f28963 * c2) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c2) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c2) - 1) % c2;
                            C11970g.f28960 = ((C11970g.f28960 + c2) - 1) % c2;
                            int i4 = (C11970g.f28963 * c2) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c2) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c2) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c2) + C11970g.f28959;
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
