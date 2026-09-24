package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.C13134c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.n */
/* JADX INFO: compiled from: MemoryEventFilter.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13827n implements InterfaceC13819f {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, a> f39424a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.n$a */
    /* JADX INFO: compiled from: MemoryEventFilter.java */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final boolean f39425a;

        public a(boolean z) {
            this.f39425a = z;
        }

        /* JADX INFO: renamed from: a */
        public boolean m41086a() {
            return this.f39425a;
        }
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13819f
    /* JADX INFO: renamed from: a */
    public boolean mo35095a(C13818e c13818e) throws Exception {
        a aVar;
        if (c13818e != null && !TextUtils.isEmpty(c13818e.m41012g())) {
            try {
                String strM41012g = c13818e.m41012g();
                if (this.f39424a.containsKey(strM41012g)) {
                    aVar = this.f39424a.get(strM41012g);
                } else {
                    a aVar2 = new a(C13134c.m37280a(strM41012g));
                    this.f39424a.put(strM41012g, aVar2);
                    aVar = aVar2;
                }
                return aVar != null && aVar.m41086a();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("TrackManager", "apply", e);
                }
            }
        }
        return false;
    }
}
