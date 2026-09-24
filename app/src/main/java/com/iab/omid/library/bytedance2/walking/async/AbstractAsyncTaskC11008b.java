package com.iab.omid.library.bytedance2.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC11008b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a */
    private a f22922a;

    /* JADX INFO: renamed from: b */
    protected final b f22923b;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo23658a(AbstractAsyncTaskC11008b abstractAsyncTaskC11008b);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        JSONObject mo23659a();

        /* JADX INFO: renamed from: a */
        void mo23660a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC11008b(b bVar) {
        this.f22923b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m23655a(a aVar) {
        this.f22922a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f22922a;
        if (aVar != null) {
            aVar.mo23658a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23657a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
