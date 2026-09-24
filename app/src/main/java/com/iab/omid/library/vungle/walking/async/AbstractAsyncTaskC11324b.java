package com.iab.omid.library.vungle.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11324b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f23761a;

    /* JADX INFO: renamed from: b */
    protected final b f23762b;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25219a(AbstractAsyncTaskC11324b abstractAsyncTaskC11324b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo25220a();

        /* JADX INFO: renamed from: a */
        void mo25221a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC11324b(b bVar) {
        this.f23762b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m25216a(a aVar) {
        this.f23761a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23761a;
        if (aVar != null) {
            aVar.mo25219a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25218a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
