package com.iab.omid.library.vungle.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.internal.C11292c;
import com.iab.omid.library.vungle.utils.C11312c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.f */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11328f extends AbstractAsyncTaskC11323a {
    public AsyncTaskC11328f(AbstractAsyncTaskC11324b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m25227b(String str) {
        C11292c c11292cM25003c = C11292c.m25003c();
        if (c11292cM25003c != null) {
            for (C11271a c11271a : c11292cM25003c.m25006b()) {
                if (this.f23758c.contains(c11271a.m24933c())) {
                    c11271a.m24934d().m25097b(str, this.f23760e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C11312c.m25145h(this.f23759d, this.f23762b.mo25220a())) {
            return null;
        }
        this.f23762b.mo25221a(this.f23759d);
        return this.f23759d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC11324b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m25227b(str);
        }
        super.onPostExecute(str);
    }
}
