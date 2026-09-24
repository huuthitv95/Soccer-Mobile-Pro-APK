package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C9273x implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9239i0 f21711a;

    public C9273x(AbstractC9239i0 abstractC9239i0) {
        this.f21711a = abstractC9239i0;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (exc != null || TextUtils.isEmpty(str)) {
            AbstractC9183r.f21478b.post(new RunnableC9271w(this));
            return;
        }
        AbstractC9239i0 abstractC9239i0 = this.f21711a;
        if (AbstractC9174o.m21989a(abstractC9239i0.f21565b) != null) {
            C9215a0 c9215a0 = new C9215a0(str);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(AbstractC9174o.m21989a(abstractC9239i0.f21565b).getApplicationContext(), c9215a0);
            c9215a0.f21521b = mediaScannerConnection;
            mediaScannerConnection.connect();
        }
    }
}
