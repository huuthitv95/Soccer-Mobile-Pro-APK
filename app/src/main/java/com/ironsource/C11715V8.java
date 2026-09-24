package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.V8 */
/* JADX INFO: loaded from: classes6.dex */
public class C11715V8 {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f26019a;

    public C11715V8(C11426F0 c11426f0) {
        this.f26019a = c11426f0;
    }

    /* JADX INFO: renamed from: a */
    public void m27677a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f26019a.m25748a(EnumC11372C0.INIT_STARTED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27676a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f26019a.m25748a(EnumC11372C0.INIT_ENDED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27674a() {
        this.f26019a.m25748a(EnumC11372C0.INIT_SUCCESS, null);
    }

    /* JADX INFO: renamed from: a */
    public void m27675a(int i, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        map.put("reason", str);
        this.f26019a.m25748a(EnumC11372C0.INIT_FAILED, map);
    }
}
