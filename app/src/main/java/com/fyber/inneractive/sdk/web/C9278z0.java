package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.z0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9278z0 extends LruCache {
    public C9278z0() {
        super(1048576);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String str;
        C9222c1 c9222c1 = (C9222c1) obj2;
        int length = 0;
        for (String str2 : c9222c1.f21531b.keySet()) {
            if (str2 != null && (str = (String) c9222c1.f21531b.get(str2)) != null) {
                length += str.length() + str2.length();
            }
        }
        return length + c9222c1.f21530a.length;
    }
}
