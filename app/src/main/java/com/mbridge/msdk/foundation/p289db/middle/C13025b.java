package com.mbridge.msdk.foundation.p289db.middle;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13021k;
import com.mbridge.msdk.foundation.same.buffer.C13090a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b */
/* JADX INFO: compiled from: ReplaceTempDaoMiddle.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13025b {

    /* JADX INFO: renamed from: a */
    private C13090a f35595a;

    /* JADX INFO: renamed from: b */
    private C13021k f35596b;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$a */
    /* JADX INFO: compiled from: ReplaceTempDaoMiddle.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f35597a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C13090a f35598b;

        a(boolean z, C13090a c13090a) {
            this.f35597a = z;
            this.f35598b = c13090a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f35597a || C13025b.this.f35596b == null) {
                return;
            }
            for (String str : this.f35598b.m37099a()) {
                C13025b.this.f35596b.m36713a(str, C13025b.this.f35595a.m37100a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b */
    /* JADX INFO: compiled from: ReplaceTempDaoMiddle.java */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static C13025b f35600a = new C13025b(null);
    }

    /* synthetic */ C13025b(a aVar) {
        this();
    }

    private C13025b() {
        this.f35595a = new C13090a(1000);
        try {
            C13021k c13021kM36711a = C13021k.m36711a(C13017g.m36693a(C13008c.m36588n().m36542d()));
            this.f35596b = c13021kM36711a;
            m36741a(c13021kM36711a.m36716d(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36741a(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            C13090a c13090a = new C13090a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f35595a.m37101a(next, jSONObjectOptJSONObject);
                c13090a.m37101a(next, jSONObjectOptJSONObject);
            }
            C13167a.m37543b().execute(new a(z, c13090a));
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONArray m36742b() {
        return new JSONArray((Collection) this.f35595a.m37099a());
    }

    /* JADX INFO: renamed from: a */
    public static C13025b m36738a() {
        return b.f35600a;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m36740a(String str) {
        C13021k c13021k;
        JSONObject jSONObjectM37100a = this.f35595a.m37100a(str);
        if (jSONObjectM37100a != null || (c13021k = this.f35596b) == null) {
            return jSONObjectM37100a;
        }
        JSONObject jSONObjectM36715b = c13021k.m36715b(str);
        if (jSONObjectM36715b != null) {
            this.f35595a.m37101a(str, jSONObjectM36715b);
        }
        return jSONObjectM36715b;
    }
}
