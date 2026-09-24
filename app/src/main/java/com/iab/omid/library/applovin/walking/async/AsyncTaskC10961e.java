package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.internal.C10929c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.e */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC10961e extends AbstractAsyncTaskC10957a {
    public AsyncTaskC10961e(AbstractAsyncTaskC10958b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m23423b(String str) {
        C10929c c10929cM23224c = C10929c.m23224c();
        if (c10929cM23224c != null) {
            for (C10919a c10919a : c10929cM23224c.m23227b()) {
                if (this.f22790c.contains(c10919a.m23181c())) {
                    c10919a.m23182d().m23301a(str, this.f22792e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f22791d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC10958b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        m23423b(str);
        super.onPostExecute(str);
    }
}
