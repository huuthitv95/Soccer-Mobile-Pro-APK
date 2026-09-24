package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;

/* JADX INFO: loaded from: classes6.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* JADX INFO: renamed from: g */
    private static int f36816g = 1;

    /* JADX INFO: renamed from: h */
    private static int f36817h;

    /* JADX INFO: renamed from: i */
    private static int f36818i;

    /* JADX INFO: renamed from: f */
    private boolean f36819f;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    /* JADX INFO: renamed from: a */
    protected boolean m38381a() {
        return this.f36819f;
    }

    public int getOrientation() {
        return f36816g;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f36816g, f36818i, f36817h);
    }

    /* JADX INFO: renamed from: a */
    private void m38380a(int i, int i2) {
        int iM37760n = C13211m0.m37760n(C13008c.m36588n().m36542d());
        int iM37757m = C13211m0.m37757m(C13008c.m36588n().m36542d());
        int i3 = f36816g;
        if (i3 == 1) {
            if (iM37757m > i2 * 4) {
                setHeight(iM37757m - i2);
                setWidth(iM37760n);
                return;
            } else {
                setHeight(0);
                setWidth(0);
                return;
            }
        }
        if (i3 == 2) {
            if (iM37760n > i * 4) {
                setWidth(iM37760n - i);
                setHeight(iM37757m);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
    }

    public SplashBidRequestParams(String str, String str2, boolean z, int i, int i2, int i3) {
        this(str, str2, "", z, i, i3, i2);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        super(str, str2, str3, 0, 0);
        this.f36819f = false;
        f36816g = i;
        m38380a(i2, i3);
        this.f36819f = z;
    }
}
