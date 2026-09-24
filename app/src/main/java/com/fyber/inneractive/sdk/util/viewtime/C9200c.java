package com.fyber.inneractive.sdk.util.viewtime;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9139c0;
import com.fyber.inneractive.sdk.util.C9132a;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.viewtime.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C9200c extends AbstractC9198a {

    /* JADX INFO: renamed from: b */
    public final AbstractC8236x f21509b;

    /* JADX INFO: renamed from: c */
    public final C9132a f21510c;

    /* JADX INFO: renamed from: d */
    public boolean f21511d;

    public C9200c(AbstractC8236x abstractC8236x, C9132a c9132a, boolean z) {
        this.f21509b = abstractC8236x;
        this.f21510c = c9132a;
        this.f21511d = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m22036a(boolean z) {
        Object objM21958a;
        C8006r c8006r;
        long j = this.f21504a;
        String str = String.format(Locale.US, "%d.%03d", Integer.valueOf((int) (j / 1000)), Integer.valueOf((int) (j % 1000)));
        EnumC8424u enumC8424u = EnumC8424u.VAST_WATCHED_DURATION_AND_SKIP_ACTION;
        AbstractC8236x abstractC8236x = this.f21509b;
        InneractiveAdRequest inneractiveAdRequest = abstractC8236x != null ? abstractC8236x.f18373a : null;
        AbstractC9087e abstractC9087e = abstractC8236x != null ? abstractC8236x.f18374b : null;
        JSONArray jSONArrayM20435b = (abstractC8236x == null || (c8006r = abstractC8236x.f18375c) == null) ? null : c8006r.m20435b();
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        Boolean boolValueOf = Boolean.valueOf(this.f21511d);
        if (z) {
            C9132a c9132a = this.f21510c;
            c9132a.getClass();
            objM21958a = AbstractC9139c0.m21958a(System.currentTimeMillis(), c9132a.f21432d, c9132a.f21434f);
        } else {
            objM21958a = -1;
        }
        c8428w.m20807a("duration", str, "is_skip_clickable", boolValueOf, "skip_action_latency", objM21958a);
        c8428w.m20808a((String) null);
    }
}
