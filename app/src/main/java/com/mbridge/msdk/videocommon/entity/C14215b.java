package com.mbridge.msdk.videocommon.entity;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.entity.b */
/* JADX INFO: compiled from: AdUnitInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14215b {

    /* JADX INFO: renamed from: a */
    private int f41075a;

    /* JADX INFO: renamed from: b */
    private int f41076b;

    /* JADX INFO: renamed from: c */
    private C14214a f41077c;

    public C14215b(int i, int i2, C14214a c14214a) {
        this.f41075a = i;
        this.f41076b = i2;
        this.f41077c = c14214a;
    }

    /* JADX INFO: renamed from: a */
    public static List<C14215b> m42616a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    int iOptInt = jSONObjectOptJSONObject.optInt("id");
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("timeout");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
                    arrayList.add(new C14215b(iOptInt, iOptInt2, jSONObjectOptJSONObject2 != null ? C14214a.m42615a(jSONObjectOptJSONObject2) : null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public int m42617a() {
        return this.f41075a;
    }

    /* JADX INFO: renamed from: b */
    public int m42618b() {
        return this.f41076b;
    }
}
