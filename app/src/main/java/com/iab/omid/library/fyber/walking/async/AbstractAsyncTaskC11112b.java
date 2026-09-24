package com.iab.omid.library.fyber.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11112b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f23198a;

    /* JADX INFO: renamed from: b */
    protected final b f23199b;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24174a(AbstractAsyncTaskC11112b abstractAsyncTaskC11112b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo24175a();

        /* JADX INFO: renamed from: a */
        void mo24176a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC11112b(b bVar) {
        this.f23199b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m24171a(a aVar) {
        this.f23198a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23198a;
        if (aVar != null) {
            aVar.mo24174a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24173a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
