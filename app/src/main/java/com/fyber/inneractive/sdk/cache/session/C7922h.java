package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.h */
/* JADX INFO: loaded from: classes9.dex */
public final class C7922h extends HashMap {
    public C7922h() {
        for (EnumC7919c enumC7919c : EnumC7919c.values()) {
            if (enumC7919c != EnumC7919c.NONE) {
                put(enumC7919c, new C7921g(0, 0, 0, System.currentTimeMillis()));
            }
        }
    }
}
