package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import com.fyber.inneractive.sdk.network.C8376g;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.response.nativead.C9100f;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C8162t implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final C9100f f18175a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8161s f18176b;

    public C8162t(C9100f c9100f, InterfaceC8161s interfaceC8161s) {
        this.f18175a = c9100f;
        this.f18176b = interfaceC8161s;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        Uri uri = (Uri) obj;
        if (exc instanceof C8376g) {
            return;
        }
        if (exc != null || uri == null) {
            this.f18176b.mo20566a(null, exc, this.f18175a);
            return;
        }
        InterfaceC8161s interfaceC8161s = this.f18176b;
        C9100f c9100f = this.f18175a;
        interfaceC8161s.mo20566a(new C8143g(c9100f.f21342a, uri), null, c9100f);
    }
}
