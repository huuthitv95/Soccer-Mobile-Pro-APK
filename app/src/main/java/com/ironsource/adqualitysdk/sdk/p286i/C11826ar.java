package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ar */
/* JADX INFO: loaded from: classes6.dex */
public final class C11826ar extends AbstractC11823ao.AnonymousClass3 {

    /* JADX INFO: renamed from: ﻛ */
    private static int f27242 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f27243 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27244 = 166;

    /* JADX INFO: renamed from: ﻐ */
    private final String f27245;

    public C11826ar(C11829au c11829au) {
        m28559("\ufff7\u0003\u0002\u0002\ufff9\ufff7\b\u0003\u0006\u0007", Color.blue(0) + 10, false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, View.combineMeasuredStates(0, 0) + 274).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m28559("\u0000", View.resolveSizeAndState(0, 0, 0) + 1, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SUB).intern());
        sb.append(UUID.randomUUID().toString().replace(m28559("\u0000", 1 - ((Process.getThreadPriority(0) + 20) >> 6), false, -Process.getGidForName(""), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 211).intern(), ""));
        this.f27245 = sb.toString();
        m28508(c11829au);
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m28561() {
        int i = 2 % 2;
        int i2 = f27243 + 41;
        f27242 = i2 % 128;
        int i3 = i2 % 2;
        String strOptString = m28507().optString(m28559("\u0003\ufffe\uffff", View.MeasureSpec.getMode(0) + 3, true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, TextUtils.lastIndexOf("", '0', 0) + 274).intern(), this.f27245);
        int i4 = f27242 + 53;
        f27243 = i4 % 128;
        int i5 = i4 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m28560(String str) {
        int i = 2 % 2;
        int i2 = f27242 + 51;
        f27243 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = m28558().optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(m28559("\ufffe\u0004\u0003\ufff8\u0004\u0003\u0003\ufffa\ufff8\t\u0004\u0007￫\ufffa\u0007\b", 16 - View.MeasureSpec.getMode(0), false, 2 - TextUtils.lastIndexOf("", '0'), 272 - TextUtils.lastIndexOf("", '0')).intern());
        }
        int i4 = f27243 + 3;
        f27242 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final boolean m28562() {
        JSONObject jSONObjectM28507;
        int iNormalizeMetaState;
        int keyRepeatTimeout;
        int trimmedLength;
        int i = 2 % 2;
        int i2 = f27243 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27242 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM28507 = m28507();
            iNormalizeMetaState = 114 >> KeyEvent.normalizeMetaState(1);
            keyRepeatTimeout = 99 - (ViewConfiguration.getKeyRepeatTimeout() - 46);
            trimmedLength = 29038 - TextUtils.getTrimmedLength("");
        } else {
            jSONObjectM28507 = m28507();
            iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
            keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            trimmedLength = TextUtils.getTrimmedLength("") + 274;
        }
        boolean zHas = jSONObjectM28507.has(m28559("\ufff7\u0003\u0002\u0002\ufff9\ufff7\b\u0003\u0006\u0007", iNormalizeMetaState, false, keyRepeatTimeout, trimmedLength).intern());
        int i3 = f27242 + 67;
        f27243 = i3 % 128;
        int i4 = i3 % 2;
        return zHas;
    }

    /* JADX INFO: renamed from: ﻐ */
    private JSONObject m28558() {
        int i = 2 % 2;
        int i2 = f27242 + 33;
        f27243 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectOptJSONObject = m28507().optJSONObject(m28559("\ufff7\u0003\u0002\u0002\ufff9\ufff7\b\u0003\u0006\u0007", 9 - ((byte) KeyEvent.getModifierMetaStateMask()), false, TextUtils.getCapsMode("", 0, 0) + 10, 274 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject = new JSONObject();
        int i4 = f27242 + 63;
        f27243 = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28559(String str, int i, boolean z, int i2, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11889d.f28479) {
            char[] cArr2 = new char[i];
            C11889d.f28481 = 0;
            while (C11889d.f28481 < i) {
                C11889d.f28480 = cArr[C11889d.f28481];
                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                int i4 = C11889d.f28481;
                cArr2[i4] = (char) (cArr2[i4] - f27244);
                C11889d.f28481++;
            }
            if (i2 > 0) {
                C11889d.f28478 = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
            }
            if (z) {
                char[] cArr4 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                    C11889d.f28481++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
