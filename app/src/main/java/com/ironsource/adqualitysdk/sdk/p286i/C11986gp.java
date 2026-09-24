package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.moloco.sdk.publisher.Moloco;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gp */
/* JADX INFO: loaded from: classes6.dex */
public final class C11986gp extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29044 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f29045 = {46135, 31138, 12043, 56497, 33373, 47046, 26030, 11028, 55551, 36442, 45952, 25012, 5916, 50426, 35364, 49107, 28081, 4895, 49402, 63078, 48083, 27057, 7959, 52377, 61986, 42984, 21937, 6939, 51335, 65122, 41941, 'm', 52726, 39774, 26788, 13831, 914};

    /* JADX INFO: renamed from: ﾇ */
    private static long f29046 = 2745517201509961113L;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29047 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29047 + 107;
        f29044 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30238(View.getDefaultSize(0, 0), (char) (TextUtils.indexOf("", "", 0) + 46164), 31 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
        int i4 = f29047 + 113;
        f29044 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29044;
        int i3 = i2 + 1;
        f29047 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        f29047 = i5 % 128;
        if (i5 % 2 != 0) {
            return Moloco.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11858bw c11858bw = new C11858bw(mo30209());
        int i2 = f29044 + 87;
        f29047 = i2 % 128;
        int i3 = i2 % 2;
        return c11858bw;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29044 + 59;
        f29047 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30238(TextUtils.indexOf("", "", 0, 0) + 31, (char) ((-1) - Process.getGidForName("")), 6 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        int i4 = f29044 + 23;
        f29047 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30238(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29045[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29046)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
