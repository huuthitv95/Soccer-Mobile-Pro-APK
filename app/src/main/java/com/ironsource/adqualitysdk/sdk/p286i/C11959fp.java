package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fp */
/* JADX INFO: loaded from: classes6.dex */
public final class C11959fp extends C11958fo {

    /* JADX INFO: renamed from: ｋ */
    private static int f28904 = 180;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28905 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28906;

    public C11959fp(AbstractC11919ec abstractC11919ec) {
        super(abstractC11919ec);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11958fo, com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28905 + 71;
        f28906 = i2 % 128;
        int i3 = i2 % 2;
        C11908ds c11908dsMo30195 = super.mo30195(c11907dr, c11877co);
        c11908dsMo30195.m30061(true);
        int i4 = f28906 + 51;
        f28905 = i4 % 128;
        int i5 = i4 % 2;
        return c11908dsMo30195;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.C11958fo
    public final String toString() {
        int i = 2 % 2;
        int i2 = f28906 + 31;
        f28905 = i2 % 128;
        if (i2 % 2 != 0) {
            if (m30203() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(m30204("\u0011\u000e\nﾼ\u000e\u0001\u0010", 7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, 4 - Color.argb(0, 0, 0, 0), 279 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                sb.append(super.toString());
                String string = sb.toString();
                int i3 = f28906 + 31;
                f28905 = i3 % 128;
                int i4 = i3 % 2;
                return string;
            }
            return m30204("�\nￓ\u0006\n\r\f", 7 - Gravity.getAbsoluteGravity(0, 0), true, 2 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 284).intern();
        }
        m30203();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30204(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f28904);
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
