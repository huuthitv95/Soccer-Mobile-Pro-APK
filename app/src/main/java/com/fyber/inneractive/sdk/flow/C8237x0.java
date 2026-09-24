package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.response.C9089g;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.x0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8237x0 {

    /* JADX INFO: renamed from: a */
    public final Context f18379a;

    /* JADX INFO: renamed from: b */
    public final C8219t0 f18380b;

    /* JADX INFO: renamed from: c */
    public final InneractiveAdRequest f18381c;

    /* JADX INFO: renamed from: d */
    public final C9089g f18382d;

    /* JADX INFO: renamed from: e */
    public final C8293b f18383e;

    /* JADX INFO: renamed from: f */
    public final JSONArray f18384f;

    /* JADX INFO: renamed from: g */
    public final C7994v f18385g;

    public C8237x0(Context context, C8219t0 c8219t0) {
        C7994v c7994v;
        JSONArray jSONArrayM20435b;
        C8006r c8006r = c8219t0.f18375c;
        InneractiveAdRequest inneractiveAdRequest = c8219t0.f18373a;
        C9089g c9089g = (C9089g) c8219t0.f18374b;
        C8293b c8293b = c9089g.f21329L;
        if (c8006r != null) {
            c7994v = (C7994v) c8006r.m20432a(C7994v.class);
            jSONArrayM20435b = c8006r.m20435b();
        } else {
            c7994v = null;
            jSONArrayM20435b = null;
        }
        this.f18379a = context;
        this.f18380b = c8219t0;
        this.f18381c = inneractiveAdRequest;
        this.f18382d = c9089g;
        this.f18383e = c8293b;
        this.f18385g = c7994v;
        this.f18384f = jSONArrayM20435b;
    }
}
