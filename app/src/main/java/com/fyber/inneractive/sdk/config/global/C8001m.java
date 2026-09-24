package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.cache.InterfaceC7899a;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8001m implements InterfaceC7899a {
    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) throws Exception {
        try {
            return C8000l.m20429a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.m21946b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f21426a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        int i = AbstractC8013k.f17788a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") != null) {
            return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
        }
        Locale locale = Locale.ENGLISH;
        return "https://cdn2.inner-active.mobi/ia-sdk-config/features_config.json";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20351a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return "ia-remote.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        return true;
    }
}
