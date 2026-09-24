package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C8427v0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C7909k {

    /* JADX INFO: renamed from: a */
    public long f17579a;

    /* JADX INFO: renamed from: b */
    public String f17580b;

    /* JADX INFO: renamed from: c */
    public String f17581c;

    /* JADX INFO: renamed from: d */
    public String f17582d;

    /* JADX INFO: renamed from: e */
    public String f17583e;

    /* JADX INFO: renamed from: a */
    public final void m20355a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f17579a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            if (iAConfigManager.f17688t.f17862b.m20446a(false, "use_js_inline")) {
                Application application = AbstractC9174o.f21470a;
                if (application == null) {
                    IAlog.m21950f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f17579a = System.currentTimeMillis();
                C8427v0 c8427v0 = new C8427v0(new C7905g(this), application, new C7904f("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                IAlog.m21948d("%s- Loading URL: %s", IAlog.m21943a(this), "https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js");
                iAConfigManager.f17686r.m20768a(c8427v0);
                iAConfigManager.f17686r.m20768a(new C8427v0(new C7906h(this), application, new C7904f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.f17686r.m20768a(new C8427v0(new C7907i(this), application, new C7904f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                C8040s c8040s = iAConfigManager.f17688t;
                if (c8040s == null || !c8040s.f17862b.m20446a(false, "dt_plbl")) {
                    return;
                }
                iAConfigManager.f17686r.m20768a(new C8427v0(new C7908j(this), application, new C7904f("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
            }
        }
    }
}
