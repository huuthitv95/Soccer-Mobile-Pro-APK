package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.same.net.model.C13116a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.e */
/* JADX INFO: compiled from: CommonRequestParams.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13126e {

    /* JADX INFO: renamed from: c */
    private static final String f36052c = "e";

    /* JADX INFO: renamed from: d */
    public static String f36053d = "h";

    /* JADX INFO: renamed from: e */
    public static String f36054e = "i";

    /* JADX INFO: renamed from: f */
    public static String f36055f = "coppa";

    /* JADX INFO: renamed from: g */
    public static String f36056g = "d";

    /* JADX INFO: renamed from: h */
    public static String f36057h = "e";

    /* JADX INFO: renamed from: i */
    public static String f36058i = "a";

    /* JADX INFO: renamed from: j */
    public static String f36059j = "f";

    /* JADX INFO: renamed from: k */
    public static String f36060k = "g";

    /* JADX INFO: renamed from: a */
    private Map<String, C13116a> f36061a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private Map<String, String> f36062b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public void m37245a(String str, String str2) {
        if (str2 == null) {
            C13219q0.m37816b(f36052c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f36062b.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public String m37246b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f36062b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append(C11744X3.j.f26434b);
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m37247c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f36062b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, C13116a> entry2 : this.f36061a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().m37206d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e) {
            C13219q0.m37816b(f36052c, e.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f36062b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append(C11341A5.f23808U);
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, C13116a> entry2 : this.f36061a.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb.append(C11341A5.f23808U);
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().m37206d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            C13219q0.m37816b(f36052c, e.getMessage());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m37243a() {
        return this.f36062b;
    }

    /* JADX INFO: renamed from: a */
    public void m37244a(String str) {
        this.f36062b.remove(str);
        this.f36061a.remove(str);
    }
}
