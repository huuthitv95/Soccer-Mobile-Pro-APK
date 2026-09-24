package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dz */
/* JADX INFO: loaded from: classes6.dex */
public final class C11915dz extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28743 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28744 = 1;

    /* JADX INFO: renamed from: ｋ */
    private String f28747;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f28746 = {5552, 23448, 35128, 65232, 11385, 37396};

    /* JADX INFO: renamed from: ﾇ */
    private static long f28745 = 5306682525019491941L;

    public C11915dz(String str, C11904do c11904do) {
        super(c11904do);
        this.f28747 = C11914dy.m30142(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        C11908ds c11908ds = new C11908ds(c11877co.m29670().m28835(C12081kc.m30851(this.f28747, m30143((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (5534 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 6).intern())));
        int i2 = f28744 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f28743 = i2 % 128;
        int i3 = i2 % 2;
        return c11908ds;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f28743 + 15;
        int i3 = i2 % 128;
        f28744 = i3;
        int i4 = i2 % 2;
        String str = this.f28747;
        int i5 = i3 + 25;
        f28743 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f28743;
        int i3 = i2 + 75;
        f28744 = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i5 = i2 + 105;
            f28744 = i5 % 128;
            int i6 = i5 % 2;
            if (getClass() == obj.getClass()) {
                String str = this.f28747;
                String str2 = ((C11915dz) obj).f28747;
                if (str != null) {
                    boolean zEquals = str.equals(str2);
                    int i7 = f28744 + 37;
                    f28743 = i7 % 128;
                    int i8 = i7 % 2;
                    return zEquals;
                }
                if (str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28743 + 33;
        int i3 = i2 % 128;
        f28744 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f28747;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i3 + 39;
        f28743 = i4 % 128;
        if (i4 % 2 == 0) {
            return 0;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30143(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28746[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28745)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
