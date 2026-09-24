package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.view.View;
import android.widget.ExpandableListView;
import com.five_corp.ad.FiveAd;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gm */
/* JADX INFO: loaded from: classes6.dex */
public final class C11983gm extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29026 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29027 = {'c', 'o', 'm', '.', 'f', 'i', 'v', 'e', '_', 'r', 'p', 'a', 'd', 'F', 'A', 'g'};

    /* JADX INFO: renamed from: ｋ */
    private static char f29028 = 4;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29029 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29026 + 9;
        f29029 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30234("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\f\u0004\u0005\r\u000b\u0002\b\u000f\u0001\u000f\u0006\u0007\u0006\u000f¯", 23 - View.MeasureSpec.getMode(0), (byte) (75 - ExpandableListView.getPackedPositionType(0L))).intern();
        int i4 = f29026 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29029 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29026;
        int i3 = i2 + 25;
        f29029 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        f29029 = i5 % 128;
        int i6 = i5 % 2;
        return FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11852bq c11852bq = new C11852bq(mo30209());
        int i2 = f29029 + 93;
        f29026 = i2 % 128;
        if (i2 % 2 == 0) {
            return c11852bq;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29026 + 109;
        f29029 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m30234("\u0005\u0006\u0007\u0004\b\u000f", View.getDefaultSize(0, 1), (byte) (((Process.getThreadPriority(1) << 81) >> 59) * 52)) : m30234("\u0005\u0006\u0007\u0004\b\u000f", 6 - View.getDefaultSize(0, 0), (byte) (75 - ((Process.getThreadPriority(0) + 20) >> 6)))).intern();
        int i3 = f29029 + 51;
        f29026 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30234(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29027;
            char c = f29028;
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
