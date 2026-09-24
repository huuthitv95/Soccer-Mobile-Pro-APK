package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Pair;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8805d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f20613a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f20614b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c */
    public static final int[] f20615c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: a */
    public static Pair m21322a(byte[] bArr) {
        int iM21332a;
        int iM21332a2;
        C8814m c8814m = new C8814m(bArr);
        int iM21332a3 = c8814m.m21332a(5);
        if (iM21332a3 == 31) {
            iM21332a3 = c8814m.m21332a(6) + 32;
        }
        int iM21332a4 = c8814m.m21332a(4);
        if (iM21332a4 == 15) {
            iM21332a = c8814m.m21332a(24);
        } else {
            if (iM21332a4 >= 13) {
                throw new IllegalArgumentException();
            }
            iM21332a = f20614b[iM21332a4];
        }
        int iM21332a5 = c8814m.m21332a(4);
        if (iM21332a3 == 5 || iM21332a3 == 29) {
            int iM21332a6 = c8814m.m21332a(4);
            if (iM21332a6 == 15) {
                iM21332a2 = c8814m.m21332a(24);
            } else {
                if (iM21332a6 >= 13) {
                    throw new IllegalArgumentException();
                }
                iM21332a2 = f20614b[iM21332a6];
            }
            iM21332a = iM21332a2;
            int iM21332a7 = c8814m.m21332a(5);
            if (iM21332a7 == 31) {
                iM21332a7 = c8814m.m21332a(6) + 32;
            }
            if (iM21332a7 == 22) {
                iM21332a5 = c8814m.m21332a(4);
            }
        }
        int i = f20615c[iM21332a5];
        if (i != -1) {
            return Pair.create(Integer.valueOf(iM21332a), Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }
}
