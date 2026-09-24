package com.iab.omid.library.unity3d.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.internal.C11234c;
import com.iab.omid.library.unity3d.utils.C11249c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.f */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11264f extends AbstractAsyncTaskC11259a {
    public AsyncTaskC11264f(AbstractAsyncTaskC11260b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m24922b(String str) {
        C11234c c11234cM24743c = C11234c.m24743c();
        if (c11234cM24743c != null) {
            for (C11224a c11224a : c11234cM24743c.m24746b()) {
                if (this.f23593c.contains(c11224a.getAdSessionId())) {
                    c11224a.getAdSessionStatePublisher().m24812b(str, this.f23595e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C11249c.m24848h(this.f23594d, this.f23597b.mo24915a())) {
            return null;
        }
        this.f23597b.mo24916a(this.f23594d);
        return this.f23594d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC11260b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m24922b(str);
        }
        super.onPostExecute(str);
    }
}
