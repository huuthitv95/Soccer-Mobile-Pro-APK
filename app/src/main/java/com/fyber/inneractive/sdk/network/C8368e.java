package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8368e implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f18636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JSONArray f18637b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f18638c;

    public C8368e(String str, JSONArray jSONArray, long j) {
        this.f18636a = str;
        this.f18637b = jSONArray;
        this.f18638c = j;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m21945a("Event Request: Hitting URL finished: %s, body: %s", this.f18636a, this.f18637b);
        if (exc == null) {
            IAlog.m21945a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.m21945a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.m21945a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f18638c));
    }
}
