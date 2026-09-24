package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C7903e implements InterfaceC7899a {
    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) throws JSONException {
        try {
            return C8021o.m20442a(new JSONObject(str));
        } catch (JSONException e) {
            IAlog.m21946b("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        int i = AbstractC8013k.f17788a;
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null ? "https://cdn2.inner-active.mobi/ia-sdk-config/config_android.json" : System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20351a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "IALastModifiedFromHeader.global";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return "ia-global.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        return true;
    }
}
