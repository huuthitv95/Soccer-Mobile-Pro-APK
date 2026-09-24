package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.p4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1681p4 {

    /* JADX INFO: renamed from: a */
    private final Activity f2527a;

    /* JADX INFO: renamed from: b */
    private final int f2528b;

    /* JADX INFO: renamed from: c */
    private final int f2529c;

    /* JADX INFO: renamed from: d */
    private final boolean f2530d;

    /* JADX INFO: renamed from: e */
    private final boolean f2531e;

    public C1681p4(Activity activity) {
        this.f2527a = activity;
        int iM4095d = AbstractC1701q7.m4095d(activity);
        this.f2529c = iM4095d;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f2530d = zIsTablet;
        this.f2528b = m3869a(iM4095d, zIsTablet);
        this.f2531e = zIsTablet && 2 == m3870a(activity);
    }

    /* JADX INFO: renamed from: a */
    private int m3869a(int i, boolean z) {
        if (z && this.f2531e) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : -1;
    }

    /* JADX INFO: renamed from: a */
    private static int m3870a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = AbstractC1701q7.m4104f(context).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    /* JADX INFO: renamed from: a */
    private void m3871a(int i) {
        try {
            this.f2527a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3872a(AbstractC1736b.c cVar) {
        if (cVar != AbstractC1736b.c.ACTIVITY_PORTRAIT) {
            if (cVar == AbstractC1736b.c.ACTIVITY_LANDSCAPE) {
                if (this.f2530d && this.f2531e) {
                    int i = this.f2529c;
                    if (i == 0 || i == 2) {
                        m3871a(i != 2 ? 0 : 8);
                        return;
                    } else {
                        m3871a(0);
                        return;
                    }
                }
                int i2 = this.f2529c;
                if (i2 == 1 || i2 == 3) {
                    m3871a(i2 == 1 ? 0 : 8);
                    return;
                } else {
                    m3871a(0);
                    return;
                }
            }
            return;
        }
        if (!this.f2530d || !this.f2531e) {
            int i3 = this.f2529c;
            if (i3 == 0 || i3 == 2) {
                m3871a(i3 != 0 ? 9 : 1);
                return;
            } else {
                m3871a(1);
                return;
            }
        }
        int i4 = this.f2529c;
        if (i4 != 1 && i4 != 3) {
            m3871a(1);
        } else if (i4 == 1) {
            m3871a(9);
        } else {
            m3871a(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3873a(AbstractC1736b abstractC1736b) {
        int i;
        if (!abstractC1736b.m4562t0() || (i = this.f2528b) == -1) {
            m3872a(abstractC1736b.m4513W());
        } else {
            m3871a(i);
        }
    }
}
