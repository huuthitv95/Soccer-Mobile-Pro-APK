package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.nativead.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C9105k extends AbstractC9087e {

    /* JADX INFO: renamed from: K */
    public C9103i f21361K;

    @Override // com.fyber.inneractive.sdk.response.AbstractC9087e
    /* JADX INFO: renamed from: a */
    public final InneractiveErrorCode mo21891a(InneractiveAdRequest inneractiveAdRequest, C8006r c8006r) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9087e
    /* JADX INFO: renamed from: b */
    public final InneractiveErrorCode mo21894b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C9099e m21899c() {
        ArrayList<C9100f> arrayList;
        C9103i c9103i = this.f21361K;
        if (c9103i == null || (arrayList = c9103i.f21355a) == null) {
            c9100f = null;
        } else {
            for (C9100f c9100f : arrayList) {
                if (c9100f.f21344c != null) {
                }
            }
            c9100f = null;
        }
        if (c9100f != null) {
            return c9100f.f21344c;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21900d() {
        String str;
        C9099e c9099eM21899c = m21899c();
        return (c9099eM21899c == null || (str = c9099eM21899c.f21341a) == null || str.isEmpty()) ? false : true;
    }
}
