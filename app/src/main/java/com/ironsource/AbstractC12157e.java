package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC12157e {

    /* JADX INFO: renamed from: a */
    private final String f30265a = "eventId";

    /* JADX INFO: renamed from: b */
    private final String f30266b = "timestamp";

    /* JADX INFO: renamed from: c */
    private final String f30267c = "InterstitialEvents";

    /* JADX INFO: renamed from: d */
    private final String f30268d = "events";

    /* JADX INFO: renamed from: e */
    private final String f30269e = "events";

    /* JADX INFO: renamed from: f */
    JSONObject f30270f;

    /* JADX INFO: renamed from: g */
    int f30271g;

    /* JADX INFO: renamed from: h */
    private String f30272h;

    AbstractC12157e() {
    }

    /* JADX INFO: renamed from: a */
    private String m31330a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    /* JADX INFO: renamed from: a */
    protected abstract String mo27248a();

    /* JADX INFO: renamed from: a */
    public abstract String mo27249a(ArrayList<C12580w5> arrayList, JSONObject jSONObject);

    /* JADX INFO: renamed from: b */
    String m31334b() {
        return TextUtils.isEmpty(this.f30272h) ? mo27248a() : this.f30272h;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo27250c();

    /* JADX INFO: renamed from: a */
    JSONObject m31332a(C12580w5 c12580w5) {
        JSONObject jSONObject;
        try {
            String strM34041a = c12580w5.m34041a();
            if (!TextUtils.isEmpty(strM34041a)) {
                jSONObject = new JSONObject(strM34041a);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("eventId", c12580w5.m34046c());
            jSONObject.put("timestamp", c12580w5.m34047d());
            return jSONObject;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    String m31331a(JSONArray jSONArray) {
        try {
            if (this.f30270f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f30270f.toString());
            jSONObject.put("timestamp", IronSourceUtils.m32769e());
            jSONObject.put(m31330a(this.f30271g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    void m31333a(String str) {
        this.f30272h = str;
    }
}
