package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC11008b;
import com.iab.omid.library.bytedance2.walking.async.AsyncTaskC11010d;
import com.iab.omid.library.bytedance2.walking.async.AsyncTaskC11011e;
import com.iab.omid.library.bytedance2.walking.async.AsyncTaskC11012f;
import com.iab.omid.library.bytedance2.walking.async.C11009c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11013b implements AbstractAsyncTaskC11008b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f22928a;

    /* JADX INFO: renamed from: b */
    private final C11009c f22929b;

    public C11013b(C11009c c11009c) {
        this.f22929b = c11009c;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC11008b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo23659a() {
        return this.f22928a;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC11008b.b
    /* JADX INFO: renamed from: a */
    public void mo23660a(JSONObject jSONObject) {
        this.f22928a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m23668a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22929b.m23662b(new AsyncTaskC11011e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m23669b() {
        this.f22929b.m23662b(new AsyncTaskC11010d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m23670b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22929b.m23662b(new AsyncTaskC11012f(this, hashSet, jSONObject, j));
    }
}
