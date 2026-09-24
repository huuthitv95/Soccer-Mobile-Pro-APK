package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.cache.b */
/* JADX INFO: compiled from: AbsNativeCache.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13308b<K, V> {
    /* JADX INFO: renamed from: a */
    public long m38390a() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        return c13635gM39718d.m39477b0() * 1000;
    }

    /* JADX INFO: renamed from: a */
    public abstract V mo38383a(K k, int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo38384a(K k, V v);

    /* JADX INFO: renamed from: a */
    public abstract void mo38385a(K k, V v, String str);

    /* JADX INFO: renamed from: a */
    public abstract void mo38386a(String str, Campaign campaign, String str2);

    /* JADX INFO: renamed from: b */
    public long m38391b() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        return c13635gM39718d.m39486c0() * 1000;
    }

    /* JADX INFO: renamed from: b */
    public V mo38389b(K k, int i) {
        return null;
    }
}
