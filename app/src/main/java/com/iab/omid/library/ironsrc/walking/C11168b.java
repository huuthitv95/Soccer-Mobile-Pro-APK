package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC11163b;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC11165d;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC11166e;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC11167f;
import com.iab.omid.library.ironsrc.walking.async.C11164c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.b */
/* JADX INFO: loaded from: classes6.dex */
public class C11168b implements AbstractAsyncTaskC11163b.b {

    /* JADX INFO: renamed from: a */
    private JSONObject f23339a;

    /* JADX INFO: renamed from: b */
    private final C11164c f23340b;

    public C11168b(C11164c c11164c) {
        this.f23340b = c11164c;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC11163b.b
    /* JADX INFO: renamed from: a */
    public JSONObject mo24428a() {
        return this.f23339a;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC11163b.b
    /* JADX INFO: renamed from: a */
    public void mo24429a(JSONObject jSONObject) {
        this.f23339a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m24437a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23340b.m24431b(new AsyncTaskC11166e(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: b */
    public void m24438b() {
        this.f23340b.m24431b(new AsyncTaskC11165d(this));
    }

    /* JADX INFO: renamed from: b */
    public void m24439b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f23340b.m24431b(new AsyncTaskC11167f(this, hashSet, jSONObject, j));
    }
}
