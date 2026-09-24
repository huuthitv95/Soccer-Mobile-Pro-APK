package com.iab.omid.library.bytedance2.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.internal.C10980c;
import com.iab.omid.library.bytedance2.utils.C10996c;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.f */
/* JADX INFO: loaded from: classes6.dex */
public class AsyncTaskC11012f extends AbstractAsyncTaskC11007a {
    public AsyncTaskC11012f(AbstractAsyncTaskC11008b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* JADX INFO: renamed from: b */
    private void m23666b(String str) {
        C10980c c10980cM23477c = C10980c.m23477c();
        if (c10980cM23477c != null) {
            for (C10970a c10970a : c10980cM23477c.m23480b()) {
                if (this.f22919c.contains(c10970a.getAdSessionId())) {
                    c10970a.getAdSessionStatePublisher().m23553b(str, this.f22921e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C10996c.m23589h(this.f22920d, this.f22923b.mo23659a())) {
            return null;
        }
        this.f22923b.mo23660a(this.f22920d);
        return this.f22920d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC11008b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m23666b(str);
        }
        super.onPostExecute(str);
    }
}
