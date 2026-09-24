package com.iab.omid.library.chartboost.walking;

import com.iab.omid.library.chartboost.walking.async.AbstractAsyncTaskC11060b;
import com.iab.omid.library.chartboost.walking.async.AsyncTaskC11062d;
import com.iab.omid.library.chartboost.walking.async.AsyncTaskC11063e;
import com.iab.omid.library.chartboost.walking.async.AsyncTaskC11064f;
import com.iab.omid.library.chartboost.walking.async.C11061c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11065b implements AbstractAsyncTaskC11060b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f23069a;

    /* JADX INFO: renamed from: b */
    private final C11061c f23070b;

    public C11065b(C11061c c11061c) {
        this.f23070b = c11061c;
    }

    @Override // com.iab.omid.library.chartboost.walking.async.AbstractAsyncTaskC11060b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo23919a() {
        return this.f23069a;
    }

    @Override // com.iab.omid.library.chartboost.walking.async.AbstractAsyncTaskC11060b.b
    /* JADX INFO: renamed from: a */
    public void mo23920a(JSONObject jSONObject) {
        this.f23069a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m23928a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23070b.m23922b(new AsyncTaskC11063e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m23929b() {
        this.f23070b.m23922b(new AsyncTaskC11062d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m23930b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23070b.m23922b(new AsyncTaskC11064f(this, hashSet, jSONObject, j));
    }
}
