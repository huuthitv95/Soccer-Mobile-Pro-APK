package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.internal.C11083c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.e */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11115e extends AbstractAsyncTaskC11111a {
    public AsyncTaskC11115e(AbstractAsyncTaskC11112b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m24180b(String str) {
        C11083c c11083cM23981c = C11083c.m23981c();
        if (c11083cM23981c != null) {
            for (C11073a c11073a : c11083cM23981c.m23984b()) {
                if (this.f23195c.contains(c11073a.m23938c())) {
                    c11073a.m23939d().m24058a(str, this.f23197e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f23196d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC11112b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        m24180b(str);
        super.onPostExecute(str);
    }
}
