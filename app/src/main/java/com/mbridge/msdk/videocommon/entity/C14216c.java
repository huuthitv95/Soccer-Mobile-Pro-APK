package com.mbridge.msdk.videocommon.entity;

import android.text.TextUtils;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.entity.c */
/* JADX INFO: compiled from: Reward.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14216c {

    /* JADX INFO: renamed from: a */
    private String f41078a;

    /* JADX INFO: renamed from: b */
    private int f41079b;

    public C14216c(String str, int i) {
        this.f41078a = str;
        this.f41079b = i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x0001, B:5:0x000f, B:12:0x002a, B:8:0x0017, B:10:0x001d), top: B:18:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static C14216c m42619a(String str) {
        C14216c c14216cM42622b;
        C14216c c14216c = null;
        try {
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            if (!TextUtils.isEmpty(str)) {
                if (c14221aM42670c != null && c14221aM42670c.m42651g() != null) {
                    c14216cM42622b = c14221aM42670c.m42651g().get(str);
                }
                if (c14216c == null) {
                    return m42622b();
                }
                return c14216c;
            }
            c14216cM42622b = m42622b();
            c14216c = c14216cM42622b;
            if (c14216c == null) {
                return m42622b();
            }
            return c14216c;
        } catch (Exception e) {
            e.printStackTrace();
            return c14216c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14216c m42620a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString("name");
            int iOptInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new C14216c(strOptString, iOptInt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, C14216c> m42621a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("id"), new C14216c(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optInt("amount")));
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C14216c m42622b() {
        return new C14216c("Virtual Item", 1);
    }

    /* JADX INFO: renamed from: a */
    public int m42623a() {
        return this.f41079b;
    }

    /* JADX INFO: renamed from: a */
    public void m42624a(int i) {
        this.f41079b = i;
    }

    /* JADX INFO: renamed from: b */
    public void m42625b(String str) {
        this.f41078a = str;
    }

    /* JADX INFO: renamed from: c */
    public String m42626c() {
        return this.f41078a;
    }

    public String toString() {
        return "Reward{name='" + this.f41078a + "', amount=" + this.f41079b + AbstractJsonLexerKt.END_OBJ;
    }
}
