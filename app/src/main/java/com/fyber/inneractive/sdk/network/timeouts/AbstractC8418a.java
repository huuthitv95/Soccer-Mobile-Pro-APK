package com.fyber.inneractive.sdk.network.timeouts;

import com.fyber.inneractive.sdk.network.timeouts.content.C8419a;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.timeouts.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8418a {

    /* JADX INFO: renamed from: a */
    public int f18726a = 0;

    /* JADX INFO: renamed from: b */
    public int f18727b = 0;

    /* JADX INFO: renamed from: c */
    public int f18728c = 0;

    /* JADX INFO: renamed from: d */
    public int f18729d = 0;

    /* JADX INFO: renamed from: e */
    public int f18730e = 0;

    /* JADX INFO: renamed from: f */
    public int f18731f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f18732g = false;

    /* JADX INFO: renamed from: a */
    public static int m20796a(int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i);
        if (i2 <= 0) {
            i2 = iMax;
        }
        int iMax2 = Math.max(0, i3);
        int iMax3 = Math.max(0, i4);
        int i5 = iMax3 + 1;
        int i6 = iMax - ((iMax2 * iMax3) + i2);
        if (i6 < 0) {
            return Math.max(iMax3, 0);
        }
        return i6 == 0 ? Math.max(i5, 0) : m20796a(i6, i2, iMax2, i5);
    }

    /* JADX INFO: renamed from: a */
    public final int m20797a() {
        int iMax;
        int i = this.f18728c;
        int i2 = this.f18729d;
        if (i2 <= 0) {
            IAlog.m21950f("%s Unable resolve retries because of invalid ILAT: %d, will set retries to 0", IAlog.m21942a(C8419a.class), Integer.valueOf(i2));
            iMax = 0;
        } else {
            int i3 = i / i2;
            int i4 = i3 - 1;
            if (i4 > 3) {
                i4 = i3 - 2;
            }
            iMax = Math.max(i4, 0);
        }
        int i5 = this.f18728c;
        int i6 = this.f18729d;
        int i7 = this.f18730e;
        int i8 = this.f18731f;
        int iMax2 = Math.max(0, i5);
        int iMax3 = Math.max(0, i6);
        int iMax4 = Math.max(0, iMax);
        int iMax5 = Math.max(0, (iMax2 - (Math.max(0, i7) * iMax4)) - (Math.max(0, i8) * iMax4));
        int iMax6 = Math.max(0, iMax3);
        if (iMax4 > 0) {
            iMax5 %= iMax6;
        }
        int iMax7 = Math.max(iMax5, 0);
        if (iMax7 == 0 && iMax > 2) {
            iMax--;
            iMax7 = this.f18729d;
        }
        int i9 = iMax + 1;
        int iMax8 = Math.max(0, iMax7);
        if (i9 > 0) {
            iMax8 /= i9;
        }
        this.f18727b = iMax8;
        return Math.max(0, m20796a(this.f18728c, this.f18729d, iMax8, 0) - 1);
    }
}
