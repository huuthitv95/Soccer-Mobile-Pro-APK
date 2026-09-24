package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.cache.C7902d;
import com.fyber.inneractive.sdk.cache.C7911m;
import com.fyber.inneractive.sdk.flow.nativead.C8162t;
import com.fyber.inneractive.sdk.nativead.C8352b;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.u0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8425u0 extends C8427v0 {

    /* JADX INFO: renamed from: s */
    public static final String f18740s = IAlog.m21942a(C8425u0.class);

    public C8425u0(C8162t c8162t, Context context, C7902d c7902d) {
        super(c8162t, context, c7902d);
    }

    @Override // com.fyber.inneractive.sdk.network.C8427v0, com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0 {
        C8401o0 c8401o0 = new C8401o0();
        try {
            c8401o0.f18691b = new String(Base64.encode(AbstractC9195v.m22031a(c8391l.f18668c), 0));
            return c8401o0;
        } catch (Exception e) {
            IAlog.m21946b("%s : failed parse cacheable network request", f18740s, e);
            throw new C8398n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.C8427v0, com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final void mo20788a(C8401o0 c8401o0, String str, String str2) {
        C8366d0 c8366d0 = this.f18751r;
        if (c8366d0 == null) {
            IAlog.m21950f("%s: failed to cache file: no cache helper", f18740s);
            return;
        }
        c8366d0.m20740b(str2);
        if (c8401o0 == null || TextUtils.isEmpty(c8401o0.f18691b) || TextUtils.isEmpty(str)) {
            IAlog.m21950f("%s: failed to cache file: empty result", f18740s);
            return;
        }
        boolean zMo20738a = this.f18751r.mo20738a(str, c8401o0.f18691b);
        Uri uri = (Uri) this.f18751r.mo20736a().f17586a;
        c8401o0.f18690a = uri;
        if (zMo20738a) {
            this.f18750q.mo20351a(uri);
        } else {
            IAlog.m21946b("%s: Failed to cache file", f18740s);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: c */
    public final void mo20790c() {
        this.f18711a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.C8427v0, com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: i */
    public final C8356a mo20793i() {
        C8369e0 c8369e0 = new C8369e0(this.f18749p, this.f18750q, C8352b.f18613f.f18615b);
        this.f18751r = c8369e0;
        C7911m c7911mMo20736a = c8369e0.mo20736a();
        String str = c7911mMo20736a.f17587b;
        Uri uri = (Uri) c7911mMo20736a.f17586a;
        this.f18750q.mo20353c();
        return new C8356a(uri, str);
    }
}
