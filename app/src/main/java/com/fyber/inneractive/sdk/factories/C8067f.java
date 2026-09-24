package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.factories.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8067f {

    /* JADX INFO: renamed from: a */
    public final HashMap f17950a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final void m20467a(EnumC9083a enumC9083a, InterfaceC8066e interfaceC8066e) {
        if (this.f17950a.containsKey(enumC9083a)) {
            IAlog.m21950f("Handler already exists for ad type %s! : %s", enumC9083a, this.f17950a.get(enumC9083a));
        } else {
            this.f17950a.put(enumC9083a, interfaceC8066e);
        }
    }
}
