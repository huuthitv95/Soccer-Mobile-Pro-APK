package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC11324b;
import com.iab.omid.library.vungle.walking.async.AsyncTaskC11326d;
import com.iab.omid.library.vungle.walking.async.AsyncTaskC11327e;
import com.iab.omid.library.vungle.walking.async.AsyncTaskC11328f;
import com.iab.omid.library.vungle.walking.async.C11325c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11329b implements AbstractAsyncTaskC11324b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f23767a;

    /* JADX INFO: renamed from: b */
    private final C11325c f23768b;

    public C11329b(C11325c c11325c) {
        this.f23768b = c11325c;
    }

    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC11324b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo25220a() {
        return this.f23767a;
    }

    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC11324b.b
    /* JADX INFO: renamed from: a */
    public void mo25221a(JSONObject jSONObject) {
        this.f23767a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m25229a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23768b.m25223b(new AsyncTaskC11327e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m25230b() {
        this.f23768b.m25223b(new AsyncTaskC11326d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m25231b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23768b.m25223b(new AsyncTaskC11328f(this, hashSet, jSONObject, j));
    }
}
