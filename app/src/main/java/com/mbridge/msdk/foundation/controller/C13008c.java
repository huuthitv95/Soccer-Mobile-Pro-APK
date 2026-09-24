package com.mbridge.msdk.foundation.controller;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.c */
/* JADX INFO: compiled from: MBSDKContext.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13008c extends AbstractC13003a {

    /* JADX INFO: renamed from: t */
    private static volatile C13008c f35518t;

    private C13008c() {
    }

    /* JADX INFO: renamed from: n */
    public static C13008c m36588n() {
        if (f35518t == null) {
            synchronized (C13008c.class) {
                if (f35518t == null) {
                    f35518t = new C13008c();
                }
            }
        }
        return f35518t;
    }

    @Override // com.mbridge.msdk.foundation.controller.AbstractC13003a
    /* JADX INFO: renamed from: a */
    protected void mo36528a(AbstractC13003a.e eVar) {
    }
}
