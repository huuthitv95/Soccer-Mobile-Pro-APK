package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.session.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C7926l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C7921g c7921g = (C7921g) obj;
        C7921g c7921g2 = (C7921g) obj2;
        if (c7921g == null || c7921g2 == null) {
            return 0;
        }
        return c7921g.f17604d < c7921g2.f17604d ? -1 : 1;
    }
}
