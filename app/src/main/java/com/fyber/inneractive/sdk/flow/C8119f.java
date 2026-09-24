package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.metrics.AbstractC8282a;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.f */
/* JADX INFO: loaded from: classes9.dex */
public final class C8119f extends AbstractC8282a {

    /* JADX INFO: renamed from: e */
    public static final String f18063e = String.valueOf(24);

    /* JADX INFO: renamed from: f */
    public static final String f18064f = String.valueOf(1);

    /* JADX INFO: renamed from: b */
    public final AbstractC9087e f18065b;

    /* JADX INFO: renamed from: c */
    public final InneractiveAdRequest f18066c;

    /* JADX INFO: renamed from: d */
    public final JSONArray f18067d;

    public C8119f(AbstractC9087e abstractC9087e, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f18065b = abstractC9087e;
        this.f18066c = inneractiveAdRequest;
        this.f18067d = jSONArray;
    }
}
