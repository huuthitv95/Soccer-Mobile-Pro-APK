package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jt */
/* JADX INFO: loaded from: classes6.dex */
public final class C12071jt {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29732 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29733 = {'f', 's', 'a', AbstractJsonLexerKt.UNICODE_ESC, 't', 'i', 'd', 'p', 'A', 'Q', 'l', 'y', 'S', 'D', 'K', 'E', 'v', 'e', 'n', 'G', 'r', 'o', ' ', 'g', '/', 'm', 'j', 'h', 'k', 'q', 'w', 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ};

    /* JADX INFO: renamed from: ﾇ */
    private static char f29734 = 6;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29735;

    /* JADX INFO: renamed from: ｋ */
    public static JSONObject m30745(String str, C11831aw c11831aw, boolean z, C11827as c11827as) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (z) {
                int i2 = f29732 + 7;
                f29735 = i2 % 128;
                if (i2 % 2 == 0) {
                    jSONObject.put(m30744("\u0001\u0002", 2 - TextUtils.indexOf("", "", 0, 0), (byte) (View.MeasureSpec.getSize(0) + 74)).intern(), true);
                } else {
                    jSONObject.put(m30744("\u0001\u0002", 2 / TextUtils.indexOf("", "", 1, 0), (byte) (28 << View.MeasureSpec.getSize(0))).intern(), false);
                }
            }
            if (c11827as.m28564()) {
                int i3 = f29735 + 67;
                f29732 = i3 % 128;
                int i4 = i3 % 2;
                jSONObject.put(m30744("\u0003\u0004\u0005\u0000µ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, (byte) (81 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern(), true);
            }
            jSONObject.put(m30744("\t\u0001\u0000\u000b", 3 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern(), str);
        } catch (JSONException e) {
            C12085l.m30922(m30744("\t\u0007\u000f\t\u0004\b\u0000\u0005\u0006\u0011\u000e\u000f\u0010\u0011\f\u0017\u0001\u0016\f\u0017\u000e\u0017\u0003\u0005\u0016\u0015", 26 - View.resolveSizeAndState(0, 0, 0), (byte) (TextUtils.indexOf("", "", 0, 0) + 113)).intern(), m30744("\u000e\u0015\u0015\u0016\u0015\u0017\u0000\b\u000b\u0000\u0013\u0012\u0012\u0004\u0002\u0017\u0002\u0005\u0017\u0004\u0013\u0000\u0005\u0003¹¹\u001c\u0006\u0003\u0002\n\u001c\u0001\t\b\u0000\u0005\u0010\u001c\n\u0001\u001d\u0010\u0017\u0003\u0016\u0014\u001c\u0003\u0013»", 51 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (77 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), e);
        }
        C12077jz.m30802(jSONObject, c11831aw.m28665());
        C12077jz.m30802(jSONObject, c11831aw.m28662());
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30744(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29733;
            char c = f29734;
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
