package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C7904f;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.measurement.tracker.C8281f;
import com.fyber.inneractive.sdk.network.C8427v0;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8271e {

    /* JADX INFO: renamed from: b */
    public String f18434b;

    /* JADX INFO: renamed from: c */
    public String f18435c;

    /* JADX INFO: renamed from: d */
    public String f18436d;

    /* JADX INFO: renamed from: e */
    public Partner f18437e;

    /* JADX INFO: renamed from: a */
    public boolean f18433a = false;

    /* JADX INFO: renamed from: f */
    public final C8281f f18438f = new C8281f();

    /* JADX INFO: renamed from: g */
    public final C8267a f18439g = new C8267a(this);

    /* JADX INFO: renamed from: h */
    public final C8268b f18440h = new C8268b(this);

    /* JADX INFO: renamed from: i */
    public final C8269c f18441i = new C8269c(this);

    /* JADX INFO: renamed from: a */
    public static void m20672a(Context context, String str, String str2, InterfaceC8374f0 interfaceC8374f0) {
        IAlog.m21948d("%s- Loading URL: %s", IAlog.m21942a(C8271e.class), str);
        IAConfigManager.f17654M.f17686r.m20768a(new C8427v0(interfaceC8374f0, context, new C7904f(str, str2)));
    }

    /* JADX INFO: renamed from: a */
    public static void m20673a(C8271e c8271e, Context context) {
        c8271e.getClass();
        m20672a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/" + Omid.getVersion() + ".js", "omid-latest.js", c8271e.f18439g);
        m20672a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-" + Omid.getVersion() + ".js", "omid-session-client-latest.js", c8271e.f18440h);
        m20672a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", c8271e.f18441i);
    }
}
