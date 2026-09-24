package com.bytedance.sdk.openadsdk.p266uq.p267lr;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3545ri {

    /* JADX INFO: renamed from: ik */
    private List<ri> f12943ik;

    /* JADX INFO: renamed from: lr */
    private List<ri> f12944lr;

    /* JADX INFO: renamed from: ri */
    private String f12945ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.lr.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        private int f12946ik;

        /* JADX INFO: renamed from: lr */
        private String f12947lr;

        /* JADX INFO: renamed from: ri */
        private String f12948ri;

        /* JADX INFO: renamed from: ri */
        public static ri m16138ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            ri riVar = new ri();
            riVar.f12948ri = jSONObject.optString("url");
            riVar.f12947lr = jSONObject.optString("md5");
            riVar.f12946ik = jSONObject.optInt("type");
            return riVar;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof ri)) {
                return super.equals(obj);
            }
            String str2 = this.f12948ri;
            if (str2 != null) {
                ri riVar = (ri) obj;
                if (str2.equals(riVar.f12948ri) && (str = this.f12947lr) != null && str.equals(riVar.f12947lr)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ri */
        public String m16139ri() {
            return this.f12948ri;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static C3545ri m16130lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C3545ri c3545ri = new C3545ri();
            c3545ri.m16135ri(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    ri riVarM16138ri = ri.m16138ri(jSONArrayOptJSONArray.optJSONObject(i));
                    if (riVarM16138ri != null) {
                        if (riVarM16138ri.f12946ik == 1) {
                            arrayList.add(riVarM16138ri);
                        } else if (riVarM16138ri.f12946ik == 2 && arrayList2.size() < 10) {
                            arrayList2.add(riVarM16138ri);
                        }
                    }
                }
            }
            c3545ri.m16136ri(arrayList);
            c3545ri.m16133lr(arrayList2);
            return c3545ri;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ik */
    public List<ri> m16131ik() {
        return this.f12943ik;
    }

    /* JADX INFO: renamed from: lr */
    public List<ri> m16132lr() {
        return this.f12944lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m16133lr(List<ri> list) {
        this.f12943ik = list;
    }

    /* JADX INFO: renamed from: ri */
    public String m16134ri() {
        return this.f12945ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m16135ri(String str) {
        this.f12945ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m16136ri(List<ri> list) {
        this.f12944lr = list;
    }
}
