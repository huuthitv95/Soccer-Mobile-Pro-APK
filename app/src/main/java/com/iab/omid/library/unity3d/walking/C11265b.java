package com.iab.omid.library.unity3d.walking;

import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC11260b;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC11262d;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC11263e;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC11264f;
import com.iab.omid.library.unity3d.walking.async.C11261c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11265b implements AbstractAsyncTaskC11260b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f23602a;

    /* JADX INFO: renamed from: b */
    private final C11261c f23603b;

    public C11265b(C11261c c11261c) {
        this.f23603b = c11261c;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC11260b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo24915a() {
        return this.f23602a;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC11260b.b
    /* JADX INFO: renamed from: a */
    public void mo24916a(JSONObject jSONObject) {
        this.f23602a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m24924a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23603b.m24918b(new AsyncTaskC11263e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m24925b() {
        this.f23603b.m24918b(new AsyncTaskC11262d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m24926b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23603b.m24918b(new AsyncTaskC11264f(this, hashSet, jSONObject, j));
    }
}
