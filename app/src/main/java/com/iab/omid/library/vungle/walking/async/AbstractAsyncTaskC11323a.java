package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11323a extends AbstractAsyncTaskC11324b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f23758c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f23759d;

    /* JADX INFO: renamed from: e */
    protected final long f23760e;

    public AbstractAsyncTaskC11323a(AbstractAsyncTaskC11324b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f23758c = new HashSet<>(hashSet);
        this.f23759d = jSONObject;
        this.f23760e = j;
    }
}
