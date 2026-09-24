package com.iab.omid.library.fyber.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11111a extends AbstractAsyncTaskC11112b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f23195c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f23196d;

    /* JADX INFO: renamed from: e */
    protected final long f23197e;

    public AbstractAsyncTaskC11111a(AbstractAsyncTaskC11112b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f23195c = new HashSet<>(hashSet);
        this.f23196d = jSONObject;
        this.f23197e = j;
    }
}
