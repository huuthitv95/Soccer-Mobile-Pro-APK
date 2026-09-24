package com.iab.omid.library.ironsrc.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11162a extends AbstractAsyncTaskC11163b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f23330c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f23331d;

    /* JADX INFO: renamed from: e */
    protected final long f23332e;

    public AbstractAsyncTaskC11162a(AbstractAsyncTaskC11163b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f23330c = new HashSet<>(hashSet);
        this.f23331d = jSONObject;
        this.f23332e = j;
    }
}
