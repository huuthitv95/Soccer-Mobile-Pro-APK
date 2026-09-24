package com.ironsource.adqualitysdk.sdk.p286i;

import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11945fb extends AbstractC11928el {

    /* JADX INFO: renamed from: ﻛ */
    private static long f28853 = -5240609378749725126L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28854 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28855;

    public C11945fb(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30173(int i) {
        int i2 = 2 % 2;
        if (i != 0) {
            int i3 = f28854 + 55;
            f28855 = i3 % 128;
            return i3 % 2 == 0;
        }
        int i4 = f28854 + 65;
        f28855 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30175(String str, String str2) {
        int i = 2 % 2;
        int i2 = f28855 + 19;
        f28854 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            str.equals(str2);
            super.hashCode();
            throw null;
        }
        if (str.equals(str2)) {
            return false;
        }
        int i3 = f28855 + 79;
        f28854 = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    final boolean mo30174(Object obj, Object obj2) {
        int i = 2 % 2;
        if (obj == obj2) {
            return false;
        }
        int i2 = f28855;
        int i3 = i2 + 113;
        f28854 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        f28854 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i = 2 % 2;
        int i2 = f28855 + 91;
        f28854 = i2 % 128;
        return m30191("啕啴\udfc7ᧀ\ufaeb낑", ExpandableListView.getPackedPositionGroup(i2 % 2 == 0 ? 1L : 0L)).intern();
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30191(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28853, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28853));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
