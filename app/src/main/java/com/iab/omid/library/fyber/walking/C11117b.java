package com.iab.omid.library.fyber.walking;

import com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC11112b;
import com.iab.omid.library.fyber.walking.async.AsyncTaskC11114d;
import com.iab.omid.library.fyber.walking.async.AsyncTaskC11115e;
import com.iab.omid.library.fyber.walking.async.AsyncTaskC11116f;
import com.iab.omid.library.fyber.walking.async.C11113c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11117b implements AbstractAsyncTaskC11112b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f23204a;

    /* JADX INFO: renamed from: b */
    private final C11113c f23205b;

    public C11117b(C11113c c11113c) {
        this.f23205b = c11113c;
    }

    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC11112b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo24175a() {
        return this.f23204a;
    }

    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC11112b.b
    /* JADX INFO: renamed from: a */
    public void mo24176a(JSONObject jSONObject) {
        this.f23204a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m24184a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23205b.m24178b(new AsyncTaskC11115e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m24185b() {
        this.f23205b.m24178b(new AsyncTaskC11114d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m24186b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23205b.m24178b(new AsyncTaskC11116f(this, hashSet, jSONObject, j));
    }
}
