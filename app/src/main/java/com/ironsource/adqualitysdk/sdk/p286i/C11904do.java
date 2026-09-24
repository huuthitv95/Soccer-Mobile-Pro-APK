package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.do */
/* JADX INFO: loaded from: classes6.dex */
public final class C11904do {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28634 = 23;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28635 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28636;

    /* JADX INFO: renamed from: ﻐ */
    private int f28637;

    /* JADX INFO: renamed from: ｋ */
    private String f28638;

    /* JADX INFO: renamed from: ﾒ */
    public static C11904do m30036(String str, int i) {
        int i2 = 2 % 2;
        int i3 = f28636 + 43;
        f28635 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (!C12092s.m30994().m31001()) {
            return null;
        }
        C11904do c11904do = new C11904do(str, i);
        int i5 = f28635 + 63;
        f28636 = i5 % 128;
        if (i5 % 2 == 0) {
            return c11904do;
        }
        super.hashCode();
        throw null;
    }

    private C11904do(String str, int i) {
        this.f28638 = str;
        this.f28637 = i;
    }

    /* JADX INFO: renamed from: ｋ */
    public final int m30038() {
        int i = 2 % 2;
        int i2 = f28636 + 63;
        f28635 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f28637;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28638);
        sb.append(m30037("\u0000", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, -Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 81).intern());
        sb.append(this.f28637);
        String string = sb.toString();
        int i2 = f28636 + 55;
        f28635 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30037(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f28634);
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
