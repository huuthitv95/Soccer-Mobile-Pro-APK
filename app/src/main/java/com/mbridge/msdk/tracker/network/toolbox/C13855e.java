package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.InterfaceC13832c;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.e */
/* JADX INFO: compiled from: DefaultCacheKeyGenerator.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13855e implements InterfaceC13832c {
    @Override // com.mbridge.msdk.tracker.network.InterfaceC13832c
    /* JADX INFO: renamed from: a */
    public String mo41092a(AbstractC13850t<?> abstractC13850t) {
        String strM41248t = abstractC13850t.m41248t();
        int iM41237g = abstractC13850t.m41237g();
        if (iM41237g == 0) {
            return strM41248t;
        }
        return Integer.toString(iM41237g) + '-' + strM41248t;
    }
}
