package com.mbridge.msdk.tracker.network.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.tracker.network.C13836f;
import com.mbridge.msdk.tracker.network.C13866u;
import com.mbridge.msdk.tracker.network.InterfaceC13830b;
import com.mbridge.msdk.tracker.network.InterfaceC13843m;
import com.mbridge.msdk.tracker.network.InterfaceC13868w;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.o */
/* JADX INFO: compiled from: Volley.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13865o {
    /* JADX INFO: renamed from: a */
    public static C13866u m41319a(InterfaceC13843m interfaceC13843m, InterfaceC13868w interfaceC13868w, int i, InterfaceC13830b interfaceC13830b) {
        if (interfaceC13843m == null) {
            interfaceC13843m = new C13852b(new C13858h());
        }
        if (interfaceC13868w == null) {
            interfaceC13868w = new C13836f(new Handler(Looper.getMainLooper()));
        }
        if (i <= 0) {
            i = 4;
        }
        if (interfaceC13830b == null) {
            interfaceC13830b = new C13862l();
        }
        return new C13866u(interfaceC13843m, interfaceC13868w, i, interfaceC13830b);
    }
}
