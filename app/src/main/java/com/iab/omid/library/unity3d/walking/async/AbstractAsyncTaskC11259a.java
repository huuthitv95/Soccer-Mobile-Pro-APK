package com.iab.omid.library.unity3d.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11259a extends AbstractAsyncTaskC11260b {

    /* JADX INFO: renamed from: c */
    protected final HashSet<String> f23593c;

    /* JADX INFO: renamed from: d */
    protected final JSONObject f23594d;

    /* JADX INFO: renamed from: e */
    protected final long f23595e;

    public AbstractAsyncTaskC11259a(AbstractAsyncTaskC11260b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f23593c = new HashSet<>(hashSet);
        this.f23594d = jSONObject;
        this.f23595e = j;
    }
}
