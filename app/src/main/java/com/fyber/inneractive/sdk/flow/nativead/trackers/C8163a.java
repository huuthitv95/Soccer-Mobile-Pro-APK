package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9248m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.trackers.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8163a {

    /* JADX INFO: renamed from: a */
    public C8235w0 f18177a;

    /* JADX INFO: renamed from: b */
    public C8164b f18178b;

    public C8163a(C8235w0 c8235w0) {
        this.f18177a = c8235w0;
    }

    /* JADX INFO: renamed from: a */
    public final void m20574a() {
        C8164b c8164b = this.f18178b;
        if (c8164b != null) {
            IAlog.m21945a("%sDestroy called", C8164b.f18179e);
            Handler handler = c8164b.f18183d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                c8164b.f18183d = null;
            }
            C9248m c9248m = c8164b.f18182c;
            if (c9248m != null) {
                AbstractC9195v.m22027a(c9248m);
                c9248m.destroy();
                c8164b.f18182c = null;
            }
            c8164b.f18181b = null;
            this.f18178b = null;
        }
        this.f18177a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20575a(InterfaceC8165c interfaceC8165c) {
        for (String str : this.f18177a.f18371w) {
            if (!TextUtils.isEmpty(str)) {
                IAlog.m21945a("%sHitting URL: %s", IAlog.m21943a(this), str);
                C8435z0.m20813b(str);
            }
        }
        C8164b c8164b = new C8164b(this.f18177a.f18372x, interfaceC8165c);
        this.f18178b = c8164b;
        if (c8164b.f18183d == null || c8164b.f18182c == null) {
            IAlog.m21946b("%sWas destroyed, create a new instance", C8164b.f18179e);
        } else {
            c8164b.m20576a();
        }
    }
}
