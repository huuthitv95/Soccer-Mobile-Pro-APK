package com.iab.omid.library.applovin.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC10957a extends AbstractAsyncTaskC10958b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f22790c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f22791d;

    /* JADX INFO: renamed from: e */
    protected final long f22792e;

    public AbstractAsyncTaskC10957a(AbstractAsyncTaskC10958b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f22790c = new HashSet<>(hashSet);
        this.f22791d = jSONObject;
        this.f22792e = j;
    }
}
