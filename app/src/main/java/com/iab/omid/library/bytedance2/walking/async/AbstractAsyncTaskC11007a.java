package com.iab.omid.library.bytedance2.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11007a extends AbstractAsyncTaskC11008b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f22919c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f22920d;

    /* JADX INFO: renamed from: e */
    protected final long f22921e;

    public AbstractAsyncTaskC11007a(AbstractAsyncTaskC11008b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f22919c = new HashSet<>(hashSet);
        this.f22920d = jSONObject;
        this.f22921e = j;
    }
}
