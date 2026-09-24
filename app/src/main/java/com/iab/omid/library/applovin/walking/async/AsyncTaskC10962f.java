package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.internal.C10929c;
import com.iab.omid.library.applovin.utils.C10946c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.f */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC10962f extends AbstractAsyncTaskC10957a {
    public AsyncTaskC10962f(AbstractAsyncTaskC10958b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m23425b(String str) {
        C10929c c10929cM23224c = C10929c.m23224c();
        if (c10929cM23224c != null) {
            for (C10919a c10919a : c10929cM23224c.m23227b()) {
                if (this.f22790c.contains(c10919a.m23181c())) {
                    c10919a.m23182d().m23307b(str, this.f22792e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C10946c.m23345h(this.f22791d, this.f22794b.mo23418a())) {
            return null;
        }
        this.f22794b.mo23419a(this.f22791d);
        return this.f22791d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC10958b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m23425b(str);
        }
        super.onPostExecute(str);
    }
}
