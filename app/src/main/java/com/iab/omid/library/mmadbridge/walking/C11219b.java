package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC11214b;
import com.iab.omid.library.mmadbridge.walking.async.AsyncTaskC11216d;
import com.iab.omid.library.mmadbridge.walking.async.AsyncTaskC11217e;
import com.iab.omid.library.mmadbridge.walking.async.AsyncTaskC11218f;
import com.iab.omid.library.mmadbridge.walking.async.C11215c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11219b implements AbstractAsyncTaskC11214b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f23474a;

    /* JADX INFO: renamed from: b */
    private final C11215c f23475b;

    public C11219b(C11215c c11215c) {
        this.f23475b = c11215c;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC11214b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo24681a() {
        return this.f23474a;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC11214b.b
    /* JADX INFO: renamed from: a */
    public void mo24682a(JSONObject jSONObject) {
        this.f23474a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m24690a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23475b.m24684b(new AsyncTaskC11217e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m24691b() {
        this.f23475b.m24684b(new AsyncTaskC11216d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m24692b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23475b.m24684b(new AsyncTaskC11218f(this, hashSet, jSONObject, j));
    }
}
