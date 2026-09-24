package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.internal.C11234c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.e */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11263e extends AbstractAsyncTaskC11259a {
    public AsyncTaskC11263e(AbstractAsyncTaskC11260b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m24920b(String str) {
        C11234c c11234cM24743c = C11234c.m24743c();
        if (c11234cM24743c != null) {
            for (C11224a c11224a : c11234cM24743c.m24746b()) {
                if (this.f23593c.contains(c11224a.getAdSessionId())) {
                    c11224a.getAdSessionStatePublisher().m24806a(str, this.f23595e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f23594d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC11260b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        m24920b(str);
        super.onPostExecute(str);
    }
}
