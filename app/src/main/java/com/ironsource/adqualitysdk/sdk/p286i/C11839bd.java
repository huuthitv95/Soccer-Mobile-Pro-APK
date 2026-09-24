package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11839bd extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27591 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27592 = 161;

    /* JADX INFO: renamed from: ｋ */
    private static int f27593 = 1;

    public C11839bd(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27593 + 35;
        f27591 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m28820("\uffff\ufffe\uffff\b\ufffb￼\u0006", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, false, TextUtils.lastIndexOf("", '0', 0) + 3, 231 - ExpandableListView.getPackedPositionGroup(0L)).intern();
        int i4 = f27593 + 15;
        f27591 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        int i = 2 % 2;
        int i2 = f27591;
        int i3 = i2 + 5;
        f27593 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        f27593 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        int i2 = f27591 + 37;
        f27593 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo28821() {
        int i = 2 % 2;
        int i2 = f27591 + 55;
        int i3 = i2 % 128;
        f27593 = i3;
        boolean z = i2 % 2 != 0;
        int i4 = i3 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f27591 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m28820(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f27592);
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
