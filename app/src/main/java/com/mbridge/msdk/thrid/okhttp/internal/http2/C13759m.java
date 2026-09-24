package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.m */
/* JADX INFO: compiled from: Settings.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13759m {

    /* JADX INFO: renamed from: a */
    private int f39088a;

    /* JADX INFO: renamed from: b */
    private final int[] f39089b = new int[10];

    /* JADX INFO: renamed from: a */
    int m40585a(int i) {
        return this.f39089b[i];
    }

    /* JADX INFO: renamed from: a */
    C13759m m40586a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f39089b;
            if (i < iArr.length) {
                this.f39088a = (1 << i) | this.f39088a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    void m40587a() {
        this.f39088a = 0;
        Arrays.fill(this.f39089b, 0);
    }

    /* JADX INFO: renamed from: a */
    void m40588a(C13759m c13759m) {
        for (int i = 0; i < 10; i++) {
            if (c13759m.m40594d(i)) {
                m40586a(i, c13759m.m40585a(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    int m40589b() {
        if ((this.f39088a & 2) != 0) {
            return this.f39089b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    int m40590b(int i) {
        return (this.f39088a & 16) != 0 ? this.f39089b[4] : i;
    }

    /* JADX INFO: renamed from: c */
    int m40591c() {
        if ((this.f39088a & 128) != 0) {
            return this.f39089b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: c */
    int m40592c(int i) {
        return (this.f39088a & 32) != 0 ? this.f39089b[5] : i;
    }

    /* JADX INFO: renamed from: d */
    int m40593d() {
        return Integer.bitCount(this.f39088a);
    }

    /* JADX INFO: renamed from: d */
    boolean m40594d(int i) {
        return ((1 << i) & this.f39088a) != 0;
    }
}
