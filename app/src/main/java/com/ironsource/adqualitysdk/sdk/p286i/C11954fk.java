package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fk */
/* JADX INFO: loaded from: classes6.dex */
public final class C11954fk extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﱟ */
    private static int f28873 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28874 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char f28875 = 24702;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28876 = 26743;

    /* JADX INFO: renamed from: ﾇ */
    private static char f28877 = 21614;

    /* JADX INFO: renamed from: ﾒ */
    private static char f28878 = 45447;

    /* JADX INFO: renamed from: ｋ */
    private AbstractC11961fr[] f28879;

    public C11954fk(List<AbstractC11961fr> list) {
        AbstractC11961fr[] abstractC11961frArr = new AbstractC11961fr[list.size()];
        this.f28879 = abstractC11961frArr;
        list.toArray(abstractC11961frArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        C11908ds c11908ds = new C11908ds(null);
        C11907dr c11907dr2 = new C11907dr(c11907dr);
        AbstractC11961fr[] abstractC11961frArr = this.f28879;
        int i2 = f28874 + 83;
        f28873 = i2 % 128;
        int i3 = i2 % 2;
        for (AbstractC11961fr abstractC11961fr : abstractC11961frArr) {
            int i4 = f28873 + 75;
            f28874 = i4 % 128;
            int i5 = i4 % 2;
            c11908ds = abstractC11961fr.mo30195(c11907dr2, c11877co);
            if (c11908ds.m30064()) {
                break;
            }
            int i6 = f28874 + 113;
            f28873 = i6 % 128;
            int i7 = i6 % 2;
            if (c11908ds.m30062() || c11908ds.m30060()) {
                break;
            }
        }
        return c11908ds;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30196("ර\uf6ed", 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        for (AbstractC11961fr abstractC11961fr : this.f28879) {
            int i2 = f28873 + 9;
            f28874 = i2 % 128;
            int i3 = i2 % 2;
            sb.append(m30196("缞쨎缞쨎", MotionEvent.axisFromString("") + 5).intern());
            sb.append(abstractC11961fr.toString());
            sb.append(m30196("妺ա", Color.rgb(0, 0, 0) + 16777217).intern());
        }
        sb.append(m30196("蒮丒", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
        String string = sb.toString();
        int i4 = f28874 + 27;
        f28873 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f28873 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28874 = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C11954fk c11954fk = (C11954fk) obj;
            AbstractC11961fr[] abstractC11961frArr = this.f28879;
            if (abstractC11961frArr != null) {
                int i4 = f28874 + 87;
                f28873 = i4 % 128;
                int i5 = i4 % 2;
                AbstractC11961fr[] abstractC11961frArr2 = c11954fk.f28879;
                if (i5 == 0) {
                    return abstractC11961frArr.equals(abstractC11961frArr2);
                }
                abstractC11961frArr.equals(abstractC11961frArr2);
                throw null;
            }
            if (c11954fk.f28879 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28874;
        int i3 = i2 + 49;
        f28873 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        AbstractC11961fr[] abstractC11961frArr = this.f28879;
        if (abstractC11961frArr == null) {
            int i4 = i2 + 107;
            f28873 = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        int i6 = i2 + 11;
        f28873 = i6 % 128;
        if (i6 % 2 == 0) {
            return abstractC11961frArr.hashCode();
        }
        abstractC11961frArr.hashCode();
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30196(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f28876)) ^ ((c2 >>> 5) + f28875)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f28878) ^ ((c3 + i2) ^ ((c3 << 4) + f28877))));
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
}
