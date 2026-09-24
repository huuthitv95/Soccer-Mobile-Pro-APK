package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.internal.C11292c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.e */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11327e extends AbstractAsyncTaskC11323a {
    public AsyncTaskC11327e(AbstractAsyncTaskC11324b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m25225b(String str) {
        C11292c c11292cM25003c = C11292c.m25003c();
        if (c11292cM25003c != null) {
            for (C11271a c11271a : c11292cM25003c.m25006b()) {
                if (this.f23758c.contains(c11271a.m24933c())) {
                    c11271a.m24934d().m25092a(str, this.f23760e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f23759d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC11324b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        m25225b(str);
        super.onPostExecute(str);
    }
}
