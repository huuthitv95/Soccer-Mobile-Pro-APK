package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.d1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9225d1 {

    /* JADX INFO: renamed from: a */
    public final String f21537a;

    /* JADX INFO: renamed from: b */
    public final String f21538b;

    /* JADX INFO: renamed from: c */
    public final HashMap f21539c;

    public C9225d1(WebResourceRequest webResourceRequest) {
        this.f21537a = webResourceRequest.getUrl().toString();
        this.f21538b = webResourceRequest.getMethod();
        this.f21539c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9225d1.class != obj.getClass()) {
            return false;
        }
        C9225d1 c9225d1 = (C9225d1) obj;
        if (this.f21537a.equals(c9225d1.f21537a) && this.f21538b.equals(c9225d1.f21538b)) {
            return this.f21539c.equals(c9225d1.f21539c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21539c.hashCode() + ((this.f21538b.hashCode() + (this.f21537a.hashCode() * 31)) * 31);
    }
}
