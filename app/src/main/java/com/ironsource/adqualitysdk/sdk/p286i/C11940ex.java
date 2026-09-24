package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ex */
/* JADX INFO: loaded from: classes6.dex */
public final class C11940ex extends AbstractC11929em {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28835 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28836 = 1104602847;

    /* JADX INFO: renamed from: ｋ */
    private static int f28837 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static char f28838;

    /* JADX INFO: renamed from: ﾒ */
    private static long f28839;

    public C11940ex(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 115;
        com.ironsource.adqualitysdk.sdk.p286i.C11940ex.f28837 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 25;
        com.ironsource.adqualitysdk.sdk.p286i.C11940ex.f28837 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11928el
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean mo30173(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11940ex.f28835
            int r2 = r1 + 45
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11940ex.f28837 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L15
            r2 = 23
            int r2 = r2 / r3
            if (r5 > 0) goto L20
            goto L17
        L15:
            if (r5 > 0) goto L20
        L17:
            int r1 = r1 + 25
            int r5 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11940ex.f28837 = r5
            int r1 = r1 % r0
            r5 = 1
            return r5
        L20:
            int r1 = r1 + 115
            int r5 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11940ex.f28837 = r5
            int r1 = r1 % r0
            if (r1 == 0) goto L2a
            return r3
        L2a:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11940ex.mo30173(int):boolean");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        char cIndexOf;
        long packedPositionForGroup;
        long j;
        int i = 2 % 2;
        int i2 = f28835 + 43;
        f28837 = i2 % 128;
        if (i2 % 2 == 0) {
            cIndexOf = (char) (TextUtils.indexOf("", "", 1, 0) + 60900);
            packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            j = 1;
        } else {
            cIndexOf = (char) (60900 - TextUtils.indexOf("", "", 0, 0));
            packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            j = 0;
        }
        return m30186("䠉Ⰺ", cIndexOf, "\u0000\u0000\u0000\u0000", (packedPositionForGroup > j ? 1 : (packedPositionForGroup == j ? 0 : -1)), "╛쇲\ue453雭").intern();
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30186(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28839) ^ ((long) f28836)) ^ ((long) f28838));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
