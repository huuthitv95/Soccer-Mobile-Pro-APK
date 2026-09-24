package com.iab.omid.library.ironsrc.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11163b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f23333a;

    /* JADX INFO: renamed from: b */
    protected final b f23334b;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24427a(AbstractAsyncTaskC11163b abstractAsyncTaskC11163b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo24428a();

        /* JADX INFO: renamed from: a */
        void mo24429a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC11163b(b bVar) {
        this.f23334b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m24424a(a aVar) {
        this.f23333a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23333a;
        if (aVar != null) {
            aVar.mo24427a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24426a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
