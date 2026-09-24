package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.vast.AbstractC8233j;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.g */
/* JADX INFO: loaded from: classes4.dex */
public class C9089g extends AbstractC9087e {

    /* JADX INFO: renamed from: K */
    public long f21328K;

    /* JADX INFO: renamed from: L */
    public C8293b f21329L;

    /* JADX INFO: renamed from: O */
    public final ArrayList f21332O = new ArrayList();

    /* JADX INFO: renamed from: M */
    public final LinkedHashMap f21330M = new LinkedHashMap();

    /* JADX INFO: renamed from: N */
    public final ArrayList f21331N = new ArrayList();

    /* JADX INFO: renamed from: P */
    public final LinkedHashMap f21333P = new LinkedHashMap();

    @Override // com.fyber.inneractive.sdk.response.AbstractC9087e
    /* JADX INFO: renamed from: a */
    public InneractiveErrorCode mo21891a(InneractiveAdRequest inneractiveAdRequest, C8006r c8006r) {
        return AbstractC8233j.m20632a(inneractiveAdRequest, this, c8006r);
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9087e
    /* JADX INFO: renamed from: b */
    public InneractiveErrorCode mo21894b() {
        return mo21891a(null, null);
    }
}
