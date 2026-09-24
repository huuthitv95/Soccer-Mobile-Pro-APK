package com.iab.omid.library.chartboost.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11059a extends AbstractAsyncTaskC11060b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f23060c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f23061d;

    /* JADX INFO: renamed from: e */
    protected final long f23062e;

    public AbstractAsyncTaskC11059a(AbstractAsyncTaskC11060b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f23060c = new HashSet<>(hashSet);
        this.f23061d = jSONObject;
        this.f23062e = j;
    }
}
