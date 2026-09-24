package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ay */
/* JADX INFO: loaded from: classes6.dex */
public final class C11833ay {

    /* JADX INFO: renamed from: ﭖ */
    private static int f27428 = 135;

    /* JADX INFO: renamed from: ﭴ */
    private static boolean f27429 = true;

    /* JADX INFO: renamed from: ﭸ */
    private static boolean f27430 = true;

    /* JADX INFO: renamed from: ﮉ */
    private static int f27431 = 1;

    /* JADX INFO: renamed from: ﮌ */
    private static int f27432 = 0;

    /* JADX INFO: renamed from: ﮐ */
    private static char f27433 = 18761;

    /* JADX INFO: renamed from: ﱟ */
    private static char f27434 = 21649;

    /* JADX INFO: renamed from: ﱡ */
    private static char[] f27435 = {232, 234, 251, 230, 250, 249, 236, 235, 252, 244, 247, 246, 256, 193};

    /* JADX INFO: renamed from: ﺙ */
    private static char f27436 = 31357;

    /* JADX INFO: renamed from: ﻏ */
    private static char f27437 = 18021;

    /* JADX INFO: renamed from: ﻐ */
    private ISAdQualityAdListener f27438;

    /* JADX INFO: renamed from: ｋ */
    private C11814af f27440;

    /* JADX INFO: renamed from: ﾒ */
    private Handler f27442;

    /* JADX INFO: renamed from: ﾇ */
    private Set<InterfaceC12040ip> f27441 = new HashSet();

    /* JADX INFO: renamed from: ﻛ */
    private Set<String> f27439 = new HashSet();

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ C11814af m28691(C11833ay c11833ay) {
        int i = 2 % 2;
        int i2 = f27431;
        int i3 = i2 + 63;
        f27432 = i3 % 128;
        int i4 = i3 % 2;
        C11814af c11814af = c11833ay.f27440;
        if (i4 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 85;
        f27432 = i5 % 128;
        int i6 = i5 % 2;
        return c11814af;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ void m28696(C11833ay c11833ay, String str, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27432 + 3;
        f27431 = i2 % 128;
        int i3 = i2 % 2;
        c11833ay.m28692(str, jSONObject);
        if (i3 == 0) {
            throw null;
        }
    }

    public C11833ay(Handler handler, C11814af c11814af) {
        this.f27440 = c11814af;
        this.f27442 = handler;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28701(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = 2 % 2;
        int i2 = f27431;
        int i3 = i2 + 27;
        f27432 = i3 % 128;
        int i4 = i3 % 2;
        this.f27438 = iSAdQualityAdListener;
        int i5 = i2 + 37;
        f27432 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m28702(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27431 + 67;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = jSONObject.optInt(C12035ik.f29412);
        ISAdQualityAdListener iSAdQualityAdListener = this.f27438;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adDisplayed(jSONObject.optString(C12035ik.f29413), ISAdQualityAdType.fromInt(iOptInt));
            int i4 = f27432 + 7;
            f27431 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m28704(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27432 + 63;
        f27431 = i2 % 128;
        int i3 = i2 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = this.f27438;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adClosed(jSONObject.optString(C12035ik.f29413), ISAdQualityAdType.fromInt(jSONObject.optInt(C12035ik.f29412)));
            int i4 = f27432 + 45;
            f27431 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28706(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27432 + 33;
        f27431 = i2 % 128;
        m28705((i2 % 2 == 0 ? m28693("먐䓂㘑\u09deᡝ\ue287ꡅ㣊ꐔ巎턣쫼", 32 % (ViewConfiguration.getScrollDefaultDelay() + 13)) : m28693("먐䓂㘑\u09deᡝ\ue287ꡅ㣊ꐔ巎턣쫼", 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), jSONObject);
        int i3 = f27432 + 61;
        f27431 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m28710(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27431 + 77;
        f27432 = i2 % 128;
        m28705(m28694((String) null, i2 % 2 != 0 ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE % View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (int[]) null, "\u0088\u0087\u0083\u0086\u0081\u0083\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject);
        int i3 = f27431 + 71;
        f27432 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m28709(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27431 + 15;
        f27432 = i2 % 128;
        m28705(m28694((String) null, i2 % 2 != 0 ? 6 << Gravity.getAbsoluteGravity(1, 0) : Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u0088\u0087\u008a\u0089\u0085\u0087\u0086\u0084\u0083\u0082\u0081").intern(), jSONObject);
    }

    /* JADX INFO: renamed from: ﺙ */
    public final void m28699(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27432 + 109;
        f27431 = i2 % 128;
        int i3 = i2 % 2;
        m28705(m28694((String) null, Color.blue(0) + 127, (int[]) null, "\u0088\u0087\u0085\u0089\u0081\u008b\u0084\u0083\u0082\u0081").intern(), jSONObject);
        int i4 = f27431 + 5;
        f27432 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final void m28698(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27431 + 35;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
        m28705(m28693("먐䓂㘑\u09de繞쌾⾈慯∛礑턣쫼", 11 - ExpandableListView.getPackedPositionGroup(0L)).intern(), jSONObject);
        int i4 = f27431 + 91;
        f27432 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final void m28697(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27431 + 103;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
        m28705(m28693("먐䓂㘑\u09de\ueb8a窶鎗듄칦長繞쌾팦塠\uef25凜", (ViewConfiguration.getTapTimeout() >> 16) + 15).intern(), jSONObject);
        int i4 = f27431 + 33;
        f27432 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻏ */
    public final void m28700(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f27432 + 27;
        f27431 = i2 % 128;
        m28705((i2 % 2 == 0 ? m28694((String) null, 91 % (ViewConfiguration.getJumpTapTimeout() % 35), (int[]) null, "\u0088\u0087\u008d\u008c\u0086\u0083\u0085\u0087\u0088\u0084\u0083\u0082\u0081") : m28694((String) null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), (int[]) null, "\u0088\u0087\u008d\u008c\u0086\u0083\u0085\u0087\u0088\u0084\u0083\u0082\u0081")).intern(), jSONObject);
        int i3 = f27431 + 1;
        f27432 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m28705(final String str, final JSONObject jSONObject) {
        int i = 2 % 2;
        this.f27442.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ay.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                C11833ay.m28696(C11833ay.this, str, jSONObject);
            }
        });
        int i2 = f27431 + 85;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private void m28692(final String str, JSONObject jSONObject) {
        int i = 2 % 2;
        m28695(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(C12035ik.f29413, jSONObject.remove(C12035ik.f29413));
            jSONObject2.put(C12035ik.f29369, jSONObject.remove(C12035ik.f29369));
            int i2 = f27432 + 55;
            f27431 = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
        this.f27440.m28378(str, jSONObject, jSONObject2, new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ay.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                if (C12035ik.f29359.contains(str)) {
                    C12089p.m30943(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.ay.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo28224() {
                            C11833ay.m28691(C11833ay.this).m28377();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m28708(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f27431 + 85;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
        m28703(str, str2, str3, str4, null, false);
        int i4 = f27431 + 41;
        f27432 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m28703(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f27439) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(m28694((String) null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, (int[]) null, "\u008e").intern());
            sb.append(str2);
            String string = sb.toString();
            if (!this.f27439.contains(string) || z || AbstractC11823ao.m28472().mo28505()) {
                this.f27439.add(string);
                if (Math.random() * 100.0d < m28690()) {
                    JSONObject jSONObjectM28360 = C11814af.m28360(str, str2, str3, str4, jSONObject);
                    m28695(m28694((String) null, 127 - View.combineMeasuredStates(0, 0), (int[]) null, "\u0086\u008c\u0086\u0086\u0087\u0084\u008b\u0083").intern(), jSONObjectM28360);
                    this.f27440.m28385(m28694((String) null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (int[]) null, "\u0086\u008c\u0086\u0086\u0087\u0084\u008b\u0083").intern(), jSONObjectM28360);
                    return;
                }
                C12085l.m30909(m28693("⁹㔠쿀ၮ熭䬍쿀ၮ줆굌ヱ߀", TextUtils.indexOf("", "") + 11).intern(), m28693("苀榈踵\ud810䍪ᙂ얚\udf64痵\ufaf0闶곶\ue1ea彉興观㿸娟ꍟ㛕ᆶ▱쿀ၮ袦⻠뱆\ue9af얚\udf64≤㒬똯\ue891濶鐎觃遟⪨详罪顋䫉쁐\ue189貏Ꮒı턣쫼", 49 - View.getDefaultSize(0, 0)).intern());
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private void m28695(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        Iterator it = new HashSet(this.f27441).iterator();
        int i2 = f27431 + 77;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = f27431 + 63;
            f27432 = i4 % 128;
            if (i4 % 2 == 0) {
                JSONObject jSONObjectMo28677 = ((InterfaceC12040ip) it.next()).mo28677(str, jSONObject);
                if (jSONObjectMo28677 != null) {
                    C12077jz.m30802(jSONObject, jSONObjectMo28677);
                }
            } else {
                ((InterfaceC12040ip) it.next()).mo28677(str, jSONObject);
                Object obj = null;
                super.hashCode();
                throw null;
            }
        }
        int i5 = f27431 + 81;
        f27432 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m28707(InterfaceC12040ip interfaceC12040ip) {
        int i = 2 % 2;
        int i2 = f27431 + 3;
        f27432 = i2 % 128;
        int i3 = i2 % 2;
        this.f27441.add(interfaceC12040ip);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static double m28690() {
        int i = 2 % 2;
        int i2 = f27432 + 31;
        f27431 = i2 % 128;
        int i3 = i2 % 2;
        if (!AbstractC11823ao.m28472().mo28491()) {
            int i4 = f27431 + 61;
            f27432 = i4 % 128;
            int i5 = i4 % 2;
            return AbstractC11823ao.m28472().mo28490();
        }
        int i6 = f27431 + 65;
        f27432 = i6 % 128;
        int i7 = i6 % 2;
        return 100.0d;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28693(String str, int i) {
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
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f27437)) ^ ((c2 >>> 5) + f27434)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f27433) ^ ((c3 + i2) ^ ((c3 << 4) + f27436))));
                    i2 -= 40503;
                }
                cArr2[C12078k.f29775] = cArr3[0];
                cArr2[C12078k.f29775 + 1] = cArr3[1];
                C12078k.f29775 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m28694(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f27435;
            int i2 = f27428;
            if (f27429) {
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
            if (f27430) {
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
