package com.iab.omid.library.mmadbridge.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11213a extends AbstractAsyncTaskC11214b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f23465c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f23466d;

    /* JADX INFO: renamed from: e */
    protected final long f23467e;

    public AbstractAsyncTaskC11213a(AbstractAsyncTaskC11214b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f23465c = new HashSet<>(hashSet);
        this.f23466d = jSONObject;
        this.f23467e = j;
    }
}
