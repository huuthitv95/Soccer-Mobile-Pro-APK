package com.iab.omid.library.mmadbridge.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11214b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f23468a;

    /* JADX INFO: renamed from: b */
    protected final b f23469b;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24680a(AbstractAsyncTaskC11214b abstractAsyncTaskC11214b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo24681a();

        /* JADX INFO: renamed from: a */
        void mo24682a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC11214b(b bVar) {
        this.f23469b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m24677a(a aVar) {
        this.f23468a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23468a;
        if (aVar != null) {
            aVar.mo24680a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24679a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
