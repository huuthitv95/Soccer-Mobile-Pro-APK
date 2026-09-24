package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.internal.C11185c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.e */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11217e extends AbstractAsyncTaskC11213a {
    public AsyncTaskC11217e(AbstractAsyncTaskC11214b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m24686b(String str) {
        C11185c c11185cM24487c = C11185c.m24487c();
        if (c11185cM24487c != null) {
            for (C11175a c11175a : c11185cM24487c.m24490b()) {
                if (this.f23465c.contains(c11175a.getAdSessionId())) {
                    c11175a.getAdSessionStatePublisher().m24564a(str, this.f23467e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f23466d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC11214b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        m24686b(str);
        super.onPostExecute(str);
    }
}
