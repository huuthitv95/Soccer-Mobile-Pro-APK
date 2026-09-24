package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.aa */
/* JADX INFO: loaded from: classes6.dex */
public class C11802aa {

    /* JADX INFO: renamed from: b */
    private static final String f26774b = "aa";

    /* JADX INFO: renamed from: c */
    private static final String f26775c = "supersonic_shared_preferen";

    /* JADX INFO: renamed from: d */
    private static final String f26776d = "version";

    /* JADX INFO: renamed from: e */
    private static final String f26777e = "back_button_state";

    /* JADX INFO: renamed from: f */
    private static final String f26778f = "search_keys";

    /* JADX INFO: renamed from: g */
    private static final String f26779g = "^\\d+_\\d+$";

    /* JADX INFO: renamed from: h */
    private static C11802aa f26780h;

    /* JADX INFO: renamed from: a */
    private SharedPreferences f26781a;

    private C11802aa(Context context) {
        this.f26781a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C11802aa m28149a(Context context) {
        if (f26780h == null) {
            f26780h = new C11802aa(context);
        }
        return f26780h;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized C11802aa m28151e() {
        return f26780h;
    }

    /* JADX INFO: renamed from: b */
    public C12386n8.a m28156b() {
        int i = Integer.parseInt(this.f26781a.getString(f26777e, "2"));
        if (i == 0) {
            return C12386n8.a.None;
        }
        if (i == 1) {
            return C12386n8.a.Device;
        }
        return i == 2 ? C12386n8.a.Controller : C12386n8.a.Controller;
    }

    /* JADX INFO: renamed from: c */
    public void m28158c(String str) {
        SharedPreferences.Editor editorEdit = this.f26781a.edit();
        editorEdit.putString(f26777e, str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public List<String> m28159d() {
        String string = this.f26781a.getString(f26778f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C11720Vd c11720Vd = new C11720Vd(string);
            if (c11720Vd.m27755a(C11744X3.i.f26346R)) {
                try {
                    arrayList.addAll(c11720Vd.m27752a((JSONArray) c11720Vd.m27756b(C11744X3.i.f26346R)));
                    return arrayList;
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public void m28161e(String str) {
        SharedPreferences.Editor editorEdit = this.f26781a.edit();
        editorEdit.putString(f26778f, str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public void m28154a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f26781a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    public String m28157c() {
        return this.f26781a.getString("version", C11794a2.f26725f);
    }

    /* JADX INFO: renamed from: a */
    public String m28152a(String str) {
        String string = this.f26781a.getString(str, null);
        return string != null ? string : JsonUtils.EMPTY_JSON;
    }

    /* JADX INFO: renamed from: b */
    private boolean m28150b(String str) {
        return str.matches(f26779g);
    }

    /* JADX INFO: renamed from: a */
    public boolean m28155a(String str, String str2, String str3) {
        String string = this.f26781a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f26781a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m28160d(String str) {
        if (m28157c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f26781a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<String> m28153a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f26781a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f26781a.edit();
        for (String str : strArr) {
            if (m28150b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}
