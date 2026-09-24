package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Qe */
/* JADX INFO: loaded from: classes6.dex */
public final class C11637Qe {

    /* JADX INFO: renamed from: a */
    private EnumC11653Re f25561a;

    public C11637Qe(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f25561a = EnumC11653Re.f25597b.m27398a(config.optInt(C11744X3.a.f26183t, EnumC11653Re.CurrentlyLoadedAds.m27397b()));
    }

    /* JADX INFO: renamed from: a */
    public final EnumC11653Re m27304a() {
        return this.f25561a;
    }
}
