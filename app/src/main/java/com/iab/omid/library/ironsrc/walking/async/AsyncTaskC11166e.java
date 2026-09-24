package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.internal.C11134c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.e */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11166e extends AbstractAsyncTaskC11162a {
    public AsyncTaskC11166e(AbstractAsyncTaskC11163b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m24433b(String str) {
        C11134c c11134cM24234c = C11134c.m24234c();
        if (c11134cM24234c != null) {
            for (C11124a c11124a : c11134cM24234c.m24237b()) {
                if (this.f23330c.contains(c11124a.getAdSessionId())) {
                    c11124a.getAdSessionStatePublisher().m24311a(str, this.f23332e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f23331d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC11163b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        m24433b(str);
        super.onPostExecute(str);
    }
}
