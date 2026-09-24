package com.mbridge.msdk.advanced.request;

import android.content.Context;
import android.os.Build;
import com.ironsource.C11540L6;
import com.mbridge.msdk.foundation.same.net.wrapper.C13123b;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.net.wrapper.C13127f;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13228v;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.util.C13884b;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.request.c */
/* JADX INFO: compiled from: NativeAdvancedMBLoadRequest.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12666c extends C13123b {
    public C12666c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.C13122a, com.mbridge.msdk.foundation.same.net.wrapper.C13124c
    public void addExtraParams(String str, C13126e c13126e) {
        super.addExtraParams(str, c13126e);
        c13126e.m37245a(C11540L6.f24917H, "1");
        c13126e.m37245a("os_version", Build.VERSION.RELEASE);
        c13126e.m37245a("package_name", C13211m0.m37772t(this.mContext));
        c13126e.m37245a("app_version_name", C13211m0.m37720C(this.mContext));
        c13126e.m37245a("app_version_code", C13211m0.m37718B(this.mContext) + "");
        c13126e.m37245a("orientation", C13211m0.m37728G(this.mContext) + "");
        c13126e.m37245a(C11540L6.f24899B, C13211m0.m37762o());
        c13126e.m37245a("brand", C13211m0.m37771t());
        c13126e.m37245a(C11540L6.f24947V0, "");
        c13126e.m37245a("gaid2", C13198g.m37687c());
        int iM37770s = C13211m0.m37770s(this.mContext);
        c13126e.m37245a("network_type", iM37770s + "");
        c13126e.m37245a("network_str", C13211m0.m37732a(this.mContext, iM37770s) + "");
        c13126e.m37245a("language", C13211m0.m37763p(this.mContext));
        c13126e.m37245a("timezone", C13211m0.m37781y());
        c13126e.m37245a("useragent", C13211m0.m37749i());
        c13126e.m37245a("sdk_version", MBConfiguration.SDK_VERSION);
        c13126e.m37245a("screen_size", C13211m0.m37760n(this.mContext) + "x" + C13211m0.m37757m(this.mContext));
        c13126e.m37245a("version_flag", "1");
        if (C13884b.m41421a()) {
            c13126e.m37245a("gp_version", C13228v.m37871d(this.mContext));
        }
        C13127f.m37249a(c13126e, this.mContext);
        C13127f.m37251b(c13126e);
        C13127f.m37259j(c13126e);
    }
}
