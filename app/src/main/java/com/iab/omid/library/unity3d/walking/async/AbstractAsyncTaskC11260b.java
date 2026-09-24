package com.iab.omid.library.unity3d.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11260b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f23596a;

    /* JADX INFO: renamed from: b */
    protected final b f23597b;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24914a(AbstractAsyncTaskC11260b abstractAsyncTaskC11260b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo24915a();

        /* JADX INFO: renamed from: a */
        void mo24916a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC11260b(b bVar) {
        this.f23597b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m24911a(a aVar) {
        this.f23596a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f23596a;
        if (aVar != null) {
            aVar.mo24914a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24913a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
