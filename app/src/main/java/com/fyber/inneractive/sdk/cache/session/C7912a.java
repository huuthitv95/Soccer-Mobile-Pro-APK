package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C7912a extends HashMap {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17588a = 25;

    public C7912a() {
        for (EnumC7919c enumC7919c : EnumC7919c.values()) {
            if (enumC7919c != EnumC7919c.NONE) {
                put(enumC7919c, new C7925k(this.f17588a));
            }
        }
    }
}
