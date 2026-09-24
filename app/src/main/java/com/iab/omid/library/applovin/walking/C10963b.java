package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC10958b;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC10960d;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC10961e;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC10962f;
import com.iab.omid.library.applovin.walking.async.C10959c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C10963b implements AbstractAsyncTaskC10958b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f22799a;

    /* JADX INFO: renamed from: b */
    private final C10959c f22800b;

    public C10963b(C10959c c10959c) {
        this.f22800b = c10959c;
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC10958b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo23418a() {
        return this.f22799a;
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC10958b.b
    /* JADX INFO: renamed from: a */
    public void mo23419a(JSONObject jSONObject) {
        this.f22799a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m23427a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22800b.m23421b(new AsyncTaskC10961e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m23428b() {
        this.f22800b.m23421b(new AsyncTaskC10960d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m23429b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22800b.m23421b(new AsyncTaskC10962f(this, hashSet, jSONObject, j));
    }
}
