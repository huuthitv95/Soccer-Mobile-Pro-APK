package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fl */
/* JADX INFO: loaded from: classes6.dex */
public final class C11955fl extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28880 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28881 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f28882 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static long f28883;

    /* JADX INFO: renamed from: ﾒ */
    private static C11955fl f28884;

    /* JADX INFO: renamed from: ﾇ */
    static void m30198() {
        f28880 = new char[]{'n', 17842, 35810, 53561};
        f28883 = 3150062757256644039L;
    }

    static {
        m30198();
        f28884 = new C11955fl();
        int i = f28881 + 95;
        f28882 = i % 128;
        int i2 = i % 2;
    }

    public C11955fl() {
        super(C11904do.m30036("", -1));
    }

    /* JADX INFO: renamed from: ﾒ */
    public static synchronized C11955fl m30199() {
        C11955fl c11955fl;
        int i = 2 % 2;
        int i2 = f28882;
        int i3 = i2 + 1;
        f28881 = i3 % 128;
        int i4 = i3 % 2;
        c11955fl = f28884;
        int i5 = i2 + 81;
        f28881 = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        return c11955fl;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        C11908ds c11908ds = new C11908ds(null);
        int i2 = f28881 + 39;
        f28882 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return c11908ds;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f28881 + 85;
        f28882 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30197(TextUtils.getTrimmedLength(""), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3).intern();
        int i4 = f28881 + 13;
        f28882 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30197(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28880[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28883)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
