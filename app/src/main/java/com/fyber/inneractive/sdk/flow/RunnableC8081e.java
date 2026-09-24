package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.metrics.AbstractC8282a;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8081e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InneractiveInfrastructureError f17977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8119f f17978b;

    public RunnableC8081e(C8119f c8119f, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f17978b = c8119f;
        this.f17977a = inneractiveInfrastructureError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String string;
        AbstractC9087e abstractC9087e = this.f17978b.f18065b;
        if (abstractC9087e == null || (str = abstractC9087e.f21308h) == null) {
            return;
        }
        Map map = abstractC9087e.f21316p;
        if (map == null && abstractC9087e.f21317q == null) {
            return;
        }
        C8021o c8021o = IAConfigManager.f17654M.f17688t.f17862b;
        String strM20445a = c8021o.m20445a("max_failed_creatives_interval_hours", C8119f.f18063e);
        String strM20445a2 = c8021o.m20445a("max_failed_creatives_per_interval", C8119f.f18064f);
        int iM22022a = AbstractC9195v.m22022a(strM20445a, 24);
        int iM22022a2 = AbstractC9195v.m22022a(strM20445a2, 1);
        Application application = AbstractC9174o.f21470a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (c8021o.m20446a(false, this.f17978b.f18463a) && !AbstractC8282a.m20683a(iM22022a, iM22022a2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    try {
                        string = new JSONObject(map).toString();
                    } catch (Throwable unused2) {
                        string = "";
                    }
                } else {
                    string = this.f17978b.f18065b.f21317q;
                }
                C8119f c8119f = this.f17978b;
                InneractiveAdRequest inneractiveAdRequest = c8119f.f18066c;
                AbstractC9087e abstractC9087e2 = c8119f.f18065b;
                InneractiveInfrastructureError inneractiveInfrastructureError = this.f17977a;
                JSONArray jSONArray2 = c8119f.f18067d;
                EnumC8415t enumC8415t = EnumC8415t.IA_AD_FAILURE_DATA;
                C8428w c8428w = new C8428w(abstractC9087e2);
                c8428w.f18754b = enumC8415t;
                c8428w.f18753a = inneractiveAdRequest;
                c8428w.f18756d = jSONArray2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (Exception unused3) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", string);
                } catch (Exception unused4) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "headers", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("error_code", strDescription);
                } catch (Exception unused5) {
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", "error_code", strDescription);
                }
                c8428w.f18758f.put(jSONObject);
                c8428w.m20808a((String) null);
            }
            sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
