package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.serverapi.InterfaceC9115d;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.r0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8410r0 {

    /* JADX INFO: renamed from: a */
    public final InneractiveAdRequest f18703a;

    /* JADX INFO: renamed from: b */
    public HashMap f18704b;

    public C8410r0(InneractiveAdRequest inneractiveAdRequest, InterfaceC9115d interfaceC9115d) {
        this.f18703a = inneractiveAdRequest;
    }

    /* JADX INFO: renamed from: a */
    public final void m20783a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f18704b.put(str, str2);
    }
}
