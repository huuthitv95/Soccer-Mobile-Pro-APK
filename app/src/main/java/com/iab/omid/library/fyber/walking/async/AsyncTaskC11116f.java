package com.iab.omid.library.fyber.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.internal.C11083c;
import com.iab.omid.library.fyber.utils.C11100c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.f */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11116f extends AbstractAsyncTaskC11111a {
    public AsyncTaskC11116f(AbstractAsyncTaskC11112b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m24182b(String str) {
        C11083c c11083cM23981c = C11083c.m23981c();
        if (c11083cM23981c != null) {
            for (C11073a c11073a : c11083cM23981c.m23984b()) {
                if (this.f23195c.contains(c11073a.m23938c())) {
                    c11073a.m23939d().m24064b(str, this.f23197e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C11100c.m24102h(this.f23196d, this.f23199b.mo24175a())) {
            return null;
        }
        this.f23199b.mo24176a(this.f23196d);
        return this.f23196d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC11112b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m24182b(str);
        }
        super.onPostExecute(str);
    }
}
