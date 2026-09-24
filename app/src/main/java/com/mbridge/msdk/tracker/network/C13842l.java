package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.toolbox.C13852b;
import com.mbridge.msdk.tracker.network.toolbox.C13862l;
import com.mbridge.msdk.tracker.network.toolbox.C13863m;
import com.mbridge.msdk.tracker.network.toolbox.C13865o;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.l */
/* JADX INFO: compiled from: MBridgeVolleyManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13842l {

    /* JADX INFO: renamed from: b */
    private static volatile C13842l f39460b;

    /* JADX INFO: renamed from: a */
    private C13866u f39461a;

    private C13842l() {
    }

    /* JADX INFO: renamed from: a */
    public static C13842l m41123a() {
        if (f39460b == null) {
            synchronized (C13842l.class) {
                if (f39460b == null) {
                    f39460b = new C13842l();
                }
            }
        }
        return f39460b;
    }

    /* JADX INFO: renamed from: b */
    public C13866u m41124b() {
        if (this.f39461a == null) {
            C13866u c13866uM41319a = C13865o.m41319a(new C13852b(new C13863m()), null, 10, new C13862l());
            this.f39461a = c13866uM41319a;
            c13866uM41319a.m41329b();
        }
        return this.f39461a;
    }
}
