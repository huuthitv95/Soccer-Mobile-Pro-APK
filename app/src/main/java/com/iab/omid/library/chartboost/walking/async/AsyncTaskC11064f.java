package com.iab.omid.library.chartboost.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.internal.C11031c;
import com.iab.omid.library.chartboost.utils.C11048c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.walking.async.f */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11064f extends AbstractAsyncTaskC11059a {
    public AsyncTaskC11064f(AbstractAsyncTaskC11060b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m23926b(String str) {
        C11031c c11031cM23724c = C11031c.m23724c();
        if (c11031cM23724c != null) {
            for (C11021a c11021a : c11031cM23724c.m23727b()) {
                if (this.f23060c.contains(c11021a.m23677c())) {
                    c11021a.m23678d().m23807b(str, this.f23062e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C11048c.m23846h(this.f23061d, this.f23064b.mo23919a())) {
            return null;
        }
        this.f23064b.mo23920a(this.f23061d);
        return this.f23061d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.chartboost.walking.async.AbstractAsyncTaskC11060b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m23926b(str);
        }
        super.onPostExecute(str);
    }
}
