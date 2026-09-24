package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC10958b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f22793a;

    /* JADX INFO: renamed from: b */
    protected final b f22794b;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo23417a(AbstractAsyncTaskC10958b abstractAsyncTaskC10958b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo23418a();

        /* JADX INFO: renamed from: a */
        void mo23419a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC10958b(b bVar) {
        this.f22794b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m23414a(a aVar) {
        this.f22793a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f22793a;
        if (aVar != null) {
            aVar.mo23417a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23416a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
